package edu.sjsu.pratiksanglikar.iterator;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {

	ArrayList<String> list = new ArrayList<String>(0);
	
	@Override
	public void executeQuery(String query) {
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");		
		list.add("Item 5");		
		list.add("Item 6");		
		list.add("Item 7");		
		list.add("Item 8");		
		list.add("Item 9");		
		list.add("Item 10");		
		list.add("Item 11");		
		list.add("Item 12");		
		list.add("Item 13");
		return ;
	}
	
	public Iterator createIterator() {
		return new ConcreteIterator(list);
	}

}
