package com.eldar.step3.hibernateDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Student;

public class Demo1CreateStudent {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			// get a session from the session factory
			Session session = factory.getCurrentSession();
			// create a student
			Student student = new Student("Dan", "dan@email");
			// start a transaction
			session.beginTransaction();
			// add a student to the database
			session.save(student);
			session.getTransaction().commit();
			System.out.println(student + " added to db");
		}
	}

}
