package edu.sjsu.pratiksanglikar.observer;

public class ObserverTester {

	public static void main(String[] args) {
		Subject weatherSubject = new WeatherSubject();
		WeatherObserver observer1 = new ConcreteWeatherObserver(weatherSubject);
		WeatherObserver observer2 = new ConcreteWeatherObserver2(weatherSubject);
		
		((WeatherSubject) weatherSubject).setHumidity(12.43);
		((WeatherSubject) weatherSubject).setTemperature(63);
		
		weatherSubject.detach(observer2);
		
		((WeatherSubject) weatherSubject).setHumidity(19);
		((WeatherSubject) weatherSubject).setTemperature(72);
		
		weatherSubject.attach(observer2);
		
		((WeatherSubject) weatherSubject).setHumidity(12);
		((WeatherSubject) weatherSubject).setTemperature(69);
		
		weatherSubject.detach(observer1);
		
		((WeatherSubject) weatherSubject).setHumidity(13);
		((WeatherSubject) weatherSubject).setTemperature(67);
	}
}
