package dp2.decorator.cofee.decorators;

import dp2.decorator.cofee.Beverage;

// decorators (condiment) wrap base object (beverage)
public class Soya extends CondimentDecorator {

	private Beverage beverage;

	public Soya(Beverage beverage) {
		this.description = "Soya";
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.30;
	}

}
