package es.ual.acg.cos.trader.admin.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ual.acg.cos.trader.admin.clients.HeuristicsClient;
import es.ual.acg.cos.trader.definitions.HeuristicsParamsInfo;
import es.ual.acg.cos.trader.definitions.TraderPoliciesInfo;

@Service
public class Admin {

  @Autowired
  HeuristicsClient heuristics;

  private static final Logger LOGGER = Logger.getLogger(Admin.class);

  public String setTraderPolicies(TraderPoliciesInfo tpInfo) {

    return null;
  }

  public TraderPoliciesInfo getTraderPoliciesInfo() {

    return null;
  }

  public String setHeuristicsParams(HeuristicsParamsInfo hpInfo) {

    String message = "[Admin - setHeuristicsParams] operation failed";

    if ((hpInfo.getRatioFunctionalFactor() + hpInfo.getRatioExtraFuncionalFactor() + hpInfo.getRatioPackagingFactor()
        + hpInfo.getRatioMarketingFactor()) == 1) {

      heuristics.setRatioFFactor(hpInfo.getRatioFunctionalFactor());
      heuristics.setRatioEFFactor(hpInfo.getRatioExtraFuncionalFactor());
      heuristics.setRatioPFactor(hpInfo.getRatioPackagingFactor());
      heuristics.setRatioMFactor(hpInfo.getRatioMarketingFactor());

      message = "[Admin - setHeuristicsParams] parameters changed correctly";
      LOGGER.info(message);

    } else {
      message = "[Admin - setHeuristicsParams] The sum of the factors must be 1";
      LOGGER.info(message);
    }

    return message;

  }

  public HeuristicsParamsInfo getHeuristicsParams() {

    HeuristicsParamsInfo hpInfo = new HeuristicsParamsInfo();

    hpInfo.setRatioFunctionalFactor(heuristics.getRatioFFactor());
    hpInfo.setRatioExtraFuncionalFactor(heuristics.getRatioEFFactor());
    hpInfo.setRatioPackagingFactor(heuristics.getRatioPFactor());
    hpInfo.setRatioMarketingFactor(heuristics.getRatioMFactor());

    return hpInfo;

  }

}
