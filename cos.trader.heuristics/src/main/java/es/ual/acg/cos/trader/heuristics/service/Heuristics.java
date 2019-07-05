package es.ual.acg.cos.trader.heuristics.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import es.ual.acg.cos.trader.heuristics.astar.AStarAlgorithm;
import es.ual.acg.cos.trader.heuristics.astar.AStarNode;
import es.ual.acg.cos.trader.heuristics.astar.Adjacency;
import es.ual.acg.cos.trader.heuristics.astar.NavEdge;
import es.ual.acg.cos.trader.heuristics.astar.NavGraph;
import es.ual.acg.cos.trader.heuristics.astar.NavNode;
import es.ual.acg.cos.trader.heuristics.astar.Position;
import es.ual.acg.cos.trader.heuristics.repository.ManageDB;
import es.ual.acg.cos.trader.definitions.CandidateMatchingInfo;
import es.ual.acg.cos.trader.definitions.DependenciesInfo;
import es.ual.acg.cos.trader.definitions.ExtraFunctMatchInfo;
import es.ual.acg.cos.trader.definitions.FunctMatchInfo;
import es.ual.acg.cos.trader.definitions.ImplementationInfo;
import es.ual.acg.cos.trader.definitions.IntersectionType;
import es.ual.acg.cos.trader.definitions.LargerType;
import es.ual.acg.cos.trader.definitions.LocationInfo;
import es.ual.acg.cos.trader.definitions.MarkMatchInfo;
import es.ual.acg.cos.trader.definitions.MatchedInterfaceInfo;
import es.ual.acg.cos.trader.definitions.MatchedOperationInfo;
import es.ual.acg.cos.trader.definitions.MatchingInfo;
import es.ual.acg.cos.trader.definitions.PackMatchInfo;
import es.ual.acg.cos.trader.definitions.PropertiesInfo;
import es.ual.acg.cos.trader.definitions.ProvidedInterfInfo;
import es.ual.acg.cos.trader.definitions.RequiredInterfInfo;
import ccmm.CcmmFactory;
import ccmm.ConcreteComponentSpecification;
import acmm.AbstractComponentSpecification;
import acmm.AcmmFactory;
import acmm.RequiredInterface;
import architectural_metamodel.AbstractArchitecturalModel;
import architectural_metamodel.AbstractComponent;
import architectural_metamodel.AbstractDependency;
import architectural_metamodel.Architectural_metamodelFactory;
import architectural_metamodel.Binary;
import architectural_metamodel.ConcreteArchitecturalModel;
import architectural_metamodel.ConcreteComponent;
import architectural_metamodel.ConcreteDependency;
import architectural_metamodel.Interface;
import architectural_metamodel.OutputPort;
import architectural_metamodel.Port;
import architectural_metamodel.Relationship;
import architectural_metamodel.Required;

@Service
public class Heuristics {

  @Autowired
  ManageDB managedb;

  private HbDataStore dataStore;
  private HbDataStore dataStoreCC;
  private HbDataStore dataStoreAC;

  // Global variables to calculate ratio
  private double ratioFFactor = 0.8;
  private double ratioEFFactor = 0.15;
  private double ratioPFactor = 0.025;
  private double ratioMFactor = 0.025;

  // Global variables for Properties
  private double propLowF = 0.1;
  private double propNormalF = 0.25;
  private double propHighF = 0.65;

  private static final Logger LOGGER = Logger.getLogger(Heuristics.class);
  
  private static final String path = "C:\\costradersolutions\\";

  public String aStar() {
    String result = "";

    return result;
  }

  @PostConstruct
  public void init() {
    this.getDataStoreACFromManageDB();
    this.getDataStoreCCFromManageDB();
  }

  public double calculateHeuristicsCAM(List<String> ccIDList) {
    double timeStart = System.currentTimeMillis();
    double timeStartAC, timeEndAC;

    double h = 0;
    double h1 = 0, h2 = 0, h3 = 0;

    // Pre-defined AAM
    double timeStartGetPredAAM = System.currentTimeMillis();
    List<AbstractComponentSpecification> aam = getPredefinedAAM();
    double timeEndGetPredAAM = System.currentTimeMillis();
    LOGGER.info("Get AAM elapsed time = " + (timeEndGetPredAAM - timeStartGetPredAAM) + " milliseconds");

    // Open a new CC Session
    if (dataStoreCC == null)
      getDataStoreCCFromManageDB();
    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();
    Session sessionCC = sessionFactory.openSession();

    // Build CAM
    double timeStartGetCAM = System.currentTimeMillis();
    List<ConcreteComponentSpecification> cam = getCAMFromList(ccIDList, sessionCC);
    double timeEndGetCAM = System.currentTimeMillis();
    LOGGER.info("Get CAM elapsed time = " + (timeEndGetCAM - timeStartGetCAM) + " milliseconds");

    int acTotal = 0;
    int acMatched = 0;
    int pITotal = 0;
    int pIMatched = 0;
    int rITotal = 0;
    int rIMatched = 0;

    // log.info("[Heuristics - calculateHeuristicsCAM] CAM size: " +
    // cam.size());
    // List<AbstractComponentSpecification> aamSync =
    // Collections.synchronizedList(aam);

    for (AbstractComponentSpecification acs : aam) {
      timeStartAC = System.currentTimeMillis();

      acTotal++;

      String acID = acs.getComponentID();
      EList<acmm.ProvidedInterface> acPIEList = acs.getFunctional().getProvidedInterfaces().getInterface();
      EList<acmm.RequiredInterface> acRIEList = null;
      if (acs.getFunctional().getRequiredInterfaces() != null)
        acRIEList = acs.getFunctional().getRequiredInterfaces().getInterface();

      // Check if there is any CC matching this acID
      for (ConcreteComponentSpecification ccs : cam) {
        // if(ccs != null)
        // {
        // log.info("[Heuristics - calculateHeuristicsCAM] CCS OK");
        String ccID = ccs.getAbstractComponentID();
        // log.info("acID: " + acID);
        // log.info("ccID: " + ccID);
        if (ccID.equals(acID)) {
          acMatched++;

          // Try to match provided interfaces
          EList<ccmm.ProvidedInterface> ccPIEList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
              .getInterface();
          for (ccmm.ProvidedInterface ccPI : ccPIEList) {
            boolean matchDef = false;

            for (int i = 0; i < acPIEList.size() && matchDef == false; i++) {
              acmm.ProvidedInterface acPI = acPIEList.get(i);

              // Try to match interface internal definition
              acmm.PortType acPT = acPI.getInterfaceSpecification().getPortType();
              ccmm.PortType ccPT = ccPI.getInterfaceSpecification().getPortType();

              EList<ccmm.Operation> ccOpList = ccPT.getOperation();
              EList<acmm.Operation> acOpList = acPT.getOperation();
              int opMatched = 0;

              // log.info("[Heuristics] acOpList.size() = " + acOpList.size());

              for (int j = 0; j < ccOpList.size() && (opMatched < acOpList.size()); j++) {
                ccmm.Operation ccOp = ccOpList.get(j);

                boolean matchOp = false;
                for (int k = 0; k < acOpList.size() && matchOp == false; k++) {
                  acmm.Operation acOp = acOpList.get(k);

                  // log.info("[Heuristics] comparing: " + ccOp.getName() +
                  // " -- " + acOp.getName());

                  // if(ccOp.getName().equals(acOp.getName()))
                  if (ccOp.getInput().getType().equals(acOp.getInput().getType())) {
                    if (ccOp.getOutput() != null) {
                      if (ccOp.getOutput().getType().equals(acOp.getOutput().getType())) {
                        matchOp = true;
                        opMatched++;
                      }
                    } else {
                      matchOp = true;
                      opMatched++;
                    }
                  }
                }
              }
              // Operation matching
              if (opMatched == acOpList.size()) {
                matchDef = true;

                pIMatched++;

                // Extra operation
                // if(ccOpList.size() > acOpList.size())
                // {
                // log.info("[Heuristics] Extra operations in matched interface = "
                // +
                // (ccOpList.size() - acOpList.size()));
                // }
              }

            }
          }
          pITotal += acPIEList.size();

          // Try to match required interfaces (if AbstracComponent has)
          if (acRIEList != null) {
            if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
              EList<ccmm.RequiredInterface> ccRIEList = ccs.getFunctional().getControllerInterface()
                  .getRequiredInterfaces().getInterface();
              for (ccmm.RequiredInterface ccRI : ccRIEList) {
                boolean matchDef = false;

                for (int i = 0; i < acRIEList.size() && matchDef == false; i++) {
                  acmm.RequiredInterface acRI = acRIEList.get(i);

                  // Try to match interface internal definition
                  acmm.PortType acPT = acRI.getInterfaceSpecification().getPortType();
                  ccmm.PortType ccPT = ccRI.getInterfaceSpecification().getPortType();

                  EList<ccmm.Operation> ccOpList = ccPT.getOperation();
                  EList<acmm.Operation> acOpList = acPT.getOperation();
                  int opMatched = 0;

                  // log.info("[Heuristics] acOpList.size() = " +
                  // acOpList.size());

                  for (int j = 0; j < ccOpList.size() && (opMatched < acOpList.size()); j++) {
                    ccmm.Operation ccOp = ccOpList.get(j);

                    boolean matchOp = false;
                    for (int k = 0; k < acOpList.size() && matchOp == false; k++) {
                      acmm.Operation acOp = acOpList.get(k);

                      // log.info("[Heuristics] comparing: " + ccOp.getName() +
                      // " -- " + acOp.getName());

                      // if(ccOp.getName().equals(acOp.getName()))
                      if (ccOp.getInput().getType().equals(acOp.getInput().getType())) {
                        if (ccOp.getOutput() != null) {
                          if (ccOp.getOutput().getType().equals(acOp.getOutput().getType())) {
                            matchOp = true;
                            opMatched++;
                          }
                        } else {
                          matchOp = true;
                          opMatched++;
                        }
                      }
                    }
                  }
                  // Operation matching
                  if (opMatched == acOpList.size()) {
                    matchDef = true;
                    rIMatched++;
                  }
                }
              }
              rITotal += acRIEList.size();
            }
          }
        }
        // }
        // else
        // log.info("[Heuristics - calculateHeuristicsCAM] CCS null");
      }

      // Try to match required interfaces (if AbstracComponent has)
      // for()
      timeEndAC = System.currentTimeMillis();
      LOGGER.info("[Heuristics - calculateHeuristicsCAM] AC (" + acs.getComponentID() + ") elapsed time = "
          + (timeEndAC - timeStartAC) + " milliseconds");
    }

    // Close the session.
    sessionCC.close();

    if (acTotal != 0)
      h1 = (double) acMatched / acTotal;
    if (pITotal != 0)
      h2 = (double) pIMatched / pITotal;
    if (rITotal != 0)
      h3 = (double) rIMatched / rITotal;
    /*
     * log.info("acMatched = " + acMatched); log.info("acTotal = " + acTotal);
     * log.info("pIMatched = " + pIMatched); log.info("pITotal = " + pITotal);
     * log.info("rIMatched = " + rIMatched); log.info("rITotal = " + rITotal);
     * log.info("h1 = " + h1); log.info("h2 = " + h2); log.info("h3 = " + h3);
     */

    h = (h1 + h2 + h3) / 3;

