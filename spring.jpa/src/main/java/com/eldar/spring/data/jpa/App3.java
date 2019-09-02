package com.eldar.spring.data.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.data.jpa.dao.StudentDAO;
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
		System.out.println("============== start app 2...");
		StudentDAO studentDAO = ctx.getBean(StudentDAO.class);
		Student std = studentDAO.findById(5);
		System.out.println(std);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;

	}

}
