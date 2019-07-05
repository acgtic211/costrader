package es.ual.acg.cos.trader.lookup.service;

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
import org.springframework.stereotype.Service;

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
import es.ual.acg.cos.trader.lookup.repository.ManageDB;

@Service
public class Lookup {

  @Autowired
  ManageDB managdb;

  private HbDataStore dataStoreCC;

  private static final Logger log = Logger.getLogger(Lookup.class);

  @SuppressWarnings("unchecked")
  public List<ConcreteComponentSpecification> queryTest() {
    List<ConcreteComponentSpecification> result = null;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query

    // Query example
    // Query query =
    // session.createQuery("FROM ConcreteComponentSpecification ccs WHERE
    // ccs.abstractComponentID = 'twitter'");

    // Query example for selecting components with an identified provided
    // interface
    /*
     * Query query = session.createQuery(
     * "SELECT ccs FROM ConcreteComponentSpecification ccs, " +
     * "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi " +
     * "WHERE ccs.abstractComponentID = 'twitter' " +
     * "AND pi.interfaceID = 'manageTwitter'");
     */

    // Query example for selecting components with an identified port type
    Query query = session.createQuery("SELECT ccs FROM ConcreteComponentSpecification ccs, "
        + "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
        + "IN (pi.interfaceSpecification.portType) pt " + "WHERE ccs.abstractComponentID = 'twitter' "
        + "AND pt.name = 'manageTweets'");

    log.info("[Lookup - query] - Query constructed");

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      log.info("[Lookup - query] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentSpecification>();
      Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
      while (it.hasNext()) {
        ConcreteComponentSpecification aux = it.next();
        result.add(aux);
      }
    }

    return result;
  }

  @SuppressWarnings("unchecked")
  public List<ConcreteComponentSpecification> queryAnt(String messageQuery) {
    List<ConcreteComponentSpecification> result = null;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query
    Query query = session.createQuery(messageQuery);

    log.info("[Lookup - query] - Query constructed");

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      log.info("[Lookup - query] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentSpecification>();
      Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
      while (it.hasNext()) {
        ConcreteComponentSpecification aux = it.next();
        result.add(aux);
      }
    }

    return result;
  }

  @SuppressWarnings("unchecked")
  public List<ConcreteComponentSpecification> queryAnt(String messageQuery, int firstResult, int maxResult) {
    List<ConcreteComponentSpecification> result = null;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query
    Query query = session.createQuery(messageQuery);
    query.setFirstResult(firstResult).setMaxResults(maxResult);

    log.info("[Lookup - query] - Query constructed");

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      log.info("[Lookup - query] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentSpecification>();
      Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
      while (it.hasNext()) {
        ConcreteComponentSpecification aux = it.next();
        result.add(aux);
      }
    }

    return result;
  }
  
  @SuppressWarnings("unchecked")
  public List<ConcreteComponentInfo> query(String messageQuery) {
    List<ConcreteComponentInfo> result = null;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query
    Query query = session.createQuery(messageQuery);

    log.info("[Lookup - query] - Query constructed");

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      log.info("[Lookup - query] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentInfo>();
      Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
      while (it.hasNext()) {
        ConcreteComponentSpecification aux = it.next();
        result.add(this.ccSpec2ccInfo(aux));
      }
    }

    return result;
  }
  
  @SuppressWarnings("unchecked")
  public List<ConcreteComponentInfo> query(String messageQuery, int firstResult, int maxResult) {
    List<ConcreteComponentInfo> result = null;

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Construct the query
    Query query = session.createQuery(messageQuery);
    query.setFirstResult(firstResult).setMaxResults(maxResult);

    log.info("[Lookup - query] - Query constructed");

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      log.info("[Lookup - query] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentInfo>();
      Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
      while (it.hasNext()) {
        ConcreteComponentSpecification aux = it.next();
        result.add(this.ccSpec2ccInfo(aux));
      }
    }

    return result;
  }

  private void getDataStoreCCFromManageDB() {
    dataStoreCC = managdb.getDataStoreCC();

    if (dataStoreCC == null) {
      log.info("[Lookup] Error getting the DataStoreCC");
    }

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

}
