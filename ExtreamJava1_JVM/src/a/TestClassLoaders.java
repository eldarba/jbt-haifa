package a;

import sun.net.spi.nameservice.dns.DNSNameService;

public class TestClassLoaders {

	public static void main(String[] args) {
		ClassLoader cl = String.class.getClassLoader();
		System.out.println(cl);
		cl = A.class.getClassLoader();
		System.out.println(cl);
		cl = DNSNameService.class.getClassLoader();
		System.out.println(cl);

	}
}
