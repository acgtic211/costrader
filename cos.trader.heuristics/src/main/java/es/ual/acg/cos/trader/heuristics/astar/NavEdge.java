package es.ual.acg.cos.trader.heuristics.astar;

public class NavEdge extends Edge
{
	protected double cost;
	
	public NavEdge(String firstId, String secondId)
    {
		this.from = firstId;
		this.to = secondId;
	}

	public NavEdge(String firstId, String secondId, double cost)
	{
		this.from = firstId;
		this.to = secondId;
		this.cost = cost;
	}

	
}