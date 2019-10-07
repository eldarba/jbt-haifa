package dp3.simpleFactory.pizza.store;

import dp3.simpleFactory.pizza.Pizza;

public abstract class PizzaStore {

	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// this is the factory method - implementation always changes
	public abstract Pizza createPizza(String type);

}
