package es.ual.acg.cos.trader.register.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;

@WebService(name="ManageConcreteComponentsWS")
public interface ManageConcreteComponentsWS {
	@WebMethod(operationName="getCCInfoFromID", action="getCCInfoFromID")
	@WebResult(name="ConcreteComponentInfo")
	public ConcreteComponentInfo getCCInfoFromID(
		@WebParam(name="ccID", targetNamespace="http://ws.cos.acg.ual.es/") String ccID);
	
	@WebMethod(operationName="getCCFromAbstractComponentID", action="getCCFromAbstractComponentID")
	@WebResult(name="ConcreteComponentInfo")
	public List<ConcreteComponentInfo> getCCFromAbstractComponentID(
		@WebParam(name="acID", targetNamespace="http://ws.cos.acg.ual.es/") String acID);
	
	@WebMethod(operationName="getCCTotalNumber", action="getCCTotalNumber")
	public int getCCTotalNumber();

}

