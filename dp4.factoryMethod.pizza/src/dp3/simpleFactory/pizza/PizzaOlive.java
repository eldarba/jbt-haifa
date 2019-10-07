package dp3.simpleFactory.pizza;

public class PizzaOlive extends Pizza {

	protected String description = "Olive Pizza";

	@Override
	public void prepare() {
		System.out.println("prepare " + description);
	}

	@Override
	public void bake() {
		System.out.println("bake " + description);
	}

	@Override
	public void cut() {
		System.out.println("cut " + description);
	}

	@Override
	public void box() {
		System.out.println("box " + description);
	}

}
