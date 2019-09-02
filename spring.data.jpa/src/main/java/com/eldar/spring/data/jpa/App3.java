package com.eldar.spring.data.jpa;

import java.util.Optional;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.data.jpa.dao.StudentRepository;
import com.eldar.spring.data.jpa.entities.Student;

@Order(3)
@SpringBootApplication
public class App3 implements ApplicationContextAware, CommandLineRunner {

	private static ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		main(args);

	}

	public static void main(String[] args) {
		System.out.println("============== start app 3...");
		StudentRepository studentDAO = ctx.getBean(StudentRepository.class);

		int id = 500;
		Optional<Student> result = studentDAO.findById(id);

		if (result.isPresent()) {
			Student std = result.get();
			System.out.println(std);
		} else {
			System.out.println("student id " + id + " not found");
		}

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;

	}

}
