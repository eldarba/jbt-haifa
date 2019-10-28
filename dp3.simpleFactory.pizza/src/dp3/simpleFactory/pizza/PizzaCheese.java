package dp3.simpleFactory.pizza;

public class PizzaCheese extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("bake cheese pizza");
	}

	@Override
	public void cut() {
		System.out.println("cut cheese pizza");
	}

	@Override
	public void box() {
		System.out.println("box cheese pizza");
	}

}
