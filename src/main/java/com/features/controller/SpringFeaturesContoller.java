package com.features.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.features.SpringBootFeatures;
import com.features.service.SpringFeaturesService;

@RestController
@RequestMapping("/features")
public class SpringFeaturesContoller {

	@Autowired
	SpringFeaturesService springFeaturesService;

	@GetMapping("/health")
	public static String healthCheck() {
		String healthMessage = SpringBootFeatures.class.getSimpleName() + " Server running!!";
		System.out.println(healthMessage);
		return healthMessage;
	}
	
	

}