    double timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - calculateHeuristicsCAM] elapsed time = " + (timeEnd - timeStart) + " milliseconds");

    return (1 - h);
  }

  public double calculateHeuristicsCAM(ConcreteArchitecturalModel cam) {
    double hTotal = 0.0;

    EList<ConcreteComponent> ccEList = cam.getConcreteComponent();
    for (ConcreteComponent cc : ccEList) {
      cc.getComponentID();

    }

    return hTotal;

  }

  public double calculateHeuristicsCC(String ccID) {
    double hConcreteComponent = 0.0;

    LOGGER.info("[Heuristics - calculateHeuristicsCC] CC ID: " + ccID);

    ConcreteComponentSpecification ccs = getCCFromID(ccID);

    if (ccs != null) {
      String acID = ccs.getAbstractComponentID();
      AbstractComponentSpecification acs = getACFromID(acID);

      if (acs != null) {
        hConcreteComponent = calculateHeuristicsCCFromAC(ccs, acs);
        LOGGER.info("[Heuristics - calculateHeuristicsCC] " + ccID + " = " + hConcreteComponent);
      } else {
        LOGGER.info("[Heuristics - calculateHeuristicsCC] AbstractComponent with ID = '" + acID
            + "' does not exist --> Could not calculalte heuristics");
        hConcreteComponent = -1;
      }
    } else {
      LOGGER.info(
          "[Heuristics - calculateHeuristicsCC] " + ccID + " ID does not exist --> Could not calculalte heuristics");
      hConcreteComponent = -1;
    }

    return hConcreteComponent;
  }

  /*
   * private int matchedProvidedInterfaces() {
   * 
   * }
   */

  private double calculateHeuristicsCCFromAC(ConcreteComponentSpecification ccs, AbstractComponentSpecification acs) {
    double hConcreteComponent = 0.0;

    // Matching ProvidedInterfaces
    EList<ccmm.ProvidedInterface> ccPIEList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
        .getInterface();
    for (ccmm.ProvidedInterface ccPI : ccPIEList) {
      // boolean matchID = false;
      boolean matchDef = false;

      EList<acmm.ProvidedInterface> acPIEList = acs.getFunctional().getProvidedInterfaces().getInterface();
      for (int i = 0; i < acPIEList.size() && /* matchID==false && */matchDef == false; i++) {
        acmm.ProvidedInterface acPI = acPIEList.get(i);

        // Try to match interface ID
        // if(ccPI.getInterfaceID().equals(acPI.getInterfaceID()))
        // {
        // log.info("[Heuristics] Matching interface ID");
        // matchID = true;
        // }

        // Try to match interface internal definition
        acmm.PortType acPT = acPI.getInterfaceSpecification().getPortType();
        ccmm.PortType ccPT = ccPI.getInterfaceSpecification().getPortType();

        // It is not necessary that interface names (portType names) matches
        // if(ccPT.getName().equals(acPT.getName()))
        // {
        EList<ccmm.Operation> ccOpList = ccPT.getOperation();
        EList<acmm.Operation> acOpList = acPT.getOperation();
        int matchedOperations = 0;

        LOGGER.info("[Heuristics - calculateHeuristicsCCFromAC] acOpList.size() = " + acOpList.size());

        for (int j = 0; j < ccOpList.size() && (matchedOperations < acOpList.size()); j++) {
          ccmm.Operation ccOp = ccOpList.get(j);

          boolean matchOp = false;
          for (int k = 0; k < acOpList.size() && matchOp == false; k++) {
            acmm.Operation acOp = acOpList.get(k);

            LOGGER.info(
                "[Heuristics - calculateHeuristicsCCFromAC] comparing: " + ccOp.getName() + " -- " + acOp.getName());

            if (ccOp.getName().equals(acOp.getName())) {
              matchOp = true;
              matchedOperations++;
            }

          }
        }
        // Operation matching --> score
        if (matchedOperations == acOpList.size()) {
          matchDef = true;

          // Extra operation
          if (ccOpList.size() > acOpList.size()) {
            LOGGER.info("[Heuristics - calculateHeuristicsCCFromAC] Extra operation in matched interface = "
                + (ccOpList.size() - acOpList.size()));
            hConcreteComponent += (ccOpList.size() - acOpList.size()) * 0.1;
          }

        }
        // }

        // if(acPT == ccPT)
        // {
        // log.info("[Heuristics] Matching interface definition");
        // matchDef = true;
        // }
      }

      // If any match is solved --> score
      if (/* matchID || */matchDef) {
        hConcreteComponent += 5.0;
      }
      // Extra interface --> score
      else {
        hConcreteComponent += 0.5;
      }

    }

    // Matching RequiredInterfaces

    return hConcreteComponent;
  }

  private void getDataStoreCCFromManageDB() {

    dataStoreCC = managedb.getDataStoreCC();

    if (dataStoreCC == null)
      LOGGER.info("[Heuristics] Error getting the DataStoreCC");

  }

  private void getDataStoreACFromManageDB() {
    dataStoreAC = null;

    dataStoreAC = managedb.getDataStoreAC();

    if (dataStoreAC == null)
      LOGGER.info("[Heuristics] Error getting the DataStoreAC");

  }

  public ConcreteComponentSpecification getCCFromID(String ccID) {
    ConcreteComponentSpecification ccs = null;

    // getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session.createQuery("FROM ConcreteComponentSpecification ccs WHERE ccs.componentID = '" + ccID + "'");
    List<?> ccsList = query.list();

    // LOGGER.info("[Heuristics - getCCFromID] size of results: " +
    // ccsList.size());

    if (ccsList.size() != 0) {
      ccs = (ConcreteComponentSpecification) ccsList.get(0);

      // // Initialize the object
      // Hibernate.initialize(ccs);
      // for (ccmm.ProvidedInterface pI : ccs.getFunctional()
      // .getControllerInterface().getProvidedInterfaces().getInterface()) {
      // Hibernate.initialize(pI);
      // for (ccmm.Operation op : pI.getInterfaceSpecification().getPortType()
      // .getOperation())
      // Hibernate.initialize(op);
      // }
      // if
      // (ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
      // != null) {
      // for (ccmm.RequiredInterface rI : ccs.getFunctional()
      // .getControllerInterface().getRequiredInterfaces().getInterface()) {
      // Hibernate.initialize(rI);
      // for (ccmm.Operation op : rI.getInterfaceSpecification().getPortType()
      // .getOperation())
      // Hibernate.initialize(op);
      // }
      // }
    }

    // Close the session.
    session.close();

    return ccs;

  }

  @SuppressWarnings("unchecked")
  private List<ConcreteComponentSpecification> getCCFromIDList(List<String> ccIDList, Session sessionCC) {
    List<ConcreteComponentSpecification> result = null;

    // Build the query
    String queryString = "FROM ConcreteComponentSpecification ccs WHERE ";
    for (String ccID : ccIDList)
      queryString += "ccs.componentID = '" + ccID + "' OR ";
    queryString = queryString.substring(0, queryString.length() - 3);
    Query query = sessionCC.createQuery(queryString);

    LOGGER.info("[Heuristics - getCCFromIDList] - queryString: " + queryString);

    List<ConcreteComponentSpecification> ccsList = query.list();
    if (ccsList.size() == 0) {
      LOGGER.info("[Heuristics - getCCFromIDList] - No results found");
    } else {
      result = new ArrayList<ConcreteComponentSpecification>();

      for (ConcreteComponentSpecification aux : ccsList) {
        double timeStartIniObject = System.currentTimeMillis();

        result.add(aux);

        // Initialize the object
        /*
         * Hibernate.initialize(aux); for(ccmm.ProvidedInterface pI : aux.getFunctional
         * ().getControllerInterface().getProvidedInterfaces().getInterface()) {
         * Hibernate.initialize(pI); for(ccmm.Operation op :
         * pI.getInterfaceSpecification().getPortType().getOperation())
         * Hibernate.initialize(op); } if(aux.getFunctional().getControllerInterface
         * ().getRequiredInterfaces()!=null) { for(ccmm.RequiredInterface rI :
         * aux.getFunctional().getControllerInterface().getRequiredInterfaces().
         * getInterface()) { Hibernate.initialize(rI); for(ccmm.Operation op :
         * rI.getInterfaceSpecification().getPortType().getOperation())
         * Hibernate.initialize(op); } }
         */

        double timeEndIniObject = System.currentTimeMillis();
        LOGGER.info("Init CC (foreach) elapsed time = " + (timeEndIniObject - timeStartIniObject) + " milliseconds");

      }

      /*
       * Iterator<ConcreteComponentSpecification> it = ccsList.iterator();
       * 
       * while(it.hasNext()) { double timeStartIniObject = System.currentTimeMillis();
       * 
       * ConcreteComponentSpecification aux = it.next(); result.add(aux);
       * 
       * //Initialize the object Hibernate.initialize(aux); for(ccmm.ProvidedInterface
       * pI : aux.getFunctional().getControllerInterface
       * ().getProvidedInterfaces().getInterface()) { Hibernate.initialize(pI);
       * for(ccmm.Operation op :
       * pI.getInterfaceSpecification().getPortType().getOperation())
       * Hibernate.initialize(op); } if(aux.getFunctional().getControllerInterface
       * ().getRequiredInterfaces()!=null) { for(ccmm.RequiredInterface rI :
       * aux.getFunctional().getControllerInterface().getRequiredInterfaces().
       * getInterface()) { Hibernate.initialize(rI); for(ccmm.Operation op :
       * rI.getInterfaceSpecification().getPortType().getOperation())
       * Hibernate.initialize(op); } }
       * 
       * double timeEndIniObject = System.currentTimeMillis();
       * log.info("Init CC elapsed time = " + (timeEndIniObject-timeStartIniObject) +
       * " milliseconds"); }
       */
    }

    return result;

  }

  private AbstractComponentSpecification getACFromID(String acID) {
    AbstractComponentSpecification acs = null;

    // getDataStoreACFromManageDB();

    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    Query query = session.createQuery("FROM AbstractComponentSpecification acs WHERE acs.componentID = '" + acID + "'");

    List<?> acsList = query.list();
    if (acsList.size() != 0) {
      acs = (AbstractComponentSpecification) acsList.get(0);

      // // Initialize the object
      // Hibernate.initialize(acs);
      // for (acmm.ProvidedInterface pI : acs.getFunctional()
      // .getProvidedInterfaces().getInterface()) {
      // Hibernate.initialize(pI);
      // for (acmm.Operation op : pI.getInterfaceSpecification().getPortType()
      // .getOperation())
      // Hibernate.initialize(op);
      // }
      // if (acs.getFunctional().getRequiredInterfaces() != null) {
      // for (acmm.RequiredInterface rI : acs.getFunctional()
      // .getRequiredInterfaces().getInterface()) {
      // Hibernate.initialize(rI);
      // for (acmm.Operation op : rI.getInterfaceSpecification().getPortType()
      // .getOperation())
      // Hibernate.initialize(op);
      // }
      // }
    }

    // Close the session.
    session.close();

    return acs;
  }

  private List<AbstractComponentSpecification> getPredefinedAAM() {
    List<AbstractComponentSpecification> aam = new ArrayList<AbstractComponentSpecification>();

    aam.add(getACFromID("map"));
    aam.add(getACFromID("histogram"));
    aam.add(getACFromID("header"));
    aam.add(getACFromID("twitter"));
    aam.add(getACFromID("cloudStorage"));
    aam.add(getACFromID("rss"));

    return aam;
  }

  private List<ConcreteComponentSpecification> getCAMFromList(List<String> ccIDList, Session sessionCC) {
    /*
     * List<ConcreteComponentSpecification> cam = new
     * ArrayList<ConcreteComponentSpecification>();
     * 
     * for(String ccID : ccIDList) cam.add(getCCFromID(ccID));
     */

    List<ConcreteComponentSpecification> cam = getCCFromIDList(ccIDList, sessionCC);

    return cam;
  }

  @SuppressWarnings("unchecked")
  private List<String> getAllIDCC() {

    List<String> candidates = new ArrayList<String>();

    // getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session.createQuery("FROM ConcreteComponentSpecification");
    List<ConcreteComponentSpecification> ccsList = query.list();

    if (ccsList.size() != 0) {
      for (ConcreteComponentSpecification ccs : ccsList) {
        String ccID = ccs.getComponentID();
        candidates.add(ccID);
      }
    } else {
      LOGGER.info("[Heuristics - getCandidates] candidates list is empty");
    }

    // Close the session.
    session.close();

    return candidates;
  }

  @SuppressWarnings("unchecked")
  private List<ConcreteComponentSpecification> getAllCC() {

    List<ConcreteComponentSpecification> candidates = null;

    // getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session.createQuery("FROM ConcreteComponentSpecification");
    candidates = query.list();

    // Close the session.
    session.close();

    return candidates;
  }

  @SuppressWarnings("unchecked")
  private List<String> getIDCandidatesByACID(String acID) {

    List<String> candidates = new ArrayList<String>();

    // getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the CC ID does exist
    Query query = session
        .createQuery("FROM ConcreteComponentSpecification ccs " + "WHERE ccs.abstractComponentID = '" + acID + "'");
    List<ConcreteComponentSpecification> ccsList = query.list();

    if (ccsList.size() != 0) {
      for (ConcreteComponentSpecification ccs : ccsList) {
        String ccID = ccs.getComponentID();
        candidates.add(ccID);
      }
    } else {
      LOGGER.info("[Heuristics - getCandidates] candidates list is empty");
    }

    // Close the session.
    session.close();

    return candidates;
  }

  @SuppressWarnings("unchecked")
  private List<ConcreteComponentSpecification> getCandidatesByACID(String acID) {

    List<ConcreteComponentSpecification> candidates = null;

    // getDataStoreCCFromManageDB();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Get CC candidates from AC ID
    Query query = session
        .createQuery("FROM ConcreteComponentSpecification ccs " + "WHERE ccs.abstractComponentID = '" + acID + "'");
    candidates = query.list();

    // Close the session.
    session.close();

    return candidates;
  }

  @SuppressWarnings("unchecked")
  private List<ConcreteComponentSpecification> getCandidatesByACOperations(String acID) {

    long timeStart, timeEnd, timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<ConcreteComponentSpecification> candidates = null;

    // Get the required info from the operations
    timeStart = System.currentTimeMillis();
    AbstractComponentSpecification acs = this.getACFromID(acID);
    List<String> inputTypes = new ArrayList<String>();
    EList<acmm.ProvidedInterface> pIList = acs.getFunctional().getProvidedInterfaces().getInterface();
    for (acmm.ProvidedInterface pI : pIList) {
      EList<acmm.Operation> opList = pI.getInterfaceSpecification().getPortType().getOperation();
      for (acmm.Operation op : opList) {
        inputTypes.add(op.getInput().getType());
      }
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - getCandidatesByACOperations] get info from operations: " + (timeEnd - timeStart)
        + " milliseconds");

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Get CC candidates from AC info of operations
    // //Query example for selecting components with an identified port type
    // Query query = session.createQuery(
    // "SELECT ccs FROM ConcreteComponentSpecification ccs, " +
    // "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
    // +
    // "IN (pi.interfaceSpecification.portType) pt " +
    // "WHERE ccs.abstractComponentID = 'twitter' " +
    // "AND pt.name = 'manageTweets'");
    Query query = session.createQuery("SELECT DISTINCT ccs FROM ConcreteComponentSpecification ccs, "
        + "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
        + "IN (pi.interfaceSpecification.portType) pt, " + "IN (pt.operation) op "
        + "WHERE op.input.type IN (:inputTypes)");
    query.setParameterList("inputTypes", inputTypes);
    candidates = query.list();

    // Close the session.
    session.close();

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - getCandidatesByACOperations] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return candidates;
  }

  @SuppressWarnings("unchecked")
  public List<String> getCandidatesByOperations(List<String> inputTypes) {

    long timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<ConcreteComponentSpecification> candidates = null;
    List<String> result = new ArrayList<String>();

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Get CC candidates from AC info of operations
    Query query = session.createQuery("SELECT DISTINCT ccs FROM ConcreteComponentSpecification ccs, "
        + "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
        + "IN (pi.interfaceSpecification.portType) pt, " + "IN (pt.operation) op "
        + "WHERE op.input.type IN (:inputTypes)");
    query.setParameterList("inputTypes", inputTypes);
    candidates = query.list();

    for (ConcreteComponentSpecification cc : candidates) {
      result.add(cc.getComponentID());
    }

    // Close the session.
    session.close();

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - getCandidatesByOperations] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return result;
  }

  @SuppressWarnings("unchecked")
  private List<ConcreteComponentSpecification> getCandidatesByACOperations(AbstractComponentSpecification acs) {

    long timeStart, timeEnd, timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<ConcreteComponentSpecification> candidates = null;

    // Get the required info from the operations
    timeStart = System.currentTimeMillis();
    List<String> inputTypes = new ArrayList<String>();
    EList<acmm.ProvidedInterface> pIList = acs.getFunctional().getProvidedInterfaces().getInterface();
    for (acmm.ProvidedInterface pI : pIList) {
      EList<acmm.Operation> opList = pI.getInterfaceSpecification().getPortType().getOperation();
      for (acmm.Operation op : opList) {
        inputTypes.add(op.getInput().getType());
      }
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - getCandidatesByACOperations] get info from operations: " + (timeEnd - timeStart)
        + " milliseconds");

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Get CC candidates from AC info of operations
    // //Query example for selecting components with an identified port type
    // Query query = session.createQuery(
    // "SELECT ccs FROM ConcreteComponentSpecification ccs, " +
    // "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
    // +
    // "IN (pi.interfaceSpecification.portType) pt " +
    // "WHERE ccs.abstractComponentID = 'twitter' " +
    // "AND pt.name = 'manageTweets'");
    Query query = session.createQuery("SELECT DISTINCT ccs FROM ConcreteComponentSpecification ccs, "
        + "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
        + "IN (pi.interfaceSpecification.portType) pt, " + "IN (pt.operation) op "
        + "WHERE op.input.type IN (:inputTypes)");
    query.setParameterList("inputTypes", inputTypes);
    candidates = query.list();

    // Close the session.
    session.close();

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - getCandidatesByACOperations] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return candidates;
  }

  @SuppressWarnings("unchecked")
  private Map<String, List<ConcreteComponentSpecification>> getCandidatesGroupedByACOperations(
      List<AbstractComponentSpecification> acsList) {

    long timeStartTotal, timeEndTotal;
    timeStartTotal = System.currentTimeMillis();

    Map<String, List<ConcreteComponentSpecification>> result = new HashMap<String, List<ConcreteComponentSpecification>>();
    List<ConcreteComponentSpecification> candidates = null;

    SessionFactory sessionFactory = dataStoreCC.getSessionFactory();
    Session session = sessionFactory.openSession();

    for (AbstractComponentSpecification acs : acsList) {

      // Get the required info from the operations
      List<String> inputTypes = new ArrayList<String>();
      EList<acmm.ProvidedInterface> pIList = acs.getFunctional().getProvidedInterfaces().getInterface();
      for (acmm.ProvidedInterface pI : pIList) {
        EList<acmm.Operation> opList = pI.getInterfaceSpecification().getPortType().getOperation();
        for (acmm.Operation op : opList) {
          inputTypes.add(op.getInput().getType());
        }
      }

      // LOGGER.info("inputTypes size: " + inputTypes.size());

      Query query = session.createQuery("SELECT DISTINCT ccs FROM ConcreteComponentSpecification ccs, "
          + "IN (ccs.functional.controllerInterface.providedInterfaces.interface) pi, "
          + "IN (pi.interfaceSpecification.portType) pt, " + "IN (pt.operation) op "
          + "WHERE op.input.type IN (:inputTypes)");
      query.setParameterList("inputTypes", inputTypes);
      candidates = query.list();

      result.put(acs.getComponentID(), candidates);
    }

    session.close();

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("[Heuristics - getCandidatesGroupedByACOperations] time total: " + (timeEndTotal - timeStartTotal)
        + " milliseconds");

    return result;
  }

  public List<String> getCandidatesListByACList(List<String> acList) {
    List<String> ccsIDList = new ArrayList<String>();
    AbstractComponentSpecification acs = this.joinAC(acList);
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acs);
    for (ConcreteComponentSpecification ccs : ccsList) {
      ccsIDList.add(ccs.getComponentID());
    }
    return ccsIDList;
  }

  public List<CandidateMatchingInfo> calculateMatchingInfo(String acID) {

    long timeStart, timeEnd, timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<CandidateMatchingInfo> list = new ArrayList<CandidateMatchingInfo>();

    // Select all the candidates
    timeStart = System.currentTimeMillis();
    List<String> candidates = getIDCandidatesByACID(acID);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - calculateMatchingInfo] time selecting the candidates: " + (timeEnd - timeStart)
        + " milliseconds");

    // Calculate each matching info
    timeStart = System.currentTimeMillis();
    for (String candidateID : candidates) {
      MatchingInfo mInfo = this.calculateMatchingCC(candidateID, acID);
      CandidateMatchingInfo cInfo = new CandidateMatchingInfo();
      cInfo.setCcID(candidateID);
      cInfo.setRatioTotal(mInfo.getRatio());
      cInfo.setRatioFunctional(mInfo.getFunctionalMatchInfo().getRatio());
      cInfo.setRatioExtraFunctional(mInfo.getExtraFunctionalMatchInfo().getRatio());
      cInfo.setRatioPackaging(mInfo.getPackagingMatchInfo().getRatio());
      cInfo.setRatioMarketing(mInfo.getMarketingMatchInfo().getRatio());
      list.add(cInfo);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - calculateMatchingInfo] time calculating the info: " + (timeEnd - timeStart) + " milliseconds");

    timeStart = System.currentTimeMillis();
    Collections.sort(list);
    timeEnd = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time sorting the list: " + (timeEnd - timeStart) + " milliseconds");

    timeEndTotal = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return list;
  }

  public List<CandidateMatchingInfo> calculateMatchingInfo2(String acID) {

    long timeStart, timeEnd, timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<CandidateMatchingInfo> list = new ArrayList<CandidateMatchingInfo>();

    // Select all the candidates
    timeStart = System.currentTimeMillis();
    // List<ConcreteComponentSpecification> candidates = getAllCC();
    // List<ConcreteComponentSpecification> candidates =
    // getCandidatesByACID(acID);
    List<ConcreteComponentSpecification> candidates = getCandidatesByACOperations(acID);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - calculateMatchingInfo] time selecting the candidates: " + (timeEnd - timeStart)
        + " milliseconds");

    LOGGER.info("[Heuristics - calculateMatchingInfo] candidates size: " + candidates.size());

    AbstractComponentSpecification acs = this.getACFromID(acID);

    // Calculate each matching info
    timeStart = System.currentTimeMillis();
    for (ConcreteComponentSpecification ccs : candidates) {
      MatchingInfo mInfo = this.calculateMatchingCC(ccs, acs);
      CandidateMatchingInfo cInfo = new CandidateMatchingInfo();
      cInfo.setCcID(ccs.getComponentID());
      cInfo.setRatioTotal(mInfo.getRatio());
      cInfo.setRatioFunctional(mInfo.getFunctionalMatchInfo().getRatio());
      cInfo.setRatioExtraFunctional(mInfo.getExtraFunctionalMatchInfo().getRatio());
      cInfo.setRatioPackaging(mInfo.getPackagingMatchInfo().getRatio());
      cInfo.setRatioMarketing(mInfo.getMarketingMatchInfo().getRatio());
      list.add(cInfo);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - calculateMatchingInfo] time calculating the info: " + (timeEnd - timeStart) + " milliseconds");

    timeStart = System.currentTimeMillis();
    Collections.sort(list);
    timeEnd = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time sorting the list: " + (timeEnd - timeStart) + " milliseconds");

    timeEndTotal = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return list;
  }

  public MatchingInfo calculateMatchingCC(ConcreteComponentSpecification ccs, AbstractComponentSpecification acs) {
    MatchingInfo mInfo = new MatchingInfo();

    double ratio = 0.0;

    if (ccs != null) {

      if (acs != null) {

        // Perform the matching algorithm
        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching '"
        // + ccs.getComponentID() + "' with '" + acs.getComponentID() + "'");

        // Functional part
        acmm.Functional acFunctional = acs.getFunctional();
        ccmm.Functional ccFunctional = ccs.getFunctional();
        FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
        mInfo.setFunctionalMatchInfo(functionalMatchInfo);

        // Extra-functional part
        acmm.ExtraFunctional acExtraFunctional = acs.getExtraFunctional();
        ccmm.ExtraFunctional ccExtraFunctional = ccs.getExtraFunctional();
        ExtraFunctMatchInfo extraFunctionalMatchInfo = this.calculateMatchingCCExtraFunct(acExtraFunctional,
            ccExtraFunctional);
        mInfo.setExtraFunctionalMatchInfo(extraFunctionalMatchInfo);

        // Packaging part
        acmm.Packaging acPackaging = acs.getPackaging();
        ccmm.Packaging ccPackaging = ccs.getPackaging();
        PackMatchInfo packagingMatchInfo = this.calculateMatchingCCPack(acPackaging, ccPackaging);
        mInfo.setPackagingMatchInfo(packagingMatchInfo);

        // Marketing part
        acmm.Marketing acMarketing = acs.getMarketing();
        ccmm.Marketing ccMarketing = ccs.getMarketing();
        MarkMatchInfo marketingMatchInfo = this.calculateMatchingCCMark(acMarketing, ccMarketing);
        mInfo.setMarketingMatchInfo(marketingMatchInfo);

        // Total ratio
        double ratioF = functionalMatchInfo.getRatio();
        double ratioEF = extraFunctionalMatchInfo.getRatio();
        double ratioP = packagingMatchInfo.getRatio();
        double ratioM = marketingMatchInfo.getRatio();
        ratio = ratioF * ratioFFactor + ratioEF * ratioEFFactor + ratioP * ratioPFactor + ratioM * ratioMFactor;
        // // Format the ratio with 4 decimal digits
        // DecimalFormat df = new DecimalFormat("#.####");
        // String ratioString = df.format(ratio).replace(',', '.');
        // ratio = Double.parseDouble(ratioString);

        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching calculated");

      } else {
        LOGGER.info(
            "[Heuristics - calculateMatchingCC] AbstractComponent is null " + "--> Could not calculate the matching");

      }
    } else {
      LOGGER.info(
          "[Heuristics - calculateMatchingCC] ConcreteComponent is null " + "--> Could not calculate the matching");

    }

    mInfo.setRatio(ratio);
    mInfo.setAcID(acs.getComponentID());
    mInfo.setCcID(ccs.getComponentID());
    // mInfo.setIntersection(intersection);
    // mInfo.setLarger(larger);

    return mInfo;
  }

  public List<CandidateMatchingInfo> calculateMatchingInfoOnlyF(String acID) {

    List<CandidateMatchingInfo> list = new ArrayList<CandidateMatchingInfo>();

    // Select all the candidates
    List<String> candidates = getIDCandidatesByACID(acID);

    // Calculate each matching info
    for (String candidateID : candidates) {
      MatchingInfo mInfo = this.calculateMatchingCCOnlyF(candidateID, acID);
      CandidateMatchingInfo cInfo = new CandidateMatchingInfo();
      cInfo.setCcID(candidateID);
      cInfo.setRatioTotal(mInfo.getRatio());
      cInfo.setRatioFunctional(mInfo.getFunctionalMatchInfo().getRatio());
      list.add(cInfo);
    }

    Collections.sort(list);

    return list;
  }

  /**********************************************************************************/
  public List<String> aStar(List<String> acList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    AbstractComponentSpecification acsTotal = joinAC(acList);

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");
    Position pnRoot = new Position();
    pnRoot.setX(0);
    pnRoot.setY(0);
    nRoot.setPosition(pnRoot);

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // The first level of the graph
    // String firsACID = acList.get(0);
    List<CandidateMatchingInfo> firstLevelCCList = this.calculateMatchingInfo2(acsTotal);

    // For each CC, add a node, an edge and the corresponding adjacencies
    // ****Posible Modification --> Not for each CC. Only for .........
    // ???????????
    List<NavNode> neighborsList = new ArrayList<NavNode>();
    for (CandidateMatchingInfo cInfo : firstLevelCCList) {

      LOGGER.info(cInfo.getCcID() + " --> " + cInfo.getRatioTotal());

      // Create the node
      NavNode n = new NavNode();
      // n.setId(cInfo.getCcID());
      n.setId(nRoot.getId() + "&" + cInfo.getCcID());
      Position pn = new Position();
      pn.setX(cInfo.getRatioTotal());
      pn.setY(cInfo.getRatioTotal());
      n.setPosition(pn);
      nodeList.add(n);

      NavEdge e = new NavEdge(nRoot.getId(), n.getId(), 1);
      edgeList.add(e);

      neighborsList.add(n);

      // Adjacencie from this actual node to the root node
      Adjacency<NavNode> a = new Adjacency<NavNode>();
      a.setNode(n);
      List<NavNode> nneighborsList = new ArrayList<NavNode>();
      nneighborsList.add(nRoot);
      Set<NavNode> nneighbors = new HashSet<NavNode>(nneighborsList);
      a.setNeighbors(nneighbors);
      adjacency.put(n.getId(), a);

    }
    // Add adjacencies
    Adjacency<NavNode> a = new Adjacency<NavNode>();
    a.setNode(nRoot);
    Set<NavNode> neighbors = new HashSet<NavNode>(neighborsList);
    a.setNeighbors(neighbors);
    adjacency.put(nRoot.getId(), a);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    // List<NavNode> result = AStarAlgorithm.search(graph, nRoot, acsTotal);
    AStarNode result = AStarAlgorithm.search(graph, nRoot, acsTotal);
    int counterIteration = 0;
    LOGGER.info("SOLUTION: ");
    if (result != null) {
      /*
       * for(NavNode n : result) { LOGGER.info(n.getId() + " --> " +
       * n.getExtraData()); }
       */

      while (result.getH() != 0) {

        counterIteration++;
        LOGGER.info("------------------------------" + counterIteration + "----------------------");
        if (counterIteration > 9) {
          break;
        }

        String mergedCC = result.getId();
        StringTokenizer st = new StringTokenizer(mergedCC, "&");
        List<String> listCC = new ArrayList<String>();
        while (st.hasMoreTokens()) {
          listCC.add(st.nextToken());
        }

        // Next level of the tree
        List<NavNode> resultNeighbors = new ArrayList<NavNode>();
        for (CandidateMatchingInfo cInfo : firstLevelCCList) {

          if (!listCC.contains(cInfo.getCcID())) {

            // Create the node
            NavNode n = new NavNode();
            n.setId(result.getId() + "&" + cInfo.getCcID());
            nodeList.add(n);

            NavEdge e = new NavEdge(result.getId(), n.getId(), 1);
            edgeList.add(e);

            resultNeighbors.add(n);

            // Adjacencie from this actual node to the result node
            Adjacency<NavNode> adj = new Adjacency<NavNode>();
            adj.setNode(n);
            List<NavNode> nneighborsList = new ArrayList<NavNode>();
            nneighborsList.add(result.getNode());
            Set<NavNode> nneighbors = new HashSet<NavNode>(nneighborsList);
            adj.setNeighbors(nneighbors);
            adjacency.put(n.getId(), adj);
          }
        }
        // Add adjacencies
        Adjacency<NavNode> newAdj = new Adjacency<NavNode>();
        newAdj.setNode(result.getNode());
        Set<NavNode> newNeighbors = new HashSet<NavNode>(resultNeighbors);
        newAdj.setNeighbors(newNeighbors);
        adjacency.put(result.getId(), newAdj);

        // Add the variables to the graph
        graph.setNodeList(nodeList);
        graph.setEdgeList(edgeList);
        graph.setAdjacency(adjacency);

        // Execute the A* algorithm
        result = AStarAlgorithm.search(graph, result.getNode(), acsTotal);

      }

      LOGGER.info("iterations: " + counterIteration);
      LOGGER.info("----------------> " + result.getId());

      String mergedCC = result.getId();
      StringTokenizer st = new StringTokenizer(mergedCC, "&");
      while (st.hasMoreTokens()) {
        finalSolution.add(st.nextToken());
      }

      /*
       * if(obtainedH == 0) { LOGGER.info("FINAL SOLUTION FOUND!!");
       * LOGGER.info(result.getId()); finalSolution = result.getId();
       * 
       * } else { LOGGER.info("(no final solution)");
       * 
       * String mergedCC = result.getId(); StringTokenizer st = new
       * StringTokenizer(mergedCC, "&"); List<String> listCC = new
       * ArrayList<String>(); while(st.hasMoreTokens()) { listCC.add(st.nextToken());
       * }
       * 
       * // Next level of the tree List<NavNode> resultNeighbors = new
       * ArrayList<NavNode>(); for(CandidateMatchingInfo cInfo : firstLevelCCList) {
       * 
       * if(!listCC.contains(cInfo.getCcID())) {
       * 
       * // Create the node NavNode n = new NavNode();
       * n.setId(result.getId()+"&"+cInfo.getCcID()); nodeList.add(n);
       * 
       * NavEdge e = new NavEdge(result.getId(), n.getId(), 1); edgeList.add(e);
       * 
       * resultNeighbors.add(n);
       * 
       * // Adjacencie from this actual node to the result node Adjacency<NavNode> adj
       * = new Adjacency<NavNode>(); adj.setNode(n); List<NavNode> nneighborsList =
       * new ArrayList<NavNode>(); nneighborsList.add(result.getNode()); Set<NavNode>
       * nneighbors = new HashSet<NavNode>(nneighborsList);
       * adj.setNeighbors(nneighbors); adjacency.put(n.getId(), adj); } } // Add
       * adjacencies Adjacency<NavNode> newAdj = new Adjacency<NavNode>();
       * newAdj.setNode(result.getNode()); Set<NavNode> newNeighbors = new
       * HashSet<NavNode>(resultNeighbors); newAdj.setNeighbors(newNeighbors);
       * adjacency.put(result.getId(), newAdj);
       * 
       * // Add the variables to the graph graph.setNodeList(nodeList);
       * graph.setEdgeList(edgeList); graph.setAdjacency(adjacency);
       * 
       * // Execute the A* algorithm AStarNode newResult =
       * AStarAlgorithm.search(graph, result.getNode(), acsTotal); if(newResult !=
       * null) {
       * 
       * LOGGER.info("----------------> " + newResult.getId()); finalSolution =
       * newResult.getId();
       * 
       * } else {
       * 
       * }
       * 
       * }
       */

    } else {
      LOGGER.info("(no best node has been found)");
    }

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("[Heuristics - aStar] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return finalSolution;

  }

  /**********************************************************************************/
  public List<String> aStarv2(List<String> acList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    AbstractComponentSpecification acsTotal = joinAC(acList);

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acsTotal);
    LOGGER.info("candidates size: " + ccsList.size());

    // Cloning all the candidates
    /*
     * timeStart = System.currentTimeMillis(); List<ConcreteComponentSpecification>
     * ccsListCloned = new ArrayList<ConcreteComponentSpecification>(); for
     * (ConcreteComponentSpecification ccs : ccsList) { ccsListCloned.add(ccs); }
     * timeEnd = System.currentTimeMillis();
     * LOGGER.info("time cloning the candidates: " + (timeEnd - timeStart));
     */

    // For each CC, add a node, an edge and the corresponding adjacencies
    for (ConcreteComponentSpecification ccs : ccsList) {

      // Create the node
      NavNode n = new NavNode();
      n.setId(ccs.getComponentID());
      // n.setCcs(ccs);
      nodeList.add(n);

      // Add an edge from this node to the rest of candidates
      /*
       * for(int i = 0; i < ccsList.size(); i++) { ConcreteComponentSpecification
       * ccsClone = ccsList.get(i);
       * if(!ccs.getComponentID().equalsIgnoreCase(ccsClone.getComponentID())) {
       * NavEdge e = new NavEdge(ccs.getComponentID(), ccsClone.getComponentID(), 1);
       * edgeList.add(e); } }
       */
    }
    // Add adjacencies from root to all nodes
    Adjacency<NavNode> a = new Adjacency<NavNode>();
    a.setNode(nRoot);
    Set<NavNode> neighbors = new HashSet<NavNode>(nodeList);
    a.setNeighbors(neighbors);
    adjacency.put(nRoot.getId(), a);

    // Add adjacencies from all nodes to all nodes
    for (NavNode node : nodeList) {
      Adjacency<NavNode> adj = new Adjacency<NavNode>();
      adj.setNode(node);
      List<NavNode> neighb = new ArrayList<NavNode>();
      for (NavNode nodeCopy : nodeList) {
        if (!node.getId().equalsIgnoreCase(nodeCopy.getId())) {
          neighb.add(nodeCopy);
        }
      }
      // neighb.remove(node);
      Set<NavNode> neighbs = new HashSet<NavNode>(neighb);
      adj.setNeighbors(neighbs);
      adjacency.put(node.getId(), adj);
    }

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    AStarNode result = AStarAlgorithm.searchv2(graph, nRoot, acsTotal);

    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    String mergedCC = result.getId();
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }

    return finalSolution;

  }

  /**********************************************************************************/

  /**********************************************************************************/
  public List<String> aStarv3(List<String> acsIDList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    // AbstractComponentSpecification acsTotal = joinAC(acList);
    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListAC(acsIDList);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acsTotal);
    LOGGER.info("candidates size: " + ccsList.size());

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    AStarNode result = AStarAlgorithm.searchv3(graph, nRoot, acsTotal, acsList, ccsList);
    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    String mergedCC = result.getId();
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }

    return finalSolution;

  }

  /**********************************************************************************/

  /**********************************************************************************/
  public List<String> aStarv4(List<String> acsIDList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListAC(acsIDList);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    Map<String, List<ConcreteComponentSpecification>> ccsMap = this.getCandidatesGroupedByACOperations(acsListCopy);

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    AStarNode result = AStarAlgorithm.searchv4(graph, nRoot, acsTotal, acsList, ccsMap);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[aStarv4] time: " + (timeEnd - timeStart));

    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    String mergedCC = result.getId();
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }

    return finalSolution;

  }

  /**********************************************************************************/

  /**********************************************************************************/
  public List<String> aStarv5(List<String> acsIDList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    // AbstractComponentSpecification acsTotal = joinAC(acList);
    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListAC(acsIDList);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acsTotal);
    LOGGER.info("candidates size: " + ccsList.size());

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    AStarNode result = AStarAlgorithm.searchv5(graph, nRoot, acsTotal, acsList, ccsList);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[aStarv5] time: " + (timeEnd - timeStart));
    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    String mergedCC = result.getId();
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }

    return finalSolution;

  }

  /**********************************************************************************/

  /**********************************************************************************/
  public List<String> aStarv6(List<String> acsIDList) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    List<String> finalSolution = new ArrayList<String>();

    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListAC(acsIDList);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    Map<String, List<ConcreteComponentSpecification>> ccsMap = this.getCandidatesGroupedByACOperations(acsListCopy);

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    AStarNode result = AStarAlgorithm.searchv6(graph, nRoot, acsTotal, acsList, ccsMap);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[aStarv6] time: " + (timeEnd - timeStart));

    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    String mergedCC = result.getId();
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }

    return finalSolution;

  }

  /**********************************************************************************/

  public List<CandidateMatchingInfo> calculateMatchingInfo2(List<String> acsIDList) {

    AbstractComponentSpecification acs = this.joinAC(acsIDList);
    return this.calculateMatchingInfo2(acs);
  }

  private List<CandidateMatchingInfo> calculateMatchingInfo2(AbstractComponentSpecification acs) {

    long timeStart, timeEnd, timeStartTotal, timeEndTotal;

    timeStartTotal = System.currentTimeMillis();

    List<CandidateMatchingInfo> list = new ArrayList<CandidateMatchingInfo>();

    // Select all the candidates
    timeStart = System.currentTimeMillis();

    List<ConcreteComponentSpecification> candidates = getCandidatesByACOperations(acs);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[Heuristics - calculateMatchingInfo] time selecting the candidates: " + (timeEnd - timeStart)
        + " milliseconds");

    LOGGER.info("[Heuristics - calculateMatchingInfo] candidates size: " + candidates.size());

    // Calculate each matching info
    timeStart = System.currentTimeMillis();
    for (ConcreteComponentSpecification ccs : candidates) {
      MatchingInfo mInfo = this.calculateMatchingCC(ccs, acs);
      CandidateMatchingInfo cInfo = new CandidateMatchingInfo();
      cInfo.setCcID(ccs.getComponentID());
      cInfo.setRatioTotal(mInfo.getRatio());
      cInfo.setRatioFunctional(mInfo.getFunctionalMatchInfo().getRatio());
      cInfo.setRatioExtraFunctional(mInfo.getExtraFunctionalMatchInfo().getRatio());
      cInfo.setRatioPackaging(mInfo.getPackagingMatchInfo().getRatio());
      cInfo.setRatioMarketing(mInfo.getMarketingMatchInfo().getRatio());
      list.add(cInfo);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info(
        "[Heuristics - calculateMatchingInfo] time calculating the info: " + (timeEnd - timeStart) + " milliseconds");

    timeStart = System.currentTimeMillis();
    Collections.sort(list);
    timeEnd = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time sorting the list: " + (timeEnd - timeStart) + " milliseconds");

    timeEndTotal = System.currentTimeMillis();
    LOGGER
        .info("[Heuristics - calculateMatchingInfo] time total: " + (timeEndTotal - timeStartTotal) + " milliseconds");

    return list;
  }

  @SuppressWarnings("unchecked")
  private AbstractComponentSpecification joinAC(List<String> acIDList) {

    List<AbstractComponentSpecification> acsList = null;
    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();
    Session session = sessionFactory.openSession();
    Query query = session.createQuery(
        "SELECT DISTINCT acs FROM AbstractComponentSpecification acs " + "WHERE acs.componentID IN (:acIDList)");
    query.setParameterList("acIDList", acIDList);
    acsList = query.list();
    session.close();

    AbstractComponentSpecification acsTotal = acsList.get(0);
    for (int i = 1; i < acsList.size(); i++) {
      AbstractComponentSpecification acs = acsList.get(i);
      EList<acmm.ProvidedInterface> provList = acs.getFunctional().getProvidedInterfaces().getInterface();
      acsTotal.getFunctional().getProvidedInterfaces().getInterface().addAll(provList);

      if (acs.getFunctional().getRequiredInterfaces() != null) {
        EList<acmm.RequiredInterface> reqList = acs.getFunctional().getRequiredInterfaces().getInterface();
        if (acsTotal.getFunctional().getRequiredInterfaces() == null) {
          acsTotal.getFunctional().setRequiredInterfaces(AcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        acsTotal.getFunctional().getRequiredInterfaces().getInterface().addAll(reqList);
      }

      if (acs.getExtraFunctional() != null) {
        if (acsTotal.getExtraFunctional() == null) {
          acsTotal.setExtraFunctional(AcmmFactory.eINSTANCE.createExtraFunctional());
        }
        if (acs.getExtraFunctional().getDependencies() != null) {
          if (acsTotal.getExtraFunctional().getDependencies() == null) {
            acsTotal.getExtraFunctional().setDependencies(AcmmFactory.eINSTANCE.createDependencies());
          }
          acsTotal.getExtraFunctional().getDependencies().getDependency()
              .addAll(acs.getExtraFunctional().getDependencies().getDependency());

        }
        if (acs.getExtraFunctional().getProperties() != null) {
          if (acsTotal.getExtraFunctional().getProperties() == null) {
            acsTotal.getExtraFunctional().setProperties(AcmmFactory.eINSTANCE.createProperties());
          }
          acsTotal.getExtraFunctional().getProperties().getProperty()
              .addAll(acs.getExtraFunctional().getProperties().getProperty());
        }
      }
    }
    return acsTotal;
  }

  @SuppressWarnings("unchecked")
  private List<Object> joinAndListAC(List<String> acIDList) {

    List<Object> result = new ArrayList<Object>();

    List<AbstractComponentSpecification> acsList = null;
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();
    Session session = sessionFactory.openSession();
    Query query = session.createQuery(
        "SELECT DISTINCT acs FROM AbstractComponentSpecification acs " + "WHERE acs.componentID IN (:acIDList)");
    query.setParameterList("acIDList", acIDList);
    acsList = query.list();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    // result.add(acsList);
    result.add(acsListCopy);
    session.close();

    AbstractComponentSpecification acsTotal = acsList.get(0);
    for (int i = 1; i < acsList.size(); i++) {
      AbstractComponentSpecification acs = acsList.get(i);
      EList<acmm.ProvidedInterface> provList = acs.getFunctional().getProvidedInterfaces().getInterface();
      acsTotal.getFunctional().getProvidedInterfaces().getInterface().addAll(provList);

      if (acs.getFunctional().getRequiredInterfaces() != null) {
        EList<acmm.RequiredInterface> reqList = acs.getFunctional().getRequiredInterfaces().getInterface();
        if (acsTotal.getFunctional().getRequiredInterfaces() == null) {
          acsTotal.getFunctional().setRequiredInterfaces(AcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        acsTotal.getFunctional().getRequiredInterfaces().getInterface().addAll(reqList);
      }

      if (acs.getExtraFunctional() != null) {
        if (acsTotal.getExtraFunctional() == null) {
          acsTotal.setExtraFunctional(AcmmFactory.eINSTANCE.createExtraFunctional());
        }
        if (acs.getExtraFunctional().getDependencies() != null) {
          if (acsTotal.getExtraFunctional().getDependencies() == null) {
            acsTotal.getExtraFunctional().setDependencies(AcmmFactory.eINSTANCE.createDependencies());
          }
          acsTotal.getExtraFunctional().getDependencies().getDependency()
              .addAll(acs.getExtraFunctional().getDependencies().getDependency());

        }
        if (acs.getExtraFunctional().getProperties() != null) {
          if (acsTotal.getExtraFunctional().getProperties() == null) {
            acsTotal.getExtraFunctional().setProperties(AcmmFactory.eINSTANCE.createProperties());
          }
          acsTotal.getExtraFunctional().getProperties().getProperty()
              .addAll(acs.getExtraFunctional().getProperties().getProperty());
        }
      }
    }
    result.add(0, acsTotal);
    return result;
  }

  @SuppressWarnings("unchecked")
  private List<Object> joinAndListACFromAAM(AbstractArchitecturalModel aam) {

    LOGGER.info("[Heuristics - joinAndListACFromAAM]");

    // Get the acIDList
    List<String> acIDList = new ArrayList<String>();
    for (AbstractComponent ac : aam.getAbstractComponent()) {
      acIDList.add(ac.getComponentID());
    }

    List<Object> result = new ArrayList<Object>();

    List<AbstractComponentSpecification> acsList = null;
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    SessionFactory sessionFactory = dataStoreAC.getSessionFactory();
    Session session = sessionFactory.openSession();
    Query query = session.createQuery(
        "SELECT DISTINCT acs FROM AbstractComponentSpecification acs " + "WHERE acs.componentID IN (:acIDList)");
    query.setParameterList("acIDList", acIDList);
    acsList = query.list();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    // result.add(acsListCopy);
    // session.close();

    AbstractComponentSpecification acsTotal = EcoreUtil.copy(acsList.get(0));
    // Check for this first component and add only the mandatory required interfaces
    if (acsTotal.getFunctional().getRequiredInterfaces() != null) {
      List<acmm.RequiredInterface> reqListFirst = (List<RequiredInterface>) EcoreUtil
          .copyAll(acsTotal.getFunctional().getRequiredInterfaces().getInterface());
      if (acsTotal.getFunctional().getRequiredInterfaces() == null) {
        acsTotal.getFunctional().setRequiredInterfaces(AcmmFactory.eINSTANCE.createRequiredInterfaces());
      }
      Iterator<acmm.RequiredInterface> reqListFirstIt = reqListFirst.iterator();
      while (reqListFirstIt.hasNext()) {
        acmm.RequiredInterface reqI = reqListFirstIt.next();
        String interfaceID = reqI.getInterfaceID();
        if (checkMandatory(interfaceID, aam.getRelationship())) {
          acsTotal.getFunctional().getRequiredInterfaces().getInterface().add(reqI);
          LOGGER.info(interfaceID + " is mandatory");
        } else {
          LOGGER.info(interfaceID + " is not mandatory");
          // Delete this interface in the AC specification
          for (AbstractComponentSpecification acsAux : acsListCopy) {
            if (acsAux.getComponentID().equalsIgnoreCase(acsTotal.getComponentID())) {

              /*
               * for (acmm.RequiredInterface reqInterface : reqInterfaceList) { if
               * (reqInterface.getInterfaceID().equalsIgnoreCase(interfaceID)) { boolean
               * removed =
               * acsAux.getFunctional().getRequiredInterfaces().getInterface().remove(
               * reqInterface); LOGGER.info("AC REQUIRED INTERFACE REMOVED: " + removed); } }
               */
              List<acmm.RequiredInterface> reqInterfaceList = (List<RequiredInterface>) EcoreUtil
                  .copyAll(acsAux.getFunctional().getRequiredInterfaces().getInterface());
              for (int i = 0; i < reqInterfaceList.size(); i++) {
                acmm.RequiredInterface reqInterface = reqInterfaceList.get(i);
                if (reqInterface.getInterfaceID().equalsIgnoreCase(interfaceID)) {
                  if (acsTotal.getFunctional().getRequiredInterfaces().getInterface().size() == 1) {
                    acsTotal.getFunctional().setRequiredInterfaces(null);
                    acsListCopy.get(0).getFunctional().setRequiredInterfaces(null);
                    // LOGGER.info("(1) AC REQUIRED INTERFACE REMOVED size = 1");
                  } else {
                    acmm.RequiredInterface removed = acsTotal.getFunctional().getRequiredInterfaces().getInterface()
                        .remove(i);
                    acsListCopy.get(0).getFunctional().getRequiredInterfaces().getInterface().remove(i);
                    // LOGGER.info("(1) AC REQUIRED INTERFACE REMOVED size > 1: " +
                    // removed.getInterfaceID());
                  }
                }
              }
            }
          }
        }
      }
    }

    for (int i = 1; i < acsList.size(); i++) {
      AbstractComponentSpecification acs = acsList.get(i);
      EList<acmm.ProvidedInterface> provList = acs.getFunctional().getProvidedInterfaces().getInterface();
      acsTotal.getFunctional().getProvidedInterfaces().getInterface().addAll(provList);

      // LOGGER.info("ACID: " + acs.getComponentID());
      if (acs.getFunctional().getRequiredInterfaces() != null) {
        // EList<acmm.RequiredInterface> reqList = acs.getFunctional()
        // .getRequiredInterfaces().getInterface();
        List<acmm.RequiredInterface> reqList = (List<RequiredInterface>) EcoreUtil
            .copyAll(acs.getFunctional().getRequiredInterfaces().getInterface());
        if (acsTotal.getFunctional().getRequiredInterfaces() == null) {
          acsTotal.getFunctional().setRequiredInterfaces(AcmmFactory.eINSTANCE.createRequiredInterfaces());
        }

        // Add only the mandatory required interfaces
        Iterator<acmm.RequiredInterface> reqListIt = reqList.iterator();
        while (reqListIt.hasNext()) {

          acmm.RequiredInterface reqI = reqListIt.next();
          String interfaceID = reqI.getInterfaceID();

          if (checkMandatory(interfaceID, aam.getRelationship())) {
            acsTotal.getFunctional().getRequiredInterfaces().getInterface().add(reqI);
            LOGGER.info(interfaceID + " is mandatory");
          } else {
            LOGGER.info(interfaceID + " is not mandatory");
            // Delete this interface in the AC specification
            for (AbstractComponentSpecification acsAux : acsListCopy) {
              if (acsAux.getComponentID().equalsIgnoreCase(acs.getComponentID())) {

                /*
                 * for (acmm.RequiredInterface reqInterface :
                 * acsAux.getFunctional().getRequiredInterfaces().getInterface()) { if
                 * (reqInterface.getInterfaceID().equalsIgnoreCase(interfaceID)) {
                 * acsAux.getFunctional().getRequiredInterfaces().getInterface().remove(
                 * reqInterface); LOGGER.info("AC REQUIRED INTERFACE REMOVED"); } }
                 */

                List<acmm.RequiredInterface> reqInterfaceList = (List<RequiredInterface>) EcoreUtil
                    .copyAll(acsAux.getFunctional().getRequiredInterfaces().getInterface());
                for (int j = 0; j < reqInterfaceList.size(); j++) {
                  acmm.RequiredInterface reqInterface = reqInterfaceList.get(j);
                  if (reqInterface.getInterfaceID().equalsIgnoreCase(interfaceID)) {
                    if (acsTotal.getFunctional().getRequiredInterfaces().getInterface().size() == 1) {
                      // acsTotal.getFunctional().setRequiredInterfaces(null);
                      acsListCopy.get(i).getFunctional().setRequiredInterfaces(null);
                      // LOGGER.info("(2) AC REQUIRED INTERFACE REMOVED size = 1");
                    } else {
                      // acmm.RequiredInterface removed =
                      // acsTotal.getFunctional().getRequiredInterfaces().getInterface().remove(j);
                      acsListCopy.get(i).getFunctional().getRequiredInterfaces().getInterface().remove(j);
                      // LOGGER.info("(2) AC REQUIRED INTERFACE REMOVED size > 1");
                      // LOGGER.info("SIZE: " +
                      // acsTotal.getFunctional().getRequiredInterfaces().getInterface().size());
                    }
                  }
                }

              }
            }
          }
        }

        if (acsTotal.getFunctional().getRequiredInterfaces().getInterface().size() == 0) {
          acsTotal.getFunctional().setRequiredInterfaces(null);
        }

      }

    }
    result.add(acsListCopy);
    session.close();
    result.add(0, acsTotal);

    return result;
  }

  private boolean checkMandatory(String interfaceID, EList<Relationship> relationshipList) {

    boolean isMandatory = false;

    for (Relationship r : relationshipList) {
      if (r instanceof Binary) {
        for (AbstractDependency absDep : ((Binary) r).getDependency()) {
          if (absDep.getSource().getInterfaceID().equalsIgnoreCase(interfaceID)) {
            isMandatory = true;
            break;
          }
        }
      }
    }

    return isMandatory;
  }

  /**********************************************************************************/

  public MatchingInfo calculateMatchingACListCCList(List<String> acList, List<String> ccList) {

    MatchingInfo mInfo = new MatchingInfo();

    // Join all abstract components
    // (only functional part)
    AbstractComponentSpecification acsTotal = this.getACFromID(acList.get(0));
    for (int i = 1; i < acList.size(); i++) {
      String acID = acList.get(i);
      AbstractComponentSpecification acs = this.getACFromID(acID);
      EList<acmm.ProvidedInterface> provList = acs.getFunctional().getProvidedInterfaces().getInterface();
      acsTotal.getFunctional().getProvidedInterfaces().getInterface().addAll(provList);

      if (acs.getFunctional().getRequiredInterfaces() != null) {
        EList<acmm.RequiredInterface> reqList = acs.getFunctional().getRequiredInterfaces().getInterface();
        if (acsTotal.getFunctional().getRequiredInterfaces() == null) {
          acsTotal.getFunctional().setRequiredInterfaces(AcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        acsTotal.getFunctional().getRequiredInterfaces().getInterface().addAll(reqList);
      }
    }

    // Join all concrete components
    // (only functional part)
    ConcreteComponentSpecification ccsTotal = this.getCCFromID(ccList.get(0));
    for (int i = 1; i < ccList.size(); i++) {
      String ccID = ccList.get(i);
      ConcreteComponentSpecification ccs = this.getCCFromID(ccID);
      EList<ccmm.ProvidedInterface> provList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
          .getInterface();
      ccsTotal.getFunctional().getControllerInterface().getProvidedInterfaces().getInterface().addAll(provList);

      if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
        EList<ccmm.RequiredInterface> reqList = ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
            .getInterface();
        if (ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces() == null) {
          ccsTotal.getFunctional().getControllerInterface()
              .setRequiredInterfaces(CcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces().getInterface().addAll(reqList);
      }
    }

    // Calculate matching
    // Functional part
    acmm.Functional acFunctional = acsTotal.getFunctional();
    ccmm.Functional ccFunctional = ccsTotal.getFunctional();
    FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
    mInfo.setFunctionalMatchInfo(functionalMatchInfo);

    double ratioFunctional = functionalMatchInfo.getRatio();
    double ratio = ratioFunctional;
    mInfo.setRatio(ratio);

    return mInfo;
  }

  public List<CandidateMatchingInfo> calculateMatchingACList(List<String> acList) {

    MatchingInfo mInfo = new MatchingInfo();

    AbstractComponentSpecification acs = this.joinAC(acList);

    List<CandidateMatchingInfo> listMInfo = this.calculateMatchingInfo2(acs);

    return listMInfo;
  }

  public ConcreteComponentSpecification joinCC(List<String> ccIDList) {

    ConcreteComponentSpecification ccsTotal = this.getCCFromID(ccIDList.get(0));
    for (int i = 1; i < ccIDList.size(); i++) {
      String ccID = ccIDList.get(i);
      // LOGGER.info("joinCC ccID --> " + ccID);
      ConcreteComponentSpecification ccs = this.getCCFromID(ccID);
      EList<ccmm.ProvidedInterface> provList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
          .getInterface();
      ccsTotal.getFunctional().getControllerInterface().getProvidedInterfaces().getInterface().addAll(provList);

      if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
        EList<ccmm.RequiredInterface> reqList = ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
            .getInterface();
        if (ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces() == null) {
          ccsTotal.getFunctional().getControllerInterface()
              .setRequiredInterfaces(CcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces().getInterface().addAll(reqList);
      }
      if (ccs.getExtraFunctional() != null) {
        if (ccsTotal.getExtraFunctional() == null) {
          ccsTotal.setExtraFunctional(CcmmFactory.eINSTANCE.createExtraFunctional());
        }
        if (ccs.getExtraFunctional().getDependencies() != null) {
          if (ccsTotal.getExtraFunctional().getDependencies() == null) {
            ccsTotal.getExtraFunctional().setDependencies(CcmmFactory.eINSTANCE.createDependencies());
          }
          ccsTotal.getExtraFunctional().getDependencies().getDependency()
              .addAll(ccs.getExtraFunctional().getDependencies().getDependency());

        }
        if (ccs.getExtraFunctional().getProperties() != null) {
          if (ccsTotal.getExtraFunctional().getProperties() == null) {
            ccsTotal.getExtraFunctional().setProperties(CcmmFactory.eINSTANCE.createProperties());
          }
          ccsTotal.getExtraFunctional().getProperties().getProperty()
              .addAll(ccs.getExtraFunctional().getProperties().getProperty());
        }
      }
    }

    return ccsTotal;

  }

  public ConcreteComponentSpecification joinCCFromCCS(List<ConcreteComponentSpecification> listCC) {

    // LOGGER.info("listCC size: " + listCC.size());
    // ConcreteComponentSpecification ccsTotal = listCC.get(0);
    // Copier copier = new Copier();
    // ConcreteComponentSpecification ccsTotal =
    // (ConcreteComponentSpecification) copier
    // .copy(listCC.get(0));
    ConcreteComponentSpecification ccsTotal = (ConcreteComponentSpecification) EcoreUtil.copy(listCC.get(0));

    for (int i = 1; i < listCC.size(); i++) {
      ConcreteComponentSpecification ccs = listCC.get(i);
      EList<ccmm.ProvidedInterface> provList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
          .getInterface();
      ccsTotal.getFunctional().getControllerInterface().getProvidedInterfaces().getInterface().addAll(provList);

      if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
        EList<ccmm.RequiredInterface> reqList = ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
            .getInterface();
        if (ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces() == null) {
          ccsTotal.getFunctional().getControllerInterface()
              .setRequiredInterfaces(CcmmFactory.eINSTANCE.createRequiredInterfaces());
        }
        ccsTotal.getFunctional().getControllerInterface().getRequiredInterfaces().getInterface().addAll(reqList);
      }
      if (ccs.getExtraFunctional() != null) {
        if (ccsTotal.getExtraFunctional() == null) {
          ccsTotal.setExtraFunctional(CcmmFactory.eINSTANCE.createExtraFunctional());
        }
        if (ccs.getExtraFunctional().getDependencies() != null) {
          if (ccsTotal.getExtraFunctional().getDependencies() == null) {
            ccsTotal.getExtraFunctional().setDependencies(CcmmFactory.eINSTANCE.createDependencies());
          }
          ccsTotal.getExtraFunctional().getDependencies().getDependency()
              .addAll(ccs.getExtraFunctional().getDependencies().getDependency());

        }
        if (ccs.getExtraFunctional().getProperties() != null) {
          if (ccsTotal.getExtraFunctional().getProperties() == null) {
            ccsTotal.getExtraFunctional().setProperties(CcmmFactory.eINSTANCE.createProperties());
          }
          ccsTotal.getExtraFunctional().getProperties().getProperty()
              .addAll(ccs.getExtraFunctional().getProperties().getProperty());
        }
      }
    }

    return ccsTotal;
  }

  public MatchingInfo calculateMatchingCC(String ccID, String acID) {

    MatchingInfo mInfo = new MatchingInfo();

    double ratio = 0.0;
    // IntersectionType intersection = IntersectionType.EMPTY;
    // LargerType larger = LargerType.UNDETERMINED;

    // LOGGER.info("[Heuristics - calculateMatchingCC] CC ID: " + ccID);

    ConcreteComponentSpecification ccs = getCCFromID(ccID);

    if (ccs != null) {

      AbstractComponentSpecification acs = getACFromID(acID);

      if (acs != null) {

        // Perform the matching algorithm
        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching '"
        // + ccs.getComponentID() + "' with '" + acs.getComponentID() + "'");

        // Functional part
        acmm.Functional acFunctional = acs.getFunctional();
        ccmm.Functional ccFunctional = ccs.getFunctional();
        FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
        mInfo.setFunctionalMatchInfo(functionalMatchInfo);

        // Extra-functional part
        acmm.ExtraFunctional acExtraFunctional = acs.getExtraFunctional();
        ccmm.ExtraFunctional ccExtraFunctional = ccs.getExtraFunctional();
        ExtraFunctMatchInfo extraFunctionalMatchInfo = this.calculateMatchingCCExtraFunct(acExtraFunctional,
            ccExtraFunctional);
        mInfo.setExtraFunctionalMatchInfo(extraFunctionalMatchInfo);

        // Packaging part
        acmm.Packaging acPackaging = acs.getPackaging();
        ccmm.Packaging ccPackaging = ccs.getPackaging();
        PackMatchInfo packagingMatchInfo = this.calculateMatchingCCPack(acPackaging, ccPackaging);
        mInfo.setPackagingMatchInfo(packagingMatchInfo);

        // Marketing part
        acmm.Marketing acMarketing = acs.getMarketing();
        ccmm.Marketing ccMarketing = ccs.getMarketing();
        MarkMatchInfo marketingMatchInfo = this.calculateMatchingCCMark(acMarketing, ccMarketing);
        mInfo.setMarketingMatchInfo(marketingMatchInfo);

        // Total ratio
        double ratioF = functionalMatchInfo.getRatio();
        double ratioEF = extraFunctionalMatchInfo.getRatio();
        double ratioP = packagingMatchInfo.getRatio();
        double ratioM = marketingMatchInfo.getRatio();
        ratio = ratioF * ratioFFactor + ratioEF * ratioEFFactor + ratioP * ratioPFactor + ratioM * ratioMFactor;
        // // Format the ratio with 4 decimal digits
        // DecimalFormat df = new DecimalFormat("#.####");
        // String ratioString = df.format(ratio).replace(',', '.');
        // ratio = Double.parseDouble(ratioString);

        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching calculated");

      } else {
        LOGGER.info("[Heuristics - calculateMatchingCC] AbstractComponent with ID = '" + acID
            + "' does not exist --> Could not calculate the matching");

      }
    } else {
      LOGGER.info(
          "[Heuristics - calculateMatchingCC] " + ccID + " ID does not exist --> Could not calculate the matching");

    }

    mInfo.setRatio(ratio);
    // mInfo.setIntersection(intersection);
    // mInfo.setLarger(larger);

    return mInfo;
  }

  public MatchingInfo calculateMatchingCCACList(String ccID, List<String> acList) {

    MatchingInfo mInfo = new MatchingInfo();

    AbstractComponentSpecification acs = this.joinAC(acList);

    double ratio = 0.0;
    // IntersectionType intersection = IntersectionType.EMPTY;
    // LargerType larger = LargerType.UNDETERMINED;

    // LOGGER.info("[Heuristics - calculateMatchingCC] CC ID: " + ccID);

    ConcreteComponentSpecification ccs = getCCFromID(ccID);

    if (ccs != null) {

      if (acs != null) {

        // Perform the matching algorithm
        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching '"
        // + ccs.getComponentID() + "' with '" + acs.getComponentID() + "'");

        // Functional part
        acmm.Functional acFunctional = acs.getFunctional();
        ccmm.Functional ccFunctional = ccs.getFunctional();
        FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
        mInfo.setFunctionalMatchInfo(functionalMatchInfo);

        // Extra-functional part
        acmm.ExtraFunctional acExtraFunctional = acs.getExtraFunctional();
        ccmm.ExtraFunctional ccExtraFunctional = ccs.getExtraFunctional();
        ExtraFunctMatchInfo extraFunctionalMatchInfo = this.calculateMatchingCCExtraFunct(acExtraFunctional,
            ccExtraFunctional);
        mInfo.setExtraFunctionalMatchInfo(extraFunctionalMatchInfo);

        // Packaging part
        acmm.Packaging acPackaging = acs.getPackaging();
        ccmm.Packaging ccPackaging = ccs.getPackaging();
        PackMatchInfo packagingMatchInfo = this.calculateMatchingCCPack(acPackaging, ccPackaging);
        mInfo.setPackagingMatchInfo(packagingMatchInfo);

        // Marketing part
        acmm.Marketing acMarketing = acs.getMarketing();
        ccmm.Marketing ccMarketing = ccs.getMarketing();
        MarkMatchInfo marketingMatchInfo = this.calculateMatchingCCMark(acMarketing, ccMarketing);
        mInfo.setMarketingMatchInfo(marketingMatchInfo);

        // Total ratio
        double ratioF = functionalMatchInfo.getRatio();
        double ratioEF = extraFunctionalMatchInfo.getRatio();
        double ratioP = packagingMatchInfo.getRatio();
        double ratioM = marketingMatchInfo.getRatio();
        ratio = ratioF * ratioFFactor + ratioEF * ratioEFFactor + ratioP * ratioPFactor + ratioM * ratioMFactor;
        // // Format the ratio with 4 decimal digits
        // DecimalFormat df = new DecimalFormat("#.####");
        // String ratioString = df.format(ratio).replace(',', '.');
        // ratio = Double.parseDouble(ratioString);

        // LOGGER.info("[Heuristics - calculateMatchingCC] Matching calculated");

      } else {
        LOGGER.info("[Heuristics - calculateMatchingCCACList] Could not calculate the matching");

      }
    } else {
      LOGGER.info("[Heuristics - calculateMatchingCCACList] " + ccID
          + " ID does not exist --> Could not calculate the matching");
    }

    mInfo.setRatio(ratio);

    return mInfo;
  }

  public MatchingInfo calculateMatchingCCOnlyF(String ccID, String acID) {

    MatchingInfo mInfo = new MatchingInfo();

    double ratio = 0.0;

    LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] CC ID: " + ccID);

    ConcreteComponentSpecification ccs = getCCFromID(ccID);

    if (ccs != null) {

      AbstractComponentSpecification acs = getACFromID(acID);

      if (acs != null) {

        // Perform the matching algorithm
        LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] Matching '" + ccs.getComponentID() + "' with '"
            + acs.getComponentID() + "'");

        // Functional part
        acmm.Functional acFunctional = acs.getFunctional();
        ccmm.Functional ccFunctional = ccs.getFunctional();
        FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
        mInfo.setFunctionalMatchInfo(functionalMatchInfo);

        // Total ratio
        double ratioF = functionalMatchInfo.getRatio();
        ratio = ratioF;

        LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] Matching calculated");

      } else {
        LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] AbstractComponent with ID = '" + acID
            + "' does not exist --> Could not calculate the matching");

      }
    } else {
      LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] " + ccID
          + " ID does not exist --> Could not calculate the matching");

    }

    mInfo.setRatio(ratio);

    return mInfo;
  }

  public MatchingInfo calculateMatchingCCOnlyF(ConcreteComponentSpecification ccs, AbstractComponentSpecification acs) {

    MatchingInfo mInfo = new MatchingInfo();

    double ratio = 0.0;

    if (ccs != null) {
      if (acs != null) {

        // Perform the matching algorithm
        // LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] Matching '"
        // + ccs.getComponentID() + "' with '" + acs.getComponentID() + "'");

        // Functional part
        acmm.Functional acFunctional = acs.getFunctional();
        ccmm.Functional ccFunctional = ccs.getFunctional();
        FunctMatchInfo functionalMatchInfo = this.calculateMatchingCCFunct(acFunctional, ccFunctional);
        mInfo.setFunctionalMatchInfo(functionalMatchInfo);

        // Total ratio
        double ratioF = functionalMatchInfo.getRatio();
        ratio = ratioF;

        // LOGGER
        // .info("[Heuristics - calculateMatchingCCOnlyF] Matching calculated");

      } else {
        LOGGER.info(
            "[Heuristics - calculateMatchingCCOnlyF] AbstractComponent does not exist --> Could not calculate the matching");

      }
    } else {
      LOGGER.info("[Heuristics - calculateMatchingCCOnlyF] CC does not exist --> Could not calculate the matching");

    }

    mInfo.setRatio(ratio);

    return mInfo;
  }

  private FunctMatchInfo calculateMatchingCCFunct(acmm.Functional acFunctional, ccmm.Functional ccFunctional) {

    FunctMatchInfo functMatchInfo = new FunctMatchInfo();

    boolean onlyOneAC = false;

    double ratio = 1.0;
    IntersectionType intersection = IntersectionType.EMPTY;
    LargerType larger = LargerType.UNDETERMINED;
    double ratioProvided = 1.0;
    IntersectionType intersectionProvided = IntersectionType.EMPTY;
    LargerType largerProvided = LargerType.UNDETERMINED;
    int acNumProvidedInterfaces = 0;
    int ccNumProvidedInterfaces = 0;
    int numMatchedProvidedInterfaces = 0;
    int involvedProvidedInterfaces = 0;
    int acNumProvidedOperations = 0;
    int ccNumProvidedOperations = 0;
    int numMatchedProvidedOperations = 0;
    List<MatchedInterfaceInfo> matchedProvidedInterfaces = new ArrayList<MatchedInterfaceInfo>();
    double ratioRequired = 1.0;
    IntersectionType intersectionRequired = IntersectionType.EMPTY;
    LargerType largerRequired = LargerType.UNDETERMINED;
    int acNumRequiredInterfaces = 0;
    int ccNumRequiredInterfaces = 0;
    int numMatchedRequiredInterfaces = 0;
    int involvedRequiredInterfaces = 0;
    int acNumRequiredOperations = 0;
    int ccNumRequiredOperations = 0;
    int numMatchedRequiredOperations = 0;
    List<MatchedInterfaceInfo> matchedRequiredInterfaces = new ArrayList<MatchedInterfaceInfo>();

    // Previous calculations for ProvidedInterfaces
    EList<acmm.ProvidedInterface> acProvList = acFunctional.getProvidedInterfaces().getInterface();
    acNumProvidedInterfaces = acProvList.size();
    for (acmm.ProvidedInterface acProvInterface : acProvList) {
      int ops = acProvInterface.getInterfaceSpecification().getPortType().getOperation().size();
      acNumProvidedOperations += ops;
    }
    ccmm.ProvidedInterfaces ccProvided = ccFunctional.getControllerInterface().getProvidedInterfaces();
    EList<ccmm.ProvidedInterface> ccProvList = ccProvided.getInterface();
    ccNumProvidedInterfaces = ccProvList.size();
    for (ccmm.ProvidedInterface ccProvInterface : ccProvList) {
      int ops = ccProvInterface.getInterfaceSpecification().getPortType().getOperation().size();
      ccNumProvidedOperations += ops;
    }

    // Previous calculations for ProvidedInterfaces
    acmm.RequiredInterfaces acReqInterfaces = acFunctional.getRequiredInterfaces();
    EList<acmm.RequiredInterface> acReqList = null;
    if (acReqInterfaces != null) {
      acReqList = acReqInterfaces.getInterface();
      acNumRequiredInterfaces = acReqList.size();
      for (acmm.RequiredInterface acReqInterface : acReqList) {
        // LOGGER.info("(1) REQ INTERFACE --------------> " +
        // acReqInterface.getInterfaceID());
        int ops = acReqInterface.getInterfaceSpecification().getPortType().getOperation().size();
        acNumRequiredOperations += ops;
      }
    }
    ccmm.RequiredInterfaces ccReqInterfaces = ccFunctional.getControllerInterface().getRequiredInterfaces();
    if (ccReqInterfaces != null) {
      EList<ccmm.RequiredInterface> ccReqList = ccReqInterfaces.getInterface();
      ccNumRequiredInterfaces = ccReqList.size();
      for (ccmm.RequiredInterface ccReqInterface : ccReqList) {
        int ops = ccReqInterface.getInterfaceSpecification().getPortType().getOperation().size();
        ccNumRequiredOperations += ops;
      }
    }

    // --------------- Check the Provided block --------------- //
    // EList<acmm.ProvidedInterface> acProvList =
    // acFunctional.getProvidedInterfaces().getInterface();
    // acNumProvidedInterfaces = acProvList.size();

    for (acmm.ProvidedInterface acProvInterface : acProvList) {
      EList<acmm.Operation> acInferfOperations = acProvInterface.getInterfaceSpecification().getPortType()
          .getOperation();
      int acInterfOperationsTotal = acInferfOperations.size();
      // acNumProvidedOperations += acInterfOperationsTotal;
      List<MatchedOperationInfo> matchedProvOperations = new ArrayList<MatchedOperationInfo>();
      int matchedOps = 0;
      for (acmm.Operation acInterfOperation : acInferfOperations) {
        MatchedOperationInfo mOp = checkOperation(acInterfOperation, ccProvided);
        if (mOp != null) {

          matchedOps++;
          numMatchedProvidedOperations++;

          // Add matched operation
          matchedProvOperations.add(mOp);
        }

        if (matchedOps == acInterfOperationsTotal) {

          numMatchedProvidedInterfaces++;

          // Add matched interfaces
          MatchedInterfaceInfo mInterf = new MatchedInterfaceInfo();
          mInterf.setAcInterfaceID(acProvInterface.getInterfaceID());
          List<String> interfaces = new ArrayList<String>();
          for (MatchedOperationInfo mOpAux : matchedProvOperations) {
            String interfaceID = mOpAux.getCcInterfaceID();
            if (!interfaces.contains(interfaceID)) {
              interfaces.add(interfaceID);
            }
          }
          int ccNumInterfaces = interfaces.size();
          mInterf.setCcNumInterfaces(ccNumInterfaces);
          mInterf.setMatchedOperation(matchedProvOperations);
          matchedProvidedInterfaces.add(mInterf);

          break;
        }
      }

      if (numMatchedProvidedInterfaces == acNumProvidedInterfaces) {

        break;
      }
    }

    // Calculated "involved" cc provided interfaces
    List<String> involvedProvidedInterfacesList = new ArrayList<String>();
    for (MatchedInterfaceInfo mii : matchedProvidedInterfaces) {
      List<MatchedOperationInfo> mois = mii.getMatchedOperation();
      for (MatchedOperationInfo moi : mois) {
        if (!involvedProvidedInterfacesList.contains(moi.getCcInterfaceID())) {
          involvedProvidedInterfacesList.add(moi.getCcInterfaceID());
        }
      }
    }
    involvedProvidedInterfaces = involvedProvidedInterfacesList.size();

    // Calculate ratioProvided
    // ratioProvided = (double) numMatchedProvidedInterfaces
    // / acNumProvidedInterfaces;
    // -- The difference between cc and ac [cc - ac] could be:
    // -- (-n, ..., -1, 0, 1, ..., n)
    // -- 0 is the optimal case
    // -- negative values are worse than positive
    // -- bigger values of abs(n) are worse than smaller
    // -- the value for n-max is the number of acNumberOperations
    if (onlyOneAC == true) {
      int diffProv = involvedProvidedInterfaces - acNumProvidedInterfaces;
      double ratioMatchedProvided = (double) numMatchedProvidedInterfaces / acNumProvidedInterfaces;
      double penaltyProvided = 0.0;
      if (diffProv < 0) {
        penaltyProvided = (double) Math.abs(diffProv) / acNumProvidedOperations;
      } else {
        penaltyProvided = (double) Math.abs(diffProv) / (acNumProvidedOperations * 2);
      }
      ratioProvided = ratioMatchedProvided - penaltyProvided;
      if (ratioProvided < 0) {
        ratioProvided = 0.0;
      }
    } else {
      ratioProvided = (double) numMatchedProvidedOperations / acNumProvidedOperations;
    }

    // // Format the ratio
    // DecimalFormat df = new DecimalFormat("#.####");
    // String ratioProvidedString = df.format(ratioProvided).replace(',', '.');
    // ratioProvided = Double.parseDouble(ratioProvidedString);

    // Calculate largerProvided
    if (acNumProvidedInterfaces > ccNumProvidedInterfaces) {
      largerProvided = LargerType.AC;
    } else {
      if (acNumProvidedInterfaces < ccNumProvidedInterfaces) {
        largerProvided = LargerType.CC;
      } else {
        largerProvided = LargerType.EQUAL;
      }
    }

    // Calculate intersectionProvided
    if (ratioProvided == 0) {
      intersectionProvided = IntersectionType.EMPTY;
    } else {
      if (ratioProvided == 1) {
        if (largerProvided == LargerType.AC) {
          intersectionProvided = IntersectionType.CC;
        } else {
          if (largerProvided == LargerType.CC) {
            intersectionProvided = IntersectionType.AC;
          } else {
            intersectionProvided = IntersectionType.OTHER;
          }
        }
      } else {
        intersectionProvided = IntersectionType.OTHER;
      }
    }
    // -------------------------------------------------------- //

    // --------------- Check the Required block --------------- //
    if (acReqInterfaces != null) {
      if (ccReqInterfaces != null) {
        for (acmm.RequiredInterface acReqInterface : acReqList) {
          EList<acmm.Operation> acInferfOperations = acReqInterface.getInterfaceSpecification().getPortType()
              .getOperation();
          int acInterfOperationsTotal = acInferfOperations.size();
          // acNumRequiredOperations += acInterfOperationsTotal;
          List<MatchedOperationInfo> matchedOperations = new ArrayList<MatchedOperationInfo>();
          int matchedOps = 0;
          for (acmm.Operation acInterfOperation : acInferfOperations) {
            MatchedOperationInfo mOp = checkOperation(acInterfOperation, ccReqInterfaces);
            if (mOp != null) {

              matchedOps++;
              numMatchedRequiredOperations++;

              // Add matched operation
              matchedOperations.add(mOp);
            }

            if (matchedOps == acInterfOperationsTotal) {

              numMatchedRequiredInterfaces++;

              // Add matched interfaces
              MatchedInterfaceInfo mInterf = new MatchedInterfaceInfo();
              mInterf.setAcInterfaceID(acReqInterface.getInterfaceID());
              List<String> interfaces = new ArrayList<String>();
              for (MatchedOperationInfo mOpAux : matchedOperations) {
                String interfaceID = mOpAux.getCcInterfaceID();
                if (!interfaces.contains(interfaceID)) {
                  interfaces.add(interfaceID);
                }
              }
              int ccNumInterfaces = interfaces.size();
              mInterf.setCcNumInterfaces(ccNumInterfaces);
              mInterf.setMatchedOperation(matchedOperations);
              matchedRequiredInterfaces.add(mInterf);

              break;
            }
          }

          if (numMatchedRequiredInterfaces == acNumRequiredInterfaces) {

            break;
          }

        }

        // Calculated "involved" cc required interfaces
        List<String> involvedRequiredInterfacesList = new ArrayList<String>();
        for (MatchedInterfaceInfo mii : matchedRequiredInterfaces) {
          List<MatchedOperationInfo> mois = mii.getMatchedOperation();
          for (MatchedOperationInfo moi : mois) {
            if (!involvedRequiredInterfacesList.contains(moi.getCcInterfaceID())) {
              involvedRequiredInterfacesList.add(moi.getCcInterfaceID());
            }
          }
        }
        involvedRequiredInterfaces = involvedRequiredInterfacesList.size();

        // Calculate ratioRequired
        // ratioRequired = (double) numMatchedRequiredInterfaces
        // / acNumRequiredInterfaces;
        // -- The difference between cc and ac [cc - ac] could be:
        // -- (-n, ..., -1, 0, 1, ..., n)
        // -- 0 is the optimal case
        // -- negative values are worse than positive
        // -- bigger values of abs(n) are worse than smaller
        // -- the value for n-max is the number of acNumberOperations
        if (onlyOneAC == true) {
          int diffReq = involvedRequiredInterfaces - acNumRequiredInterfaces;
          double ratioMatchedRequired = (double) numMatchedRequiredInterfaces / acNumRequiredInterfaces;
          double penaltyRequired = 0.0;
          if (diffReq < 0) {
            penaltyRequired = (double) Math.abs(diffReq) / acNumRequiredOperations;

          } else {
            penaltyRequired = (double) Math.abs(diffReq) / (acNumRequiredOperations * 2);
          }
          ratioRequired = ratioMatchedRequired - penaltyRequired;
          if (ratioRequired < 0) {
            ratioRequired = 0.0;
          }
        } else {
          ratioRequired = (double) numMatchedRequiredOperations / acNumRequiredOperations;
        }

        // // Format the ratio
        // DecimalFormat df = new DecimalFormat("#.####");
        // String ratioRequiredString = df.format(ratioRequired).replace(',',
        // '.');
        // ratioRequired = Double.parseDouble(ratioRequiredString);

        // Calculate largerRequired
        if (acNumRequiredInterfaces > ccNumRequiredInterfaces) {
          largerRequired = LargerType.AC;
        } else {
          if (acNumRequiredInterfaces < ccNumRequiredInterfaces) {
            largerRequired = LargerType.CC;
          } else {
            largerRequired = LargerType.EQUAL;
          }
        }

        // Calculate intersectionRequired
        if (ratioRequired == 0) {
          intersectionRequired = IntersectionType.EMPTY;
        } else {
          if (ratioRequired == 1) {
            if (largerRequired == LargerType.AC) {
              intersectionRequired = IntersectionType.CC;
            } else {
              if (largerRequired == LargerType.CC) {
                intersectionRequired = IntersectionType.AC;
              } else {
                intersectionRequired = IntersectionType.OTHER;
              }
            }
          } else {
            intersectionRequired = IntersectionType.OTHER;
          }
        }

      } else {
        ratioRequired = 0.0;
        intersectionRequired = IntersectionType.EMPTY;
        largerRequired = LargerType.AC;
      }
    } else {
      if (ccReqInterfaces != null) {
        ratioRequired = 0.0;
        intersectionRequired = IntersectionType.EMPTY;
        largerRequired = LargerType.CC;
      } else {
        intersectionRequired = IntersectionType.EMPTY;
        largerRequired = LargerType.EQUAL;
      }
    }
    // ------------------------------------------------------------ //

    // -------------------------------------------------------- //

    // Total ratio
    // ratio = (ratioProvided + ratioRequired) / 2;
    if (acReqInterfaces == null && ccReqInterfaces == null) {
      ratio = ratioProvided;
    } else {
      if (ratioProvided == 0.0) {
        ratio = 0.0;
      } else {
        ratio = (ratioProvided + ratioRequired) / 2;
      }
    }
    /*
     * if(intersectionProvided != IntersectionType.EMPTY) { if(intersectionRequired
     * != IntersectionType.EMPTY) { ratio = (ratioProvided + ratioRequired) / 2; }
     * else { ratio = ratioProvided; } } else { if(intersectionRequired !=
     * IntersectionType.EMPTY) { ratio = ratioRequired; } else { ratio = 0.0; } }
     */

    // Total intersection
    if (intersectionProvided == IntersectionType.AC && intersectionRequired == IntersectionType.AC) {
      intersection = IntersectionType.AC;
    } else {
      if (intersectionProvided == IntersectionType.CC && intersectionRequired == IntersectionType.CC) {
        intersection = IntersectionType.CC;
      } else {
        if (intersectionProvided == IntersectionType.EMPTY && intersectionRequired == IntersectionType.EMPTY) {
          intersection = IntersectionType.EMPTY;
        } else {
          intersection = IntersectionType.OTHER;
        }
      }
    }

    // Total larger
    if (largerProvided == LargerType.EQUAL && largerRequired == LargerType.EQUAL) {
      larger = LargerType.EQUAL;
    } else {
      if ((largerProvided == LargerType.CC && largerRequired == LargerType.CC)
          || (largerProvided == LargerType.CC && largerRequired == LargerType.EQUAL)
          || (largerProvided == LargerType.EQUAL && largerRequired == LargerType.CC)) {
        larger = LargerType.CC;
      } else {
        if ((largerProvided == LargerType.AC && largerRequired == LargerType.AC)
            || (largerProvided == LargerType.AC && largerRequired == LargerType.EQUAL)
            || (largerProvided == LargerType.EQUAL && largerRequired == LargerType.AC)) {
          larger = LargerType.AC;
        } else {
          larger = LargerType.UNDETERMINED;
        }
      }
    }

    functMatchInfo.setRatio(ratio);
    functMatchInfo.setIntersection(intersection);
    functMatchInfo.setLarger(larger);
    ProvidedInterfInfo providedInfo = new ProvidedInterfInfo();
    providedInfo.setRatio(ratioProvided);
    providedInfo.setIntersection(intersectionProvided);
    providedInfo.setLarger(largerProvided);
    providedInfo.setAcNumProvidedInterfaces(acNumProvidedInterfaces);
    providedInfo.setCcNumProvidedInterfaces(ccNumProvidedInterfaces);
    providedInfo.setMatchedProvidedInterfaces(numMatchedProvidedInterfaces);
    providedInfo.setInvolvedProvidedInterfaces(involvedProvidedInterfaces);
    providedInfo.setAcNumProvidedOperations(acNumProvidedOperations);
    providedInfo.setCcNumProvidedOperations(ccNumProvidedOperations);
    providedInfo.setMatchedProvidedOperations(numMatchedProvidedOperations);
    providedInfo.setMatchedInterface(matchedProvidedInterfaces);
    functMatchInfo.setProvided(providedInfo);
    RequiredInterfInfo requiredInfo = new RequiredInterfInfo();
    requiredInfo.setRatio(ratioRequired);
    requiredInfo.setIntersection(intersectionRequired);
    requiredInfo.setLarger(largerRequired);
    requiredInfo.setAcNumRequiredInterfaces(acNumRequiredInterfaces);
    requiredInfo.setCcNumRequiredInterfaces(ccNumRequiredInterfaces);
    requiredInfo.setMatchedRequiredInterfaces(numMatchedRequiredInterfaces);
    requiredInfo.setInvolvedRequiredInterfaces(involvedRequiredInterfaces);
    requiredInfo.setAcNumRequiredOperations(acNumRequiredOperations);
    requiredInfo.setCcNumRequiredOperations(ccNumRequiredOperations);
    requiredInfo.setMatchedRequiredOperations(numMatchedRequiredOperations);
    requiredInfo.setMatchedInterface(matchedRequiredInterfaces);
    functMatchInfo.setRequired(requiredInfo);

    return functMatchInfo;

  }

  private MatchedOperationInfo checkOperation(acmm.Operation acInterfOperation, ccmm.ProvidedInterfaces ccProvided) {

    MatchedOperationInfo mOp = null;

    acmm.Input acInput = acInterfOperation.getInput();
    acmm.Output acOutput = acInterfOperation.getOutput();

    boolean matchedOperation = false;

    for (ccmm.ProvidedInterface provInterf : ccProvided.getInterface()) {
      EList<ccmm.Operation> operations = provInterf.getInterfaceSpecification().getPortType().getOperation();
      for (ccmm.Operation op : operations) {

        boolean matchedInput = false;
        boolean matchedOutput = false;

        ccmm.Input ccInput = op.getInput();
        ccmm.Output ccOutput = op.getOutput();

        // Compare Input
        if (acInput.getType().equalsIgnoreCase(ccInput.getType())) {
          matchedInput = true;
        }

        // Compare Output
        if (acOutput != null) {
          if (ccOutput != null) {
            if (acOutput.getType().equalsIgnoreCase(ccOutput.getType())) {
              matchedOutput = true;
            }
          }
        } else {
          if (ccOutput == null) {
            matchedOutput = true;
          }
        }

        if (matchedInput && matchedOutput) {
          mOp = new MatchedOperationInfo();
          // mOp.setAcInterfaceID( ((acmm.PortType)
          // acInterfOperation.eContainer()).getName() );
          mOp.setAcOperationID(acInterfOperation.getName());
          mOp.setCcInterfaceID(provInterf.getInterfaceID());
          mOp.setCcOperationID(op.getName());
          mOp.setInputType(acInput.getType());
          if (acOutput != null) {
            mOp.setOutputType(acOutput.getType());
          }

          break;
        }

      }
      if (matchedOperation) {
        break;
      }
    }

    return mOp;
  }

  private MatchedOperationInfo checkOperation(acmm.Operation acInterfOperation, ccmm.RequiredInterfaces ccRequired) {

    MatchedOperationInfo mOp = null;

    acmm.Input acInput = acInterfOperation.getInput();
    acmm.Output acOutput = acInterfOperation.getOutput();

    boolean matchedOperation = false;

    for (ccmm.RequiredInterface reqInterf : ccRequired.getInterface()) {
      EList<ccmm.Operation> operations = reqInterf.getInterfaceSpecification().getPortType().getOperation();
      for (ccmm.Operation op : operations) {

        boolean matchedInput = false;
        boolean matchedOutput = false;

        ccmm.Input ccInput = op.getInput();
        ccmm.Output ccOutput = op.getOutput();

        // Compare Input
        if (acInput.getType().equalsIgnoreCase(ccInput.getType())) {
          matchedInput = true;
        }

        // Compare Output
        if (acOutput != null) {
          if (ccOutput != null) {
            if (acOutput.getType().equalsIgnoreCase(ccOutput.getType())) {
              matchedOutput = true;
            }
          }
        } else {
          if (ccOutput == null) {
            matchedOutput = true;
          }
        }

        if (matchedInput && matchedOutput) {
          mOp = new MatchedOperationInfo();
          // mOp.setAcInterfaceID( ((acmm.PortType)
          // acInterfOperation.eContainer()).getName() );
          mOp.setAcOperationID(acInterfOperation.getName());
          mOp.setCcInterfaceID(reqInterf.getInterfaceID());
          mOp.setCcOperationID(op.getName());
          mOp.setInputType(acInput.getType());
          if (acOutput != null) {
            mOp.setOutputType(acOutput.getType());
          }

          break;
        }

      }
      if (matchedOperation) {
        break;
      }
    }

    return mOp;
  }

  private ExtraFunctMatchInfo calculateMatchingCCExtraFunct(acmm.ExtraFunctional ace, ccmm.ExtraFunctional cce) {

    ExtraFunctMatchInfo extraFunctMatchInfo = new ExtraFunctMatchInfo();

    double ratio = 1.0;
    LargerType larger = LargerType.UNDETERMINED;
    IntersectionType intersection = IntersectionType.EMPTY;
    double ratioDependencies = 1.0;
    int acNumDependencies = 0;
    int ccNumDependencies = 0;
    int matchedDependencies = 0;
    LargerType largerDependencies = LargerType.UNDETERMINED;
    IntersectionType intersectionDependencies = IntersectionType.EMPTY;
    double ratioProperties = 1.0;
    int acNumProperties = 0;
    int ccNumProperties = 0;
    int matchedProperties = 0;
    int acNumPropertiesLow = 0;
    int matchedPropertiesLow = 0;
    int acNumPropertiesNormal = 0;
    int matchedPropertiesNormal = 0;
    int acNumPropertiesHigh = 0;
    int matchedPropertiesHigh = 0;
    LargerType largerProperties = LargerType.UNDETERMINED;
    IntersectionType intersectionProperties = IntersectionType.EMPTY;

    // Previous calculations for Dependencies
    acmm.Dependencies acDependencies = null;
    ccmm.Dependencies ccDependencies = null;
    EList<acmm.Dependency> acDepList = null;
    EList<ccmm.Dependency> ccDepList = null;
    if (ace != null) {
      acDependencies = ace.getDependencies();
      if (acDependencies != null) {
        acDepList = acDependencies.getDependency();
        acNumDependencies = acDepList.size();
      }
    }
    if (cce != null) {
      ccDependencies = cce.getDependencies();
      if (ccDependencies != null) {
        ccDepList = ccDependencies.getDependency();
        ccNumDependencies = ccDepList.size();
      }
    }
    // Previous calculations for Properties
    acmm.Properties acProperties = null;
    ccmm.Properties ccProperties = null;
    EList<acmm.Property> acPropList = null;
    EList<ccmm.Property> ccPropList = null;
    if (ace != null) {
      acProperties = ace.getProperties();
      if (acProperties != null) {
        acPropList = acProperties.getProperty();
        acNumProperties = acPropList.size();
        for (acmm.Property acProp : acPropList) {
          String prior = acProp.getPropertyPriority().getLiteral();
          if ("normal".equalsIgnoreCase(prior)) {
            acNumPropertiesNormal++;
          } else {
            if ("low".equalsIgnoreCase(prior)) {
              acNumPropertiesLow++;
            } else {
              acNumPropertiesHigh++;
            }
          }
        }
      }
    }
    if (cce != null) {
      ccProperties = cce.getProperties();
      if (ccProperties != null) {
        ccPropList = ccProperties.getProperty();
        ccNumProperties = ccPropList.size();
      }
    }

    // ------- Calculation of Dependencies and Properties blocks ------- //
    if (ace != null) {
      if (cce != null) {

        // --------------- Check the Dependencies block --------------- //
        if (acDependencies != null) {
          if (ccDependencies != null) {
            for (acmm.Dependency acDep : acDepList) {
              String acInterfaceID = acDep.getInterfaceID();
              for (ccmm.Dependency ccDep : ccDepList) {
                if (ccDep.getInterfaceID().equalsIgnoreCase(acInterfaceID)) {
                  matchedDependencies++;
                  break;
                }
              }
            }

            // // Calculate ratioDependencies
            // ratioDependencies = (double) matchedDependencies
            // / acNumDependencies;

            // Calculate largerDependencies and ratioDependencies
            if (acNumDependencies > ccNumDependencies) {
              largerDependencies = LargerType.AC;
              ratioDependencies = (double) matchedDependencies / acNumDependencies;
            } else {
              if (acNumDependencies < ccNumDependencies) {
                largerDependencies = LargerType.CC;
                ratioDependencies = (double) matchedDependencies / ccNumDependencies;
              } else {
                largerDependencies = LargerType.EQUAL;
                ratioDependencies = (double) matchedDependencies / acNumDependencies;
              }
            }

            // Calculate intersectionDependencies
            if (ratioDependencies == 0) {
              intersectionDependencies = IntersectionType.EMPTY;
            } else {
              if (ratioDependencies == 1) {
                if (largerDependencies == LargerType.AC) {
                  intersectionDependencies = IntersectionType.CC;
                } else {
                  if (largerDependencies == LargerType.CC) {
                    intersectionDependencies = IntersectionType.AC;
                  } else {
                    intersectionDependencies = IntersectionType.OTHER;
                  }
                }
              } else {
                intersectionDependencies = IntersectionType.OTHER;
              }
            }

          } else {
            ratioDependencies = 0.0;
            intersectionDependencies = IntersectionType.EMPTY;
            largerDependencies = LargerType.AC;
          }
        } else {
          if (ccDependencies != null) {
            ratioDependencies = 0.0;
            intersectionDependencies = IntersectionType.EMPTY;
            largerDependencies = LargerType.CC;
          } else {
            intersectionDependencies = IntersectionType.EMPTY;
            largerDependencies = LargerType.EQUAL;
          }
        }
        // ------------------------------------------------------------ //

        // --------------- Check the Properties block --------------- //
        if (acProperties != null) {
          if (ccProperties != null) {
            for (acmm.Property acProp : acPropList) {
              String acPropertyID = acProp.getPropertyID().getLiteral();
              String acPropertyValue = acProp.getPropertyValue();
              for (ccmm.Property ccProp : ccPropList) {
                if (ccProp.getPropertyID().getLiteral().equalsIgnoreCase(acPropertyID)
                    && ccProp.getPropertyValue().equalsIgnoreCase(acPropertyValue)) {
                  matchedProperties++;
                  String prior = acProp.getPropertyPriority().getLiteral();
                  if ("normal".equalsIgnoreCase(prior)) {
                    matchedPropertiesNormal++;
                  } else {
                    if ("low".equalsIgnoreCase(prior)) {
                      matchedPropertiesLow++;
                    } else {
                      matchedPropertiesHigh++;
                    }
                  }
                  break;
                }
              }
            }

            // Calculate ratioProperties
            // ratioProperties = (double) matchedProperties / acNumProperties;
            ratioProperties = (matchedPropertiesLow * propLowF + matchedPropertiesNormal * propNormalF
                + matchedPropertiesHigh * propHighF)
                / (acNumPropertiesLow * propLowF + acNumPropertiesNormal * propNormalF
                    + acNumPropertiesHigh * propHighF);
            // DecimalFormat df = new DecimalFormat("#.####");
            // String ratioPropertiesString =
            // df.format(ratioProperties).replace(
            // ',', '.');
            // ratioProperties = Double.parseDouble(ratioPropertiesString);

            // Calculate largerProperties
            if (acNumProperties > ccNumProperties) {
              largerProperties = LargerType.AC;
            } else {
              if (acNumProperties < ccNumProperties) {
                largerProperties = LargerType.CC;
              } else {
                largerProperties = LargerType.EQUAL;
              }
            }

            // Calculate intersectionProperties
            if (ratioProperties == 0) {
              intersectionProperties = IntersectionType.EMPTY;
            } else {
              if (ratioProperties == 1) {
                if (largerProperties == LargerType.AC) {
                  intersectionProperties = IntersectionType.CC;
                } else {
                  if (largerProperties == LargerType.CC) {
                    intersectionProperties = IntersectionType.AC;
                  } else {
                    intersectionProperties = IntersectionType.OTHER;
                  }
                }
              } else {
                intersectionProperties = IntersectionType.OTHER;
              }
            }

          } else {
            ratioProperties = 0.0;
            intersectionProperties = IntersectionType.EMPTY;
            largerProperties = LargerType.AC;
          }
        } else {
          if (ccProperties != null) {
            intersectionProperties = IntersectionType.EMPTY;
            largerProperties = LargerType.CC;
          } else {
            intersectionProperties = IntersectionType.EMPTY;
            largerProperties = LargerType.EQUAL;
          }
        }
        // ------------------------------------------------------------ //

      } else {
        ratio = 0.0;
        ratioDependencies = 0.0;
        ratioProperties = 0.0;
        intersection = IntersectionType.EMPTY;
        larger = LargerType.AC;
      }
    } else {

      if (cce != null) {
        intersection = IntersectionType.EMPTY;
        larger = LargerType.CC;
        if (ccNumDependencies > 0) {
          ratioDependencies = 0.0;
        }
      } else {
        intersection = IntersectionType.EMPTY;
        larger = LargerType.EQUAL;
      }
    }
    // ----------------------------------------------------------------- //

    // Total ratio
    ratio = (ratioDependencies + ratioProperties) / 2;

    // Total intersection
    if (intersectionDependencies == IntersectionType.AC && intersectionProperties == IntersectionType.AC) {
      intersection = IntersectionType.AC;
    } else {
      if (intersectionDependencies == IntersectionType.CC && intersectionProperties == IntersectionType.CC) {
        intersection = IntersectionType.CC;
      } else {
        if (intersectionDependencies == IntersectionType.EMPTY && intersectionProperties == IntersectionType.EMPTY) {
          intersection = IntersectionType.EMPTY;
        } else {
          intersection = IntersectionType.OTHER;
        }
      }
    }

    // Total larger
    if (largerDependencies == LargerType.EQUAL && largerProperties == LargerType.EQUAL) {
      larger = LargerType.EQUAL;
    } else {
      if ((largerDependencies == LargerType.CC && largerProperties == LargerType.CC)
          || (largerDependencies == LargerType.CC && largerProperties == LargerType.EQUAL)
          || (largerDependencies == LargerType.EQUAL && largerProperties == LargerType.CC)) {
        larger = LargerType.CC;
      } else {
        if ((largerDependencies == LargerType.AC && largerProperties == LargerType.AC)
            || (largerDependencies == LargerType.AC && largerProperties == LargerType.EQUAL)
            || (largerDependencies == LargerType.EQUAL && largerProperties == LargerType.AC)) {
          larger = LargerType.AC;
        } else {
          larger = LargerType.UNDETERMINED;
        }
      }
    }

    extraFunctMatchInfo.setRatio(ratio);
    extraFunctMatchInfo.setLarger(larger);
    extraFunctMatchInfo.setIntersection(intersection);
    DependenciesInfo depInfo = new DependenciesInfo();
    depInfo.setRatio(ratioDependencies);
    depInfo.setIntersection(intersectionDependencies);
    depInfo.setLarger(largerDependencies);
    depInfo.setAcNumDependencies(acNumDependencies);
    depInfo.setCcNumDependencies(ccNumDependencies);
    depInfo.setMatchedDependencies(matchedDependencies);
    extraFunctMatchInfo.setDependencies(depInfo);
    PropertiesInfo propInfo = new PropertiesInfo();
    propInfo.setRatio(ratioProperties);
    propInfo.setIntersection(intersectionProperties);
    propInfo.setLarger(largerProperties);
    propInfo.setAcNumProperties(acNumProperties);
    propInfo.setCcNumProperties(ccNumProperties);
    propInfo.setMatchedProperties(matchedProperties);
    propInfo.setAcNumPropertiesLow(acNumPropertiesLow);
    propInfo.setMatchedPropertiesLow(matchedPropertiesLow);
    propInfo.setAcNumPropertiesNormal(acNumPropertiesNormal);
    propInfo.setMatchedPropertiesNormal(matchedPropertiesNormal);
    propInfo.setAcNumPropertiesHigh(acNumPropertiesHigh);
    propInfo.setMatchedPropertiesHigh(matchedPropertiesHigh);
    extraFunctMatchInfo.setProperties(propInfo);

    return extraFunctMatchInfo;
  }

  private PackMatchInfo calculateMatchingCCPack(acmm.Packaging acp, ccmm.Packaging ccp) {

    PackMatchInfo packMatchInfo = new PackMatchInfo();

    double ratio = 1.0;
    IntersectionType intersection = IntersectionType.EMPTY;
    LargerType larger = LargerType.CC;
    double ratioImplementation = 1.0;
    IntersectionType intersectionImplementation = IntersectionType.EMPTY;
    LargerType largerImplementation = LargerType.CC;
    double ratioLocation = 1.0;
    IntersectionType intersectionLocation = IntersectionType.EMPTY;
    LargerType largerLocation = LargerType.CC;

    if (acp != null) {
      if (ccp != null) {

        // Check the Implementation block
        acmm.Implementation acImplementation = acp.getImplementation();
        ccmm.Implementation ccImplementation = ccp.getImplementation();
        if (acImplementation != null) {
          if (acImplementation.getProgrammingLanguage() != null) {
            if (acImplementation.getProgrammingLanguage()
                .equalsIgnoreCase(ccImplementation.getProgrammingLanguage()) == false) {
              ratioImplementation -= 0.5;
            }
          }
          if (acImplementation.getPlatformType() != null) {
            if (acImplementation.getPlatformType().getLiteral()
                .equalsIgnoreCase(ccImplementation.getPlatformType().getLiteral()) == false) {
              ratioImplementation -= 0.5;
            }
          }

          if (acImplementation.getProgrammingLanguage() != null && acImplementation.getPlatformType() != null) {
            largerImplementation = LargerType.EQUAL;
          }

          if (ratioImplementation == 0) {
            intersectionImplementation = IntersectionType.EMPTY;
          } else {
            if (ratioImplementation == 1) {
              intersectionImplementation = IntersectionType.AC;
            } else {
              intersectionImplementation = IntersectionType.OTHER;
            }
          }
        }

        // Check the Location block
        acmm.Location acLocation = acp.getLocation();
        ccmm.Location ccLocation = ccp.getLocation();
        if (acLocation != null) {
          if (acLocation.getRepositoryID() != null) {
            if (acLocation.getRepositoryID().equalsIgnoreCase(ccLocation.getRepositoryID()) == false) {
              ratioLocation -= 0.5;
            }
          }
          if (acLocation.getRepositoryType() != null) {
            if (acLocation.getRepositoryType().getLiteral()
                .equalsIgnoreCase(ccLocation.getRepositoryType().getLiteral()) == false) {
              ratioLocation -= 0.5;
            }
          }

          if (acLocation.getRepositoryID() != null && acLocation.getRepositoryType() != null) {
            largerLocation = LargerType.EQUAL;
          }

          if (ratioLocation == 0) {
            intersectionLocation = IntersectionType.EMPTY;
          } else {
            if (ratioLocation == 1) {
              intersectionLocation = IntersectionType.AC;
            } else {
              intersectionLocation = IntersectionType.OTHER;
            }
          }
        }

        // Total ratio
        ratio = (ratioImplementation + ratioLocation) / 2;

        // Total intersection
        if (intersectionImplementation == IntersectionType.AC && intersectionLocation == IntersectionType.AC) {
          intersection = IntersectionType.AC;
        } else {
          if (intersectionImplementation == IntersectionType.AC || intersectionImplementation == IntersectionType.OTHER
              || intersectionLocation == IntersectionType.AC || intersectionLocation == IntersectionType.OTHER) {
            intersection = IntersectionType.OTHER;
          }
        }

        // Total larger
        if (largerLocation == LargerType.EQUAL && largerImplementation == LargerType.EQUAL) {
          larger = LargerType.EQUAL;
        }

      } else {
        ratio = 0.0;
      }
    }

    packMatchInfo.setRatio(ratio);
    packMatchInfo.setLarger(larger);
    packMatchInfo.setIntersection(intersection);
    ImplementationInfo implInfo = new ImplementationInfo();
    implInfo.setRatio(ratioImplementation);
    implInfo.setIntersection(intersectionImplementation);
    implInfo.setLarger(largerImplementation);
    packMatchInfo.setImplementation(implInfo);
    LocationInfo locInfo = new LocationInfo();
    locInfo.setRatio(ratioLocation);
    locInfo.setIntersection(intersectionLocation);
    locInfo.setLarger(largerLocation);
    packMatchInfo.setLocation(locInfo);

    return packMatchInfo;
  }

  private MarkMatchInfo calculateMatchingCCMark(acmm.Marketing acm, ccmm.Marketing ccm) {

    MarkMatchInfo markMatchInfo = new MarkMatchInfo();

    double ratio = 1.0;
    LargerType larger = LargerType.CC;
    IntersectionType intersection = IntersectionType.EMPTY;

    if (acm != null) {
      if (ccm != null) {

        if (acm.getEntityID().compareToIgnoreCase(ccm.getEntityID()) == 0) {

          if (acm.getContacts() != null) {
            EList<acmm.Contact> acContactList = acm.getContacts().getContact();
            EList<ccmm.Contact> ccContactList = ccm.getContacts().getContact();
            int contactMatches = 0;

            for (acmm.Contact acContact : acContactList) {

              String acContactName = acContact.getPersonName();
              boolean foundContactMach = false;
              for (ccmm.Contact ccContact : ccContactList) {
                if (ccContact.getPersonName().equalsIgnoreCase(acContactName)) {
                  foundContactMach = true;
                  break;
                }
              }
              if (foundContactMach) {
                contactMatches++;
              }
            }

            double ratioOfContacts = (double) contactMatches / acContactList.size();
            ratio = 0.5 + ratioOfContacts / 2;

            if (acContactList.size() > ccContactList.size()) {
              larger = LargerType.AC;
              if (ratio == 1.0) {
                intersection = IntersectionType.CC;
              } else {
                if (ratio == 0.0) {
                  intersection = IntersectionType.EMPTY;
                } else {
                  intersection = IntersectionType.OTHER;
                }
              }
            } else {
              if (acContactList.size() < ccContactList.size()) {
                larger = LargerType.CC;
                if (ratio == 1.0) {
                  intersection = IntersectionType.AC;
                } else {
                  if (ratio == 0.0) {
                    intersection = IntersectionType.EMPTY;
                  } else {
                    intersection = IntersectionType.OTHER;
                  }
                }
              } else {
                larger = LargerType.EQUAL;
                if (ratio == 0.0) {
                  intersection = IntersectionType.EMPTY;
                } else {
                  intersection = IntersectionType.OTHER;
                }
              }
            }
          } else {
            larger = LargerType.CC;
            intersection = IntersectionType.EMPTY;
          }
        } else {
          ratio = 0.0;
        }

      } else {
        larger = LargerType.AC;
        intersection = IntersectionType.EMPTY;
        ratio = 0.0;
      }
    } else {
      if (ccm != null) {
        larger = LargerType.CC;
        intersection = IntersectionType.EMPTY;
      } else {
        larger = LargerType.EQUAL;
        intersection = IntersectionType.EMPTY;
      }
    }

    markMatchInfo.setRatio(ratio);
    markMatchInfo.setLarger(larger);
    markMatchInfo.setIntersection(intersection);

    return markMatchInfo;
  }

  public double weightBaseAC(String acID) {

    // 1 means the maximum weight: F, EF, P, M
    // 0 means the minimum weight: (empty)
    // each combination must have a unique value
    //
    // F = 0.5
    // EF = 0.3
    // P = 0.15
    // M = 0.05
    //
    // F ==> 0.5
    // F, EF ==> 0.8
    // F, P ==> 0.65
    // F, M ==> 0.55
    // F, EF, P ==> 0.95
    // F, EF, M ==> 0.85
    // F, P, M ==> 0.7
    // F, EF, P, M ==> 1

    double F = 0.5;
    double EF = 0.3;
    double P = 0.15;
    double M = 0.05;

    double weight = 0.0;

    AbstractComponentSpecification acs = this.getACFromID(acID);

    if (acs != null) {
      if (acs.getFunctional() != null) {
        weight += F;
      }
      if (acs.getExtraFunctional() != null) {
        weight += EF;
      }
      if (acs.getPackaging() != null) {
        weight += P;
      }
      if (acs.getMarketing() != null) {
        weight += M;
      }
    }

    DecimalFormat df = new DecimalFormat("0.00");
    String formated = df.format(weight).replace(',', '.');
    double wFormated = Double.parseDouble(formated);

    return wFormated;
  }

  public double weightBaseCC(String ccID) {

    // 1 means the maximum weight: F, EF, P, M
    // 0 means the minimum weight: (empty)
    // each combination must have a unique value
    //
    // F = 0.5
    // EF = 0.3
    // P = 0.15
    // M = 0.05
    //
    // F ==> 0.5
    // F, EF ==> 0.8
    // F, P ==> 0.65
    // F, M ==> 0.55
    // F, EF, P ==> 0.95
    // F, EF, M ==> 0.85
    // F, P, M ==> 0.7
    // F, EF, P, M ==> 1

    double F = 0.5;
    double EF = 0.3;
    double P = 0.15;
    double M = 0.05;

    double weight = 0.0;

    ConcreteComponentSpecification ccs = this.getCCFromID(ccID);

    if (ccs != null) {
      if (ccs.getFunctional() != null) {
        weight += F;
      }
      if (ccs.getExtraFunctional() != null) {
        weight += EF;
      }
      if (ccs.getPackaging() != null) {
        weight += P;
      }
      if (ccs.getMarketing() != null) {
        weight += M;
      }
    }

    DecimalFormat df = new DecimalFormat("0.00");
    String formated = df.format(weight).replace(',', '.');
    double wFormated = Double.parseDouble(formated);

    return wFormated;

  }

  public double weightPartAC(String acID, String part) {

    double weight = 0.0;
    AbstractComponentSpecification acs = this.getACFromID(acID);

    if (acs != null) {

      if ("total".equalsIgnoreCase(part)) {
        // F
        weight += weightProvided(acs.getFunctional().getProvidedInterfaces());
        if (acs.getFunctional().getRequiredInterfaces() != null) {
          weight += weightRequired(acs.getFunctional().getRequiredInterfaces());
        }
        // EF
        if (acs.getExtraFunctional() != null) {
          if (acs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(acs.getExtraFunctional().getDependencies());
          }

          if (acs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(acs.getExtraFunctional().getProperties());
          }
        }
        // P
        if (acs.getPackaging() != null) {
          if (acs.getPackaging().getImplementation() != null) {
            weight += 1;
          }
          if (acs.getPackaging().getLocation() != null) {
            weight += 1;
          }
        }
        // M
        if (acs.getMarketing() != null) {
          weight += 1;
          if (acs.getMarketing().getContacts() != null) {
            weight += acs.getMarketing().getContacts().getContact().size();
          }
        }
      }

      if ("functional".equalsIgnoreCase(part)) {
        weight += weightProvided(acs.getFunctional().getProvidedInterfaces());
        if (acs.getFunctional().getRequiredInterfaces() != null) {
          weight += weightRequired(acs.getFunctional().getRequiredInterfaces());
        }
      }

      if ("provided".equalsIgnoreCase(part)) {
        weight += weightProvided(acs.getFunctional().getProvidedInterfaces());
      }

      if ("required".equalsIgnoreCase(part)) {
        if (acs.getFunctional().getRequiredInterfaces() != null) {
          weight += weightRequired(acs.getFunctional().getRequiredInterfaces());
        }
      }

      if ("extra-functional".equalsIgnoreCase(part)) {
        if (acs.getExtraFunctional() != null) {
          if (acs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(acs.getExtraFunctional().getDependencies());
          }

          if (acs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(acs.getExtraFunctional().getProperties());
          }
        }
      }

      if ("dependencies".equalsIgnoreCase(part)) {
        if (acs.getExtraFunctional() != null) {
          if (acs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(acs.getExtraFunctional().getDependencies());
          }
        }
      }

      if ("properties".equalsIgnoreCase(part)) {
        if (acs.getExtraFunctional() != null) {
          if (acs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(acs.getExtraFunctional().getProperties());
          }
        }
      }

      if ("packaging".equalsIgnoreCase(part)) {
        if (acs.getPackaging() != null) {
          if (acs.getPackaging().getImplementation() != null) {
            weight += 1;
          }
          if (acs.getPackaging().getLocation() != null) {
            weight += 1;
          }
        }
      }

      if ("marketing".equalsIgnoreCase(part)) {
        if (acs.getMarketing() != null) {
          weight += 1;
          if (acs.getMarketing().getContacts() != null) {
            weight += acs.getMarketing().getContacts().getContact().size();
          }
        }
      }
    }

    return weight;
  }

  public double weightPartCC(String ccID, String part) {

    double weight = 0.0;
    ConcreteComponentSpecification ccs = this.getCCFromID(ccID);

    if (ccs != null) {
      if ("total".equalsIgnoreCase(part)) {
        // F
        weight += weightProvided(ccs.getFunctional().getControllerInterface().getProvidedInterfaces());
        if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
          weight += weightRequired(ccs.getFunctional().getControllerInterface().getRequiredInterfaces());
        }
        // EF
        if (ccs.getExtraFunctional() != null) {
          if (ccs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(ccs.getExtraFunctional().getDependencies());
          }

          if (ccs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(ccs.getExtraFunctional().getProperties());
          }
        }
        // P
        if (ccs.getPackaging() != null) {
          if (ccs.getPackaging().getImplementation() != null) {
            weight += 1;
          }
          if (ccs.getPackaging().getLocation() != null) {
            weight += 1;
          }
          if (ccs.getPackaging().getVersion() != null) {
            weight += 1;
          }
        }
        // M
        if (ccs.getMarketing() != null) {
          weight += 1;
          if (ccs.getMarketing().getContacts() != null) {
            weight += ccs.getMarketing().getContacts().getContact().size();
          }
        }
      }

      if ("functional".equalsIgnoreCase(part)) {
        weight += weightProvided(ccs.getFunctional().getControllerInterface().getProvidedInterfaces());
        if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
          weight += weightRequired(ccs.getFunctional().getControllerInterface().getRequiredInterfaces());
        }
      }

      if ("provided".equalsIgnoreCase(part)) {
        weight += weightProvided(ccs.getFunctional().getControllerInterface().getProvidedInterfaces());
      }

      if ("required".equalsIgnoreCase(part)) {
        if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
          weight += weightRequired(ccs.getFunctional().getControllerInterface().getRequiredInterfaces());
        }
      }

      if ("extra-functional".equalsIgnoreCase(part)) {
        if (ccs.getExtraFunctional() != null) {
          if (ccs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(ccs.getExtraFunctional().getDependencies());
          }

          if (ccs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(ccs.getExtraFunctional().getProperties());
          }
        }
      }

      if ("dependencies".equalsIgnoreCase(part)) {
        if (ccs.getExtraFunctional() != null) {
          if (ccs.getExtraFunctional().getDependencies() != null) {
            weight += weightDependencies(ccs.getExtraFunctional().getDependencies());
          }
        }
      }

      if ("properties".equalsIgnoreCase(part)) {
        if (ccs.getExtraFunctional() != null) {
          if (ccs.getExtraFunctional().getProperties() != null) {
            weight += weightProperties(ccs.getExtraFunctional().getProperties());
          }
        }
      }

      if ("packaging".equalsIgnoreCase(part)) {
        if (ccs.getPackaging() != null) {
          if (ccs.getPackaging().getImplementation() != null) {
            weight += 1;
          }
          if (ccs.getPackaging().getLocation() != null) {
            weight += 1;
          }
          if (ccs.getPackaging().getVersion() != null) {
            weight += 1;
          }
        }
      }

      if ("marketing".equalsIgnoreCase(part)) {
        if (ccs.getMarketing() != null) {
          weight += 1;
          if (ccs.getMarketing().getContacts() != null) {
            weight += ccs.getMarketing().getContacts().getContact().size();
          }
        }
      }
    }

    return weight;
  }

  public double weightProvided(acmm.ProvidedInterfaces prov) {
    double weight = 0.0;
    for (acmm.Interface iface : prov.getInterface()) {
      weight += weightInterface(iface);
    }
    return weight;
  }

  public double weightProvided(ccmm.ProvidedInterfaces prov) {
    double weight = 0.0;
    for (ccmm.Interface iface : prov.getInterface()) {
      weight += weightInterface(iface);
    }
    return weight;
  }

  public double weightRequired(acmm.RequiredInterfaces req) {
    double weight = 0.0;
    for (acmm.Interface iface : req.getInterface()) {
      weight += weightInterface(iface);
    }
    return weight;
  }

  public double weightRequired(ccmm.RequiredInterfaces req) {
    double weight = 0.0;
    for (ccmm.Interface iface : req.getInterface()) {
      weight += weightInterface(iface);
    }
    return weight;
  }

  public double weightInterface(acmm.Interface iface) {
    double weight = 0.0;
    for (acmm.Operation op : iface.getInterfaceSpecification().getPortType().getOperation()) {
      weight += weightOperation(op);
    }
    return weight;
  }

  public double weightInterface(ccmm.Interface iface) {
    double weight = 0.0;
    for (ccmm.Operation op : iface.getInterfaceSpecification().getPortType().getOperation()) {
      weight += weightOperation(op);
    }
    return weight;
  }

  public double weightOperation(acmm.Operation op) {
    double weight = 0.5;
    if (op.getOutput() != null) {
      weight = 1.0;
    }
    return weight;
  }

  public double weightOperation(ccmm.Operation op) {
    double weight = 0.5;
    if (op.getOutput() != null) {
      weight = 1.0;
    }
    return weight;
  }

  public double weightDependencies(acmm.Dependencies deps) {
    return deps.getDependency().size();
  }

  public double weightDependencies(ccmm.Dependencies deps) {
    return deps.getDependency().size();
  }

  public double weightProperties(acmm.Properties props) {
    return props.getProperty().size();
  }

  public double weightProperties(ccmm.Properties props) {
    return props.getProperty().size();
  }

  public double getRatioFFactor() {
    return ratioFFactor;
  }

  public void setRatioFFactor(double ratioFFactor) {
    this.ratioFFactor = ratioFFactor;
  }

  public double getRatioEFFactor() {
    return ratioEFFactor;
  }

  public void setRatioEFFactor(double ratioEFFactor) {
    this.ratioEFFactor = ratioEFFactor;
  }

  public double getRatioPFactor() {
    return ratioPFactor;
  }

  public void setRatioPFactor(double ratioPFactor) {
    this.ratioPFactor = ratioPFactor;
  }

  public double getRatioMFactor() {
    return ratioMFactor;
  }

  public void setRatioMFactor(double ratioMFactor) {
    this.ratioMFactor = ratioMFactor;
  }

  public String solveCAMv5(AbstractArchitecturalModel aam) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();

    // AbstractComponentSpecification acsTotal = joinAC(acList);
    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListACFromAAM(aam);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acsTotal);
    LOGGER.info("candidates size: " + ccsList.size());

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    AStarNode result = AStarAlgorithm.searchv5(graph, nRoot, acsTotal, acsList, ccsList);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[aStarv5] time: " + (timeEnd - timeStart));
    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    // Build the CAM from the CC list and the AAM
    ConcreteArchitecturalModel cam = buildCAM(aam, acsList, result.getNode().getCcsList());

    return null;
  }

  public void solveCAMv5simulation(AbstractArchitecturalModel aam) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd, timeQuery, timeAStar, timeTotal;
    timeStartTotal = System.currentTimeMillis();

    // AbstractComponentSpecification acsTotal = joinAC(acList);
    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListACFromAAM(aam);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    timeStart = System.currentTimeMillis();
    List<ConcreteComponentSpecification> ccsList = this.getCandidatesByACOperations(acsTotal);
    timeEnd = System.currentTimeMillis();
    timeQuery = timeEnd - timeStart;

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    List<Object> result = AStarAlgorithm.searchv5simulation(graph, nRoot, acsTotal, acsList, ccsList);
    timeEnd = System.currentTimeMillis();
    timeAStar = timeEnd - timeStart;
    LOGGER.info("[aStarv5] time: " + timeAStar);

    timeEndTotal = System.currentTimeMillis();
    timeTotal = timeEndTotal - timeStartTotal;
    LOGGER.info("elapsed time: " + timeTotal);

    // Extract the data of the simulation
    AStarNode aStarNode = (AStarNode) result.get(0);
    boolean isSolution = aStarNode.isSolution();
    String solution = aStarNode.getId();
    int discardedSolutions = (int) result.get(1);
    long timeFirstSolution = (int) result.get(2);

    writeToFile(path + "simulationTraderv5.txt", isSolution,
        discardedSolutions, timeFirstSolution, timeQuery, timeAStar, timeTotal, solution);
  }

  // public List<String> solveCAMv6(AbstractArchitecturalModel aam) {
  public List<String> solveCAMv6(String aamID) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd;
    timeStartTotal = System.currentTimeMillis();
    
    AbstractArchitecturalModel aam = this.getAAM(aamID);

    List<String> finalSolution = new ArrayList<String>();

    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListACFromAAM(aam);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    Map<String, List<ConcreteComponentSpecification>> ccsMap = this.getCandidatesGroupedByACOperations(acsListCopy);
    int total = 0;
    for (List<ConcreteComponentSpecification> group : ccsMap.values()) {
      total += group.size();

    }
    LOGGER.info("SIZE of CANDIDATES: " + total);

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    AStarNode result = AStarAlgorithm.searchv6(graph, nRoot, acsTotal, acsList, ccsMap);
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[aStarv6] time: " + (timeEnd - timeStart));

    LOGGER.info("---------------> " + result.getId());

    timeEndTotal = System.currentTimeMillis();
    LOGGER.info("elapsed time: " + (timeEndTotal - timeStartTotal));

    StringTokenizer st = new StringTokenizer(result.getId(), "&");
    while (st.hasMoreTokens()) {
      finalSolution.add(st.nextToken());
    }
    finalSolution.add("CAM_resolved_0459");

    /*
     * // Save the results in .xmi List<ConcreteComponentSpecification> ccsList =
     * result.getNode().getCcsList(); Resource.Factory.Registry reg =
     * Resource.Factory.Registry.INSTANCE; Map<String, Object> m =
     * reg.getExtensionToFactoryMap(); m.put(".xmi", new XMIResourceFactoryImpl());
     * 
     * ResourceSet resSet = new ResourceSetImpl();
     * resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "xmi",
     * new XMLResourceFactoryImpl());
     * 
     * String path = "/C:/Users/JaviACG/Desktop/AITM'2015/evaluation/solution.xmi";
     * //String path = "/D:/_aux_files/";
     * 
     * Resource resource; try { URI uri = URI.createURI(path); LOGGER.info("URI: " +
     * uri.path()); resource = resSet.createResource(uri);
     * //LOGGER.info("RESOURCE: " + resource);
     * //resource.getContents().add(ccsList.get(0));
     * //resource.getContents().add(ccsList.get(8));
     * //resource.getContents().add(ccsList.get(9));
     * resource.getContents().addAll(ccsList);
     * 
     * resource.save(Collections.EMPTY_MAP);
     * 
     * } catch (IOException e) { LOGGER.error(e); }
     */

    // Build the CAM from the CC list and the AAM
    ConcreteArchitecturalModel cam = buildCAM(aam, acsList, result.getNode().getCcsList());

    return finalSolution;

  }

  //public void solveCAMv6simulation(AbstractArchitecturalModel aam) {
  public void solveCAMv6simulation(String aamID, int gIncrement) {

    long timeStartTotal, timeEndTotal, timeStart, timeEnd, timeQuery, timeAStar, timeTotal;
    timeStartTotal = System.currentTimeMillis();
    
    AbstractArchitecturalModel aam = this.getAAM(aamID);

    List<String> finalSolution = new ArrayList<String>();

    timeStart = System.currentTimeMillis();
    List<Object> joinAndList = joinAndListACFromAAM(aam);
    AbstractComponentSpecification acsTotal = (AbstractComponentSpecification) joinAndList.get(0);
    List<AbstractComponentSpecification> acsList = (List<AbstractComponentSpecification>) joinAndList.get(1);
    List<AbstractComponentSpecification> acsListCopy = new ArrayList<AbstractComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      AbstractComponentSpecification acsCopy = EcoreUtil.copy(acs);
      acsListCopy.add(acsCopy);
    }
    timeEnd = System.currentTimeMillis();
    LOGGER.info("[joinAndList] time: " + (timeEnd - timeStart));

    // Root node
    NavNode nRoot = new NavNode();
    nRoot.setId("root");

    // Initialize the variables of the graph
    List<NavNode> nodeList = new ArrayList<NavNode>();
    // nodeList.add(nRoot);
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();

    // Get all the candidates
    timeStart = System.currentTimeMillis();
    Map<String, List<ConcreteComponentSpecification>> ccsMap = this.getCandidatesGroupedByACOperations(acsListCopy);
    timeEnd = System.currentTimeMillis();
    timeQuery = timeEnd - timeStart;

    nodeList.add(nRoot);

    // Add the variables to the graph
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    graph.setEdgeList(edgeList);
    graph.setAdjacency(adjacency);

    // Execute the A* algorithm
    timeStart = System.currentTimeMillis();
    List<Object> result = AStarAlgorithm.searchv6simulation(graph, nRoot, acsTotal, acsList, ccsMap, gIncrement);
    timeEnd = System.currentTimeMillis();
    timeAStar = timeEnd - timeStart;
    LOGGER.info("[aStarv6] time: " + timeAStar);

    timeEndTotal = System.currentTimeMillis();
    timeTotal = timeEndTotal - timeStartTotal;
    LOGGER.info("elapsed time: " + timeTotal);

    // Extract the data of the simulation
    AStarNode aStarNode = (AStarNode) result.get(0);
    boolean isSolution = aStarNode.isSolution();
    String solution = aStarNode.getId();
    int discardedSolutions = (int) result.get(1);
    long timeFirstSolution = (long) result.get(2);

    writeToFile(path + "simulationTraderv6.txt", isSolution,
        discardedSolutions, timeFirstSolution, timeQuery, timeAStar, timeTotal, solution);

  }

  private void writeToFile(String fileURI, boolean isSolution, int discardedSolutions, long timeFirstSolution,
      long timeQuery, long timeAStar, long timeTotal, String solution) {

    FileWriter fw;
    try {
      fw = new FileWriter(fileURI, true);
      fw.write(isSolution + ";" + discardedSolutions + ";" + timeFirstSolution + ";" + timeQuery + ";" + timeAStar + ";"
          + timeTotal + ";" + solution + "\n");
      fw.flush();
      fw.close();
    } catch (IOException e) {
      LOGGER.error(e);
    }
  }

  private ConcreteArchitecturalModel buildCAM(AbstractArchitecturalModel aam,
      List<AbstractComponentSpecification> acsList, List<ConcreteComponentSpecification> ccsList) {

    // Previous calculations of matching info
    List<MatchingInfo> ccsMInfoList = new ArrayList<MatchingInfo>();
    List<ConcreteComponentSpecification> ccsListOrdered = new ArrayList<ConcreteComponentSpecification>();
    for (AbstractComponentSpecification acs : acsList) {
      MatchingInfo bestMInfo = null;
      ConcreteComponentSpecification bestCCS = null;
      for (ConcreteComponentSpecification ccs : ccsList) {

        MatchingInfo mInfo = calculateMatchingCC(ccs, acs);
        if (bestMInfo == null) {
          bestMInfo = mInfo;
          bestCCS = ccs;
        } else {
          if (mInfo.getRatio() > bestMInfo.getRatio()) {
            bestMInfo = mInfo;
            bestCCS = ccs;
          }
        }

      }
      ccsMInfoList.add(bestMInfo);
      ccsListOrdered.add(bestCCS);
    }

    ConcreteArchitecturalModel cam = Architectural_metamodelFactory.eINSTANCE.createConcreteArchitecturalModel();

    // cam.setAam(aam);
    cam.setAamID(aam.getAamID());
    cam.setCamID("new CAM");

    for (int i = 0; i < ccsListOrdered.size(); i++) {

      ConcreteComponentSpecification ccs = ccsListOrdered.get(i);
      AbstractComponentSpecification acs = acsList.get(i);
      AbstractComponent ac = aam.getAbstractComponent().get(i);

      ConcreteComponent cc = Architectural_metamodelFactory.eINSTANCE.createConcreteComponent();
      cc.setComponentID(ccs.getComponentID());
      cc.setComponentName(ac.getComponentName());
      cc.setComponentType(ac.getComponentType());

      List<architectural_metamodel.Interface> interfaces = getInterfaces(ccs);
      cc.getInterface().addAll(interfaces);

      List<architectural_metamodel.Port> ports = getPorts(ccs);
      cc.getPort().addAll(ports);

      LOGGER.info(acs.getComponentID() + "-" + ccs.getComponentID() + "-" + ac.getComponentName() + "-"
          + ac.getComponentType());

      cam.getConcreteComponent().add(cc);

    }

    for (Relationship r : aam.getRelationship()) {

      if (r instanceof Binary) {
        Binary bR = Architectural_metamodelFactory.eINSTANCE.createBinary();
        bR.setRelationshipID(r.getRelationshipID());
        bR.setType(((Binary) r).getType());
        bR.setIsBidirectional(((Binary) r).isIsBidirectional());
        int indexSource = findACIndex(acsList, ((Binary) r).getSource());
        ConcreteComponent ccSource = cam.getConcreteComponent().get(indexSource);
        bR.setSource(ccSource);
        int indexTarget = findACIndex(acsList, ((Binary) r).getTarget());
        ConcreteComponent ccTarget = cam.getConcreteComponent().get(indexTarget);
        bR.setTarget(ccTarget);

        int numDep = ((Binary) r).getDependency().size();
        for (int d = 0; d < numDep; d++) {
          ConcreteDependency dep = Architectural_metamodelFactory.eINSTANCE.createConcreteDependency();

          // Set source and target interfaces

          // Set connectors

          bR.getDependency().add(dep);
        }

        cam.getRelationship().add(bR);

      } else {

      }

    }

    /*
     * for (int i = 0; i < cam.getConcreteComponent().size(); i++ ) {
     * ConcreteComponent cc = cam.getConcreteComponent().get(i); for (Interface
     * interf : cc.getInterface()) { if (interf instanceof Required) {
     * 
     * List<Operation> operationsReq = getOperations()
     * 
     * List<Port> portsReq = getPortsOfReq(interf.getInterfaceID(), ccsList.get(i));
     * 
     * } }
     * 
     * for (Port port : cc.getPort()) { if (port instanceof OutputPort) {
     * 
     * 
     * 
     * } } }
     */

    // Save CAM in a file
    // Save the results in .xmi
    ResourceSet resSet = new ResourceSetImpl();
    resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMLResourceFactoryImpl());

    //String newpath = path + "solution.xmi";
    String newpath = "/C:/costradersolutions/solution.xmi";
    
    LOGGER.info(newpath);

    Resource resource;
    try {
      URI uri = URI.createURI(newpath);
      LOGGER.info("URI: " + uri.path());
      resource = resSet.createResource(uri);
      resource.getContents().add(cam);

      resource.save(Collections.EMPTY_MAP);

    } catch (IOException e) {
      LOGGER.error(e);
    }

    return cam;

  }

  private int findACIndex(List<AbstractComponentSpecification> acsList, AbstractComponent ac) {
    int index = -1;
    for (int i = 0; i < acsList.size(); i++) {
      if (acsList.get(i).getComponentID().equalsIgnoreCase(ac.getComponentID())) {
        index = i;
        return index;
      }
    }
    return index;
  }

  private List<Interface> getInterfaces(ConcreteComponentSpecification ccs) {
    List<architectural_metamodel.Interface> interfaces = new ArrayList<architectural_metamodel.Interface>();
    List<ccmm.ProvidedInterface> provList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
        .getInterface();
    for (ccmm.ProvidedInterface prov : provList) {

      architectural_metamodel.Interface provided = Architectural_metamodelFactory.eINSTANCE.createProvided();
      provided.setInterfaceID(prov.getInterfaceID());
      interfaces.add(provided);
    }

    if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
      List<ccmm.RequiredInterface> reqList = ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
          .getInterface();
      for (ccmm.RequiredInterface req : reqList) {
        architectural_metamodel.Interface required = Architectural_metamodelFactory.eINSTANCE.createRequired();
        required.setInterfaceID(req.getInterfaceID());
        interfaces.add(required);
      }
    }

    return interfaces;
  }

  private List<Port> getPorts(ConcreteComponentSpecification ccs) {

    List<architectural_metamodel.Port> ports = new ArrayList<architectural_metamodel.Port>();
    List<ccmm.ProvidedInterface> provList = ccs.getFunctional().getControllerInterface().getProvidedInterfaces()
        .getInterface();
    for (ccmm.ProvidedInterface prov : provList) {
      List<ccmm.Operation> opList = prov.getInterfaceSpecification().getPortType().getOperation();
      for (ccmm.Operation op : opList) {

        architectural_metamodel.Port inputPort = Architectural_metamodelFactory.eINSTANCE.createInputPort();
        inputPort.setPortID(op.getInput().getName());
        ports.add(inputPort);

        if (op.getOutput() != null) {

          architectural_metamodel.Port outputPort = Architectural_metamodelFactory.eINSTANCE.createOutputPort();
          outputPort.setPortID(op.getOutput().getName());
          ports.add(outputPort);

        }
      }
    }

    if (ccs.getFunctional().getControllerInterface().getRequiredInterfaces() != null) {
      List<ccmm.RequiredInterface> reqList = ccs.getFunctional().getControllerInterface().getRequiredInterfaces()
          .getInterface();
      for (ccmm.RequiredInterface req : reqList) {
        List<ccmm.Operation> opList = req.getInterfaceSpecification().getPortType().getOperation();
        for (ccmm.Operation op : opList) {

          architectural_metamodel.Port outputPort = Architectural_metamodelFactory.eINSTANCE.createOutputPort();
          outputPort.setPortID(op.getInput().getName());
          ports.add(outputPort);

          if (op.getOutput() != null) {

            architectural_metamodel.Port inputPort = Architectural_metamodelFactory.eINSTANCE.createInputPort();
            inputPort.setPortID(op.getOutput().getName());
            ports.add(inputPort);

          }
        }
      }
    }

    return ports;
  }

  private AbstractArchitecturalModel getAAM(String aamID) {
    String message = "";
    AbstractArchitecturalModel aam = null;

    this.getDataStoreFromManageDB();
    SessionFactory sessionFactory = dataStore.getSessionFactory();

    // Open a new Session
    Session session = sessionFactory.openSession();

    // Check if the AAM ID does exist
    Query query = session.createQuery("FROM AbstractArchitecturalModel aam WHERE aam.aamID = '" + aamID + "'");
    List<?> aamsList = query.list();
    if (aamsList.size() == 0) {
      message = aamID + " ID does not exist --> Cannot solve AAM Specification";
      LOGGER.info(message);
    } else {
      message = aamID + " ID exist --> Solving AAM Specification...";
      LOGGER.info(message);

      aam = EcoreUtil.copy((AbstractArchitecturalModel) aamsList.get(0));
    }
    // Close the session.
    session.close();
    
    return aam;
  }

  private void getDataStoreFromManageDB() {

    dataStore = managedb.getDataStore();

    if (dataStore == null) {
      LOGGER.info("[Configs - getDataStoreFromManageDB] Error getting the DataStore");
    }

  }

}
