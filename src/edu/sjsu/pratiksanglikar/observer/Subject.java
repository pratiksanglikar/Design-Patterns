package edu.sjsu.pratiksanglikar.observer;

public interface Subject {
	public void attach(WeatherObserver observer);
	public void detach(WeatherObserver observer);
	public void notifyAllObservers();
}
