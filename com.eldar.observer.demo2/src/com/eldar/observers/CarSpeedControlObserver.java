package com.eldar.observers;

import com.eldar.subject.Car;

public class CarSpeedControlObserver extends CarObserverAdapter {

	@Override
	public void carSpeedAllert(Car car) {
		car.setSpeed(Car.MAX_SPEED);
		System.out.println(">>>speed conntrol corrected speed to " + Car.MAX_SPEED);
	}

}
