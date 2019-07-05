package es.ual.acg.cos.trader.definitions;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "acInterfaceID", "ccNumInterfaces", "matchedOperation" })
public class MatchedInterfaceInfo {

  private String acInterfaceID;
  private int ccNumInterfaces;
  private List<MatchedOperationInfo> matchedOperation;

  public List<MatchedOperationInfo> getMatchedOperation() {
    return matchedOperation;
  }

  public void setMatchedOperation(List<MatchedOperationInfo> matchedOperation) {
    this.matchedOperation = matchedOperation;
  }

  public String getAcInterfaceID() {
    return acInterfaceID;
  }

  public void setAcInterfaceID(String acInterfaceID) {
    this.acInterfaceID = acInterfaceID;
  }

  public int getCcNumInterfaces() {
    return ccNumInterfaces;
  }

  public void setCcNumInterfaces(int ccNumInterfaces) {
    this.ccNumInterfaces = ccNumInterfaces;
  }

}
