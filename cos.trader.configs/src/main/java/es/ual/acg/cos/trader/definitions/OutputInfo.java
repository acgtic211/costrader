package es.ual.acg.cos.trader.definitions;

import java.util.List;

public class OutputInfo
{
	private String name;
	private String type;
	private List<ElementInfo> outputElements;
	
	public OutputInfo()
	{
		
	}
	
	public OutputInfo(String name, String type, List<ElementInfo> outputElements)
	{
		this.name = name;
		this.type = type;
		this.outputElements = outputElements;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public List<ElementInfo> getOutputElements() {
		return outputElements;
	}
	
	public void setOutputElements(List<ElementInfo> outputElements) {
		this.outputElements = outputElements;
	}

}
