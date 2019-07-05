package es.ual.acg.cos.trader.heuristics.astar;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ccmm.ConcreteComponentSpecification;

public class NavNode extends Node {
  
  private Position position;
  private List<String> extraData;
  private List<ConcreteComponentSpecification> ccsList;
  
  public NavNode() {
    ccsList = new ArrayList<ConcreteComponentSpecification>();
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public List<String> getExtraData() {
    return extraData;
  }

  public void setExtraData(List<String> extraData) {
    this.extraData = extraData;
  }

  public List<ConcreteComponentSpecification> getCcsList() {
    return ccsList;
  }

  public void setCcsList(List<ConcreteComponentSpecification> ccsList) {
    this.ccsList = ccsList;
  } 
  
  public void addCC2CCsList(ConcreteComponentSpecification ccs) {
    
    //ConcreteComponentSpecification newCcs = EcoreUtil.copy(ccs);
    //this.ccsList.add(newCcs);
    this.ccsList.add(ccs);
  }

}
