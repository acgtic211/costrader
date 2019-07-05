package es.ual.acg.cos.trader.heuristics.astar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
  
  public static void main(String args[]) {
    
    NavNode n1 = new NavNode();
    n1.setId("CC1");
    Position pn1 = new Position();
    pn1.setX(1);
    pn1.setY(1);
    n1.setPosition(pn1);
    
    NavNode n2 = new NavNode();
    n2.setId("CC2");
    Position pn2 = new Position();
    pn2.setX(2);
    pn2.setY(4);
    n2.setPosition(pn2);
    
    NavNode n3 = new NavNode();
    n3.setId("CC3");
    Position pn3 = new Position();
    pn3.setX(4);
    pn3.setY(5);
    n3.setPosition(pn3);
    
    NavNode n4 = new NavNode();
    n4.setId("CC4");
    Position pn4 = new Position();
    pn4.setX(5);
    pn4.setY(3);
    n4.setPosition(pn4);
    
    NavNode n5 = new NavNode();
    n5.setId("CC5");
    Position pn5 = new Position();
    pn5.setX(5);
    pn5.setY(3);
    n5.setPosition(pn5);
    
    List<NavNode> nodeList = new ArrayList<NavNode>();
    nodeList.add(n1);
    nodeList.add(n2);
    nodeList.add(n3);
    nodeList.add(n4);
    nodeList.add(n5);
    NavGraph graph = new NavGraph();
    graph.setNodeList(nodeList);
    
    List<NavEdge> edgeList = new ArrayList<NavEdge>();
    edgeList.add(new NavEdge("CC1", "CC2", 1));
    edgeList.add(new NavEdge("CC2", "CC3", 1));
    edgeList.add(new NavEdge("CC3", "CC4", 1));
    edgeList.add(new NavEdge("CC1", "CC5", 1));
    edgeList.add(new NavEdge("CC5", "CC4", 1));
    graph.setEdgeList(edgeList);
    //graph.addConnection("CC1", "CC2");
    //graph.addConnection("CC2", "CC3");
    //graph.addConnection("CC3", "CC4");
    //graph.addConnection("CC1", "CC5");
    //graph.addConnection("CC5", "CC4");
    
    
    Map<String, Adjacency<NavNode>> adjacency = new HashMap<String, Adjacency<NavNode>>();
    
    Adjacency<NavNode> an1 = new Adjacency<NavNode>();
    an1.setNode(n1);
    List<NavNode> n1neighborsList = new ArrayList<NavNode>();
    n1neighborsList.add(n2);
    n1neighborsList.add(n5);
    Set<NavNode> n1neighbors = new HashSet<NavNode>(n1neighborsList);
    an1.setNeighbors(n1neighbors);
    
    Adjacency<NavNode> an2 = new Adjacency<NavNode>();
    an2.setNode(n2);
    List<NavNode> n2neighborsList = new ArrayList<NavNode>();
    n2neighborsList.add(n1);
    n2neighborsList.add(n3);
    Set<NavNode> n2neighbors = new HashSet<NavNode>(n2neighborsList);
    an2.setNeighbors(n2neighbors);
    
    Adjacency<NavNode> an3 = new Adjacency<NavNode>();
    an3.setNode(n3);
    List<NavNode> n3neighborsList = new ArrayList<NavNode>();
    n3neighborsList.add(n2);
    n3neighborsList.add(n4);
    Set<NavNode> n3neighbors = new HashSet<NavNode>(n3neighborsList);
    an3.setNeighbors(n3neighbors);
    
    Adjacency<NavNode> an4 = new Adjacency<NavNode>();
    an4.setNode(n4);
    List<NavNode> n4neighborsList = new ArrayList<NavNode>();
    n4neighborsList.add(n3);
    n4neighborsList.add(n5);
    Set<NavNode> n4neighbors = new HashSet<NavNode>(n4neighborsList);
    an4.setNeighbors(n4neighbors);
    
    Adjacency<NavNode> an5 = new Adjacency<NavNode>();
    an5.setNode(n5);
    List<NavNode> n5neighborsList = new ArrayList<NavNode>();
    n5neighborsList.add(n1);
    n5neighborsList.add(n4);
    Set<NavNode> n5neighbors = new HashSet<NavNode>(n5neighborsList);
    an5.setNeighbors(n5neighbors);
    
    adjacency.put("CC1", an1);
    adjacency.put("CC2", an2);
    adjacency.put("CC3", an3);
    adjacency.put("CC4", an4);
    adjacency.put("CC5", an5);
    
    graph.setAdjacency(adjacency);
    
    System.out.println("SOLUTION: ");
    List<NavNode> result = AStarAlgorithm.search(graph, n1, n4);
    for(NavNode n : result) {
      System.out.println(n.getId() + " --> " + n.getExtraData());
    }
    
    String s1 = "root&http://acg.ual.es/wookie/widgets/twitter01-req2&http://acg.ual.es/wookie/widgets/rss15";
    String s2 = "root&http://acg.ual.es/wookie/widgets/twitter01-req1";
    
    System.out.println(AStarAlgorithm.intersectionOfID(s1, s2));
    
    
  }

}
