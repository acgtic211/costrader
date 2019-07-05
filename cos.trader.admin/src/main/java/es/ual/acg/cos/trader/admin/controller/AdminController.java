package es.ual.acg.cos.trader.admin.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.ual.acg.cos.trader.admin.service.Admin;
import es.ual.acg.cos.trader.definitions.HeuristicsParamsInfo;

@RestController
@RequestMapping("/")
public class AdminController {

  @Autowired
  Admin admin;

  private static final Logger LOGGER = Logger.getLogger(AdminController.class);

  @PostMapping("/heuristicsParams")
  public String setHeuristicsParams(@RequestParam HeuristicsParamsInfo hpInfo) {

    String result = "No results obtained";

    result = admin.setHeuristicsParams(hpInfo);

    LOGGER.info("[AdminWS - setHeuristicsParams] result: " + result);

    return result;
  }

  @GetMapping("/heuristicsParams")
  public HeuristicsParamsInfo getHeuristicsParams() {

    return admin.getHeuristicsParams();
  }

}