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
@Order(2)
public class App2 implements ApplicationContextAware, CommandLineRunner {

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
		System.out.println("starting app2...");
		System.out.println("\n\n==========================");

		StudentDAO dao = ctx.getBean("studentDAOJpaImpl", StudentDAO.class);
		Student student = dao.findById(5);
		System.out.println("found: " + student);

		System.out.println("==========================\n\n");

	}

}
