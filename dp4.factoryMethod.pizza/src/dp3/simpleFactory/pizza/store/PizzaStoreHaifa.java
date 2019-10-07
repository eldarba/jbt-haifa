package dp3.simpleFactory.pizza.store;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.PizzaCheeseHaifa;
import dp3.simpleFactory.pizza.PizzaOliveHaifa;
import dp3.simpleFactory.pizza.PizzaVeggieHaifa;

public class PizzaStoreHaifa extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheeseHaifa();
			break;
		case "olive":
			pizza = new PizzaOliveHaifa();
			break;
		case "veggie":
			pizza = new PizzaVeggieHaifa();
			break;

		default:
			throw new RuntimeException("invalid pizza type: " + type);
		}

		return pizza;
	}

}
