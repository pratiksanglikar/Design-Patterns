package edu.sjsu.pratiksanglikar.proxy;

public class RealSubject {
	
	private String data = "Hi, There!";
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
