package es.ual.acg.cos.trader.heuristics.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.collections4.CollectionUtils;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import sun.util.locale.StringTokenIterator;
import ccmm.ConcreteComponentSpecification;
import es.ual.acg.cos.trader.heuristics.service.Heuristics;
import es.ual.acg.cos.trader.definitions.MatchingInfo;
import acmm.AbstractComponentSpecification;

public class AStarAlgorithm_old {

  @Autowired
  static Heuristics heuristics;

  private static final Logger LOGGER = Logger.getLogger(AStarAlgorithm_old.class);

  public static List<NavNode> search(NavGraph graph, NavNode source, NavNode target) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();
    AStarNode start = new AStarNode(source, 0, graph.calcManhattanDistance(source, target));
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode goal = null;
    while (openSet.size() > 0) {
      AStarNode x = pQueue.poll();
      openSet.remove(x.getId());
      if (x.getId().equals(target.getId())) {
        // found
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Found target node " + x.getId());
        }
        goal = x;
        break;
      } else {
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Search for node " + x.getId());
        }
        closeSet.put(x.getId(), x);
        // System.out.println("x ID: " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        for (NavNode neighbor : neighbors) {
          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {
            double g = x.getG() + graph.calcManhattanDistance(x.getNode(), neighbor);
            AStarNode n = openSet.get(neighbor.getId());

            LOGGER.info("x id: " + x.getId());
            LOGGER.info("x G: " + x.getG());

            if (n == null) {
              // not in the open set
              n = new AStarNode(neighbor, g, graph.calcManhattanDistance(neighbor, target));
              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
              pQueue.add(n);
              LOGGER.info("G: " + n.getG());
              LOGGER.info("H: " + n.getH());
              LOGGER.info("F: " + n.getF());
            } else if (g < n.getG()) {
              // Have a better route to the current node, change its parent
              n.setCameFrom(x);
              n.setG(g);
              n.setH(graph.calcManhattanDistance(neighbor, target));
              LOGGER.info("Changing the parent");
              LOGGER.info("G: " + n.getG());
              LOGGER.info("H: " + n.getH());
            }
          }
        }
      }
    }

    // after found the target, start to construct the path
    if (goal != null) {
      Stack<NavNode> stack = new Stack<NavNode>();
      List<NavNode> list = new ArrayList<NavNode>();
      stack.push(goal.getNode());
      AStarNode parent = goal.getCameFrom();
      while (parent != null) {
        stack.push(parent.getNode());
        parent = parent.getCameFrom();
      }
      if (LOGGER.isDebugEnabled()) {
        LOGGER.debug("Constructing search path: ");
      }
      while (stack.size() > 0) {
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("\t" + stack.peek().getId());
        }
        list.add(stack.pop());
      }
      return list;
    }

    return null;
  }

  public static AStarNode search(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();
    // AStarNode start = new AStarNode(source, 0, graph.calcManhattanDistance(
    // source, target));
    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode goal = null;
    AStarNode bestNode = new AStarNode(null, 0, 1);

    while (openSet.size() > 0) {
      AStarNode x = pQueue.poll();
      openSet.remove(x.getId());
      // if (x.getId().equals(target.getId())) {

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Found target node " + x.getId());
        }
        goal = x;
        break;
      } else {
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Search for node " + x.getId());
        }
        closeSet.put(x.getId(), x);
        // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        for (NavNode neighbor : neighbors) {
          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {
            // double g = x.getG()
            // + graph.calcManhattanDistance(x.getNode(), neighbor);
            double g = x.getG() + 1;
            AStarNode n = openSet.get(neighbor.getId());

            // LOGGER.info("x id: " + x.getId());
            // LOGGER.info("x G: " + x.getG());

            if (n == null) {
              // not in the open set

              // n = new AStarNode(neighbor, g, graph.calcManhattanDistance(
              // neighbor, target));
              // h(x) must be calculated as the distance between

              n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));

              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
              pQueue.add(n);
              // LOGGER.info("G: " + n.getG());
              // LOGGER.info("H: " + n.getH());
              // LOGGER.info("F: " + n.getF());
              // LOGGER.info("new node created --> " + neighbor.getId());
            } else if (g < n.getG()) {
              // Have a better route to the current node, change its parent
              n.setCameFrom(x);
              n.setG(g);
              // n.setH(graph.calcManhattanDistance(neighbor, target));
              n.setH(calculateH(neighbor, acsGoal));
              LOGGER.info("Changing the parent");
              // LOGGER.info("G: " + n.getG());
              // LOGGER.info("H: " + n.getH());
            }
          }
        }
      }
    }

    // after found the target, start to construct the path
    /*
     * if (goal != null) { Stack<NavNode> stack = new Stack<NavNode>();
     * List<NavNode> list = new ArrayList<NavNode>(); stack.push(goal.getNode());
     * AStarNode parent = goal.getCameFrom(); while (parent != null) {
     * stack.push(parent.getNode()); parent = parent.getCameFrom(); } if
     * (LOGGER.isDebugEnabled()) { LOGGER.debug("Constructing search path: "); }
     * while (stack.size() > 0) { if (LOGGER.isDebugEnabled()) { LOGGER.debug("\t" +
     * stack.peek().getId()); } list.add(stack.pop()); } return list; }
     */

    LOGGER.info("BEST: " + bestNode.getId() + " --> " + bestNode.getH());

    return bestNode;
  }

  public static AStarNode searchv2(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();
    // AStarNode start = new AStarNode(source, 0, graph.calcManhattanDistance(
    // source, target));
    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode goal = null;
    AStarNode bestNode = new AStarNode(null, 0, 1);

    long timeStart, timeEnd;

    timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

//      timeEnd = System.currentTimeMillis();
//      if ( (timeEnd - timeStart) > 5000) {
//        break;
//      }

//      if(counter > 3) {
//        break;
//      }
//      counter++;

      AStarNode x = pQueue.poll();
      openSet.remove(x.getId());

      // if (x.getId().equals(target.getId())) {

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      } else {
        // closeSet.put(x.getId(), x);
      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Found target node " + x.getId());
        }
        goal = x;
        break;
      } else {
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Search for node " + x.getId());
        }
        closeSet.put(x.getId(), x);
        LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        LOGGER.info("Number of neighbors: " + neighbors.size());
        for (NavNode neighbor : neighbors) {
          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {
            // double g = x.getG()
            // + graph.calcManhattanDistance(x.getNode(), neighbor);
            double g = x.getG() + 1;
            AStarNode n = openSet.get(neighbor.getId());

            // LOGGER.info("x id: " + x.getId());
            // LOGGER.info("x G: " + x.getG());

            if (n == null) {
              // not in the open set

              // n = new AStarNode(neighbor, g, graph.calcManhattanDistance(
              // neighbor, target));
              // h(x) must be calculated as the distance between

              // n = new AStarNode(neighbor, g, 1);
              // n.setH(calculateHv2(n, acsGoal));
              n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));

              LOGGER.info("neighbor (n) --> " + neighbor.getId());
              LOGGER.info("---- H: " + n.getH());
              LOGGER.info("X --> " + x.getId());

              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
//              String newID = neighbor.getId()+n.getCameFrom().getId();
//              LOGGER.info("new node created --> " + newID);
//              LOGGER.info("---- H: " + n.getH());
//              openSet.put(newID, n);
              pQueue.add(n);
              // LOGGER.info("G: " + n.getG());
              // LOGGER.info("H: " + n.getH());
              // LOGGER.info("F: " + n.getF());

              // Create a new node which is adjacent to this
              NavNode newNode = new NavNode();
              // newNode.setId(n.getCameFrom().getId() + "&" + neighbor.getId());
              newNode.setId(x.getId() + "&" + neighbor.getId());
              LOGGER.info("new node ID --> " + newNode.getId());
              graph.getNodeList().add(newNode);

              // Add adjecent node from "neighbor" to "newNode"
              Map<String, Adjacency<NavNode>> adj = graph.getAdjacency();
              Set<NavNode> adjacentNodes = graph.getAdjacentNodes(neighbor.getId());
              List<NavNode> adjacentNodesList = new ArrayList<NavNode>();
              for (NavNode adjn : adjacentNodes) {
                // if(!adjn.getId().equalsIgnoreCase(neighbor.getId())) {
                if (intersectionOfID(adjn.getId(), neighbor.getId()) == false) {
                  adjacentNodesList.add(adjn);
                  // LOGGER.info("Added new adjacent: " + adjn.getId() + " to " +
                  // neighbor.getId());
                }
              }
              adjacentNodesList.add(newNode);
              Set<NavNode> adjacentNodesClone = new HashSet<NavNode>(adjacentNodesList);
              // Concurrent error
              // --adjacentNodes.add(newNode);
              Adjacency<NavNode> a = new Adjacency<NavNode>();
              a.setNode(neighbor);
              a.setNeighbors(adjacentNodesClone);
              adj.remove(neighbor.getId());
              adj.put(neighbor.getId(), a);
              graph.setAdjacency(adj);

              // Add adjacent node from "newNode" to "neighbor"
              /*
               * List<NavNode> adjacentNodesNewNodeList = new ArrayList<NavNode>();
               * adjacentNodesNewNodeList.add(neighbor); Set<NavNode> adjacentNodesNewNode =
               * new HashSet<NavNode>(adjacentNodesNewNodeList); Adjacency<NavNode> aNewNode =
               * new Adjacency<NavNode>(); aNewNode.setNode(newNode);
               * aNewNode.setNeighbors(adjacentNodesNewNode); adj.put(newNode.getId(),
               * aNewNode); graph.setAdjacency(adj);
               */

              // Add adjacent node from "newNode" to the rest of the nodes of the graph
              // but "root" and itself (contained in the whole id)
              List<NavNode> adjacentNodesNewNodeList2 = new ArrayList<NavNode>();
              for (NavNode navNode : graph.getNodeList()) {
                /*
                 * if("root".equalsIgnoreCase(navNode.getId()) == false &&
                 * newNode.getId().equalsIgnoreCase(navNode.getId()) == false) {
                 * adjacentNodesNewNodeList2.add(navNode); }
                 */
                if (intersectionOfID(newNode.getId(), navNode.getId()) == false) {
                  adjacentNodesNewNodeList2.add(navNode);
                }
              }
              Set<NavNode> adjacentNodesNewNode2 = new HashSet<NavNode>(adjacentNodesNewNodeList2);
              Adjacency<NavNode> aNewNode2 = new Adjacency<NavNode>();
              aNewNode2.setNode(newNode);
              aNewNode2.setNeighbors(adjacentNodesNewNode2);
              adj.put(newNode.getId(), aNewNode2);
              graph.setAdjacency(adj);

            } else {

              // LOGGER.info("G: " + g + " -- NG: " + n.getG());

              if (g < n.getG()) {
                // Have a better route to the current node, change its parent
                n.setCameFrom(x);
                n.setG(g);
                // n.setH(graph.calcManhattanDistance(neighbor, target));
                // n.setH(calculateHv2(n, acsGoal));
                n.setH(calculateH(neighbor, acsGoal));
                LOGGER.info("Changing the parent");
                // LOGGER.info("G: " + n.getG());
                // LOGGER.info("H: " + n.getH());
              }
            }
          } else {
            // LOGGER.info("visited is not null --> " + visited.getId());
          }
        }
      }
    }

    // after found the target, start to construct the path
    /*
     * if (goal != null) { Stack<NavNode> stack = new Stack<NavNode>();
     * List<NavNode> list = new ArrayList<NavNode>(); stack.push(goal.getNode());
     * AStarNode parent = goal.getCameFrom(); while (parent != null) {
     * stack.push(parent.getNode()); parent = parent.getCameFrom(); } if
     * (LOGGER.isDebugEnabled()) { LOGGER.debug("Constructing search path: "); }
     * while (stack.size() > 0) { if (LOGGER.isDebugEnabled()) { LOGGER.debug("\t" +
     * stack.peek().getId()); } list.add(stack.pop()); } return list; }
     */

    LOGGER.info("BEST: " + bestNode.getId() + " --> " + bestNode.getH());

    return bestNode;
  }

  public static boolean intersectionOfID(String nodeID1, String nodeID2) {

    boolean intersection = true;

    StringTokenizer st1 = new StringTokenizer(nodeID1, "&");
    StringTokenizer st2 = new StringTokenizer(nodeID2, "&");

    List<String> id1List = new ArrayList<String>();
    List<String> id2List = new ArrayList<String>();

    while (st1.hasMoreTokens()) {
      id1List.add(st1.nextToken());
    }

    while (st2.hasMoreTokens()) {
      id2List.add(st2.nextToken());
    }

    if ((CollectionUtils.intersection(id1List, id2List)).size() == 0) {
      intersection = false;
    }

    return intersection;
  }

  private static double calculateH(NavNode neighbor, AbstractComponentSpecification acsGoal) {

    double h = 1.0;

    String mergedCC = neighbor.getId();
    LOGGER.info("mergedCC --> " + mergedCC);
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    List<String> listCC = new ArrayList<String>();
    while (st.hasMoreTokens()) {
      String nT = st.nextToken();
      if (!"root".equalsIgnoreCase(nT)) {
        listCC.add(nT);
      }
    }
//      if(listCC.contains("root")) {
//        listCC.remove("root");        
//      }

    ConcreteComponentSpecification ccs = heuristics.joinCC(listCC);

    // ConcreteComponentSpecification ccs =
    // heuristics.getCCFromID(neighbor.getId());

    MatchingInfo mInfo = heuristics.calculateMatchingCC(ccs, acsGoal);
    h = 1 - mInfo.getRatio();
    LOGGER.info("calculate H --> " + h);

    // **********************Too many calculations**********************
    // h must be faster
    // LOGGER.info("h calculated for " + neighbor.getId() + " --> " + h);

    return h;
  }

