package com.eldar.spring.jpa;

import java.util.Optional;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.jpa.dao.StudentRepository;
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

		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		int id = 4;
		Optional<Student> result = studentRepository.findById(id);
		System.out.println(result);
		if (result.isPresent()) {
			Student student = result.get();
			System.out.println("found: " + student);
		} else {
			System.out.println("student " + id + " not found");
		}

		System.out.println("==========================\n\n");

	}

}
