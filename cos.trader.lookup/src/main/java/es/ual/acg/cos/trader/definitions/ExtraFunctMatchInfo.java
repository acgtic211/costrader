package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger", "dependencies",
    "properties" })
public class ExtraFunctMatchInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private DependenciesInfo dependencies;
  private PropertiesInfo properties;

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

  public DependenciesInfo getDependencies() {
    return dependencies;
  }

  public void setDependencies(DependenciesInfo dependencies) {
    this.dependencies = dependencies;
  }

  public PropertiesInfo getProperties() {
    return properties;
  }

  public void setProperties(PropertiesInfo properties) {
    this.properties = properties;
  }

}
