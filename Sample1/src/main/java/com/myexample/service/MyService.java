package com.myexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	Logger logger = LoggerFactory.getLogger(MyService.class);
	
	public Message<?> myMethod(Message<?> message) {
		logger.info("in service method :: {}", message.getPayload());
		return message;
	}
}
