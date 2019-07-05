package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ratioFunctionalFactor", "ratioExtraFuncionalFactor",
    "ratioPackagingFactor", "ratioMarketingFactor" })
public class HeuristicsParamsInfo {

  private double ratioFunctionalFactor;
  private double ratioExtraFuncionalFactor;
  private double ratioPackagingFactor;
  private double ratioMarketingFactor;

  public double getRatioFunctionalFactor() {
    return ratioFunctionalFactor;
  }

  public void setRatioFunctionalFactor(double ratioFunctionalFactor) {
    this.ratioFunctionalFactor = ratioFunctionalFactor;
  }

  public double getRatioExtraFuncionalFactor() {
    return ratioExtraFuncionalFactor;
  }

  public void setRatioExtraFuncionalFactor(double ratioExtraFuncionalFactor) {
    this.ratioExtraFuncionalFactor = ratioExtraFuncionalFactor;
  }

  public double getRatioPackagingFactor() {
    return ratioPackagingFactor;
  }

  public void setRatioPackagingFactor(double ratioPackagingFactor) {
    this.ratioPackagingFactor = ratioPackagingFactor;
  }

  public double getRatioMarketingFactor() {
    return ratioMarketingFactor;
  }

  public void setRatioMarketingFactor(double ratioMarketingFactor) {
    this.ratioMarketingFactor = ratioMarketingFactor;
  }

}
