package dp3.simpleFactory.pizza.store;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.PizzaCheeseJerusalem;
import dp3.simpleFactory.pizza.PizzaVeggieJerusalem;

public class PizzaStoreJerusalem extends PizzaStore {

	// factory method
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheeseJerusalem();
			break;
//		case "olive":
//			pizza = new PizzaOliveJerusalem();
//			break;
		case "veggie":
			pizza = new PizzaVeggieJerusalem();
			break;

		default:
			throw new RuntimeException("invalid pizza type: " + type);
		}

		return pizza;
	}

}
