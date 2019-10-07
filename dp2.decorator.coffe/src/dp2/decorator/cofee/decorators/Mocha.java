package dp2.decorator.cofee.decorators;

import dp2.decorator.cofee.Beverage;

// decorators (condiment) wrap base object (beverage)
public class Mocha extends CondimentDecorator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.description = "Mocha";
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.70;
	}

}
