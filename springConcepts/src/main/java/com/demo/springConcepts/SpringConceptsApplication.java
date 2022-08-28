package com.demo.springConcepts;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springConcepts.component.DemoBeam;

import org.slf4j.Logger;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello to the spring boot project");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBeam demoBeam = context.getBean(DemoBeam.class);
		logger.debug("Demo Bean : "+demoBeam.toString());
		logger.debug("\n**** Example of using multiple annotation ****");
	}

}
