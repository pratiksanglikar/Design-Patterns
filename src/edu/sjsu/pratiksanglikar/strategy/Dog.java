package edu.sjsu.pratiksanglikar.strategy;

public class Dog extends Animal {
	
	public Dog() {
		super.setFlyingStrategy(new CantFly());
	}
	
	public void bark(){
		System.out.println("Barking!");
	}
}
