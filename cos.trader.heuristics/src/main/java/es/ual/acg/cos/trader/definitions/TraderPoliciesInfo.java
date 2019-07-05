package es.ual.acg.cos.trader.definitions;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "" })
public class TraderPoliciesInfo {

  private boolean allowsSoftNumberComponents;
  private boolean allowsSoftProvStructure;
  private boolean allowsSoftReqStructure;
  private boolean allowsExtraReqNoDep;
  private double ratioPropMatching;
  private double maxSearchTime;


}
