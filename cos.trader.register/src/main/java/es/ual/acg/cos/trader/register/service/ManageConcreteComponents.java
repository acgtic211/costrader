package es.ual.acg.cos.trader.register.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ccmm.ConcreteComponentSpecification;
import ccmm.InputElement;
import ccmm.Operation;
import ccmm.OutputElement;
import ccmm.ProvidedInterface;
import ccmm.RequiredInterface;
import ccmm.impl.ConcreteComponentSpecificationImpl;
import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;
import es.ual.acg.cos.trader.definitions.ElementInfo;
import es.ual.acg.cos.trader.definitions.InputInfo;
import es.ual.acg.cos.trader.definitions.InterfaceInfo;
import es.ual.acg.cos.trader.definitions.OperationInfo;
import es.ual.acg.cos.trader.definitions.OutputInfo;
import es.ual.acg.cos.trader.register.clients.LookupClient;
import es.ual.acg.cos.trader.register.repository.ManageDB;

@Repository
public class ManageConcreteComponents {

  @Autowired
  LookupClient lookup;
  
  @Autowired
  ManageDB managedb;

  private HbDataStore dataStoreCC;
  private static final Logger LOGGER = Logger.getLogger(ManageConcreteComponents.class);

  public ManageConcreteComponents() {
    LOGGER.info("ManageConcreteComponents created");
  }


  public ConcreteComponentInfo getCCInfoFromID(String ccID) {
    ConcreteComponentInfo ccInfo = null;

    String messageQuery = "SELECT ccs FROM ConcreteComponentSpecification ccs " + "WHERE ccs.componentID = '" + ccID
        + "'";

    List<ConcreteComponentInfo> list = lookup.query(messageQuery);
    Iterator<ConcreteComponentInfo> it = list.iterator();
    LOGGER.info("query executed!!");
    if (it.hasNext()) {
      ccInfo = it.next();

    }


    return ccInfo;
  }

  public List<ConcreteComponentInfo> getCCFromAbstractComponentID(String acID) {

    String messageQuery = "SELECT ccs FROM ConcreteComponentSpecification ccs " + "WHERE ccs.abstractComponentID = '"
        + acID + "'";

    List<ConcreteComponentInfo> ccInfoList = lookup.query(messageQuery);

    LOGGER.info("query executed!!");
    
    return ccInfoList;
  }


  public int getCCTotalNumber() {
    int CCTotalNumber = 0;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query
    Query query = session.createQuery("SELECT count(ccs) FROM ConcreteComponentSpecification ccs");

    CCTotalNumber = ((Number) query.uniqueResult()).intValue();
    session.close();

    return CCTotalNumber;
  }

