package b.animals;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public String speak() {
		return "woof";
	}

}
