package es.ual.acg.cos.trader.configs.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;
import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.ConcreteComponent;
import architectural_metamodel.Port;
import es.ual.acg.cos.trader.configs.repository.ManageDB;

@Service
public class ManageArchitectures {

  @Autowired
  ManageDB managedb;

  private HbDataStore dataStore;

  private static final Logger LOGGER = Logger.getLogger(ManageArchitectures.class);

  public String exportCAMFromString(String camFileType, String camFileString) {
    // It is necessary for the SOAP message, that the input String has
    // <![CDATA["" at the start and
    // "]]>" at the end

    String result = "";

    ConcreteArchitecturalModel cam = null;
    String camID = null;
    try {
      cam = (ConcreteArchitecturalModel) convertXMIStringToEObject(camFileString);
      camID = cam.getCamID();
      LOGGER.info("Read CAM ID: " + camID);
    } catch (IOException e) {
      LOGGER.error(e);
    }

    if (cam != null) {
      getDataStoreFromManageDB();

      SessionFactory sessionFactory = dataStore.getSessionFactory();

      // Open a new Session
      Session session = sessionFactory.openSession();

      // Check if the CAM ID does exist
      Query query = session.createQuery("FROM ConcreteArchitecturalModel cam WHERE cam.camID = '" + camID + "'");
      List<?> ccsList = query.list();
      if (ccsList.size() == 0) {
        result = camID + " ID does not exist --> Insert CAM Specification";
        LOGGER.info(result);

        AbstractArchitecturalModel aam = getAbstractArchitecturalModel(cam.getAamID(), session);
        cam.setAam(aam);

        // Start transaction
        session.beginTransaction();

        session.save(cam);

        // Commit the changes to the database.
        session.getTransaction().commit();

      } else {
        result = cam + " ID exist --> CAM Specification is not inserted";
        LOGGER.info(result);
      }

      // Close the session.
      session.close();

    }

    return result;
  }

  private static AbstractArchitecturalModel getAbstractArchitecturalModel(String aamID, Session session) {
    AbstractArchitecturalModel aam = null;

    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID='" + aamID + "'");
    List<?> aamList = query.list();
    if (aamList.size() == 1) {
      System.out.println("AAM has been found");
      aam = (AbstractArchitecturalModel) aamList.get(0);
    } else {
      System.out.println("AAM has not been found");
    }

    return aam;
  }

  public String exportAAMFromString(String aamFileType, String aamFileString) {
    // It is necessary for the SOAP message, that the input String has
    // <![CDATA["" at the start and
    // "]]>" at the end

    String result = "";

    AbstractArchitecturalModel aam = null;
    String aamID = null;
    try {
      aam = (AbstractArchitecturalModel) convertXMIStringToEObject(aamFileString);
      aamID = aam.getAamID();
      LOGGER.info("Read AAM ID: " + aamID);
    } catch (IOException e) {
      LOGGER.error(e.toString());
    }

    if (aam != null) {
      getDataStoreFromManageDB();

      SessionFactory sessionFactory = dataStore.getSessionFactory();

      // Open a new Session
      Session session = sessionFactory.openSession();

      // Check if the CAM ID does exist
      Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
      List<?> ccsList = query.list();
      if (ccsList.size() == 0) {
        result = aamID + " ID does not exist --> Insert AAM Specification";
        LOGGER.info(result);

        // Start transaction
        session.beginTransaction();

        session.save(aam);

        // Commit the changes to the database.
        session.getTransaction().commit();

      } else {
        result = aam + " ID exist --> AAM Specification is not inserted";
        LOGGER.info(result);
      }

      // Close the session.
      session.close();

    }

    return result;
  }

  public String withdrawCAM(String camID) {
    String result = "";
    getDataStoreFromManageDB();
    SessionFactory sessionFactory = dataStore.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session.createQuery("FROM ConcreteArchitecturalModel cam WHERE cam.camID = '" + camID + "'");
    List<?> camsList = query.list();
    if (camsList.size() == 0) {
      result = camID + " ID does not exist --> Cannot delete CAM Specification";
      LOGGER.info(result);
    } else {
      result = camID + " ID exist --> Deleting CAM Specification...";
      LOGGER.info(result);

      ConcreteArchitecturalModel cam = (ConcreteArchitecturalModel) camsList.get(0);

      // Start transaction
      session.beginTransaction();

      for (ConcreteComponent cc : cam.getConcreteComponent()) {
        for (Port p : cc.getPort())
          session.delete(p);
        session.delete(cc);
      }

      session.delete(cam);

      // Commit the changes to the database.
      session.getTransaction().commit();

      LOGGER.info(" CAM Specification has been deleted");
    }
    // Close the session.
    session.close();

    return result;
  }

  public String withdrawAAM(String aamID) {
    String result = "";
    getDataStoreFromManageDB();
    SessionFactory sessionFactory = dataStore.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
    List<?> aamsList = query.list();
    if (aamsList.size() == 0) {
      result = aamID + " ID does not exist --> Cannot delete AAM Specification";
      LOGGER.info(result);
    } else {
      result = aamID + " ID exist --> Deleting AAM Specification...";
      LOGGER.info(result);

      AbstractArchitecturalModel aam = (AbstractArchitecturalModel) aamsList.get(0);

      // Start transaction
      session.beginTransaction();

      session.delete(aam);

      // Commit the changes to the database.
      session.getTransaction().commit();

      LOGGER.info(" AAM Specification has been deleted");
    }
    // Close the session.
    session.close();

    return result;
  }

  private void getDataStoreFromManageDB() {

    dataStore = managedb.getDataStore();

    if (dataStore == null)
      LOGGER.info("[ManageArchitectures] Error getting the DataStore");

  }

  private EObject convertXMIStringToEObject(String xmiString) throws IOException {
    XMIResourceImpl resource = new XMIResourceImpl();
    // resource.setEncoding("UTF-8");
    resource.setEncoding("UTF-8");
    resource.load(new InputSource(new StringReader(xmiString)), null);

    return resource.getContents().get(0);
  }

}
