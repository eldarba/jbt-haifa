package com.eldar.observers;

import com.eldar.subject.Car;

public class CarObserverImpl implements CarObserver {

	@Override
	public void carStarted(Car car) {
		System.out.println(">>> car started");
	}

	@Override
	public void carStopped(Car car) {
		System.out.println(">>> car stopped");
	}

	@Override
	public void carGasAllert(Car car) {
		System.out.println(">>> car GAS ALLERT!");
	}

	@Override
	public void carSpeedAllert(Car car) {
		System.out.println(">>> car SPEED ALLERT: " + car.getSpeed());
	}

}