//  private static double calculateHv2(AStarNode n,
//      AbstractComponentSpecification acsGoal) {
//
//    double h = 1.0;
//
//    // Get the Heuristics
//    Heuristics heuristics = null;
//    Context initialContext;
//    try {
//      initialContext = new InitialContext();
//      
//      heuristics = (Heuristics) initialContext
//          .lookup("java:app/COS-trader/Heuristics");
//      
//      // Get the ID for all the path 
//      Stack<NavNode> stack = new Stack<NavNode>();
//      List<NavNode> list = new ArrayList<NavNode>();
//      stack.push(n.getNode());
//      AStarNode parent = n.getCameFrom();
//      while (parent != null) {
//        stack.push(parent.getNode());
//        parent = parent.getCameFrom();
//      }
//      if (LOGGER.isDebugEnabled()) {
//        LOGGER.debug("Constructing search path: ");
//      }
//      while (stack.size() > 0) {
//        if (LOGGER.isDebugEnabled()) {
//          LOGGER.debug("\t" + stack.peek().getId());
//        }
//        list.add(stack.pop());
//      }
//      
//      List<ConcreteComponentSpecification> listCC = new ArrayList<ConcreteComponentSpecification>();
//      
//      String totalCC = "";
//      // Pass to joinCC, a list of CC, not the IDs
//      for(NavNode node : list) {
//        listCC.add(node.getCcs());
//        totalCC = totalCC + ";" + node.getId();
//      } 
//      LOGGER.info("CALCULATING H for --> " + totalCC);
//      
//      ConcreteComponentSpecification ccs = heuristics.joinCCFromCCS(listCC);
//          
//      MatchingInfo mInfo = heuristics.calculateMatchingCC(ccs, acsGoal);
//      h = 1 - mInfo.getRatio();
//
//      //**********************Too many calculations**********************
//      //h must be faster
//      //LOGGER.info("h calculated for " + neighbor.getId() + " --> " + h);
//
//    } catch (NamingException e) {
//      LOGGER.error(e);
//    }
//
//    return h;
//  }

}