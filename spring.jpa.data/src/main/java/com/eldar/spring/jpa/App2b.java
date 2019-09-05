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
@Order(5)
public class App2b implements ApplicationContextAware, CommandLineRunner {

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

		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		int id = 4;
		Student s = studentRepository.getOne(id);
		System.out.println("aaa");

		System.out.println("==========================\n\n");

	}

}
