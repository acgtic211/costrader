package es.ual.acg.cos.trader.heuristics.astar;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<N extends Node, E extends Edge>
{

    protected List<N> nodeList;
    
    protected List<E> edgeList;
    
    public List<N> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<N> nodeList) {
		this.nodeList = nodeList;
	}

	public List<E> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<E> edgeList) {
		this.edgeList = edgeList;
	}

	public Map<String, Adjacency<N>> getAdjacency() {
		return adjacency;
	}

	public void setAdjacency(Map<String, Adjacency<N>> adjacency) {
		this.adjacency = adjacency;
	}

	public boolean isDiGraph() {
		return diGraph;
	}

	public void setDiGraph(boolean diGraph) {
		this.diGraph = diGraph;
	}

	//Index for fast access
    private Map<String, Adjacency<N>> adjacency;

    //directed graph or not
    protected boolean diGraph;

    public Set<N> getAdjacentNodes(String idNode)
    {
    	return this.adjacency.get(idNode).getNeighbors();
    }
}