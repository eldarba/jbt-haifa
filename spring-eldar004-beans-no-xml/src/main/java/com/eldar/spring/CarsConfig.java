package com.eldar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("a") // current package
public class CarsConfig {

	@Bean
	public Horn simpleHorn() {
		return new SimpleHorn();
	}

	@Bean("theSlowCar")
	@Scope("singleton")
	public Car familyCar() {
		Car car = new FamilyCar(simpleHorn());
		car.setSpeed(20);
		return car;
	}

	@Bean("theFastCar")
	public Car fastCar() {
		Car car = new FamilyCar(simpleHorn());
		car.setSpeed(120);
		return car;
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(CarsConfig.class);

		Car car1 = ctx.getBean("theSlowCar", Car.class);
		Car car2 = ctx.getBean("theFastCar", Car.class);
		System.out.println(car1 == car2);
		System.out.println(car1.startDriving());
		System.out.println(car2.startDriving());
		ctx.close();
	}
}
