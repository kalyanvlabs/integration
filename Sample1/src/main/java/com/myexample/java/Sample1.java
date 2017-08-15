package com.myexample.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableAutoConfiguration
@IntegrationComponentScan
@EnableIntegration
@ImportResource(value = "sample1-config.xml")
public class Sample1 {

	public static void main(String[] args) {
		SpringApplication.run(Sample1.class, args);
	}

}
