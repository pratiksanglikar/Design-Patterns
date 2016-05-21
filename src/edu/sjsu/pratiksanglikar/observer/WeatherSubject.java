package edu.sjsu.pratiksanglikar.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {

	private double temperature;
	private double humidity;
	
	private List<WeatherObserver> observers = null;
	
	public WeatherSubject() {
		this.observers = new ArrayList<WeatherObserver>(0);
	}
			
	@Override
	public void attach(WeatherObserver observer) {
		System.out.println("Attaching Observer : " + observer.getClass().getName());
		this.observers.add(observer);
	}

	@Override
	public void detach(WeatherObserver observer) {
		int index = this.observers.indexOf(observer);
		if(index >= 0) {
			System.out.println("Detaching Observer : " + observer.getClass().getName());
			this.observers.remove(index);
		}
	}

	@Override
	public void notifyAllObservers() {
		for (WeatherObserver observer : observers) {
			observer.update(humidity, temperature);
		}
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		this.notifyAllObservers();
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		this.notifyAllObservers();
	}
}
