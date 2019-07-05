package es.ual.acg.cos.trader.definitions;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MatchingInfo")
@XmlType(propOrder = {"acID", "ccID", "ratio", "intersection", "larger",
    "functionalMatchInfo", "extraFunctionalMatchInfo", 
    "packagingMatchInfo", "marketingMatchInfo"})
public class MatchingInfo {
  
  private String acID;
  private String ccID;
  
  private double ratio;
  private IntersectionType intersection;
  private LargerType larger;
  
  private FunctMatchInfo functionalMatchInfo;
  private ExtraFunctMatchInfo extraFunctionalMatchInfo;
  private PackMatchInfo packagingMatchInfo;
  private MarkMatchInfo marketingMatchInfo;
  
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
  
  @XmlElement(name="FunctionalMatchInfo")
  public FunctMatchInfo getFunctionalMatchInfo() {
    return functionalMatchInfo;
  }

  public void setFunctionalMatchInfo(FunctMatchInfo functionalMatchInfo) {
    this.functionalMatchInfo = functionalMatchInfo;
  }

  @XmlElement(name="ExtraFunctionalMatchInfo")
  public ExtraFunctMatchInfo getExtraFunctionalMatchInfo() {
    return extraFunctionalMatchInfo;
  }

  public void setExtraFunctionalMatchInfo(
      ExtraFunctMatchInfo extraFunctionalMatchInfo) {
    this.extraFunctionalMatchInfo = extraFunctionalMatchInfo;
  }

  @XmlElement(name="PackagingMatchInfo")
  public PackMatchInfo getPackagingMatchInfo() {
    return packagingMatchInfo;
  }

  public void setPackagingMatchInfo(PackMatchInfo packagingMatchInfo) {
    this.packagingMatchInfo = packagingMatchInfo;
  }

  @XmlElement(name="MarketingMatchInfo")
  public MarkMatchInfo getMarketingMatchInfo() {
    return marketingMatchInfo;
  }

  public void setMarketingMatchInfo(MarkMatchInfo marketingMatchInfo) {
    this.marketingMatchInfo = marketingMatchInfo;
  }
  public String getAcID() {
    return acID;
  }
  public void setAcID(String acID) {
    this.acID = acID;
  }
  public String getCcID() {
    return ccID;
  }
  public void setCcID(String ccID) {
    this.ccID = ccID;
  }
  
}
