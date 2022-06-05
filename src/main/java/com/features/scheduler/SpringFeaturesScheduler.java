package com.features.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SpringFeaturesScheduler {

	//@Scheduled(cron = "*/1 * * * * *")
	//or
	//@Scheduled(cron = "@hourly")
	public void scheduler() {
		System.out.println("hello");
	}
	
	//More details here -> https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/support/CronExpression.html
}
