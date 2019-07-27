package c.animals.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import a.person.Person;
import b.animals.Animal;

@Configuration
@ComponentScan({ "b", "a.person" }) // specify packages to scan
public class AnimalsConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AnimalsConfig.class);
		Animal animal;
		animal = ctx.getBean("dog", Animal.class);
		System.out.println(animal.speak());

		Person p = ctx.getBean("person", Person.class);
		System.out.println(p);

		ctx.close();
	}

}
