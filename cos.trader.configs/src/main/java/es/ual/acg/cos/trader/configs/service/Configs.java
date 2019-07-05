package es.ual.acg.cos.trader.configs.service;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import architectural_metamodel.AbstractArchitecturalModel;
import es.ual.acg.cos.trader.configs.clients.HeuristicsClient;
import es.ual.acg.cos.trader.configs.repository.ManageDB;

@Service
public class Configs {

  @Autowired
  ManageDB managedb;

  @Autowired
  HeuristicsClient heuristics;

  private HbDataStore dataStore;
  private static final Logger LOGGER = Logger.getLogger(Configs.class);

  public String solveCAMv5(String aamID) {

    String result = "";
    AbstractArchitecturalModel aam = null;

    this.getDataStoreFromManageDB();
    SessionFactory sessionFactory = dataStore.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the AAM ID does exist
    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
    List<?> aamsList = query.list();
    if (aamsList.size() == 0) {
      result = aamID + " ID does not exist --> Cannot solve AAM Specification";
      LOGGER.info(result);
    } else {
      result = aamID + " ID exist --> Solving AAM Specification...";
      LOGGER.info(result);

      aam = EcoreUtil.copy((AbstractArchitecturalModel) aamsList.get(0));
    }
    // Close the session.
    session.close();

    // Invoke the aStar algorithm
    result = heuristics.solveCAMv5(aam);

    return result;
  }

  public void solveCAMv5simulation(String aamID) {

    AbstractArchitecturalModel aam = null;

    this.getDataStoreFromManageDB();
    SessionFactory sessionFactory = dataStore.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the AAM ID does exist
    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
    List<?> aamsList = query.list();
    if (aamsList.size() == 0) {
      LOGGER.info(aamID + " ID does not exist --> Cannot solve AAM Specification");
    } else {
      LOGGER.info(aamID + " ID exist --> Solving AAM Specification...");

      aam = EcoreUtil.copy((AbstractArchitecturalModel) aamsList.get(0));
    }
    // Close the session.
    session.close();

    // Invoke the aStar algorithm
    heuristics.solveCAMv5simulation(aam);

  }

  public List<String> solveCAMv6(String aamID) {

    List<String> result = null;
//    String message = "";
//    AbstractArchitecturalModel aam = null;
//
//    this.getDataStoreFromManageDB();
//    SessionFactory sessionFactory = dataStore.getSessionFactory();
//
//    // Open a new Session
//    Session session = sessionFactory.openSession();
//
//    // Check if the AAM ID does exist
//    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
//    List<?> aamsList = query.list();
//    if (aamsList.size() == 0) {
//      message = aamID + " ID does not exist --> Cannot solve AAM Specification";
//      LOGGER.info(message);
//    } else {
//      message = aamID + " ID exist --> Solving AAM Specification...";
//      LOGGER.info(message);
//
//      aam = EcoreUtil.copy((AbstractArchitecturalModel) aamsList.get(0));
//    }
//    // Close the session.
//    session.close();

    // Invoke the aStar algorithm
    result = heuristics.solveCAMv6(aamID);

    return result;
  }

  public void solveCAMv6simulation(String aamID, int gIncrement) {

//    AbstractArchitecturalModel aam = null;
//
//    this.getDataStoreFromManageDB();
//    SessionFactory sessionFactory = dataStore.getSessionFactory();
//
//    // Open a new Session
//    Session session = sessionFactory.openSession();
//
//    // Check if the AAM ID does exist
//    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
//    List<?> aamsList = query.list();
//    if (aamsList.size() == 0) {
//      LOGGER.info(aamID + " ID does not exist --> Cannot solve AAM Specification");
//    } else {
//      LOGGER.info(aamID + " ID exist --> Solving AAM Specification...");
//
//      aam = EcoreUtil.copy((AbstractArchitecturalModel) aamsList.get(0));
//    }
//    // Close the session.
//    session.close();

    // Invoke the aStar algorithm
    heuristics.solveCAMv6simulation(aamID, gIncrement);

  }

  private void getDataStoreFromManageDB() {

    dataStore = managedb.getDataStore();

    if (dataStore == null) {
      LOGGER.info("[Configs - getDataStoreFromManageDB] Error getting the DataStore");
    }

  }
}
