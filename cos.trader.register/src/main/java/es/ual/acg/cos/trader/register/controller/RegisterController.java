
package es.ual.acg.cos.trader.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.register.service.Register;
import es.ual.acg.cos.trader.register.ws.RegisterWS;

import org.jboss.logging.Logger;

@RestController
@RequestMapping("/register")
public class RegisterController implements RegisterWS {

  @Autowired
  Register register;

  private static final Logger LOGGER = Logger.getLogger(RegisterController.class);


  public String wsdlparser(String wsdlURI) {
    String result = "No results obtained";

    result = register.wsdlparser(wsdlURI);

    LOGGER.info("[RegisterController - wsdlparser] result: " + result);

    return result;

  }

  public String exportCCFromURI(String ccFileType, String ccFileURI) {
    String result = "No results obtained";

    result = register.exportCCFromURI(ccFileType, ccFileURI);

    LOGGER.info("[RegisterController - exportCCFromURI] result: " + result);

    return result;
  }

  public String exportACFromURI(String acFileType, String acFileURI) {
    String result = "No results obtained";

    result = register.exportACFromURI(acFileType, acFileURI);

    LOGGER.info("[RegisterController - exportACFromURI] result: " + result);

    return result;
  }

  public String exportCCFromString(String ccFileType, String ccFileString) {
    String result = "No results obtained";

    result = register.exportCCFromString(ccFileType, ccFileString);

    LOGGER.info("[RegisterController - exportFromString] result: " + result);

    return result;
  }

  public String exportACFromString(String acFileType, String acFileString) {
    String result = "No results obtained";

    result = register.exportACFromString(acFileType, acFileString);

    LOGGER.info("[RegisterController - exportACFromString] result: " + result);

    return result;
  }

  public String withdrawCC(String ccID) {
    String result = "No results obtained";

    result = register.withdrawCC(ccID);

    LOGGER.info("[RegisterController - withdrawCC] result: " + result);

    return result;
  }

  public String withdrawAC(String acID) {
    String result = "No results obtained";

    result = register.withdrawAC(acID);

    LOGGER.info("[RegisterController - withdrawAC] result: " + result);

    return result;
  }

  @RequestMapping("/registerExampleCC")
  public void registerExampleCC() {

    register.registerExampleCC();
    LOGGER.info("[RegisterController - registerExampleCC] OK");

  }

  @RequestMapping("/registerExampleAC")
  public void registerExampleAC() {

    register.registerExampleAC();
    LOGGER.info("[RegisterController - registerExampleAC] OK");

  }

}
