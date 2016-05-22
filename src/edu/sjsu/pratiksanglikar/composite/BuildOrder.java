package edu.sjsu.pratiksanglikar.composite;

public class BuildOrder {
	
	public static Component getOrder() {
		Component order = new Composite("The Order");
		Component appetizers = new Composite("Appetizers");
		Component mainCourse = new Composite("Main Course");
		Component desserts = new Composite("Desserts");
		
		appetizers.addComponent(new Leaf("Crispy Chicken", 5.99));
		appetizers.addComponent(new Leaf("Crispy Veg", 3.99));
		mainCourse.addComponent(new Leaf("Chicken Tikka", 9.99));
		mainCourse.addComponent(new Leaf("Pork Roast", 11.59));
		desserts.addComponent(new Leaf("Cheese Cake", 5.99));
		order.addComponent(appetizers);
		order.addComponent(mainCourse);
		order.addComponent(desserts);
		return order;
	}
}
