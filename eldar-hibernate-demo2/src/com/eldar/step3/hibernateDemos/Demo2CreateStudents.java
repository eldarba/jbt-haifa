package com.eldar.step3.hibernateDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Student;

public class Demo2CreateStudents {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			// get a session from the session factory
			Session session = factory.getCurrentSession();
			// create a student
			Student student1 = new Student("Ran", "ran@email");
			Student student2 = new Student("Ziv", "ziv@email");
			Student student3 = new Student("Hanna", "hanna@email");

			try {
				// start a transaction
				session.beginTransaction();
				// add students to the database
				session.save(student1);
				session.save(student2);
				session.save(student3);
				session.getTransaction().commit();
				System.out.println(student1 + " added to db");
				System.out.println(student2 + " added to db");
				System.out.println(student3 + " added to db");
			} catch (Exception e) {
				session.getTransaction().rollback();
			}

		}
	}

}
