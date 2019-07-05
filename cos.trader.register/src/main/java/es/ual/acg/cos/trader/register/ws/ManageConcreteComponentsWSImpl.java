
package es.ual.acg.cos.trader.register.ws;

import java.util.List;

import javax.jws.WebService;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;
import es.ual.acg.cos.trader.register.singleton.ManageConcreteComponentsSingleton;

@WebService(endpointInterface = "es.ual.acg.cos.trader.register.ws.ManageConcreteComponentsWS")
public class ManageConcreteComponentsWSImpl implements ManageConcreteComponentsWS {

  public ConcreteComponentInfo getCCInfoFromID(String ccID) {
    ConcreteComponentInfo result = null;

    ManageConcreteComponentsSingleton mng = ManageConcreteComponentsSingleton.getInstance();

    result = mng.getCCInfoFromID(ccID);

    return result;
  }

  public List<ConcreteComponentInfo> getCCFromAbstractComponentID(String acID) {
    List<ConcreteComponentInfo> result = null;

    ManageConcreteComponentsSingleton mng = ManageConcreteComponentsSingleton.getInstance();
    result = mng.getCCFromAbstractComponentID(acID);

    return result;
  }

  public int getCCTotalNumber() {
    int result = 0;

    ManageConcreteComponentsSingleton mng = ManageConcreteComponentsSingleton.getInstance();
    result = mng.getCCTotalNumber();

    return result;
  }

}
