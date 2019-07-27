package com.eldar.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eldar.spring.Car;
import com.eldar.spring.CarsConfig;

public class MainApp {

	public static void main(String[] args) {

		// load spring configuration class
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(CarsConfig.class);
		Car car;
		// get the bean from spring container
		car = ctx.getBean("familyCar", Car.class);
		// use the bean
		System.out.println(car.startDriving());
		System.out.println(car.startHonking());

		car = ctx.getBean("sportCar", Car.class);
		System.out.println(car.startDriving());
		System.out.println(car.startHonking());

		car = ctx.getBean("truck", Car.class);
		System.out.println(car.startDriving());
		System.out.println(car.startHonking());

		// close the spring container
		ctx.close();

	}

}
