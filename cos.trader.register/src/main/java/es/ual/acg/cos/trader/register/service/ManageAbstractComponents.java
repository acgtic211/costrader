package es.ual.acg.cos.trader.register.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acmm.AbstractComponentSpecification;
import es.ual.acg.cos.trader.definitions.AbstractComponentInfo;
import es.ual.acg.cos.trader.definitions.ElementInfo;
import es.ual.acg.cos.trader.definitions.InputInfo;
import es.ual.acg.cos.trader.definitions.InterfaceInfo;
import es.ual.acg.cos.trader.definitions.OperationInfo;
import es.ual.acg.cos.trader.definitions.OutputInfo;
import es.ual.acg.cos.trader.register.repository.ManageDB;

@Repository
public class ManageAbstractComponents {

  @Autowired
  ManageDB managedb;

  private HbDataStore dataStoreAC;

  private static final Logger LOGGER = Logger.getLogger(ManageAbstractComponents.class);

  public ManageAbstractComponents() {
    LOGGER.info("ManageAbstractComponents created");
  }

  public List<String> getListAC() {

    List<String> listAC = new ArrayList<String>();

    this.getDataStoreACFromManageDB();

    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Create query
    Query query = session.createQuery("FROM AbstractComponentSpecification acs");
    List<?> acsList = query.list();
    for (Object acsO : acsList) {
      if (acsO instanceof AbstractComponentSpecification) {
        AbstractComponentSpecification acs = (AbstractComponentSpecification) acsO;
        listAC.add(acs.getComponentID());
      }
    }

    // Close the session.
    session.close();

    return listAC;
  }

  public AbstractComponentInfo getACInfoFromID(String acID) {

    AbstractComponentSpecification acs = null;
    AbstractComponentInfo acsInfo = null;

    this.getDataStoreACFromManageDB();

    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Create query
    Query query = session.createQuery("FROM AbstractComponentSpecification acs WHERE acs.componentID = '" + acID + "'");
    List<?> acsList = query.list();
    if (acsList.size() != 0) {
      acs = (AbstractComponentSpecification) acsList.get(0);
      acsInfo = acSpec2acInfo(acs);
    }

    // Close the session.
    session.close();

    return acsInfo;
  }

  private AbstractComponentInfo acSpec2acInfo(AbstractComponentSpecification acSpec) {

    AbstractComponentInfo acInfo = new AbstractComponentInfo();

    acInfo.setComponentID(acSpec.getComponentID());
    acInfo.setComponentName(acSpec.getComponentName());
    acInfo.setComponentDescription(acSpec.getComponentDescription());
    List<InterfaceInfo> pI = new ArrayList<InterfaceInfo>();
    List<InterfaceInfo> rI = new ArrayList<InterfaceInfo>();
    EList<acmm.ProvidedInterface> pIList = acSpec.getFunctional().getProvidedInterfaces().getInterface();
    for (acmm.ProvidedInterface pIAux : pIList) {
      EList<acmm.Operation> opEList = pIAux.getInterfaceSpecification().getPortType().getOperation();
      List<OperationInfo> opList = new ArrayList<OperationInfo>();
      for (acmm.Operation op : opEList) {
        OperationInfo opAux = new OperationInfo();
        opAux.setName(op.getName());

        List<acmm.InputElement> ieEList = op.getInput().getElement();
        List<ElementInfo> ieList = new ArrayList<ElementInfo>();
        for (acmm.InputElement ie : ieEList) {
          ElementInfo ieAux = new ElementInfo(ie.getName(), ie.getType());
          ieList.add(ieAux);
        }
        InputInfo in = new InputInfo(op.getInput().getName(), op.getInput().getType(), ieList);
        opAux.setInput(in);

        if (op.getOutput() != null) {
          List<acmm.OutputElement> oeEList = op.getOutput().getElement();
          List<ElementInfo> oeList = new ArrayList<ElementInfo>();
          for (acmm.OutputElement oe : oeEList) {
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
    if (acSpec.getFunctional().getRequiredInterfaces() != null) {
      EList<acmm.RequiredInterface> rIList = acSpec.getFunctional().getRequiredInterfaces().getInterface();
      for (acmm.RequiredInterface rIAux : rIList) {
        EList<acmm.Operation> opEList = rIAux.getInterfaceSpecification().getPortType().getOperation();
        List<OperationInfo> opList = new ArrayList<OperationInfo>();
        for (acmm.Operation op : opEList) {
          OperationInfo opAux = new OperationInfo();
          opAux.setName(op.getName());

          List<acmm.InputElement> ieEList = op.getInput().getElement();
          List<ElementInfo> ieList = new ArrayList<ElementInfo>();
          for (acmm.InputElement ie : ieEList) {
            ElementInfo ieAux = new ElementInfo(ie.getName(), ie.getType());
            ieList.add(ieAux);
          }
          InputInfo in = new InputInfo(op.getInput().getName(), op.getInput().getType(), ieList);
          opAux.setInput(in);

          if (op.getOutput() != null) {
            List<acmm.OutputElement> oeEList = op.getOutput().getElement();
            List<ElementInfo> oeList = new ArrayList<ElementInfo>();
            for (acmm.OutputElement oe : oeEList) {
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
    acInfo.setProvidedInterfaces(pI);
    acInfo.setRequiredInterfaces(rI);

    return acInfo;
  }

  private void getDataStoreACFromManageDB() {

    LOGGER.info("Getting the DataStore from ManageDB");

    /*
     * dataStoreAC = null;
     * 
     * ManageDB managdb = null; Context initialContext; try { initialContext = new
     * InitialContext();
     * 
     * managdb = (ManageDB) initialContext.lookup("java:app/COS-trader/ManageDB");
     * dataStoreAC = managdb.getDataStoreAC(); } catch (NamingException e) {
     * e.printStackTrace(); }
     */

    // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    // ManageDB managdb = (ManageDB) context.getBean("beanMDB");

    // WELL
    // AnnotationConfigApplicationContext context =
    // new AnnotationConfigApplicationContext(AppConfig.class);
    // ManageDB managdb = context.getBean("beanMDB", ManageDB.class);

    // Singleton alternative
    //ManageDBSingleton managdb = ManageDBSingleton.getInstance();

    dataStoreAC = managedb.getDataStoreAC();

    if (dataStoreAC == null)
      LOGGER.info("[ManageAbstractComponents - getDataStoreACFromManageDB] Error getting the DataStoreAC");
    else
      LOGGER.info("[ManageAbstractComponents - getDataStoreACFromManageDB] DataStoreAC is OK");

    // context.close();

  }

  public HbDataStore getDataStoreAC() {
    return dataStoreAC;
  }

  public void setDataStoreAC(HbDataStore dataStoreAC) {
    this.dataStoreAC = dataStoreAC;
  }
}
