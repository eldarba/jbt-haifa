package com.eldar.spring.jpa;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.jpa.dao.StudentDAO;
import com.eldar.spring.jpa.entities.Student;

@SpringBootApplication
@Order(1)
public class App1 implements ApplicationContextAware, CommandLineRunner {

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
		System.out.println("starting app1...");
		System.out.println("\n\n==========================");
		StudentDAO dao = ctx.getBean("studentDAOJpaImpl", StudentDAO.class);
		List<Student> students = dao.findAll();
		System.out.println("====== students:");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("==========================\n\n");
	}

}
