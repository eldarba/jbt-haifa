package dp2.decorator.cofee;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "House Blend";
	}

	@Override
	public double cost() {
		return 3.80;
	}

}
