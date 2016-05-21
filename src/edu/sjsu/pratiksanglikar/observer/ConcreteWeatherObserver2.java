package edu.sjsu.pratiksanglikar.observer;

public class ConcreteWeatherObserver2 implements WeatherObserver {

	private Subject weatherSubject;
	
	public ConcreteWeatherObserver2(Subject weatherSubject) {
		this.weatherSubject = weatherSubject;
		this.weatherSubject.attach(this);
	}
	
	@Override
	public void update(double humidity, double temparature) {
		System.out.println("Observer 2 Reporting");
		System.out.println("Humidity: \t\t\t" + humidity);
		System.out.println("Temperature: \t\t\t" + temparature  + "\n");
	}

}
