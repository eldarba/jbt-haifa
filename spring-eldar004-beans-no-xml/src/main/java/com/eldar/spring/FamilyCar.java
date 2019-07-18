package com.eldar.spring;

public class FamilyCar implements Car {

	// fields
	private Horn horn;
	private int speed;

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// CTOR
	public FamilyCar(Horn horn) {
		super();
		this.horn = horn;
	}

	// methods
	@Override
	public String startDriving() {
		return "Family car start driving safely... at " + speed + " km/h";
	}

	@Override
	public String startHonking() {
		return horn.honk();
	}

}
