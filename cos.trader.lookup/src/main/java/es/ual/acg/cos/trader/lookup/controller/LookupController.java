package es.ual.acg.cos.trader.lookup.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ccmm.ConcreteComponentSpecification;
import ccmm.impl.ConcreteComponentSpecificationImpl;
import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;
import es.ual.acg.cos.trader.lookup.service.Lookup;

@RestController
@RequestMapping("/")
public class LookupController {

  @Autowired
  Lookup lookup;

  private static final Logger LOGGER = Logger.getLogger(LookupController.class);

  @PostMapping("/queryid")
  public List<String> queryId(@RequestParam String messageQuery) {
    List<String> result = null;
    List<ConcreteComponentSpecification> list = lookup.queryAnt(messageQuery);
    result = new ArrayList<String>();
    Iterator<ConcreteComponentSpecification> it = list.iterator();
    while (it.hasNext()) {
      ConcreteComponentSpecification aux = it.next();
      result.add(aux.getComponentID());
    }
    // result = result.substring(0,result.length()-1);

    LOGGER.info("[Lookup - query] result: " + result);

    return result;

  }

  @PostMapping("/queryAnt")
  public List<ConcreteComponentSpecification> queryAnt(@RequestParam String messageQuery) {
    return lookup.queryAnt(messageQuery);
  }
  
  @PostMapping("/queryindexAnt")
  public List<ConcreteComponentSpecification> queryIndexAnt(@RequestParam String messageQuery, @RequestParam int firstResult, @RequestParam int maxResult) {
    return lookup.queryAnt(messageQuery, firstResult, maxResult);
  }
  
  @PostMapping("/query")
  public List<ConcreteComponentInfo> query(@RequestParam String messageQuery) {
    return lookup.query(messageQuery);
  }

  @PostMapping("/queryindex")
  public List<ConcreteComponentInfo> queryIndex(@RequestParam String messageQuery, @RequestParam int firstResult, @RequestParam int maxResult) {
    return lookup.query(messageQuery, firstResult, maxResult);
  }

}