
package es.ual.acg.cos.trader.heuristics.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import architectural_metamodel.AbstractArchitecturalModel;
import es.ual.acg.cos.trader.heuristics.repository.ManageDB;
import es.ual.acg.cos.trader.heuristics.service.Heuristics;

@RestController
@RequestMapping("/")
public class HeuristicsController {

  @Autowired
  Heuristics heuristics;
  
  private static final Logger LOGGER = Logger.getLogger(HeuristicsController.class);
  
  @PostMapping("/ratioFFactor")
  public void setRatioFFactor(@RequestParam double ratioFunctionalFactor) {
    heuristics.setRatioFFactor(ratioFunctionalFactor);
  }

  @PostMapping("/ratioEFFactor")
  public void setRatioEFFactor(@RequestParam double ratioExtraFuncionalFactor) {
    heuristics.setRatioEFFactor(ratioExtraFuncionalFactor);
  }

  @PostMapping("/ratioPFactor")
  public void setRatioPFactor(@RequestParam double ratioPackagingFactor) {
    heuristics.setRatioPFactor(ratioPackagingFactor);    
  }

  @PostMapping("/ratioMFactor")
  public void setRatioMFactor(@RequestParam double ratioMarketingFactor) {
    heuristics.setRatioMFactor(ratioMarketingFactor);    
  }

  @GetMapping("/ratioFFactor")
  public double getRatioFFactor() {
    return heuristics.getRatioFFactor();
  }

  @GetMapping("/ratioEFFactor")
  public double getRatioEFFactor() {
    return heuristics.getRatioEFFactor();
  }

  @GetMapping("/ratioPFactor")
  public double getRatioPFactor() {
    return heuristics.getRatioPFactor();
  }

  @GetMapping("/ratioMFactor")
  public double getRatioMFactor() {
    return heuristics.getRatioMFactor();
  }
  
  @PostMapping("/solveCAMv5")
  public String solveCAMv5(@RequestParam AbstractArchitecturalModel aam) {
    LOGGER.info("aam: " + aam);
    LOGGER.info("aam id: " + aam.getAamID());
    return heuristics.solveCAMv5(aam);    
  }

  @PostMapping("/solveCAMv5simulation")
  public void solveCAMv5simulation(@RequestParam AbstractArchitecturalModel aam) {
    heuristics.solveCAMv5simulation(aam);
  }
  
  
//@PostMapping("/solveCAMv6")
//public List<String> solveCAMv6(AbstractArchitecturalModel aam) {
//  return heuristics.solveCAMv6(aam);  
//}

  @PostMapping("/solveCAMv6")
  public List<String> solveCAMv6(String aamID) {
    return heuristics.solveCAMv6(aamID);  
  }  
  

//  @PostMapping("/solveCAMv6simulation")
//  public void solveCAMv6simulation(AbstractArchitecturalModel aam) {
//    heuristics.solveCAMv6simulation(aam);
//  }
  
  @PostMapping("/solveCAMv6simulation")
  public void solveCAMv6simulation(@RequestParam String aamID, @RequestParam int gIncrement) {
    heuristics.solveCAMv6simulation(aamID, gIncrement);
  }
  

}
