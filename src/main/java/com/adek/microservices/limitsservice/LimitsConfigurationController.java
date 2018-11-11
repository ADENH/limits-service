package com.adek.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adek.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limitsproperties")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromclass() {
		return new LimitConfiguration(1000,100);
	}
	
	
}
