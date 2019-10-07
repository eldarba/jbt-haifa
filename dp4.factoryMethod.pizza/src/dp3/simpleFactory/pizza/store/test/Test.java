package dp3.simpleFactory.pizza.store.test;

import dp3.simpleFactory.pizza.Pizza;
import dp3.simpleFactory.pizza.store.PizzaStore;
import dp3.simpleFactory.pizza.store.PizzaStoreJerusalem;

public class Test {

	public static void main(String[] args) {

		PizzaStore store = new PizzaStoreJerusalem();
		// cheese, veggie, olive
		Pizza pizza = store.orderPizza("veggie");
		System.out.println(pizza);
	}

}
