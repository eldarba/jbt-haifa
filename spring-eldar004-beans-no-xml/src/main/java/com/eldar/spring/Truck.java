package com.eldar.spring;

public class Truck implements Car {

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

	// methods
	@Override
	public String startDriving() {
		return "Truck start driving slow...";
	}

	@Override
	public String startHonking() {
		return horn.honk();
	}

}
