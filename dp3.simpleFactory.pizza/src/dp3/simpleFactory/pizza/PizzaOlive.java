package dp3.simpleFactory.pizza;

public class PizzaOlive extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare Olive pizza");
	}

	@Override
	public void bake() {
		System.out.println("bake Olive pizza");
	}

	@Override
	public void cut() {
		System.out.println("cut Olive pizza");
	}

	@Override
	public void box() {
		System.out.println("box Olive pizza");
	}

}
