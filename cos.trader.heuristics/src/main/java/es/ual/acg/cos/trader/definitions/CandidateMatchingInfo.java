package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ccID", "ratioTotal", "ratioFunctional",
    "ratioExtraFunctional", "ratioPackaging", "ratioMarketing"})
public class CandidateMatchingInfo implements Comparable<CandidateMatchingInfo> {

  private String ccID;
  private double ratioTotal;
  private double ratioFunctional;
  private double ratioExtraFunctional;
  private double ratioPackaging;
  private double ratioMarketing;

  public String getCcID() {
    return ccID;
  }

  public void setCcID(String ccID) {
    this.ccID = ccID;
  }

  public double getRatioTotal() {
    return ratioTotal;
  }

  public void setRatioTotal(double ratioTotal) {
    this.ratioTotal = ratioTotal;
  }

  public double getRatioFunctional() {
    return ratioFunctional;
  }

  public void setRatioFunctional(double ratioFunctional) {
    this.ratioFunctional = ratioFunctional;
  }

  public double getRatioExtraFunctional() {
    return ratioExtraFunctional;
  }

  public void setRatioExtraFunctional(double ratioExtraFunctional) {
    this.ratioExtraFunctional = ratioExtraFunctional;
  }

  public double getRatioPackaging() {
    return ratioPackaging;
  }

  public void setRatioPackaging(double ratioPackaging) {
    this.ratioPackaging = ratioPackaging;
  }

  public double getRatioMarketing() {
    return ratioMarketing;
  }

  public void setRatioMarketing(double ratioMarketing) {
    this.ratioMarketing = ratioMarketing;
  }

  public int compareTo(CandidateMatchingInfo other) {

    double comparedRatio = other.getRatioTotal();
    return (int) ((comparedRatio * 100) - ratioTotal * 100);
  }



}
