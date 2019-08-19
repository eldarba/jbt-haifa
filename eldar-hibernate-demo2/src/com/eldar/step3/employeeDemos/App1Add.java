package com.eldar.step3.employeeDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eldar.step2.hibernateEntityClass.Employee;

public class App1Add {

	public static void main(String[] args) {

//		Configuration config = new Configuration();
//		config = config.configure("hibernate.cfg.xml");
//		config.addAnnotatedClass(Employee.class);
//		SessionFactory factory1 = config.buildSessionFactory();

		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();
				// what we want to do
				Employee employee = new Employee("Avi", "Levi", "Samsung");
				session.save(employee);
				System.out.println(employee + " added");
				//
				session.getTransaction().commit();
			} catch (Exception e) {
				if (session != null) {
					session.getTransaction().rollback();
				}
			}
		}

	}

}
