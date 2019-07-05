package es.ual.acg.cos.trader.lookup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExampleController {
	
	@RequestMapping("/")
	public @ResponseBody String sayHello() {
		return "Hello Lookup!";
	}
	

}
