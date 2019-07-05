package es.ual.acg.cos.trader.configs.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.configs.service.ManageArchitectures;

@RestController
@RequestMapping("/")
public class ManageArchitecturesController {

  @Autowired
  ManageArchitectures mngArch;

  private static final Logger LOGGER = Logger.getLogger(ManageArchitecturesController.class);

  @PostMapping("/concretearchitectures")
  public String exportCAMFromString(@RequestParam String camFileType, @RequestParam String camFileString) {

    String result = "No results obtained";

    result = mngArch.exportCAMFromString(camFileType, camFileString);

    LOGGER.info("[ManageArchitecturesController - exportCAMFromString] result: " + result);

    return result;
  }

  @PostMapping("/abstractarchitectures")
  public String exportAAMFromString(@RequestParam String aamFileType, @RequestParam String aamFileString) {

    String result = "No results obtained";

    result = mngArch.exportAAMFromString(aamFileType, aamFileString);

    LOGGER.info("[ManageArchitecturesController - exportAAMFromString] result: " + result);

    return result;
  }

  @DeleteMapping("/concretearchitectures")
  public String withdrawCAM(@RequestParam String camID) {

    String result = "No results obtained";

    result = mngArch.withdrawCAM(camID);

    LOGGER.info("[ManageArchitecturesController - withdrawCAM] result: " + result);

    return result;
  }

  @DeleteMapping("/abstractarchitectures")
  public String withdrawAAM(@RequestParam String aamID) {

    String result = "No results obtained";

    result = mngArch.withdrawAAM(aamID);

    LOGGER.info("[ManageArchitecturesController - withdrawAAM] result: " + result);

    return result;
  }

}
