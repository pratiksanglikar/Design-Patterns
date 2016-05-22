package edu.sjsu.pratiksanglikar.proxy;

public class ProxyTester {

	public static void main(String[] args) {
		ProxyTester tester = new ProxyTester();
		tester.test();
	}
	
	public void test() {
		Proxy proxy1 = new AccessProxy();
		Proxy proxy2 = new CacheProxy();
		
		System.out.println(proxy1.getData("ABC"));
		System.out.println(proxy1.getData("ABCDEFG"));
		
		System.out.println(proxy2.getData("ABCDEFG"));
		
		proxy1.setData("ABCDEFG", "New Data");
		proxy2.setData("ABCDEFG", "Brand New Data");
		
		System.out.println(proxy2.getData("ABCDEFG"));
	}
}
