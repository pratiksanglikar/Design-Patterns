package edu.sjsu.pratiksanglikar.decorator;

public abstract class ToppingDecorator implements Pizza {
	
	private Pizza basicPizza;
	
	public ToppingDecorator(Pizza pizza) {
		basicPizza = pizza;
	}
 
	@Override
	public String getDescription() {
		return basicPizza.getDescription();
	}

	@Override
	public double getPrice() {
		return basicPizza.getPrice();
	}
}