  private ConcreteComponentInfo ccSpec2ccInfo(ConcreteComponentSpecification ccSpec) {
    ConcreteComponentInfo ccInfo = new ConcreteComponentInfo();

    ccInfo.setComponentID(ccSpec.getComponentID());
    ccInfo.setComponentName(ccSpec.getComponentName());
    ccInfo.setAbstractComponentID(ccSpec.getAbstractComponentID());
    ccInfo.setComponentDescription(ccSpec.getComponentDescription());
    List<InterfaceInfo> pI = new ArrayList<InterfaceInfo>();
    List<InterfaceInfo> rI = new ArrayList<InterfaceInfo>();
    EList<ProvidedInterface> pIList = ccSpec.getFunctional().getControllerInterface().getProvidedInterfaces()
        .getInterface();
    for (ProvidedInterface pIAux : pIList) {
      EList<Operation> opEList = pIAux.getInterfaceSpecification().getPortType().getOperation();
      List<OperationInfo> opList = new ArrayList<OperationInfo>();
      for (Operation op : opEList) {
        OperationInfo opAux = new OperationInfo();
        opAux.setName(op.getName());

        List<InputElement> ieEList = op.getInput().getElement();
        List<ElementInfo> ieList = new ArrayList<ElementInfo>();
        for (InputElement ie : ieEList) {
          ElementInfo ieAux = new ElementInfo(ie.getName(), ie.getType());
          ieList.add(ieAux);
        }
        InputInfo in = new InputInfo(op.getInput().getName(), op.getInput().getType(), ieList);
        opAux.setInput(in);

        if (op.getOutput() != null) {
          List<OutputElement> oeEList = op.getOutput().getElement();
          List<ElementInfo> oeList = new ArrayList<ElementInfo>();
          for (OutputElement oe : oeEList) {
            ElementInfo oeAux = new ElementInfo(oe.getName(), oe.getType());
            oeList.add(oeAux);
          }
          OutputInfo out = new OutputInfo(op.getOutput().getName(), op.getOutput().getType(), oeList);
          opAux.setOutput(out);
        }
        opList.add(opAux);
      }
      InterfaceInfo interfaceInfoAux = new InterfaceInfo(pIAux.getInterfaceID(), opList);
      pI.add(interfaceInfoAux);
    }
    if (ccSpec.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
      EList<RequiredInterface> rIList = ccSpec.getFunctional().getControllerInterface().getRequiredInterfaces()
          .getInterface();
      for (RequiredInterface rIAux : rIList) {
        EList<Operation> opEList = rIAux.getInterfaceSpecification().getPortType().getOperation();
        List<OperationInfo> opList = new ArrayList<OperationInfo>();
        for (Operation op : opEList) {
          OperationInfo opAux = new OperationInfo();
          opAux.setName(op.getName());

          List<InputElement> ieEList = op.getInput().getElement();
          List<ElementInfo> ieList = new ArrayList<ElementInfo>();
          for (InputElement ie : ieEList) {
            ElementInfo ieAux = new ElementInfo(ie.getName(), ie.getType());
            ieList.add(ieAux);
          }
          InputInfo in = new InputInfo(op.getInput().getName(), op.getInput().getType(), ieList);
          opAux.setInput(in);

          if (op.getOutput() != null) {
            List<OutputElement> oeEList = op.getOutput().getElement();
            List<ElementInfo> oeList = new ArrayList<ElementInfo>();
            for (OutputElement oe : oeEList) {
              ElementInfo oeAux = new ElementInfo(oe.getName(), oe.getType());
              oeList.add(oeAux);
            }
            OutputInfo out = new OutputInfo(op.getOutput().getName(), op.getOutput().getType(), oeList);
            opAux.setOutput(out);
          }
          opList.add(opAux);
        }
        InterfaceInfo interfaceInfoAux = new InterfaceInfo(rIAux.getInterfaceID(), opList);
        rI.add(interfaceInfoAux);
      }
    }
    ccInfo.setProvidedInterfaces(pI);
    ccInfo.setRequiredInterfaces(rI);

    return ccInfo;
  }

  private void getDataStoreCCFromManageDB() {
    dataStoreCC = null;

    dataStoreCC = managedb.getDataStoreCC();

    if (dataStoreCC == null)
      LOGGER.info("[ManageConcreteComponents - getDataStoreCCFromManageDB] Error getting the DataStoreCC");
    else
      LOGGER.info("[ManageConcreteComponents - getDataStoreCCFromManageDB] DataStoreCC is OK");

  }

  public List<String> getListCC(int page) {

    List<String> listCC = new ArrayList<String>();

    String messageQuery = "SELECT ccs FROM ConcreteComponentSpecification ccs";

    List<ConcreteComponentInfo> list = lookup.queryIndex(messageQuery, page * 100, 100);
    LOGGER.info("[ManageConcreteComponents - getListCC] query executed");
    if (list != null) {

      // Trim the list with the pagination info
      // List<ConcreteComponentSpecification> sublist = list.subList(0, 99 >
      // list.size() ? list.size() : 99);
      // for (ConcreteComponentSpecification ccs : sublist) {
      // listCC.add(ccs.getComponentID());
      // }

      for (ConcreteComponentInfo ccs : list) {
        listCC.add(ccs.getComponentID());
      }

    }

    return listCC;
  }

}
