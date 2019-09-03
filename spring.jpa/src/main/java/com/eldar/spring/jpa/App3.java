package com.eldar.spring.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.jpa.dao.StudentDAO;
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

		StudentDAO dao = ctx.getBean("studentDAOJpaImpl", StudentDAO.class);
		Student student1 = new Student("aaa", "aaaMail");
		Student student2 = new Student("bbb", "bbbMail");
		Student student3 = new Student("ccc", "cccMail");

		dao.save(student1);
		dao.save(student2);
		dao.save(student3);

		System.out.println("==========================\n\n");

	}

}
