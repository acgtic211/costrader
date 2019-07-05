package es.ual.acg.cos.trader.register.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import es.ual.acg.cos.trader.definitions.AbstractComponentInfo;

@WebService
public interface ManageACRepository {
  
  
  @WebMethod
  String getAbstractComponents();
  
  @WebMethod
  AbstractComponentInfo getAbstractComponent(String acID);
  
}

