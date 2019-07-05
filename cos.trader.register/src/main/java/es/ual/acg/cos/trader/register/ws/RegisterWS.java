package es.ual.acg.cos.trader.register.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "RegisterWS")
public interface RegisterWS {
  
  /*
   * @WebMethod(operationName="wsdl2model", action="wsdl2model") public String
   * wsdl2model(
   * 
   * @WebParam(name="wsdlURI", targetNamespace="http://ws.cos.acg.ual.es/") String
   * wsdlURI);
   */

  @WebMethod(operationName = "wsdlparser", action = "wsdlparser")
  public String wsdlparser(@WebParam(name = "wsdlURI", targetNamespace = "http://ws.cos.acg.ual.es/") String wsdlURI);

  @WebMethod(operationName = "exportCCFromURI", action = "exportCCFromURI")
  public String exportCCFromURI(
      @WebParam(name = "ccFileType", targetNamespace = "http://ws.cos.acg.ual.es/") String ccFileType,
      @WebParam(name = "ccFileURI", targetNamespace = "http://ws.cos.acg.ual.es/") String ccFileURI);

  @WebMethod(operationName = "exportACFromURI", action = "exportACFromURI")
  public String exportACFromURI(
      @WebParam(name = "acFileType", targetNamespace = "http://ws.cos.acg.ual.es/") String acFileType,
      @WebParam(name = "acFileURI", targetNamespace = "http://ws.cos.acg.ual.es/") String acFileURI);

  @WebMethod(operationName = "exportCCFromString", action = "exportCCFromString")
  public String exportCCFromString(
      @WebParam(name = "ccFileType", targetNamespace = "http://ws.cos.acg.ual.es/") String ccFileType,
      @WebParam(name = "ccFileString", targetNamespace = "http://ws.cos.acg.ual.es/") String ccFileString);

  @WebMethod(operationName = "exportACFromString", action = "exportACFromString")
  public String exportACFromString(
      @WebParam(name = "acFileType", targetNamespace = "http://ws.cos.acg.ual.es/") String acFileType,
      @WebParam(name = "acFileString", targetNamespace = "http://ws.cos.acg.ual.es/") String acFileString);

  @WebMethod(operationName = "withdrawCC", action = "withdrawCC")
  public String withdrawCC(@WebParam(name = "ccID", targetNamespace = "http://ws.cos.acg.ual.es/") String ccID);

  @WebMethod(operationName = "withdrawAC", action = "withdrawAC")
  public String withdrawAC(@WebParam(name = "acID", targetNamespace = "http://ws.cos.acg.ual.es/") String acID);

  @WebMethod(operationName = "registerExampleCC", action = "registerExampleCC")
  public void registerExampleCC();

  @WebMethod(operationName = "registerExampleAC", action = "registerExampleAC")
  public void registerExampleAC();

}
