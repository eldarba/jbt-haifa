package com.eldar.step3.hibernateDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Student;

public class Demo6UpdateStudents {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			// get a session from the session factory
			Session session = factory.getCurrentSession();
			// create a student

			try {
				// start a transaction
				session.beginTransaction();
				// set all emails to aaa&bbb
				session.createQuery("update Student set email='aaa@bbb'").executeUpdate();
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}

		}
	}

}
