package es.ual.acg.cos.trader.register.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.ual.acg.cos.trader.definitions.ConcreteComponentInfo;

@FeignClient("COS-TRADER-LOOKUP")
public interface LookupClient {

  @PostMapping("/query")
	public List<ConcreteComponentInfo> query(@RequestParam String messageQuery);

  @PostMapping("/queryindex")
  public List<ConcreteComponentInfo> queryIndex(@RequestParam String messageQuery, @RequestParam int firstResult, @RequestParam int maxResult);
	
	

}
