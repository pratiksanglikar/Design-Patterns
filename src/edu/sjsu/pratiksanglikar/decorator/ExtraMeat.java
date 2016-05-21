package edu.sjsu.pratiksanglikar.decorator;

public class ExtraMeat extends ToppingDecorator {

	public ExtraMeat(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + ", Extra Meat";
	}
	
	public double getPrice() {
		return super.getPrice() + 5;
	}
}
