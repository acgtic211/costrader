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

import javax.annotation.PostConstruct;

import org.apache.commons.collections4.CollectionUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ccmm.ConcreteComponentSpecification;
//import es.ual.acg.cos.beans.ManageArchitectures;
import es.ual.acg.cos.trader.heuristics.service.Heuristics;
import es.ual.acg.cos.trader.definitions.MatchedInterfaceInfo;
import es.ual.acg.cos.trader.definitions.MatchedOperationInfo;
import es.ual.acg.cos.trader.definitions.MatchingInfo;
import acmm.AbstractComponentSpecification;

@Component
public class AStarAlgorithm {

  private static Heuristics heuristics;

  @Autowired
  Heuristics heuristicsAW;

  @PostConstruct
  private void initStaticHeuristics() {
    heuristics = this.heuristicsAW;
    LOGGER.info("[AStarAlgorithm] static heuristics initialized");
  }

  private static final Logger LOGGER = Logger.getLogger(AStarAlgorithm.class);

  private static List<String> notDesiredCC;
  private static int discardedSolutions;

  private static final int gInc = 0;

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
        break;
      } else {
        closeSet.put(x.getId(), x);
        // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        for (NavNode neighbor : neighbors) {
          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {
            // double g = x.getG()
            // + graph.calcManhattanDistance(x.getNode(), neighbor);
            double g = x.getG() + gInc;
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

    // AStarNode goal = null;
    AStarNode bestNode = new AStarNode(null, 0, 1);

    // long timeStart, timeEnd;

    // timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

      // timeEnd = System.currentTimeMillis();
      // if ( (timeEnd - timeStart) > 5000) {
      // break;
      // }

      // if(counter > 3) {
      // break;
      // }
      // counter++;

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

        LOGGER.info("FOUNDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

        break;

      } else {

        closeSet.put(x.getId(), x);
        // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        // LOGGER.info("Number of neighbors: " + neighbors.size());
        for (NavNode neighbor : neighbors) {

          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {

            double g = x.getG() + gInc;
            AStarNode n = openSet.get(neighbor.getId());

            if (n == null) {
              // not in the open set

              // LOGGER.info("neighbor (n) --> " + neighbor.getId());
              // LOGGER.info("X --> " + x.getId());

              n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
              // n.setF(n.getG() + n.getH());
              n.setF(n.getH());
              // LOGGER.info("F(X) --> " + n.getF());

              if (n.getH() == 0) {
                LOGGER.info("FOUND");
                bestNode = n;
                break;
              }

              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
              // String newID = neighbor.getId()+n.getCameFrom().getId();
              // LOGGER.info("new node created --> " + newID);
              // LOGGER.info("---- H: " + n.getH());
              // openSet.put(newID, n);
              pQueue.add(n);
              // LOGGER.info("G: " + n.getG());
              // LOGGER.info("H: " + n.getH());
              // LOGGER.info("F: " + n.getF());

              if (intersectionOfID(x.getId(), neighbor.getId()) == false) {

                // Create a new node which is adjacent to this
                NavNode newNode = new NavNode();
                newNode.setId(x.getId() + "&" + neighbor.getId());
                // LOGGER.info("new node ID --> " + newNode.getId());
                graph.getNodeList().add(newNode);

                Map<String, Adjacency<NavNode>> adj = graph.getAdjacency();

                // Add adjecent node from "neighbor" to "newNode"
                Set<NavNode> adjacentNodes = graph.getAdjacentNodes(neighbor.getId());
                List<NavNode> adjacentNodesList = new ArrayList<NavNode>();
                for (NavNode adjn : adjacentNodes) {
                  // if(intersectionOfID(adjn.getId(), neighbor.getId()) ==
                  // false) {
                  adjacentNodesList.add(adjn);
                  // LOGGER.info("Added new adjacent: " + adjn.getId() + " to "
                  // + neighbor.getId());
                  // }
                }
                adjacentNodesList.add(newNode);
                Set<NavNode> adjacentNodesClone = new HashSet<NavNode>(adjacentNodesList);
                // Concurrency error
                // --adjacentNodes.add(newNode);
                Adjacency<NavNode> a = new Adjacency<NavNode>();
                a.setNode(neighbor);
                a.setNeighbors(adjacentNodesClone);
                adj.remove(neighbor.getId());
                adj.put(neighbor.getId(), a);
                graph.setAdjacency(adj);

                // Add adjacent node from "newNode" to "neighbor"
                List<NavNode> adjacentNodesNewNodeList = new ArrayList<NavNode>();
                adjacentNodesNewNodeList.add(neighbor);
                Set<NavNode> adjacentNodesNewNode = new HashSet<NavNode>(adjacentNodesNewNodeList);
                Adjacency<NavNode> aNewNode = new Adjacency<NavNode>();
                aNewNode.setNode(newNode);
                aNewNode.setNeighbors(adjacentNodesNewNode);
                adj.put(newNode.getId(), aNewNode);
                graph.setAdjacency(adj);

                // Add adjacent node from "newNode" to the rest of the nodes of
                // the graph
                // but "root" and itself (contained in the whole id)
                List<NavNode> adjacentNodesNewNodeList2 = new ArrayList<NavNode>();
                for (NavNode navNode : graph.getNodeList()) {
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

                // Add adjacent node from the rest of the nodes of the graph
                // to the "newNode"
                for (NavNode navNode : graph.getNodeList()) {
                  Set<NavNode> adjacentNodesNavNode = graph.getAdjacentNodes(navNode.getId());
                  List<NavNode> adjacentNodeListNavNode = new ArrayList<NavNode>();
                  for (NavNode adjn : adjacentNodesNavNode) {
                    // if(intersectionOfID(adjn.getId(), newNode.getId()) ==
                    // false) {
                    // if(intersectionOfID(adjn.getId(), navNode.getId()) ==
                    // false) {
                    adjacentNodeListNavNode.add(adjn);
                    // LOGGER.info("Added new adjacent: " + adjn.getId() +
                    // " to " + neighbor.getId());
                    // }
                  }
                  adjacentNodeListNavNode.add(newNode);
                  Set<NavNode> adjacentNodeNavNodeClone = new HashSet<NavNode>(adjacentNodeListNavNode);
                  Adjacency<NavNode> aNavNode = new Adjacency<NavNode>();
                  aNavNode.setNode(navNode);
                  aNavNode.setNeighbors(adjacentNodeNavNodeClone);
                  adj.remove(navNode.getId());
                  adj.put(navNode.getId(), aNavNode);
                  graph.setAdjacency(adj);
                }
              } else {
                // LOGGER.info("intersection of '" + x.getId() + "' and '"
                // + neighbor.getId() + "' is true");
              }

            } else {

              // LOGGER.info("n is not null");
              // LOGGER.info("G: " + g + " -- NG: " + n.getG());

              if (g < n.getG()) {
                // if(x.getH() < n.getH()) {

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

  public static AStarNode searchv3(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, List<ConcreteComponentSpecification> ccsList) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    while (openSet.size() > 0) {

      AStarNode x = pQueue.poll();

      openSet.remove(x.getId());

      LOGGER.info("openSet size --> " + openSet.size());
      LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      } else {

      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found

//        if(evaluateCCList(acsList, bestNode.getNode().getCcsList()) == false) {
//          LOGGER.info("DISCARDING!!!!!!!!!!!! --> " + bestNode.getId());
//          
//        } else {
//          LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
//          break;
//        } 

        LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
        break;

      } else {

        closeSet.put(x.getId(), x);

        // if(x.getNode().getCcsList().size() < acsList.size() ) {

        // Create dynamically the adjacent nodes to the "rest" of nodes of the
        // graph
        Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
        List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
        for (ConcreteComponentSpecification ccs : ccsList) {
          if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
            // Create the node
            NavNode navNode = new NavNode();
            navNode.setId(x.getId() + "&" + ccs.getComponentID());

            /*
             * List<ConcreteComponentSpecification> listCC = new
             * ArrayList<ConcreteComponentSpecification>();
             * listCC.addAll(x.getNode().getCcsList()); listCC.add(ccs);
             * navNode.setCcsList(listCC);
             */

            for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
              navNode.addCC2CCsList(cc);
            }
            navNode.addCC2CCsList(ccs);

            graph.getNodeList().add(navNode);
            // LOGGER.info("Node created --> " + navNode.getId());

            // Add adjacency from 'x' node the the 'navNode'
            newAdjNodesList.add(navNode);

          } else {
            // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
            // ccs.getComponentID());
          }
        }
        Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
        Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
        adjacency.setNode(x.getNode());
        adjacency.setNeighbors(newAdjNodes);
        adjacencies.remove(x.getId());
        adjacencies.put(x.getId(), adjacency);
        graph.setAdjacency(adjacencies);

        // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        // LOGGER.info("Number of neighbors: " + neighbors.size());
        for (NavNode neighbor : neighbors) {

          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {

            double g = x.getG() + gInc;
            AStarNode n = openSet.get(neighbor.getId());

            if (n == null) {
              // not in the open set

              // LOGGER.info("neighbor (n) --> " + neighbor.getId());
              // LOGGER.info("X --> " + x.getId());

              // n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
              // n = new AStarNode(neighbor, g, calculateHv3(neighbor, acsGoal));
              double h = calculateHv3(neighbor, acsGoal);
              n = new AStarNode(neighbor, g, h);
              // n.setF(n.getG() + n.getH());
              n.setF(n.getH());
              // LOGGER.info("F(X) --> " + n.getF());

              if (n.getH() == 0) {

                LOGGER.info("FOUND");
                bestNode = n;
                return bestNode;

//                  if(evaluateCCList(acsList, bestNode.getNode().getCcsList()) == false) {
//                    LOGGER.info("DISCARDING --> " + bestNode.getId());
//                    
//                  } else {
//                    LOGGER.info("FOUND");
//                    bestNode = n;
//                    return bestNode;
//                  }

              }

              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
              pQueue.add(n);

            } else {

              LOGGER.info("n is not null");
              // LOGGER.info("G: " + g + " -- NG: " + n.getG());

              if (g < n.getG()) {
                // if(x.getH() < n.getH()) {

                // Have a better route to the current node, change its parent
                n.setCameFrom(x);
                n.setG(g);
                // n.setH(graph.calcManhattanDistance(neighbor, target));
                // n.setH(calculateHv2(n, acsGoal));
                // n.setH(calculateH(neighbor, acsGoal));
                n.setH(calculateHv3(neighbor, acsGoal));
                LOGGER.info("Changing the parent");
                // LOGGER.info("G: " + n.getG());
                // LOGGER.info("H: " + n.getH());
              }
            }
          } else {
            // LOGGER.info("visited is not null --> " + visited.getId());
          }
        }

        // }

      }
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());

    return bestNode;
  }

  public static AStarNode searchv4(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, Map<String, List<ConcreteComponentSpecification>> ccsMap) {

    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    int acsIndex = 0;

    while (openSet.size() > 0) {

      AStarNode x = pQueue.poll();

      openSet.remove(x.getId());

      LOGGER.info("openSet size --> " + openSet.size());
      LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      }

      if (acsIndex >= acsList.size()) {
        break;
      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found
        LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
        break;

      } else {

        closeSet.put(x.getId(), x);

        // Create dynamically the adjacent nodes
        Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
        List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
        List<ConcreteComponentSpecification> ccsList = ccsMap.get(acsList.get(acsIndex).getComponentID());

        for (ConcreteComponentSpecification ccs : ccsList) {
          if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
            // Create the node
            NavNode navNode = new NavNode();
            navNode.setId(x.getId() + "&" + ccs.getComponentID());

            for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
              navNode.addCC2CCsList(cc);
            }
            navNode.addCC2CCsList(ccs);

            graph.getNodeList().add(navNode);
            // LOGGER.info("Node created --> " + navNode.getId());

            // Add adjacency from 'x' node the the 'navNode'
            newAdjNodesList.add(navNode);

          } else {
            // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
            // ccs.getComponentID());
          }
        }
        Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
        Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
        adjacency.setNode(x.getNode());
        adjacency.setNeighbors(newAdjNodes);
        adjacencies.remove(x.getId());
        adjacencies.put(x.getId(), adjacency);
        graph.setAdjacency(adjacencies);

        LOGGER.info("Getting adjacent nodes for --> " + x.getId());
        Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
        LOGGER.info("Number of neighbors: " + neighbors.size());
        for (NavNode neighbor : neighbors) {

          AStarNode visited = closeSet.get(neighbor.getId());
          if (visited == null) {

            double g = x.getG() + gInc;
            AStarNode n = openSet.get(neighbor.getId());

            if (n == null) {
              // not in the open set

              // LOGGER.info("neighbor (n) --> " + neighbor.getId());
              // LOGGER.info("X --> " + x.getId());

              // n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
              // n = new AStarNode(neighbor, g, calculateHv3(neighbor, acsGoal));
              double h = calculateHv3(neighbor, acsGoal);
              n = new AStarNode(neighbor, g, h);
              // n.setF(n.getG() + n.getH());
              n.setF(n.getH());
              // LOGGER.info("F(X) --> " + n.getF());

              if (n.getH() == 0) {
                LOGGER.info("FOUND");
                bestNode = n;
                return bestNode;
              }

              n.setCameFrom(x);
              openSet.put(neighbor.getId(), n);
              pQueue.add(n);

            } else {

              LOGGER.info("n is not null");
              // LOGGER.info("G: " + g + " -- NG: " + n.getG());

              if (g < n.getG()) {
                // if(x.getH() < n.getH()) {

                // Have a better route to the current node, change its parent
                n.setCameFrom(x);
                n.setG(g);
                // n.setH(graph.calcManhattanDistance(neighbor, target));
                // n.setH(calculateHv2(n, acsGoal));
                // n.setH(calculateH(neighbor, acsGoal));
                n.setH(calculateHv3(neighbor, acsGoal));
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

      acsIndex++;
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());

    return bestNode;
  }

  public static AStarNode searchv5(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, List<ConcreteComponentSpecification> ccsList) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();

    notDesiredCC = new ArrayList<String>();
    discardedSolutions = 0;
    boolean firstSolution = false;

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    long timeStart, timeEnd, timeFirstSolution = 0;
    timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

      timeEnd = System.currentTimeMillis();
      if ((timeEnd - timeStart) > 3000) {
        break;
      }

      AStarNode x = pQueue.poll();

      openSet.remove(x.getId());

      // LOGGER.info("openSet size --> " + openSet.size());
      // LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      } else {

      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found

        if (!firstSolution) {
          firstSolution = true;
          timeFirstSolution = System.currentTimeMillis() - timeStart;
        }

        bestNode = x;

        if (evaluateCCList(acsList, x.getNode().getCcsList()) == false) {
          LOGGER.info("DISCARDING!!!!!!!!!!!! --> " + bestNode.getId());

        } else {
          LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
          LOGGER.info("Number of discarded solutions: " + discardedSolutions);
          LOGGER.info("First solution found at: " + timeFirstSolution);
          bestNode = x;
          return bestNode;
        }

//        LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
//        break;

      } else {

        closeSet.put(x.getId(), x);

        // printNotDesiredCC();

        if (containsNotDesired(x.getId()) == false) {

          // Create dynamically the adjacent nodes to the "rest" of nodes of the
          // graph
          Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
          List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
          for (ConcreteComponentSpecification ccs : ccsList) {
            // if ( containsNotDesired(ccs.getComponentID() ) == false ) {
            if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
              // Create the node
              NavNode navNode = new NavNode();
              navNode.setId(x.getId() + "&" + ccs.getComponentID());

              for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
                navNode.addCC2CCsList(cc);
              }
              navNode.addCC2CCsList(ccs);

              graph.getNodeList().add(navNode);
              // LOGGER.info("Node created --> " + navNode.getId());

              // Add adjacency from 'x' node the the 'navNode'
              newAdjNodesList.add(navNode);

            } else {
              // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
              // ccs.getComponentID());
            }
            // }
          }
          Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
          Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
          adjacency.setNode(x.getNode());
          adjacency.setNeighbors(newAdjNodes);
          adjacencies.remove(x.getId());
          adjacencies.put(x.getId(), adjacency);
          graph.setAdjacency(adjacencies);

          // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
          Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
          // LOGGER.info("Number of neighbors: " + neighbors.size());
          for (NavNode neighbor : neighbors) {

            AStarNode visited = closeSet.get(neighbor.getId());
            if (visited == null) {

              // double g = x.getG() + gInc;
              double g;
              double gAux = acsList.size() - x.getNode().getCcsList().size();
              if (gAux >= 0) {
                g = gAux;
              } else
                g = -gAux * 100;

              // LOGGER.info("g(x) --> " + g);

              AStarNode n = openSet.get(neighbor.getId());

              if (n == null) {
                // not in the open set

                // LOGGER.info("neighbor (n) --> " + neighbor.getId());
                // LOGGER.info("X --> " + x.getId());

                // n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
                // n = new AStarNode(neighbor, g, calculateHv3(neighbor, acsGoal));
                double h = calculateHv5(neighbor, acsGoal);
                // LOGGER.info("h: " + h);
                n = new AStarNode(neighbor, g, h);
                // LOGGER.info("getH(): " + n.getH());
                // n.setF(n.getG() + n.getH());
                n.setF(n.getH());
                // LOGGER.info("F(X) --> " + n.getF());

                // Added
                if (g >= 0) {

                  if (n.getH() == 0) {

//                  LOGGER.info("FOUND");
//                  bestNode = n;
//                  return bestNode;

                    if (!firstSolution) {
                      firstSolution = true;
                      timeFirstSolution = System.currentTimeMillis() - timeStart;
                    }

                    bestNode = n;

                    if (evaluateCCList(acsList, n.getNode().getCcsList()) == false) {
                      LOGGER.info("DISCARDING --> " + bestNode.getId());

                    } else {
                      LOGGER.info("FOUND");
                      LOGGER.info("Number of discarded solutions: " + discardedSolutions);
                      LOGGER.info("First solution found at: " + timeFirstSolution);
                      bestNode = n;
                      return bestNode;
                    }

                  } else {

                    n.setCameFrom(x);
                    openSet.put(neighbor.getId(), n);
                    pQueue.add(n);
                  }

                }

              } else {

                LOGGER.info("n is not null");
                // LOGGER.info("G: " + g + " -- NG: " + n.getG());

                if (g < n.getG()) {
                  // if(x.getH() < n.getH()) {

                  // Have a better route to the current node, change its parent
                  n.setCameFrom(x);
                  n.setG(g);
                  // n.setH(graph.calcManhattanDistance(neighbor, target));
                  // n.setH(calculateHv2(n, acsGoal));
                  // n.setH(calculateH(neighbor, acsGoal));
                  n.setH(calculateHv5(neighbor, acsGoal));
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
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());
    LOGGER.info("Number of discarded solutions: " + discardedSolutions);
    LOGGER.info("First solution found at: " + timeFirstSolution);

    return bestNode;
  }

  public static List<Object> searchv5simulation(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, List<ConcreteComponentSpecification> ccsList) {
    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();
    List<Object> solution = new ArrayList<Object>();

    notDesiredCC = new ArrayList<String>();
    discardedSolutions = 0;
    boolean firstSolution = false;

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    long timeStart, timeEnd, timeFirstSolution = 0;
    timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

//      timeEnd = System.currentTimeMillis();
//      if ( (timeEnd - timeStart) > 3000) {
//        break;
//      }

      AStarNode x = pQueue.poll();

      openSet.remove(x.getId());

      // LOGGER.info("openSet size --> " + openSet.size());
      // LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      } else {

      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found

        if (!firstSolution) {
          firstSolution = true;
          timeFirstSolution = System.currentTimeMillis() - timeStart;
        }

        bestNode = x;

        if (evaluateCCList(acsList, x.getNode().getCcsList()) == false) {
          LOGGER.info("DISCARDING!!!!!!!!!!!! --> " + bestNode.getId());

        } else {
          LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
          LOGGER.info("Number of discarded solutions: " + discardedSolutions);
          LOGGER.info("First solution found at: " + timeFirstSolution);
          bestNode = x;

          bestNode.setSolution(true);
          solution.add(bestNode);
          solution.add(discardedSolutions);
          solution.add(timeFirstSolution);

          return solution;
        }

//        LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
//        break;

      } else {

        closeSet.put(x.getId(), x);

        // printNotDesiredCC();

        if (containsNotDesired(x.getId()) == false) {

          // Create dynamically the adjacent nodes to the "rest" of nodes of the
          // graph
          Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
          List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
          for (ConcreteComponentSpecification ccs : ccsList) {
            // if ( containsNotDesired(ccs.getComponentID() ) == false ) {
            if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
              // Create the node
              NavNode navNode = new NavNode();
              navNode.setId(x.getId() + "&" + ccs.getComponentID());

              for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
                navNode.addCC2CCsList(cc);
              }
              navNode.addCC2CCsList(ccs);

              graph.getNodeList().add(navNode);
              // LOGGER.info("Node created --> " + navNode.getId());

              // Add adjacency from 'x' node the the 'navNode'
              newAdjNodesList.add(navNode);

            } else {
              // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
              // ccs.getComponentID());
            }
            // }
          }
          Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
          Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
          adjacency.setNode(x.getNode());
          adjacency.setNeighbors(newAdjNodes);
          adjacencies.remove(x.getId());
          adjacencies.put(x.getId(), adjacency);
          graph.setAdjacency(adjacencies);

          // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
          Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
          // LOGGER.info("Number of neighbors: " + neighbors.size());
          for (NavNode neighbor : neighbors) {

            AStarNode visited = closeSet.get(neighbor.getId());
            if (visited == null) {

              // double g = x.getG() + gInc;
              double g;
              double gAux = acsList.size() - x.getNode().getCcsList().size();
              if (gAux >= 0) {
                g = gAux;
              } else
                g = -gAux * 100;

              // LOGGER.info("g(x) --> " + g);

              AStarNode n = openSet.get(neighbor.getId());

              if (n == null) {
                // not in the open set

                double h = calculateHv5(neighbor, acsGoal);
                // LOGGER.info("h: " + h);
                n = new AStarNode(neighbor, g, h);
                // LOGGER.info("getH(): " + n.getH());
                // n.setF(n.getG() + n.getH());
                n.setF(n.getH());
                // LOGGER.info("F(X) --> " + n.getF());

                // Added
                if (g >= 0) {

                  if (n.getH() == 0) {

                    if (!firstSolution) {
                      firstSolution = true;
                      timeFirstSolution = System.currentTimeMillis() - timeStart;
                    }

                    bestNode = n;

                    if (evaluateCCList(acsList, n.getNode().getCcsList()) == false) {
                      LOGGER.info("DISCARDING --> " + bestNode.getId());

                    } else {
                      LOGGER.info("FOUND");
                      LOGGER.info("Number of discarded solutions: " + discardedSolutions);
                      LOGGER.info("First solution found at: " + timeFirstSolution);
                      bestNode = n;

                      bestNode.setSolution(true);
                      solution.add(bestNode);
                      solution.add(discardedSolutions);
                      solution.add(timeFirstSolution);

                      return solution;
                    }

                  } else {

                    n.setCameFrom(x);
                    openSet.put(neighbor.getId(), n);
                    pQueue.add(n);
                  }

                }

              } else {

                LOGGER.info("n is not null");
                // LOGGER.info("G: " + g + " -- NG: " + n.getG());

                if (g < n.getG()) {
                  // if(x.getH() < n.getH()) {

                  // Have a better route to the current node, change its parent
                  n.setCameFrom(x);
                  n.setG(g);
                  n.setH(calculateHv5(neighbor, acsGoal));
                  LOGGER.info("Changing the parent");
                }
              }
            }
          }
        }
      }
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());
    LOGGER.info("Number of discarded solutions: " + discardedSolutions);
    LOGGER.info("First solution found at: " + timeFirstSolution);

    solution.add(bestNode);
    solution.add(discardedSolutions);
    solution.add(timeFirstSolution);

    return solution;
  }

  public static AStarNode searchv6(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, Map<String, List<ConcreteComponentSpecification>> ccsMap) {

    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();

    notDesiredCC = new ArrayList<String>();
    discardedSolutions = 0;
    boolean firstSolution = false;

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    int acsIndex = 0;

    long timeStart, timeEnd, timeFirstSolution = 0;
    ;
    timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

      timeEnd = System.currentTimeMillis();
      if ((timeEnd - timeStart) > 3000) {
        break;
      }

      AStarNode x = pQueue.poll();
      LOGGER.info("ID-->" + x.getId());
      LOGGER.info("f(x)-->" + x.getF());

      openSet.remove(x.getId());

      // LOGGER.info("openSet size --> " + openSet.size());
      // LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      }

//      if (acsIndex >= acsList.size()) {
//        break;
//      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found

        if (!firstSolution) {
          firstSolution = true;
          timeFirstSolution = System.currentTimeMillis() - timeStart;
        }

        bestNode = x;

        if (evaluateCCList(acsList, x.getNode().getCcsList()) == false) {
          LOGGER.info("DISCARDING!!!!!!!!!!!! --> " + bestNode.getId());

        } else {
          LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
          LOGGER.info("Number of discarded solutions: " + discardedSolutions);
          LOGGER.info("First solution found at: " + timeFirstSolution);
          bestNode = x;
          return bestNode;
        }

        // LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
        // break;

      } else {

        closeSet.put(x.getId(), x);

        if (x.getNode().getCcsList().size() < ccsMap.size()) {

          if (containsNotDesired(x.getId()) == false) {

            // Create dynamically the adjacent nodes
            Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
            List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
            // List<ConcreteComponentSpecification> ccsList =
            // ccsMap.get(acsList.get(acsIndex).getComponentID());
            List<ConcreteComponentSpecification> ccsList = ccsMap
                .get(acsList.get(x.getNode().getCcsList().size()).getComponentID());

            for (ConcreteComponentSpecification ccs : ccsList) {
              if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
                // Create the node
                NavNode navNode = new NavNode();
                navNode.setId(x.getId() + "&" + ccs.getComponentID());

                for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
                  navNode.addCC2CCsList(cc);
                }
                navNode.addCC2CCsList(ccs);

                graph.getNodeList().add(navNode);
                // LOGGER.info("Node created --> " + navNode.getId());

                // Add adjacency from 'x' node the the 'navNode'
                newAdjNodesList.add(navNode);

              } else {
                // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
                // ccs.getComponentID());
              }
            }
            Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
            Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
            adjacency.setNode(x.getNode());
            adjacency.setNeighbors(newAdjNodes);
            adjacencies.remove(x.getId());
            adjacencies.put(x.getId(), adjacency);
            graph.setAdjacency(adjacencies);

            // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
            Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
            // LOGGER.info("Number of neighbors: " + neighbors.size());
            for (NavNode neighbor : neighbors) {

              AStarNode visited = closeSet.get(neighbor.getId());
              if (visited == null) {

                double g = x.getG() + gInc;
                AStarNode n = openSet.get(neighbor.getId());

                if (n == null) {
                  // not in the open set

                  // LOGGER.info("neighbor (n) --> " + neighbor.getId());
                  // LOGGER.info("X --> " + x.getId());

                  // n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
                  // n = new AStarNode(neighbor, g, calculateHv3(neighbor, acsGoal));
                  double h = calculateHv5(neighbor, acsGoal);
                  n = new AStarNode(neighbor, g, h);
                  // n.setF(n.getG() + n.getH());
                  n.setF(n.getH());
                  // LOGGER.info("F(X) --> " + n.getF());

                  if (n.getH() == 0) {
                    // LOGGER.info("FOUND");
                    // bestNode = n;
                    // return bestNode;

                    if (!firstSolution) {
                      firstSolution = true;
                      timeFirstSolution = System.currentTimeMillis() - timeStart;
                    }

                    bestNode = n;

                    if (evaluateCCList(acsList, n.getNode().getCcsList()) == false) {
                      LOGGER.info("DISCARDING --> " + bestNode.getId());

                    } else {
                      LOGGER.info("FOUND");
                      LOGGER.info("Number of discarded solutions: " + discardedSolutions);
                      LOGGER.info("First solution found at: " + timeFirstSolution);
                      bestNode = n;
                      return bestNode;
                    }

                  } else {

                    n.setCameFrom(x);
                    openSet.put(neighbor.getId(), n);
                    pQueue.add(n);
                  }

                } else {

                  LOGGER.info("n is not null");
                  // LOGGER.info("G: " + g + " -- NG: " + n.getG());

                  if (g < n.getG()) {
                    // if(x.getH() < n.getH()) {

                    // Have a better route to the current node, change its parent
                    n.setCameFrom(x);
                    n.setG(g);
                    // n.setH(graph.calcManhattanDistance(neighbor, target));
                    // n.setH(calculateHv2(n, acsGoal));
                    // n.setH(calculateH(neighbor, acsGoal));
                    n.setH(calculateHv5(neighbor, acsGoal));
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
      }

      acsIndex++;
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());
    LOGGER.info("Number of discarded solutions: " + discardedSolutions);
    LOGGER.info("First solution found at: " + timeFirstSolution);

    return bestNode;
  }

  public static List<Object> searchv6simulation(NavGraph graph, NavNode source, AbstractComponentSpecification acsGoal,
      List<AbstractComponentSpecification> acsList, Map<String, List<ConcreteComponentSpecification>> ccsMap,
      int gIncrement) {

    Map<String, AStarNode> openSet = new HashMap<String, AStarNode>();
    PriorityQueue<AStarNode> pQueue = new PriorityQueue<AStarNode>(20, new AStarNodeComparator());
    Map<String, AStarNode> closeSet = new HashMap<String, AStarNode>();
    List<Object> solution = new ArrayList<Object>();

    notDesiredCC = new ArrayList<String>();
    discardedSolutions = 0;
    boolean firstSolution = false;

    AStarNode start = new AStarNode(source, 0, 1);
    openSet.put(source.getId(), start);
    pQueue.add(start);

    AStarNode bestNode = new AStarNode(null, 0, 1);

    int acsIndex = 0;

    long timeStart, timeEnd, timeFirstSolution = 0;

    timeStart = System.currentTimeMillis();

    while (openSet.size() > 0) {

      timeEnd = System.currentTimeMillis();
      if ((timeEnd - timeStart) > 3000) {
        LOGGER.info("LIMIT OF TIME REACHED");
        break;
      }

      AStarNode x = pQueue.poll();

      openSet.remove(x.getId());

      // LOGGER.info("openSet size --> " + openSet.size());
      // LOGGER.info("Removing from open set --> " + x.getId());

      if (x.getH() < bestNode.getH()) {
        bestNode = x;
      }

//      if (acsIndex >= acsList.size()) {
//        break;
//      }

      if (x.getH() == 0) {
        // we don't have a target, so, the condition is to have an h(x) = 0
        // is the target is found

        if (!firstSolution) {
          firstSolution = true;
          timeFirstSolution = System.currentTimeMillis() - timeStart;
        }

        bestNode = x;

        if (evaluateCCList(acsList, x.getNode().getCcsList()) == false) {
          LOGGER.info("DISCARDING!!!!!!!!!!!! --> " + bestNode.getId());

        } else {
          LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
          LOGGER.info("Number of discarded solutions: " + discardedSolutions);
          LOGGER.info("First solution found at: " + timeFirstSolution);
          bestNode = x;

          bestNode.setSolution(true);
          solution.add(bestNode);
          solution.add(discardedSolutions);
          solution.add(timeFirstSolution);
          return solution;
        }

        // LOGGER.info("FOUND!!!!!!!!!!!!!!!!");
        // break;

      } else {

        closeSet.put(x.getId(), x);

        if (x.getNode().getCcsList().size() < ccsMap.size()) {

          if (containsNotDesired(x.getId()) == false) {

            // Create dynamically the adjacent nodes
            Map<String, Adjacency<NavNode>> adjacencies = graph.getAdjacency();
            List<NavNode> newAdjNodesList = new ArrayList<NavNode>();
            // List<ConcreteComponentSpecification> ccsList =
            // ccsMap.get(acsList.get(acsIndex).getComponentID());
            List<ConcreteComponentSpecification> ccsList = ccsMap
                .get(acsList.get(x.getNode().getCcsList().size()).getComponentID());

            for (ConcreteComponentSpecification ccs : ccsList) {
              if (intersectionOfID(x.getId(), ccs.getComponentID()) == false) {
                // Create the node
                NavNode navNode = new NavNode();
                navNode.setId(x.getId() + "&" + ccs.getComponentID());

                for (ConcreteComponentSpecification cc : x.getNode().getCcsList()) {
                  navNode.addCC2CCsList(cc);
                }
                navNode.addCC2CCsList(ccs);

                graph.getNodeList().add(navNode);
                // LOGGER.info("Node created --> " + navNode.getId());

                // Add adjacency from 'x' node the the 'navNode'
                newAdjNodesList.add(navNode);

              } else {
                // LOGGER.info("Intersection is true --> " + x.getId() + " , " +
                // ccs.getComponentID());
              }
            }
            Set<NavNode> newAdjNodes = new HashSet<NavNode>(newAdjNodesList);
            Adjacency<NavNode> adjacency = new Adjacency<NavNode>();
            adjacency.setNode(x.getNode());
            adjacency.setNeighbors(newAdjNodes);
            adjacencies.remove(x.getId());
            adjacencies.put(x.getId(), adjacency);
            graph.setAdjacency(adjacencies);

            // LOGGER.info("Getting adjacent nodes for --> " + x.getId());
            Set<NavNode> neighbors = graph.getAdjacentNodes(x.getId());
            // LOGGER.info("Number of neighbors: " + neighbors.size());
            for (NavNode neighbor : neighbors) {

              AStarNode visited = closeSet.get(neighbor.getId());
              if (visited == null) {

                double g = x.getG() + gIncrement;
                AStarNode n = openSet.get(neighbor.getId());

                if (n == null) {
                  // not in the open set

                  // LOGGER.info("neighbor (n) --> " + neighbor.getId());
                  // LOGGER.info("X --> " + x.getId());

                  // n = new AStarNode(neighbor, g, calculateH(neighbor, acsGoal));
                  // n = new AStarNode(neighbor, g, calculateHv3(neighbor, acsGoal));
                  double h = calculateHv5(neighbor, acsGoal);
                  n = new AStarNode(neighbor, g, h);
                  // n.setF(n.getG() + n.getH());
                  n.setF(n.getH());
                  // LOGGER.info("F(X) --> " + n.getF());

                  if (n.getH() == 0) {
                    // LOGGER.info("FOUND");
                    // bestNode = n;
                    // return bestNode;

                    if (!firstSolution) {
                      firstSolution = true;
                      timeFirstSolution = System.currentTimeMillis() - timeStart;
                    }

                    bestNode = n;

                    if (evaluateCCList(acsList, n.getNode().getCcsList()) == false) {
                      LOGGER.info("DISCARDING --> " + bestNode.getId());

                    } else {
                      LOGGER.info("FOUND");
                      LOGGER.info("Number of discarded solutions: " + discardedSolutions);
                      LOGGER.info("First solution found at: " + timeFirstSolution);
                      bestNode = n;

                      bestNode.setSolution(true);
                      solution.add(bestNode);
                      solution.add(discardedSolutions);
                      solution.add(timeFirstSolution);
                      return solution;
                    }

                  } else {

                    n.setCameFrom(x);
                    openSet.put(neighbor.getId(), n);
                    pQueue.add(n);
                  }

                } else {

                  LOGGER.info("n is not null");
                  // LOGGER.info("G: " + g + " -- NG: " + n.getG());

                  if (g < n.getG()) {
                    // if(x.getH() < n.getH()) {

                    // Have a better route to the current node, change its parent
                    n.setCameFrom(x);
                    n.setG(g);
                    // n.setH(graph.calcManhattanDistance(neighbor, target));
                    // n.setH(calculateHv2(n, acsGoal));
                    // n.setH(calculateH(neighbor, acsGoal));
                    n.setH(calculateHv5(neighbor, acsGoal));
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
      }

      acsIndex++;
    }

    LOGGER.info("BEST NODE: " + bestNode.getId() + " --> " + bestNode.getH());
    LOGGER.info("Number of discarded solutions: " + discardedSolutions);
    LOGGER.info("First solution found at: " + timeFirstSolution);

    solution.add(bestNode);
    solution.add(discardedSolutions);
    solution.add(timeFirstSolution);
    return solution;
  }

  private static boolean containsNotDesired(String id) {

    String notDesiredIDList = "";
    for (String notDesiredID : notDesiredCC) {
      notDesiredIDList += notDesiredID + "&";
    }

    // LOGGER.info("Calculating intersection of:");
    // LOGGER.info(notDesiredIDList);
    // LOGGER.info(id);

    return intersectionOfID(notDesiredIDList, id);
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

    List<String> inters = (List<String>) CollectionUtils.intersection(id1List, id2List);
    if (inters.size() == 0) {
      intersection = false;
    } else {
      if (inters.size() == 1) {
        if (inters.get(0).equalsIgnoreCase("root")) {
          intersection = false;
        }
      }
    }

    return intersection;
  }

  private static double calculateH(NavNode neighbor, AbstractComponentSpecification acsGoal) {

    double h = 1.0;

    String mergedCC = neighbor.getId();
    // LOGGER.info("mergedCC --> " + mergedCC);
    StringTokenizer st = new StringTokenizer(mergedCC, "&");
    List<String> listCC = new ArrayList<String>();
    while (st.hasMoreTokens()) {
      String nT = st.nextToken();
      if (!"root".equalsIgnoreCase(nT)) {
        listCC.add(nT);
      }
    }
    // if(listCC.contains("root")) {
    // listCC.remove("root");
    // }
    ConcreteComponentSpecification ccs = heuristics.joinCC(listCC);

    // ConcreteComponentSpecification ccs =
    // heuristics.getCCFromID(neighbor.getId());

    MatchingInfo mInfo = heuristics.calculateMatchingCC(ccs, acsGoal);
    h = 1 - mInfo.getRatio();
    // LOGGER.info("calculate H --> " + h);

    // **********************Too many calculations**********************
    // h must be faster
    // LOGGER.info("h calculated for " + neighbor.getId() + " --> " + h);

    return h;
  }

  private static double calculateHv3(NavNode node, AbstractComponentSpecification acsGoal) {

    double h = 1.0;

    // Get all the CCs listed in this node
    List<ConcreteComponentSpecification> listCCAux = node.getCcsList();
    List<ConcreteComponentSpecification> listCC = new ArrayList<ConcreteComponentSpecification>();
    // List<String> listCCString = new ArrayList<String>();
    String listCCID = "";

    for (ConcreteComponentSpecification c : listCCAux) {
      if (!"root".equalsIgnoreCase(c.getComponentID())) {
        // listCC.add(c);
        ConcreteComponentSpecification cNew = EcoreUtil.copy(c);
        listCC.add(cNew);
        listCCID += c.getComponentID() + "&";
        // listCCString.add(c.getComponentID());
      }
    }
    // LOGGER.info("node id --> " + node.getId());
    // LOGGER.info("listCCID --> " + listCCID);

    ConcreteComponentSpecification ccs = heuristics.joinCCFromCCS(listCC);
    // ConcreteComponentSpecification ccs = heuristics.joinCC(listCCString);

    MatchingInfo mInfo = heuristics.calculateMatchingCC(ccs, acsGoal);
    // printInfo(mInfo);

    h = 1 - mInfo.getRatio();
    // if (h == 0) {
    // LOGGER.info(mInfo.getRatio() + " -- " + listCCID);
    // }
    // LOGGER.info("H --> " + h);

    return h;
  }

  private static double calculateHv5(NavNode node, AbstractComponentSpecification acsGoal) {

    double h = 1.0;

    List<ConcreteComponentSpecification> listCCAux = node.getCcsList();
    List<ConcreteComponentSpecification> listCC = new ArrayList<ConcreteComponentSpecification>();

    for (ConcreteComponentSpecification c : listCCAux) {
      if (!"root".equalsIgnoreCase(c.getComponentID())) {
        ConcreteComponentSpecification cNew = EcoreUtil.copy(c);
        listCC.add(cNew);
      }
    }

    ConcreteComponentSpecification ccs = heuristics.joinCCFromCCS(listCC);
    MatchingInfo mInfo = heuristics.calculateMatchingCCOnlyF(ccs, acsGoal);
    h = 1 - mInfo.getRatio();

    return h;
  }

  private static boolean evaluateCCList(List<AbstractComponentSpecification> acsList,
      List<ConcreteComponentSpecification> ccsList) {

    boolean evaluation = true;

    List<MatchingInfo> ccsMInfoList = new ArrayList<MatchingInfo>();
    for (AbstractComponentSpecification acs : acsList) {
      MatchingInfo bestMInfo = null;
      ConcreteComponentSpecification bestCCS = null;
      for (ConcreteComponentSpecification ccs : ccsList) {

        MatchingInfo mInfo = heuristics.calculateMatchingCC(ccs, acs);
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
      // LOGGER.info("bestNode for '" + bestMInfo.getAcID() + "' is '" +
      // bestMInfo.getCcID() + "'");
      if (!bestCCS.getAbstractComponentID().equalsIgnoreCase(acs.getComponentName())) {
        evaluation = false;
        LOGGER.info("Comparing --> " + bestCCS.getAbstractComponentID() + "," + acs.getComponentName());
        LOGGER.info("No desired (1): No correspondency with the architecture");
        notDesiredCC.add(bestCCS.getComponentID());
        discardedSolutions++;
        return false;
      }
    }

    if (evaluation) {
      // We cannot check only the size of both list
      if (acsList.size() != ccsList.size()) {
        evaluation = false;
        LOGGER.info("No desired (2): Different number components ");
        discardedSolutions++;
        return false;
      }
    }

    if (evaluation) {
      for (MatchingInfo ccsMInfo : ccsMInfoList) {

        /*
         * if (
         * ccsMInfo.getFunctionalMatchInfo().getProvided().getAcNumProvidedInterfaces()
         * !=
         * ccsMInfo.getFunctionalMatchInfo().getProvided().getCcNumProvidedInterfaces()
         * ) { evaluation = false; notDesiredCC.add(ccsMInfo.getCcID());
         * LOGGER.info("No desired (3) --> " + ccsMInfo.getCcID()); break; }
         * 
         * if (
         * ccsMInfo.getFunctionalMatchInfo().getRequired().getAcNumRequiredInterfaces()
         * !=
         * ccsMInfo.getFunctionalMatchInfo().getRequired().getCcNumRequiredInterfaces()
         * ) { evaluation = false; notDesiredCC.add(ccsMInfo.getCcID());
         * LOGGER.info("No desired (4) --> " + ccsMInfo.getCcID()); break; }
         */

        // Checking dependencies
        if (ccsMInfo.getExtraFunctionalMatchInfo().getDependencies().getAcNumDependencies() != ccsMInfo
            .getExtraFunctionalMatchInfo().getDependencies().getCcNumDependencies()) {
          evaluation = false;
          notDesiredCC.add(ccsMInfo.getCcID());
          LOGGER.info("No desired (3): Extra dependencies in CAM -->  " + ccsMInfo.getCcID());
          discardedSolutions++;
          return false;
        }

        // Checking ratio of properties
        if (ccsMInfo.getExtraFunctionalMatchInfo().getProperties().getRatio() < 0.5) {
          evaluation = false;
          notDesiredCC.add(ccsMInfo.getCcID());
          LOGGER.info("No desired (4): Ratio of properties is not satisfied -->  " + ccsMInfo.getCcID());
          discardedSolutions++;
          return false;
        }

      }
    }

    // printNotDesiredCC();

    return evaluation;

  }

  private static void printNotDesiredCC() {
    String result = "";

    for (String cc : notDesiredCC) {
      result += cc + "&";
    }

    LOGGER.info("NOT DESIRED CC --> " + result);

  }

  private static void printInfo(MatchingInfo mInfo) {

    LOGGER.info(mInfo.getRatio());
    LOGGER.info(mInfo.getFunctionalMatchInfo().getRatio());
    LOGGER.info(mInfo.getFunctionalMatchInfo().getProvided().getRatio());
    LOGGER.info(mInfo.getFunctionalMatchInfo().getProvided().getMatchedProvidedOperations());
    List<MatchedInterfaceInfo> provMatchInterfInfoList = mInfo.getFunctionalMatchInfo().getProvided()
        .getMatchedInterface();
    for (MatchedInterfaceInfo matchInterfInfo : provMatchInterfInfoList) {
      List<MatchedOperationInfo> matchOpInfoList = matchInterfInfo.getMatchedOperation();
      for (MatchedOperationInfo matchOpInfo : matchOpInfoList) {
        LOGGER.info("---- " + matchOpInfo.getAcOperationID() + " - " + matchOpInfo.getCcOperationID());
      }
    }
    LOGGER.info(mInfo.getFunctionalMatchInfo().getRequired().getRatio());
    LOGGER.info(mInfo.getFunctionalMatchInfo().getRequired().getMatchedRequiredOperations());
    List<MatchedInterfaceInfo> reqMatchInterfInfoList = mInfo.getFunctionalMatchInfo().getRequired()
        .getMatchedInterface();
    for (MatchedInterfaceInfo matchInterfInfo : reqMatchInterfInfoList) {
      List<MatchedOperationInfo> matchOpInfoList = matchInterfInfo.getMatchedOperation();
      for (MatchedOperationInfo matchOpInfo : matchOpInfoList) {
        LOGGER.info("---- " + matchOpInfo.getAcOperationID() + " - " + matchOpInfo.getCcOperationID());
      }
    }

  }

}