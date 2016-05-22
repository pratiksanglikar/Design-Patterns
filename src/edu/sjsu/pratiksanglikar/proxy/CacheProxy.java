package edu.sjsu.pratiksanglikar.proxy;

public class CacheProxy implements Proxy {

	private RealSubject subject;
	private String cache = null;
	
	public CacheProxy() {
		subject = new RealSubject();
	}
	
	@Override
	public String getData(String authToken) {
		if(cache != null) {
			System.out.println("Cache hit!");
			return cache;
		} else {
			System.out.println("Cache miss!");
			cache = subject.getData();
			return cache;
		}
	}

	@Override
	public void setData(String authToken, String data) {
		cache = data;
		subject.setData(data);
	}
}