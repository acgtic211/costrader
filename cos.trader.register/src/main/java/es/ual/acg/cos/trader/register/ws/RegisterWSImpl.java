
package es.ual.acg.cos.trader.register.ws;

import javax.jws.WebService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import es.ual.acg.cos.trader.register.service.Register;

@WebService(endpointInterface = "es.ual.acg.cos.trader.register.ws.RegisterWS")
public class RegisterWSImpl implements RegisterWS {

  @Autowired
  Register register;

  private static final Logger LOGGER = Logger.getLogger(RegisterWSImpl.class);

  /*
   * public String wsdl2model(String wsdlURI) { String result =
   * "No results obtained"; es.ual.acg.cos.trader.Register register = null; try {
   * Context initialContext = new InitialContext(); register =
   * (es.ual.acg.cos.trader.Register)initialContext.lookup("java:app/cos/Register"
   * ); register.wsdl2model(wsdlURI); } catch (NamingException e) {
   * e.printStackTrace(); }
   * 
   * log.info("[RegisterWS - wsdl2model] result: " + result);
   * 
   * return result;
   * 
   * }
   */

  public String wsdlparser(String wsdlURI) {
    String result = "No results obtained";

    result = register.wsdlparser(wsdlURI);

    LOGGER.info("[RegisterWS - wsdlparser] result: " + result);

    return result;

  }

  public String exportCCFromURI(String ccFileType, String ccFileURI) {
    String result = "No results obtained";

    result = register.exportCCFromURI(ccFileType, ccFileURI);

    LOGGER.info("[RegisterWS - exportCCFromURI] result: " + result);

    return result;
  }

  public String exportACFromURI(String acFileType, String acFileURI) {
    String result = "No results obtained";

    result = register.exportACFromURI(acFileType, acFileURI);

    LOGGER.info("[RegisterWS - exportACFromURI] result: " + result);

    return result;
  }

  public String exportCCFromString(String ccFileType, String ccFileString) {
    String result = "No results obtained";

    result = register.exportCCFromString(ccFileType, ccFileString);

    LOGGER.info("[RegisterWS - exportFromString] result: " + result);

    return result;
  }

  public String exportACFromString(String acFileType, String acFileString) {
    String result = "No results obtained";

    result = register.exportACFromString(acFileType, acFileString);

    LOGGER.info("[RegisterWS - exportACFromString] result: " + result);

    return result;
  }

  public String withdrawCC(String ccID) {
    String result = "No results obtained";

    result = register.withdrawCC(ccID);

    LOGGER.info("[RegisterWS - withdrawCC] result: " + result);

    return result;
  }

  public String withdrawAC(String acID) {
    String result = "No results obtained";

    result = register.withdrawAC(acID);

    LOGGER.info("[RegisterWS - withdrawAC] result: " + result);

    return result;
  }

  public void registerExampleCC() {

    register.registerExampleCC();
    LOGGER.info("[RegisterWS - registerExampleCC] OK");

  }

  public void registerExampleAC() {

    register.registerExampleAC();

  }

}
