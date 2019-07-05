package es.ual.acg.cos.trader.heuristics.astar;

import java.util.Set;

public class Adjacency<N extends Node>
{
    protected N node;
    protected Set<N> neighbors;
    
    public N getNode() {
		return node;
	}
	public void setNode(N node) {
		this.node = node;
	}
	public Set<N> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(Set<N> neighbors) {
		this.neighbors = neighbors;
	}
	
}