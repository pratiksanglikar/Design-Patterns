package edu.sjsu.pratiksanglikar.composite;

public class CompositeTester {

	public static void main(String[] args) {
		Component order = BuildOrder.getOrder();
		order.printDescription();
	}
}