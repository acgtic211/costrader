package es.ual.acg.cos.trader.register.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;

@WebService
public interface ManageCCRepository {
  
  
  @WebMethod
  //List<ConcreteComponentInfo> getConcreteComponents();
  String getConcreteComponents(int page);
  
  @WebMethod
  ConcreteComponentInfo getConcreteComponent(String ccID);
  
}

