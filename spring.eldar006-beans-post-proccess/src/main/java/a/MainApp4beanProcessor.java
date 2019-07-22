package a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp4beanProcessor {

	public static void main(String[] args) {

		System.out.println("test start");

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			// create 2 MyProto beans
			MyProto p1 = ctx.getBean(MyProto.class);
			MyProto p2 = ctx.getBean(MyProto.class);
			// print the x value of the beans - how can we make sure x is even?
			System.out.println("p1 x = " + p1.getX());
			System.out.println("p2 x = " + p2.getX());
		}

		System.out.println("test end");

	}

}
