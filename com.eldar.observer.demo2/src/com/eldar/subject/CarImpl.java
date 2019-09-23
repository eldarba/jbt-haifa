package com.eldar.subject;

import java.util.ArrayList;
import java.util.List;

import com.eldar.observers.CarObserver;

public class CarImpl implements Car {

	// the observers / listeners of this car
	private List<CarObserver> carObservers = new ArrayList<>();
	// car attributes
	private boolean started;
	private int speed;
	private int gasLevel;

	@Override
	public void start() {
		started = true;

		for (CarObserver carObserver : carObservers) {
			if (carObserver != null) {
				carObserver.carStarted(this);
				if (this.gasLevel <= 0) {
					carObserver.carGasAllert(this);
				}
			}
		}

	}

	@Override
	public void go(int speed) {
		if (started) {
			setSpeed(speed);
			setGasLevel(getGasLevel() - 5);
		} else {
			System.out.println("car not started");
		}

	}

	@Override
	public void addCarObserver(CarObserver carObserver) {
		carObservers.add(carObserver);

	}

	@Override
	public void stop() {
		this.started = false;
		setSpeed(0);
		for (CarObserver carObserver : carObservers) {
			if (carObserver != null) {
				carObserver.carStopped(this);
			}
		}

	}

	public boolean isStarted() {
		return started;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		if (speed > MAX_SPEED) {
			for (CarObserver carObserver : carObservers) {
				if (carObserver != null) {
					carObserver.carSpeedAllert(this);
				}
			}
		}
	}

	public int getGasLevel() {
		return gasLevel;
	}

	public void setGasLevel(int gasLevel) {
		this.gasLevel = gasLevel < 0 ? 0 : gasLevel;
		if (gasLevel == 0) {
			for (CarObserver carObserver : carObservers) {
				if (carObserver != null) {
					carObserver.carGasAllert(this);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "CarImpl [started=" + started + ", speed=" + speed + ", gasLevel=" + gasLevel + "]";
	}

}
