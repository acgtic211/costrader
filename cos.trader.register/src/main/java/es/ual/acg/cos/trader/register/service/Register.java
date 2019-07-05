package es.ual.acg.cos.trader.register.service;

import groovy.xml.QName;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

//import javax.ejb.Singleton;
//import javax.ejb.Stateful;
//import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;

import acmm.AbstractComponentSpecification;
import acmm.AcmmPackage;
import ccmm.CcmmFactory;
import ccmm.CcmmPackage;
import ccmm.ConcreteComponentSpecification;
import ccmm.WSDLSpecification;
import es.ual.acg.cos.trader.register.repository.ManageDB;
import es.ual.acg.cos.trader.register.singleton.ManageDBSingleton;

import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.Schema;
import com.predic8.schema.Sequence;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Input;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.Output;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;

//@Stateless
//@Stateful
//@Singleton
@Service
public class Register {
  
  @Autowired
  ManageDB managdb; 
  
  private HbDataStore dataStoreAC;
  private HbDataStore dataStoreCC;

  private static final Logger LOGGER = Logger.getLogger(Register.class);

  /*
   * public String wsdl2model(String wsdlURI) { long timeStart, timeEnd;
   * timeStart = System.currentTimeMillis();
   * 
   * log.info("WSDL URI: " + wsdlURI);
   * 
   * Document d; try { d =
   * DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(wsdlURI);
   * 
   * NodeList portTypeNodeList = d.getElementsByTagName("wsdl:portType"); Node
   * portTypeNode = null; Node operationNode = null;
   * log.info("portTypeNodeList size: " + portTypeNodeList.getLength()); for(int
   * i = 0; i< portTypeNodeList.getLength(); i++) { portTypeNode =
   * portTypeNodeList.item(i); String portTypeName =
   * portTypeNode.getAttributes().getNamedItem("name").getNodeValue();
   * log.info("--PortType --> " + portTypeName);
   * 
   * log.info("nn: " + portTypeNode.getNodeName()); log.info("nn: " +
   * portTypeNode.getLocalName()); log.info("nn: " +
   * portTypeNode.getNodeValue());
   * 
   * NodeList operationNodeList = portTypeNode.getChildNodes();
   * log.info("operationNodeList size: " + operationNodeList.getLength());
   * for(int j = 0; j < operationNodeList.getLength(); j++) { operationNode =
   * operationNodeList.item(j); log.info("oo: " + operationNode.getNodeName());
   * log.info("oo: " + operationNode.getLocalName()); log.info("oo: " +
   * operationNode.getNodeValue()); String operationName =
   * operationNode.getAttributes().getNamedItem("name").getNodeValue();
   * log.info("----Operation --> " + operationName);
   * 
   * } }
   * 
   * NodeList elements = d.getElementsByTagName("wsdl:operation");
   * log.info("elements size: " + elements.getLength()); ArrayList<String>
   * operations = new ArrayList<String>(); for (int i = 0; i <
   * elements.getLength(); i++) { String operationName =
   * elements.item(i).getAttributes().getNamedItem("name").getNodeValue();
   * operations.add(operationName); log.info("Operation: " + operationName); }
   * log.info(operations.toArray(new String[operations.size()]));
   * 
   * } catch (FileNotFoundException e) { log.error("FileNotFoundException: " +
   * e.getMessage()); } catch (SAXException e) { log.error("SAXException: " +
   * e.getMessage()); } catch (IOException e) { log.error("IOException: " +
   * e.getMessage()); } catch (ParserConfigurationException e) {
   * log.error("ParserConfigurationException: " + e.getMessage()); }
   * 
   * timeEnd = System.currentTimeMillis();
   * log.info("[Register - wsdl2model] Time for parsing WSDL: " +
   * (timeEnd-timeStart)); return null;
   * 
   * }
   */

