package com.eldar.step3.hibernateDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Student;

public class Demo3ReadStudent {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			// get a session from the session factory
			Session session = factory.getCurrentSession();
			// create a student

			try {
				// start a transaction
				session.beginTransaction();
				System.out.println("get student with id 4");
				Student student = session.get(Student.class, 4);
				System.out.println(student);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}

		}
	}

}
