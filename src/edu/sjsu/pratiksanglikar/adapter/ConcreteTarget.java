package edu.sjsu.pratiksanglikar.adapter;

public class ConcreteTarget implements Target {

	private Adaptee adaptee;
	
	public ConcreteTarget() {
		adaptee = new ConcreteAdaptee();
	}
	@Override
	public int getCube(int n) {
		return adaptee.multiply(n, adaptee.multiply(n, n));
	}

}
