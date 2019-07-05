package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "acOperationID", "ccOperationID",
    "ccInterfaceID", "inputType", "outputType" })
public class MatchedOperationInfo {

  String acOperationID;
  //String acInterfaceID;
  String ccOperationID;
  String ccInterfaceID;
  String inputType;
  String outputType;

  public String getAcOperationID() {
    return acOperationID;
  }

  public void setAcOperationID(String acOperationID) {
    this.acOperationID = acOperationID;
  }

  /*public String getAcInterfaceID() {
    return acInterfaceID;
  }

  public void setAcInterfaceID(String acInterfaceID) {
    this.acInterfaceID = acInterfaceID;
  }*/

  public String getCcOperationID() {
    return ccOperationID;
  }

  public void setCcOperationID(String ccOperationID) {
    this.ccOperationID = ccOperationID;
  }

  public String getCcInterfaceID() {
    return ccInterfaceID;
  }

  public void setCcInterfaceID(String ccInterfaceID) {
    this.ccInterfaceID = ccInterfaceID;
  }

  public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public String getOutputType() {
    return outputType;
  }

  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }

}
