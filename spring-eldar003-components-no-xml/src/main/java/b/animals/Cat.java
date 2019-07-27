package b.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public String speak() {
		return "meiw";
	}

}
