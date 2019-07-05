
package es.ual.acg.cos.trader.configs.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.configs.service.Configs;

@RestController
@RequestMapping("/")
public class ConfigsController {

  private static final Logger LOGGER = Logger.getLogger(ConfigsController.class);

  @Autowired
  Configs configs;

  @PostMapping("/solveCAMv5")
  public String solveCAMv5(@RequestParam String aamID) {

    return configs.solveCAMv5(aamID);

  }

  @PostMapping("/solveCAMv6")
  public List<String> solveCAMv6(@RequestParam String aamID) {

    return configs.solveCAMv6(aamID);

  }

  @PostMapping("/simulateConfigsv5")
  public void simulateConfigsv5(@RequestParam int iterations) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 0; j < iterations; j++) {
        this.solveCAMv5simulation("AAM_example" + i);
      }
    }
    LOGGER.info("TEST v5 finished");
  }

  @PostMapping("/simulateConfigsv6")
  public void simulateConfigsv6(@RequestParam int iterations, @RequestParam int gIncrement) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 0; j < iterations; j++) {
        this.solveCAMv6simulation("AAM_example" + i, gIncrement);
      }
    }
    LOGGER.info("TEST v6 finished");

  }

  private void solveCAMv5simulation(String aamID) {

    configs.solveCAMv5simulation(aamID);

  }

  private void solveCAMv6simulation(String aamID, int gIncrement) {

    configs.solveCAMv6simulation(aamID, gIncrement);

  }
  
  

}
