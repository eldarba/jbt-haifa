package dp3.simpleFactory.pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new PizzaCheese();
			break;
		case "olive":
			pizza = new PizzaOlive();
			break;
		case "veggie":
			pizza = new PizzaVeggie();
			break;
		default:
			throw new RuntimeException("invalid pizza type: " + type);
		}

		return pizza;
	}

}
