package com.eldar.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eldar.Car;

public class App {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			// the implementing type is not hard coded but configured
			Car car1 = ctx.getBean("theCar", Car.class);
			System.out.println(car1.startDriving());
			System.out.println(car1.startHonking());

		}

	}

}
