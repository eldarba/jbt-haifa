package com.eldar.spring.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.jpa.dao.StudentRepository;
import com.eldar.spring.jpa.entities.Student;

@SpringBootApplication
@Order(0)
public class App3 implements ApplicationContextAware, CommandLineRunner {

	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}

	@Override
	public void run(String... args) throws Exception {
		main(args);
	}

	public static void main(String[] args) {
		System.out.println("starting app3...");
		System.out.println("\n\n==========================");

		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		Student student1 = new Student("aaa", "aaaMail");
		Student student2 = new Student("bbb", "bbbMail");
		Student student3 = new Student("ccc", "cccMail");

//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);

		System.out.println("==========================\n\n");

	}

}
