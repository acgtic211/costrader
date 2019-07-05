package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratio", "intersection", "larger", 
    "acNumProperties", "ccNumProperties", "matchedProperties", 
    "acNumPropertiesLow", "matchedPropertiesLow",
    "acNumPropertiesNormal", "matchedPropertiesNormal",
    "acNumPropertiesHigh", "matchedPropertiesHigh" })
public class PropertiesInfo {
  
  private double ratio;  
  private IntersectionType intersection;
  private LargerType larger;
  
  private int acNumProperties;
  private int ccNumProperties;
  private int matchedProperties;
  private int acNumPropertiesLow;
  private int matchedPropertiesLow;
  private int acNumPropertiesNormal;
  private int matchedPropertiesNormal;
  private int acNumPropertiesHigh;
  private int matchedPropertiesHigh;
  
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
  public int getAcNumProperties() {
    return acNumProperties;
  }
  public void setAcNumProperties(int acNumProperties) {
    this.acNumProperties = acNumProperties;
  }
  public int getCcNumProperties() {
    return ccNumProperties;
  }
  public void setCcNumProperties(int ccNumProperties) {
    this.ccNumProperties = ccNumProperties;
  }
  public int getMatchedProperties() {
    return matchedProperties;
  }
  public void setMatchedProperties(int matchedProperties) {
    this.matchedProperties = matchedProperties;
  }
  public int getAcNumPropertiesLow() {
    return acNumPropertiesLow;
  }
  public void setAcNumPropertiesLow(int acNumPropertiesLow) {
    this.acNumPropertiesLow = acNumPropertiesLow;
  }
  public int getMatchedPropertiesLow() {
    return matchedPropertiesLow;
  }
  public void setMatchedPropertiesLow(int matchedPropertiesLow) {
    this.matchedPropertiesLow = matchedPropertiesLow;
  }
  public int getAcNumPropertiesNormal() {
    return acNumPropertiesNormal;
  }
  public void setAcNumPropertiesNormal(int acNumPropertiesNormal) {
    this.acNumPropertiesNormal = acNumPropertiesNormal;
  }
  public int getMatchedPropertiesNormal() {
    return matchedPropertiesNormal;
  }
  public void setMatchedPropertiesNormal(int matchedPropertiesNormal) {
    this.matchedPropertiesNormal = matchedPropertiesNormal;
  }
  public int getAcNumPropertiesHigh() {
    return acNumPropertiesHigh;
  }
  public void setAcNumPropertiesHigh(int acNumPropertiesHigh) {
    this.acNumPropertiesHigh = acNumPropertiesHigh;
  }
  public int getMatchedPropertiesHigh() {
    return matchedPropertiesHigh;
  }
  public void setMatchedPropertiesHigh(int matchedPropertiesHigh) {
    this.matchedPropertiesHigh = matchedPropertiesHigh;
  }
  

}
