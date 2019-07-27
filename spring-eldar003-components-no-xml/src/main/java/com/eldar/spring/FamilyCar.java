package com.eldar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component() // tell spring its a managed bean
public class FamilyCar implements Car {

	// fields
	private Horn horn;

	// CTOR
	@Autowired // spring container will inject Horn implementation
	public FamilyCar(@Qualifier("simpleHorn") Horn horn) {
		super();
		this.horn = horn;
	}

	// methods
	@Override
	public String startDriving() {
		return "Family car start driving safely...";
	}

	@Override
	public String startHonking() {
		return horn.honk();
	}

}
