package edu.sjsu.pratiksanglikar.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Pizza pizza1 = new TomatoSauce(new MozarellaCheese(new PlainPizza()));
		Pizza pizza2 = new ExtraMeat(new MozarellaCheese(new PlainPizza()));
		Pizza pizza3 = new TomatoSauce(new ExtraMeat(new MozarellaCheese(new PlainPizza())));
		
		System.out.println("\nPizza 1");
		System.out.println("Price: " + pizza1.getPrice() + "\t Description: " + pizza1.getDescription());

		System.out.println("\nPizza 2");
		System.out.println("Price: " + pizza2.getPrice() + "\t Description: " + pizza2.getDescription());
		
		System.out.println("\nPizza 3");
		System.out.println("Price: " + pizza3.getPrice() + "\t Description: " + pizza3.getDescription());
	}
}
