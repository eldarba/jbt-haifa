package a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp1Singleton {

	// private static Logger logger =
	// Logger.getLogger(MainApp1Singleton.class.getName());

	public static void main(String[] args) {

		System.out.println("test start");

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			MySingleton s1 = ctx.getBean(MySingleton.class);
			MySingleton s2 = ctx.getBean(MySingleton.class);
			s1.speak();
			s2.speak();
		}

		System.out.println("test end");

	}

}
