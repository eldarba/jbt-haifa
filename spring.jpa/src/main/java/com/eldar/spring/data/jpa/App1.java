package com.eldar.spring.data.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;

import com.eldar.spring.data.jpa.dao.StudentDAO;
import com.eldar.spring.data.jpa.entities.Student;

@Order(2)
@SpringBootApplication
public class App1 implements ApplicationContextAware, CommandLineRunner {

	private static ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		main(args);

	}

	public static void main(String[] args) {
		System.out.println("============== start app 1...");
		StudentDAO studentDAO = ctx.getBean(StudentDAO.class);
		Student student1 = new Student("aaa", "aaaMail");
		Student student2 = new Student("bbb", "bbbMail");
//		studentDAO.save(student1);
//		studentDAO.save(student2);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;

	}

}
