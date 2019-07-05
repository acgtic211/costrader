package es.ual.acg.cos.trader.admin.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


}
