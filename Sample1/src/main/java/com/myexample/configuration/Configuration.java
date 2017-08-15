package com.myexample.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component

public class Configuration {
	
	Logger logger = LoggerFactory.getLogger(Configuration.class);

	@Bean
	public Message<?> createMyName(Message<?> message) {
		logger.info("Input in config :: {}", message.getPayload());
		return message;
	}
	
	/*@Bean
	public IntegrationFlow testFlow() {
		return null;
	}*/
	
}
