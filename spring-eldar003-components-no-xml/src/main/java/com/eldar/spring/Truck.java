package com.eldar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component() // tell spring its a managed bean
public class Truck implements Car {

	// fields
	@Autowired // without @Qualifier we get the @Primary bean implementation
	private Horn horn;

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
