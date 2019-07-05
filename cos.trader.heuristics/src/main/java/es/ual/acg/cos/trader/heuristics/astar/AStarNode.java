package es.ual.acg.cos.trader.heuristics.astar;

import ccmm.ConcreteComponentSpecification;

public class AStarNode {

    private NavNode node;

    //used to construct the path after the search is done
    private AStarNode cameFrom;

    // Distance from source along optimal path
    private double g;

    // Heuristic estimate of distance from the current node to the target node
    private double h;
    
    private double f;
    
    private boolean solution;

	public AStarNode(NavNode source, int i, double h)	{
		this.node = source;
		this.g = i;
		this.h = h;
		this.solution = false;		
	}

	public AStarNode(NavNode neighbor, double g, double h) {
		this.node = neighbor;
		/*for (ConcreteComponentSpecification ccs : neighbor.getCcsList()) {
		  this.node.addCC2CCsList(ccs);
		}*/		
		this.g = g;
		this.h = h;
		this.solution = false;
	}

	public NavNode getNode() {
		return node;
	}

	public void setNode(NavNode node) {
		this.node = node;
	}

	public AStarNode getCameFrom() {
		return cameFrom;
	}

	public void setCameFrom(AStarNode cameFrom) {
		this.cameFrom = cameFrom;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}
	
	public String getId()
	{
		return this.node.getId();
	}

  public boolean isSolution() {
    return solution;
  }

  public void setSolution(boolean solution) {
    this.solution = solution;
  }
}