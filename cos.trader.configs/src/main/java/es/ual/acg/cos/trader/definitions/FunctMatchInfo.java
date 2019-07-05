package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger", "provided",
    "required" })
public class FunctMatchInfo {

  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;

  private ProvidedInterfInfo provided;
  private RequiredInterfInfo required;

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

  public ProvidedInterfInfo getProvided() {
    return provided;
  }

  public void setProvided(ProvidedInterfInfo provided) {
    this.provided = provided;
  }

  public RequiredInterfInfo getRequired() {
    return required;
  }

  public void setRequired(RequiredInterfInfo required) {
    this.required = required;
  }

}
