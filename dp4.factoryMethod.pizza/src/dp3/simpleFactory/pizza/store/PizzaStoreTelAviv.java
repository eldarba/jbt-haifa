package dp3.simpleFactory.pizza.store;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.PizzaCheeseTelAviv;
import dp3.simpleFactory.pizza.PizzaOliveTelAviv;
import dp3.simpleFactory.pizza.PizzaVeggieTelAviv;

public class PizzaStoreTelAviv extends PizzaStore {

	// factory method
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheeseTelAviv();
			break;
		case "olive":
			pizza = new PizzaOliveTelAviv();
			break;
		case "veggie":
			pizza = new PizzaVeggieTelAviv();
			break;

		default:
			throw new RuntimeException("invalid pizza type: " + type);
		}

		return pizza;
	}

}
