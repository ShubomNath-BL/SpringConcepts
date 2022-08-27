package com.demo.springConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springConcepts.component.DemoBeam;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Hello to the spring boot project");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBeam demoBeam = context.getBean(DemoBeam.class);
		System.out.println("Demo Bean : "+demoBeam.toString());
		System.out.println("\n**** Example of using multiple annotation ****");
	}

}
