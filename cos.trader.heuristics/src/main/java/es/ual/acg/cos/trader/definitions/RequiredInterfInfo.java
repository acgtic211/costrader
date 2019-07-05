package es.ual.acg.cos.trader.definitions;

import java.util.List;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger",
    "acNumRequiredInterfaces", "ccNumRequiredInterfaces",
    "matchedRequiredInterfaces", "involvedRequiredInterfaces",
    "acNumRequiredOperations", "ccNumRequiredOperations",
    "matchedRequiredOperations", "matchedInterface" })
public class RequiredInterfInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private int acNumRequiredInterfaces;
  private int ccNumRequiredInterfaces;
  private int matchedRequiredInterfaces;
  private int involvedRequiredInterfaces;
  private int acNumRequiredOperations;
  private int ccNumRequiredOperations;
  private int matchedRequiredOperations;
  private List<MatchedInterfaceInfo> matchedInterface;

  public int getMatchedRequiredOperations() {
    return matchedRequiredOperations;
  }

  public void setMatchedRequiredOperations(int matchedRequiredOperations) {
    this.matchedRequiredOperations = matchedRequiredOperations;
  }

  public List<MatchedInterfaceInfo> getMatchedInterface() {
    return matchedInterface;
  }

  public void setMatchedInterface(List<MatchedInterfaceInfo> matchedInterface) {
    this.matchedInterface = matchedInterface;
  }

  public double getRatio() {
    return ratio;
  }

  public void setRatio(double ratio) {
    this.ratio = ratio;
  }

  public IntersectionType getIntersection() {
    return intersection;
  }

  public void setIntersection(IntersectionType intersection) {
    this.intersection = intersection;
  }

  public LargerType getLarger() {
    return larger;
  }

  public void setLarger(LargerType larger) {
    this.larger = larger;
  }

  public int getAcNumRequiredInterfaces() {
    return acNumRequiredInterfaces;
  }

  public void setAcNumRequiredInterfaces(int acNumRequiredInterfaces) {
    this.acNumRequiredInterfaces = acNumRequiredInterfaces;
  }

  public int getCcNumRequiredInterfaces() {
    return ccNumRequiredInterfaces;
  }

  public void setCcNumRequiredInterfaces(int ccNumRequiredInterfaces) {
    this.ccNumRequiredInterfaces = ccNumRequiredInterfaces;
  }

  public int getMatchedRequiredInterfaces() {
    return matchedRequiredInterfaces;
  }

  public void setMatchedRequiredInterfaces(int matchedRequiredInterfaces) {
    this.matchedRequiredInterfaces = matchedRequiredInterfaces;
  }

  public int getAcNumRequiredOperations() {
    return acNumRequiredOperations;
  }

  public void setAcNumRequiredOperations(int acNumRequiredOperations) {
    this.acNumRequiredOperations = acNumRequiredOperations;
  }

  public int getCcNumRequiredOperations() {
    return ccNumRequiredOperations;
  }

  public void setCcNumRequiredOperations(int ccNumRequiredOperations) {
    this.ccNumRequiredOperations = ccNumRequiredOperations;
  }

  public int getInvolvedRequiredInterfaces() {
    return involvedRequiredInterfaces;
  }

  public void setInvolvedRequiredInterfaces(int involvedRequiredInterfaces) {
    this.involvedRequiredInterfaces = involvedRequiredInterfaces;
  }

}
