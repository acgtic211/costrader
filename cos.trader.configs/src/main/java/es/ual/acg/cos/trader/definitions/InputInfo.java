package es.ual.acg.cos.trader.definitions;

import java.util.List;

public class InputInfo
{
	private String name;
	private String type;
	private List<ElementInfo> inputElements;
	
	public InputInfo()
	{
		
	}
	
	public InputInfo(String name, String type, List<ElementInfo> inputElements)
	{
		this.name = name;
		this.type = type;
		this.inputElements = inputElements;		
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
	
	public List<ElementInfo> getInputElements() {
		return inputElements;
	}
	
	public void setInputElements(List<ElementInfo> inputElements) {
		this.inputElements = inputElements;
	}

}
