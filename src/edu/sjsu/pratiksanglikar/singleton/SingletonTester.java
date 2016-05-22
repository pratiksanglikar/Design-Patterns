package edu.sjsu.pratiksanglikar.singleton;

public class SingletonTester {

	public static void main(String[] args) {
		Singleton firstInstance = Singleton.getInstance();
		System.out.println("Creating first instance: \t" + firstInstance);
		Singleton secondInstance = Singleton.getInstance();
		System.out.println("Creating second instance: \t" + secondInstance);
	}
}
