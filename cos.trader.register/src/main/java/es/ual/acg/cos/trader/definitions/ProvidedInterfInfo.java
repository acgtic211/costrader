package es.ual.acg.cos.trader.definitions;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger",
    "acNumProvidedInterfaces", "ccNumProvidedInterfaces",
    "matchedProvidedInterfaces", "involvedProvidedInterfaces",
    "acNumProvidedOperations", "ccNumProvidedOperations",
    "matchedProvidedOperations", "matchedInterface" })
public class ProvidedInterfInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private int acNumProvidedInterfaces;
  private int ccNumProvidedInterfaces;
  private int matchedProvidedInterfaces;
  private int involvedProvidedInterfaces;
  private int acNumProvidedOperations;
  private int ccNumProvidedOperations;
  private int matchedProvidedOperations;
  private List<MatchedInterfaceInfo> matchedInterface;

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

  public int getAcNumProvidedInterfaces() {
    return acNumProvidedInterfaces;
  }

  public void setAcNumProvidedInterfaces(int acNumProvidedInterfaces) {
    this.acNumProvidedInterfaces = acNumProvidedInterfaces;
  }

  public int getCcNumProvidedInterfaces() {
    return ccNumProvidedInterfaces;
  }

  public void setCcNumProvidedInterfaces(int ccNumProvidedInterfaces) {
    this.ccNumProvidedInterfaces = ccNumProvidedInterfaces;
  }

  public int getMatchedProvidedInterfaces() {
    return matchedProvidedInterfaces;
  }

  public void setMatchedProvidedInterfaces(int matchedProvidedInterfaces) {
    this.matchedProvidedInterfaces = matchedProvidedInterfaces;
  }

  public int getAcNumProvidedOperations() {
    return acNumProvidedOperations;
  }

  public void setAcNumProvidedOperations(int acNumProvidedOperations) {
    this.acNumProvidedOperations = acNumProvidedOperations;
  }

  public int getCcNumProvidedOperations() {
    return ccNumProvidedOperations;
  }

  public void setCcNumProvidedOperations(int ccNumProvidedOperations) {
    this.ccNumProvidedOperations = ccNumProvidedOperations;
  }

  public List<MatchedInterfaceInfo> getMatchedInterface() {
    return matchedInterface;
  }

  public void setMatchedInterface(List<MatchedInterfaceInfo> matchedInterface) {
    this.matchedInterface = matchedInterface;
  }

  public int getMatchedProvidedOperations() {
    return matchedProvidedOperations;
  }

  public void setMatchedProvidedOperations(int matchedProvidedOperations) {
    this.matchedProvidedOperations = matchedProvidedOperations;
  }

  public int getInvolvedProvidedInterfaces() {
    return involvedProvidedInterfaces;
  }

  public void setInvolvedProvidedInterfaces(int involvedProvidedInterfaces) {
    this.involvedProvidedInterfaces = involvedProvidedInterfaces;
  }

}
