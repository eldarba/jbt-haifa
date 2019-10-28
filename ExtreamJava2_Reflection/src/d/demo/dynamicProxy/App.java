package d.demo.dynamicProxy;

import java.lang.reflect.Proxy;

public class App {

	public static void main(String[] args) {

		Example1 example1 = new Example1();
		MyInvocationHandler h = new MyInvocationHandler(example1);
		Object proxy = Proxy.newProxyInstance(App.class.getClassLoader(), example1.getClass().getInterfaces(), h);
		BasicFunction basicFunction = (BasicFunction) proxy;
		basicFunction.method1();
	}

}
