package com.eldar.step3.hibernateDemos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Student;

public class Demo4QueryStudents {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();) {
			// get a session from the session factory
			Session session = factory.getCurrentSession();
			// create a student

			try {
				// start a transaction
				session.beginTransaction();
				System.out.println("get all students");
				// HQL
				List<Student> students = session.createQuery("from Student", Student.class).getResultList();

				// print all students
				System.out.println("\nAll students");
				printStudents(students);

				students = session.createQuery("from Student where name='Dan'", Student.class).getResultList();
				// print all students named Dan
				System.out.println("\nAll students named Dan");
				printStudents(students);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}

		}
	}

	private static void printStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
