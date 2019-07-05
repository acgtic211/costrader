package es.ual.acg.cos.trader.configs.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import architectural_metamodel.AbstractArchitecturalModel;

@FeignClient("COS-TRADER-HEURISTICS")
public interface HeuristicsClient {

  @PostMapping("/ratioFFactor")
  public void setRatioFFactor(@RequestParam double ratioFunctionalFactor);

  @PostMapping("/ratioEFFactor")
  public void setRatioEFFactor(@RequestParam double ratioExtraFuncionalFactor);

  @PostMapping("/ratioPFactor")
  public void setRatioPFactor(@RequestParam double ratioPackagingFactor);

  @PostMapping("/ratioMFactor")
  public void setRatioMFactor(@RequestParam double ratioMarketingFactor);

  @GetMapping("/ratioFFactor")
  public double getRatioFFactor();

  @GetMapping("/ratioEFFactor")
  public double getRatioEFFactor();

  @GetMapping("/ratioPFactor")
  public double getRatioPFactor();

  @GetMapping("/ratioMFactor")
  public double getRatioMFactor();
  
  @PostMapping("/solveCAMv5")
  public String solveCAMv5(@RequestParam AbstractArchitecturalModel aam);

  @PostMapping("/solveCAMv5simulation")
  public void solveCAMv5simulation(@RequestParam AbstractArchitecturalModel aam);

  @PostMapping("/solveCAMv6")
  public List<String> solveCAMv6(@RequestParam String aamID);

  @PostMapping("/solveCAMv6simulation")
  public void solveCAMv6simulation(@RequestParam String aamID, @RequestParam int gIncrement);


}
