package com.eldar.spring.data.jpa;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.data.jpa.dao.StudentRepository;
import com.eldar.spring.data.jpa.entities.Student;

@Order(2)
@SpringBootApplication
public class App2 implements ApplicationContextAware, CommandLineRunner {

	private static ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		main(args);

	}

	public static void main(String[] args) {
		System.out.println("============== start app 2...");
		StudentRepository studentDAO = ctx.getBean(StudentRepository.class);
		List<Student> students = studentDAO.findAll();
		System.out.println("=== students ===");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;

	}

}