  public String wsdlparser(String wsdlURI) {
    long timeStart, timeEnd;
    timeStart = System.currentTimeMillis();

    WSDLSpecification wsdlSpec = CcmmFactory.eINSTANCE
        .createWSDLSpecification();
    wsdlSpec.setUri(wsdlURI);

    String result = "";

    WSDLParser parser = new WSDLParser();
    Definitions wsdlDef = parser.parse(wsdlURI);
    List<PortType> portTypeList = wsdlDef.getPortTypes();
    for (PortType portType : portTypeList) {
      String portTypeName = portType.getName();

      ccmm.PortType pCcm = CcmmFactory.eINSTANCE.createPortType();
      pCcm.setName(portTypeName);
      wsdlSpec.setPortType(pCcm);

      LOGGER.info("--PortType -->" + portTypeName);
      List<Operation> operationList = portType.getOperations();
      for (Operation operation : operationList) {
        String operationName = operation.getName();
        LOGGER.info("----Operation --> " + operationName);

        ccmm.Operation oCcm = CcmmFactory.eINSTANCE.createOperation();
        oCcm.setName(operationName);

        // Input
        Input input = operation.getInput();
        if (input != null) {
          String inputName = input.getName();

          ccmm.Input inputCcm = CcmmFactory.eINSTANCE.createInput();
          inputCcm.setName(inputName);

          LOGGER.info("------Input --> " + inputName);
          Element inputElement = input.getMessage().getParts().get(0)
              .getElement();
          LOGGER.info("--------InputElement --> " + inputElement.getName());
          // log.info("--------InputElementDef --> " +
          // inputElement.getAsString());

          QName inputType = inputElement.getType();
          LOGGER.info("--------InputType --> " + inputType);
          Schema inputSchema = inputElement.getSchema();
          // Element inputTypeElement = inputSchema.getElement(inputType);
          // TypeDefinition inputTypeDef = inputSchema.getType(inputType);
          // log.info("--------InputTypeElement -->" +
          // inputTypeElement.getAsString());
          // log.info("--------InputTypeDef --> " + inputTypeDef.getAsString());

          ComplexType complexType = inputSchema.getComplexType(inputElement
              .getName());
          Sequence sequence = complexType.getSequence();
          List<Element> elementList = sequence.getElements();
          LOGGER.info("--------Elements: ");
          for (Element element : elementList) {
            ccmm.InputElement inputElemCcm = CcmmFactory.eINSTANCE
                .createInputElement();
            inputElemCcm.setName(element.getName());
            inputElemCcm.setType(element.getType().toString());
            inputCcm.getElement().add(inputElemCcm);

            LOGGER.info("----------ElementName --> " + element.getName());
            LOGGER.info("----------ElementType --> " + element.getType());
          }
          oCcm.setInput(inputCcm);
        }

        // Output
        Output output = operation.getOutput();
        if (output != null) {
          String outputName = output.getName();

          ccmm.Output outputCcm = CcmmFactory.eINSTANCE.createOutput();
          outputCcm.setName(outputName);

          LOGGER.info("------Output --> " + outputName);
          Element outputElement = output.getMessage().getParts().get(0)
              .getElement();
          LOGGER.info("--------OutputElement --> " + outputElement.getName());

          QName outputType = outputElement.getType();
          LOGGER.info("--------OutputType --> " + outputType);
          Schema outputSchema = outputElement.getSchema();

          ComplexType complexType = outputSchema.getComplexType(outputElement
              .getName());
          Sequence sequence = complexType.getSequence();
          List<Element> elementList = sequence.getElements();
          LOGGER.info("--------Elements: ");
          for (Element element : elementList) {
            ccmm.OutputElement outputElemCcm = CcmmFactory.eINSTANCE
                .createOutputElement();
            outputElemCcm.setName(element.getName());
            outputElemCcm.setType(element.getType().toString());
            outputCcm.getElement().add(outputElemCcm);

            LOGGER.info("----------ElementName --> " + element.getName());
            LOGGER.info("----------ElementType --> " + element.getType());
          }
          oCcm.setOutput(outputCcm);
        }

        pCcm.getOperation().add(oCcm);
      }
    }

    // result = wsdlSpec.toString();
    result = convertToXml(wsdlSpec);
    // XMLResourceImpl r = convertToXmlResourceImpl(wsdlSpec);

    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Register - wsdlparser] Time for parsing WSDL: "
        + (timeEnd - timeStart));

    return result;
  }

  private String convertToXml(EObject eObject) {
    String result = "";
    XMLResourceImpl resource = new XMLResourceImpl();
    XMLProcessor processor = new XMLProcessor();
    resource.setEncoding("UTF-8");
    resource.getContents().add(eObject);
    try {
      result = processor.saveToString(resource, null);
    } catch (IOException e) {
      LOGGER.error("IOException: " + e.getMessage());
    }
    return result;
  }

  public String exportCCFromURI(String ccFileType, String ccFileURI) {
    String result = "";

    ConcreteComponentSpecification cc = readCCFromURI(ccFileURI);
    String componentID = cc.getComponentID();
    LOGGER.info("Read CC ID: " + componentID);

    getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session
        .createQuery("FROM ConcreteComponentSpecification ccs WHERE ccs.componentID = '"
            + componentID + "'");
    List<?> ccsList = query.list();
    if (ccsList.size() == 0) {
      result = componentID + " ID does not exist --> Insert CC Specification";
      LOGGER.info(result);

      // Start transaction
      session.beginTransaction();

      session.save(cc);

      // Commit the changes to the database.
      session.getTransaction().commit();

    } else {
      result = componentID + " ID exist --> CC Specification is not inserted";
      LOGGER.info(result);
    }

    // Close the session.
    session.close();

    return result;
  }

  public String exportCCFromString(String ccFileType, String ccFileString) {
    // It is necessary for the SOAP message, that the input String has
    // <![CDATA["" at the start and
    // "]]>" at the end

    String result = "";

    // log.info("ccFileString: " + ccFileString);
    // log.info("exportFromString!!!!!");

    ConcreteComponentSpecification cc = null;
    String componentID = null;
    try {
      cc = (ConcreteComponentSpecification) convertXMIStringToEObject(ccFileString);
      componentID = cc.getComponentID();
      LOGGER.info("Read CC ID: " + componentID);
    } catch (IOException e) {
      LOGGER.error(e.toString());
    }

    if (cc != null) {
      getDataStoreCCFromManageDB();

      SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

      // Open a new Session
      Session session = sessionFactory.openSession();

      // Check if the CC ID does exist
      Query query = session
          .createQuery("FROM ConcreteComponentSpecification ccs WHERE ccs.componentID = '"
              + componentID + "'");
      List<?> ccsList = query.list();
      if (ccsList.size() == 0) {
        result = componentID + " ID does not exist --> Insert CC Specification";
        LOGGER.info(result);

        // Start transaction
        session.beginTransaction();

        session.save(cc);

        // Commit the changes to the database.
        session.getTransaction().commit();

      } else {
        result = componentID + " ID exist --> CC Specification is not inserted";
        LOGGER.info(result);
      }

      // Close the session.
      session.close();

    }

    return result;
  }

  public boolean exportCCFromObject(ConcreteComponentSpecification ccs) {

    boolean result = false;

    if (ccs != null) {
      getDataStoreCCFromManageDB();

      SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

      // Open a new Session
      Session session = sessionFactory.openSession();

      // Check if the CC ID does exist
      String componentID = ccs.getComponentID();
      Query query = session
          .createQuery("FROM ConcreteComponentSpecification ccs WHERE ccs.componentID = '"
              + componentID + "'");
      List<?> ccsList = query.list();
      if (ccsList.size() == 0) {
        String msg = componentID
            + " ID does not exist --> Insert CC Specification";
        LOGGER.info(msg);

        // Start transaction
        session.beginTransaction();

        session.save(ccs);

        // Commit the changes to the database.
        session.getTransaction().commit();

        result = true;

      } else {
        String msg = componentID
            + " ID exist --> CC Specification is not inserted";
        LOGGER.info(msg);
      }

      // Close the session.
      session.close();

    }

    return result;
  }

  public String exportACFromURI(String acFileType, String acFileURI) {
    String result = "";

    AbstractComponentSpecification ac = readACFromURI(acFileURI);
    String componentID = ac.getComponentID();
    LOGGER.info("Read AC ID: " + componentID);

    getDataStoreACFromManageDB();

    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session
        .createQuery("FROM AbstractComponentSpecification acs WHERE acs.componentID = '"
            + componentID + "'");
    List<?> ccsList = query.list();
    if (ccsList.size() == 0) {
      result = componentID + " ID does not exist --> Insert AC Specification";
      LOGGER.info(result);

      // Start transaction
      session.beginTransaction();

      session.save(ac);

      // Commit the changes to the database.
      session.getTransaction().commit();

    } else {
      result = componentID + " ID exist --> AC Specification is not inserted";
      LOGGER.info(result);
    }

    // Close the session.
    session.close();

    return result;
  }

  public String exportACFromString(String acFileType, String acFileString) {
    // It is necessary for the SOAP message, that the input String has
    // <![CDATA["" at the start and
    // "]]>" at the end

    String result = "";

    AbstractComponentSpecification acs = null;
    String componentID = null;
    try {
      acs = (AbstractComponentSpecification) convertXMIStringToEObject(acFileString);
      componentID = acs.getComponentID();
      LOGGER.info("Read AC ID: " + componentID);
    } catch (IOException e) {
      LOGGER.error(e.toString());
    }

    if (acs != null) {
      getDataStoreACFromManageDB();

      SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

      // Open a new Session
      Session session = sessionFactory.openSession();

      // Check if the AC ID does exist
      Query query = session
          .createQuery("FROM AbstractComponentSpecification acs "
              + "WHERE acs.componentID = '" + componentID + "'");
      List<?> acsList = query.list();
      if (acsList.size() == 0) {
        result = componentID + " ID does not exist --> Insert AC Specification";
        LOGGER.info(result);

        // Start transaction
        session.beginTransaction();

        session.save(acs);

        // Commit the changes to the database.
        session.getTransaction().commit();

      } else {
        result = componentID + " ID exist --> AC Specification is not inserted";
        LOGGER.info(result);
      }

      // Close the session.
      session.close();

    }

    return result;
  }

  private ConcreteComponentSpecification readCCFromURI(String ccFileURI) {
    // Initialize the model
    CcmmPackage.eINSTANCE.eClass();

    // Register the XMI resource factory for the .xmi extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();

    // Get the resource
    Resource resource = resSet.getResource(URI.createURI(ccFileURI), true);

    // Get the first model element and cast it to the right type
    ConcreteComponentSpecification cc = (ConcreteComponentSpecification) resource
        .getContents().get(0);

    return cc;
  }

  private AbstractComponentSpecification readACFromURI(String acFileURI) {
    // Initialize the model
    AcmmPackage.eINSTANCE.eClass();

    // Register the XMI resource factory for the .xmi extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();

    // Get the resource
    Resource resource = resSet.getResource(URI.createURI(acFileURI), true);

    // Get the first model element and cast it to the right type
    AbstractComponentSpecification ac = (AbstractComponentSpecification) resource
        .getContents().get(0);

    return ac;
  }

  private void getDataStoreCCFromManageDB() {
    dataStoreCC = null;
        
    //ManageDBSingleton managdb = ManageDBSingleton.getInstance();
    dataStoreCC = managdb.getDataStoreCC();
    

    if (dataStoreCC == null)
      LOGGER.info("[Register] Error getting the DataStoreCC");

  }

  private void getDataStoreACFromManageDB() {
    dataStoreAC = null;

    //ManageDBSingleton managdb = ManageDBSingleton.getInstance();
    dataStoreAC = managdb.getDataStoreAC();

    if (dataStoreAC == null)
      LOGGER.info("[Register] Error getting the DataStoreAC");

  }

  public EObject convertXMIStringToEObject(String xmiString) throws IOException {
    XMIResourceImpl resource = new XMIResourceImpl();
    // resource.setEncoding("UTF-8");
    resource.setEncoding("UTF-8");
    resource.load(new InputSource(new StringReader(xmiString)), null);

    return resource.getContents().get(0);
  }

