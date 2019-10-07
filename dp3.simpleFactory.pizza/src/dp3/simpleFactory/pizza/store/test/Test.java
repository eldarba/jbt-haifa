package dp3.simpleFactory.pizza.store.test;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.SimplePizzaFactory;
import dp3.simpleFactory.pizza.store.PizzaStore;

public class Test {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);
	}

}
