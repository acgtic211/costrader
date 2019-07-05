package es.ual.acg.cos.trader.definitions;


public class OperationInfo
{
	private String name;
	private InputInfo input;
	private OutputInfo output;
	
	public OperationInfo()
	{
		
	}
	
	public OperationInfo(String name, InputInfo input, OutputInfo output)
	{
		this.setName(name);
		this.input = input;
		this.output = output;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public InputInfo getInput() {
		return input;
	}
	public void setInput(InputInfo input) {
		this.input = input;
	}
	public OutputInfo getOutput() {
		return output;
	}
	public void setOutput(OutputInfo output) {
		this.output = output;
	}

}
