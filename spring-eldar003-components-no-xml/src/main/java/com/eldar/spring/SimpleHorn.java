package com.eldar.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // the default implementation (without qualifier)
public class SimpleHorn implements Horn {

	@Override
	public String honk() {
		return "bip... bip... simple";
	}

}
