package com.eldar;

public class SportCar implements Car {
	
private Horn horn;
	
	public SportCar(Horn horn) {
		super();
		this.horn = horn;
	}

	@Override
	public String startDriving() {
		return "SportCar - Start driving fast!";
	}
	
	@Override
	public String startHonking() {
		return horn.honk();
	}

}
