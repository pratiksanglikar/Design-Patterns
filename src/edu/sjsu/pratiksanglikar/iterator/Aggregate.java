package edu.sjsu.pratiksanglikar.iterator;

public interface Aggregate {
	public void executeQuery(String query);
	public Iterator createIterator();
}
