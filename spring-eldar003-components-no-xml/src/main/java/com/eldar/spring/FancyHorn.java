package com.eldar.spring;

import org.springframework.stereotype.Component;

@Component
public class FancyHorn implements Horn {

	@Override
	public String honk() {
		return "bip... bip... FANCY";
	}

}
