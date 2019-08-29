package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Coupon;
import a.entities.Employee;

public class Demo1CreateTables {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Coupon.class).buildSessionFactory()) {

			Session session = factory.getCurrentSession();
			try {
				session.beginTransaction();
				//////////////////

				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
