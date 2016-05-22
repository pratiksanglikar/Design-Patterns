package edu.sjsu.pratiksanglikar.iterator;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator {

	private int currentPosition;
	private int max;
	private ArrayList<String> list;
	
	public ConcreteIterator(ArrayList<String> list) {
		this.list = list;
		currentPosition = 0;
		max = list.size() - 1;
	}
	
	@Override
	public boolean hasNext() {
		if(currentPosition <= max) {
			return true;
		}
		return false;
	}

	@Override
	public String next() {
		if(hasNext()){
			return list.get(currentPosition++);
		}
		return null;
	}

	@Override
	public String first() {
		return list.get(0);
	}

	@Override
	public String last() {
		return list.get(max);
	}

}
