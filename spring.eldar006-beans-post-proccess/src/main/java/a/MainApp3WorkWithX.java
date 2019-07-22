package a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp3WorkWithX {

	// private static Logger logger =
	// Logger.getLogger(MainApp1Singleton.class.getName());

	public static void main(String[] args) {

		System.out.println("test start");

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			MyProto p1 = ctx.getBean(MyProto.class);
			MyProto p2 = ctx.getBean(MyProto.class);
			MyProto p3 = ctx.getBean(MyProto.class);
			System.out.println("p1 x = " + p1.getX());
			System.out.println("p2 x = " + p2.getX());
			System.out.println("p3 x = " + p3.getX());

			MySingleton s1 = ctx.getBean(MySingleton.class);
			MySingleton s2 = ctx.getBean(MySingleton.class);
			MySingleton s3 = ctx.getBean(MySingleton.class);

			System.out.println("s1 x = " + s1.getX());
			System.out.println("s2 x = " + s2.getX());
			System.out.println("s3 x = " + s3.getX());

			System.out.println("=========");
			p1.setX(p1.getX() - 1);
			System.out.println("p1 x = " + p1.getX());
			System.out.println("p2 x = " + p2.getX());
			System.out.println("=========");
			s1.setX(s1.getX() - 1);
			System.out.println("s1 x = " + s1.getX());
			System.out.println("s2 x = " + s2.getX());
		}

		System.out.println("test end");

	}

}
