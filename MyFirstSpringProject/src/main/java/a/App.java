package a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = ctx.getBean("thePerson", Person.class);
		System.out.println(p);
		ctx.close();
	}

}
