package dp3.simpleFactory.pizza;

public class PizzaVeggie extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare veggie pizza");
	}

	@Override
	public void bake() {
		System.out.println("bake veggie pizza");
	}

	@Override
	public void cut() {
		System.out.println("cut veggie pizza");
	}

	@Override
	public void box() {
		System.out.println("box veggie pizza");
	}

}
