package com.eldar.observers;

import com.eldar.subject.Car;

/**
 * define the observer: here we define methods for events we want to be observed
 */
public interface CarObserver {

	void carStarted(Car car);

	void carStopped(Car car);

	void carGasAllert(Car car);

	void carSpeedAllert(Car car);

}
