package edu.sjsu.pratiksanglikar.iterator;

public class IteratorTester {

	public static void main(String[] args) {

		Aggregate aggregate = new ConcreteAggregate();
		aggregate.executeQuery("SELECT ALL");
		Iterator itr = aggregate.createIterator();
		System.out.println(itr.first());
		System.out.println(itr.last() + "\n");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
