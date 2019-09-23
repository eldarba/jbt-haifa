package com.eldar.subject;

import com.eldar.observers.CarObserver;

/**
 * define the subject: here we define a method to add observers. possibly we
 * define basic car methods
 */
public interface Car {

	int MAX_SPEED = 150;

	// a method to add observers to this subject
	void addCarObserver(CarObserver carObserver);

	// basic car methods
	void start();

	void go(int speed);

	void stop();

	int getSpeed();

	void setSpeed(int speed);
}
