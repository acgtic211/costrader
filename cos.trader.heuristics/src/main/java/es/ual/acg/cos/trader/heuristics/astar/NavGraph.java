package es.ual.acg.cos.trader.heuristics.astar;

public class NavGraph extends Graph<NavNode, NavEdge>
{
	public void addConnection(String firstId, String secondId)
    {
        NavNode node1 = this.getNode(firstId);
        NavNode node2 = this.getNode(secondId);
        if(node1 != null && node2 != null){
            double cost = this.calcManhattanDistance(node1, node2);
            NavEdge edge1 = new NavEdge(firstId, secondId, cost);
            NavEdge edge2 = new NavEdge(secondId, firstId, cost);
            this.addEdge(edge1);
            this.addEdge(edge2);
        }
    }

    public void removeConnection(String firstId, String secondId){
        NavEdge edge1 = new NavEdge(firstId, secondId);
        NavEdge edge2 = new NavEdge(secondId, firstId);
        this.removeEdge(edge1);
        this.removeEdge(edge2);
    }

    public double calcManhattanDistance(NavNode a, NavNode b){
        return Math.abs(a.getPosition().getX() - b.getPosition().getX())
                + Math.abs(a.getPosition().getY() - b.getPosition().getY());
    }
    
    private NavNode getNode(String idNode)
    {
    	NavNode node = null;
    	boolean found = false;
    	
    	NavNode aux = null;
    	for(int i=0; i<nodeList.size() && found == false; i++)
    	{
    		aux = nodeList.get(i);
    		if(aux.getId().equals(idNode))
    		{
    			node = aux;
    			found = true;    			
    		}    		
    	}
    	
    	return node; 
    }
    
	private void addEdge(NavEdge navEdge)
	{
		this.getEdgeList().add(navEdge);    	
	}
	
	private void removeEdge(NavEdge navEdge)
	{
		this.getEdgeList().remove(navEdge);	   
	}
}