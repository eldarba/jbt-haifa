package dp3.simpleFactory.pizza.store;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.SimplePizzaFactory;

public class PizzaStore {

	private SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
