package com.demo.springConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Hello to the spring boot project");
		SpringApplication.run(SpringConceptsApplication.class, args);
	}

}
