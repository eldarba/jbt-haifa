package com.eldar;

public class FamilyCar implements Car {

	private Horn horn;
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String startDriving() {
		return color + " FamilyCar - Start driving safely";
	}

	@Override
	public String startHonking() {
		return horn.honk();
	}

	public void setHorn(Horn horn) {
		this.horn = horn;
	}

}
