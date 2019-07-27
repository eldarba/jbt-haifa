package com.eldar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SportCar implements Car {

	// fields
	@Autowired
	@Qualifier("fancyHorn")
	private Horn horn;

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
