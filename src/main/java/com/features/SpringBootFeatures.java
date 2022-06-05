
package com.features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootFeatures {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeatures.class, args); //
		System.out.println(SpringBootFeatures.class.getSimpleName() + "Server started successfully!!");

	}

}
