package a.person;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class PersonConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(PersonConfig.class);

		Person p = ctx.getBean(Person.class);
		System.out.println(p);

		ctx.close();
	}

}
