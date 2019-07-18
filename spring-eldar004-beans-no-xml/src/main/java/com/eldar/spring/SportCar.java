package com.eldar.spring;

public class SportCar implements Car {

	// fields
	private Horn horn;
	private int speed;

	@Override
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// // CTOR
	// public SportCar(Horn horn) {
	// super();
	// this.horn = horn;
	// }

	// methods
	@Override
	public String startDriving() {
		return "Sport car start driving FAST!";
	}

	@Override
	public String startHonking() {
		return horn.honk();
	}

}
