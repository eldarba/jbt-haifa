package dp2.decorator.cofee;

public class Tea extends Beverage {

	public Tea() {
		this.description = "Tea";
	}

	@Override
	public double cost() {
		return 5.20;
	}

}
