package edu.sjsu.pratiksanglikar.strategy;

public class StrategyTester {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		((Dog) dog).bark();
		((Bird) bird).chirp();
		
		dog.fly();
		bird.fly();
	}
}