public String withdrawCC(String componentID) {
  String result = "";

  getDataStoreCCFromManageDB();

  SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

  // Open a new Session
  Session session = sessionFactory.openSession();

  // Check if the CC ID does exist
  Query query = session
      .createQuery("FROM ConcreteComponentSpecification ccs WHERE ccs.componentID = '"
          + componentID + "'");
  List<?> ccsList = query.list();
  if (ccsList.size() == 0) {
    result = componentID
        + " ID does not exist --> Cannot delete CC Specification";
    LOGGER.info(result);
  } else {
    result = componentID + " ID exist --> Deleting CC Specification...";
    LOGGER.info(result);

    ConcreteComponentSpecification ccs = (ConcreteComponentSpecification) ccsList
        .get(0);

    // Start transaction
    session.beginTransaction();

    session.delete(ccs);

    // Commit the changes to the database.
    session.getTransaction().commit();

    LOGGER.info(" CC Specification has been deleted");
  }

  // Close the session.
  session.close();

  return result;
}

  public String withdrawAC(String acID) {
    String result = "";

    getDataStoreACFromManageDB();

    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session
        .createQuery("FROM AbstractComponentSpecification acs WHERE acs.componentID = '"
            + acID + "'");
    List<?> acsList = query.list();
    if (acsList.size() == 0) {
      result = acID + " ID does not exist --> Cannot delete AC Specification";
      LOGGER.info(result);
    } else {
      result = acID + " ID exist --> Deleting CC Specification...";
      LOGGER.info(result);

      AbstractComponentSpecification acs = (AbstractComponentSpecification) acsList
          .get(0);

      // Start transaction
      session.beginTransaction();

      session.delete(acs);

      // Commit the changes to the database.
      session.getTransaction().commit();

      LOGGER.info(" AC Specification has been deleted");
    }

    // Close the session.
    session.close();

    return result;
  }

  /*
   * private XMLResourceImpl convertToXmlResourceImpl(EObject eObject) {
   * XMLResourceImpl resource = new XMLResourceImpl(); XMLProcessor processor =
   * new XMLProcessor(); resource.setEncoding("UTF-8");
   * resource.getContents().add(eObject);
   * 
   * return resource; }
   */

  public void registerExampleAC() {

    exportACFromURI("xmi", "http://localhost:8080/models/abstract/map.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/twitter.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/twitter-mark.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/twitter-pack.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/twitter-prop.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/twitter-less.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/cloudStorage.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/header.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/histogram.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/rss.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/legend.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/audio.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/video.xmi");
    exportACFromURI("xmi", "http://localhost:8080/models/abstract/recorder.xmi");

  }

  public void registerExampleCC() {

    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage01.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage02.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage03.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage04.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage05.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage06.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage07.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage08.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage09.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage10.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage11.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage12.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage13.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage14.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage15.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage16.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage17.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage18.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage19.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/cloudStorage/cloudStorage20.xmi");

    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header01.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header02.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header03.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header04.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header05.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header06.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header07.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header08.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header09.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header10.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header11.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header12.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header13.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header14.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header15.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header16.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header17.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header18.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header19.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/header/header20.xmi");

    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram01.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram02.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram03.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram04.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram05.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram06.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram07.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram08.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram09.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram10.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram11.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram12.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram13.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram14.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram15.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram16.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram17.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram18.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram19.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/histogram/histogram20.xmi");

    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/rss/rss20.xmi");

    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/map/map20.xmi");

    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter02.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter03.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter04.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter05.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter06.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter07.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter08.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter09.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter10.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter11.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter12.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter13.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter14.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter15.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter16.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter17.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter18.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter19.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter20.xmi");

    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-dep1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-dep2.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-dep3.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-mark1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-mark2.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-mark3.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-mark4.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-pack1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-pack2.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-prop1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-prop2.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-prop3.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-prov1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-req1.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-req2.xmi");
    exportCCFromURI("xmi",
        "http://localhost:8080/models/concrete/twitter/twitter01-req3.xmi");
    
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend20.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend21.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/legend/legend22.xmi");
    
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/audio/audio20.xmi");

    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/video/video20.xmi");
    
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder01.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder02.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder03.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder04.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder05.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder06.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder07.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder08.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder09.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder10.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder11.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder12.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder13.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder14.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder15.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder16.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder17.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder18.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder19.xmi");
    exportCCFromURI("xmi", "http://localhost:8080/models/concrete/recorder/recorder20.xmi");    
    

  }

}
