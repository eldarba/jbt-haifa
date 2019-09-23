package com.eldar;

import com.eldar.observers.CarObserverImpl;
import com.eldar.observers.CarSpeedControlObserver;
import com.eldar.subject.CarImpl;

public class CarApp {

	public static void main(String[] args) throws InterruptedException {

		CarImpl car = new CarImpl();
		// register Car (subject) with CarObservable (observable)
		car.addCarObserver(new CarObserverImpl());
		car.addCarObserver(new CarSpeedControlObserver());

		System.out.println("car created");
		System.out.println(car);
		Thread.sleep(3000);

		System.out.println("add gas");
		car.setGasLevel(10);
		System.out.println("start the car");
		car.start();
		System.out.println(car);
		Thread.sleep(3000);

		System.out.println("go");
		car.go(100);
		System.out.println(car);
		Thread.sleep(3000);

		System.out.println("go");
		car.go(200);
		System.out.println(car);
		Thread.sleep(3000);

		System.out.println("stop the car");
		car.stop();
		System.out.println(car);

	}

}
