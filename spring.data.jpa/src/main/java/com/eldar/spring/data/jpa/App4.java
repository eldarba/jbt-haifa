package com.eldar.spring.data.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.data.jpa.dao.StudentRepository;

@Order(4)
@SpringBootApplication
public class App4 implements ApplicationContextAware, CommandLineRunner {

	private static ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		main(args);

	}

	public static void main(String[] args) {
		System.out.println("============== start app 4...");
		StudentRepository studentDAO = ctx.getBean(StudentRepository.class);

		int id = 5;
//		Student std = studentDAO.getOne(id);
//		System.out.println(std);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;

	}

}
