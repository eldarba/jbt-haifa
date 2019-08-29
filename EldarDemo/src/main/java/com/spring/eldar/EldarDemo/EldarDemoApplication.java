package com.spring.eldar.EldarDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * if you hace components defined in another pacage you can still scan them:
 * */
//@SpringBootApplication(scanBasePackages = {"a", "b})


@SpringBootApplication // best practice is that all component are under this package
public class EldarDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldarDemoApplication.class, args);
	}

}
