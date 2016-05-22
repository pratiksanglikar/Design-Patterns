package edu.sjsu.pratiksanglikar.proxy;

public class AccessProxy implements Proxy {

	private RealSubject subject;
	
	public AccessProxy() {
		subject = new RealSubject();
	}
	
	@Override
	public String getData(String authToken) {
		if(authToken.equalsIgnoreCase("ABCDEFG")) {
			return subject.getData();
		} else {
			return "Unauthorized!";
		}
	}

	@Override
	public void setData(String authToken, String data) {
		if(authToken.equalsIgnoreCase("ABCDEFG")) {
			subject.setData(data);
		} else {
			System.out.println("Unauthorized!");
		}
	}
}