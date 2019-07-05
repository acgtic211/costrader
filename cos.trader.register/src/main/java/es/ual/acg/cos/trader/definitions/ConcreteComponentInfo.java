package es.ual.acg.cos.trader.definitions;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ConcreteComponentInfo") 
public class ConcreteComponentInfo
{
	private String componentID;
	private String componentName;
	private String abstractComponentID;
	private String componentDescription;
	private List<InterfaceInfo> providedInterfaces;
	private List<InterfaceInfo> requiredInterfaces;
	
	public ConcreteComponentInfo()	{
		
	}

	public String getComponentID() {
		return componentID;
	}

	public void setComponentID(String componentID) {
		this.componentID = componentID;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getAbstractComponentID() {
		return abstractComponentID;
	}

	public void setAbstractComponentID(String abstractComponentID) {
		this.abstractComponentID = abstractComponentID;
	}

	public String getComponentDescription() {
		return componentDescription;
	}

	public void setComponentDescription(String componentDescription) {
		this.componentDescription = componentDescription;
	}

	public List<InterfaceInfo> getProvidedInterfaces() {
		return providedInterfaces;
	}

	public void setProvidedInterfaces(List<InterfaceInfo> providedInterfaces) {
		this.providedInterfaces = providedInterfaces;
	}

	public List<InterfaceInfo> getRequiredInterfaces() {
		return requiredInterfaces;
	}

	public void setRequiredInterfaces(List<InterfaceInfo> requiredInterfaces) {
		this.requiredInterfaces = requiredInterfaces;
	}
	
	

}
