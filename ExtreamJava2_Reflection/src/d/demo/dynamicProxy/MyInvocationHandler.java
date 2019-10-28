package d.demo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long ts1 = System.currentTimeMillis();
		Object result = method.invoke(this.target, args);
		long ts2 = System.currentTimeMillis();
		System.out.println("total time taken: " + (ts1 - ts2) + " ms");
		return result;
	}

}
