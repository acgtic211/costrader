package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger", "acNumDependencies",
    "ccNumDependencies", "matchedDependencies" })
public class DependenciesInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private int acNumDependencies;
  private int ccNumDependencies;
  private int matchedDependencies;

  public double getRatio() {
    return ratio;
  }

  public void setRatio(double ratio) {
    this.ratio = ratio;
  }

  public LargerType getLarger() {
    return larger;
  }

  public void setLarger(LargerType larger) {
    this.larger = larger;
  }

  public IntersectionType getIntersection() {
    return intersection;
  }

  public void setIntersection(IntersectionType intersection) {
    this.intersection = intersection;
  }

  public int getAcNumDependencies() {
    return acNumDependencies;
  }

  public void setAcNumDependencies(int acNumDependencies) {
    this.acNumDependencies = acNumDependencies;
  }

  public int getCcNumDependencies() {
    return ccNumDependencies;
  }

  public void setCcNumDependencies(int ccNumDependencies) {
    this.ccNumDependencies = ccNumDependencies;
  }

  public int getMatchedDependencies() {
    return matchedDependencies;
  }

  public void setMatchedDependencies(int matchedDependencies) {
    this.matchedDependencies = matchedDependencies;
  }

}
