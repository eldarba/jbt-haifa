package com.spring.eldar.EldarDemo.rest;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestService {

	@Value("${company.name}")
	private String companyName;
	@Value("${company.address}")
	private String companyAddress;

	// expose an endpoint that returns a message
	@GetMapping("/")
	public String sayHello() {
		return "Hello World of Spring Boot:  " + LocalTime.now() + " company: " + 
	companyName + " at: " + companyAddress;
	}
	
	@GetMapping("/speak")
	public String speak() {
		return "bla bla";
	}
	@GetMapping("/rand")
	public String rand() {
		int x = (int) (Math.random()*101);
		return "Your lucky number is: " + x;
	}
	
	
}
