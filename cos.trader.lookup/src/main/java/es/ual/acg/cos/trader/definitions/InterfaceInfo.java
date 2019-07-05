package es.ual.acg.cos.trader.definitions;

import java.util.List;

public class InterfaceInfo
{
	private String interfaceID;	
	private List<OperationInfo> operations;
	
	public InterfaceInfo()
	{
		
	}
	
	public InterfaceInfo(String interfaceID, List<OperationInfo> operations)
	{
		this.interfaceID = interfaceID;
		this.operations = operations;
	}

	public String getInterfaceID() {
		return interfaceID;
	}

	public void setInterfaceID(String interfaceID) {
		this.interfaceID = interfaceID;
	}
	
	public List<OperationInfo> getOperations() {
		return operations;
	}

	public void setOperations(List<OperationInfo> operations) {
		this.operations = operations;
	}

}
