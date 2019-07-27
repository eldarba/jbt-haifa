package a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp2Prototype {

	// private static Logger logger =
	// Logger.getLogger(MainApp1Singleton.class.getName());

	public static void main(String[] args) {

		System.out.println("test start");

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			MyProto p1 = ctx.getBean(MyProto.class);
			MyProto p2 = ctx.getBean(MyProto.class);
			MyProto p3 = ctx.getBean(MyProto.class);
			p1.speak();
			p2.speak();
			p3.speak();
		}

		System.out.println("test end");

	}

}
