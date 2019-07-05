package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger", "implementation",
    "location" })
public class PackMatchInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private ImplementationInfo implementation;
  private LocationInfo location;

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

  public ImplementationInfo getImplementation() {
    return implementation;
  }

  public void setImplementation(ImplementationInfo implementation) {
    this.implementation = implementation;
  }

  public LocationInfo getLocation() {
    return location;
  }

  public void setLocation(LocationInfo location) {
    this.location = location;
  }

}
