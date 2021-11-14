package com.sidecar.spring.demo.SampleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResourceControler {
	
	private Logger logger = LoggerFactory.getLogger(HelloWorldResourceControler.class);
	
	@GetMapping("/helloworld")
	public String getHelloWorld() {
		logger.info(" INFO Hello World from Resource Controller");
		logger.debug(" DEBUG _ Hello World from Resource Controller");
		return "Hello World from Resource Controller";
	}

}
