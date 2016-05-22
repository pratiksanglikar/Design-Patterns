package edu.sjsu.pratiksanglikar.adapter;

public class AdapterTester {

	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		for (int i = 0; i < 10; i++) {
			System.out.println("Cube of " + i + " is " + target.getCube(i));
		}
	}
}
