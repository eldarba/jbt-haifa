package b.mainApps;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Coupon;
import a.entities.Employee;

public class Demo2CreateDatesAndEmployees {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Coupon.class).buildSessionFactory()) {

			Session session = factory.getCurrentSession();
			try {
				session.beginTransaction();
				//////////////////
				// create employee
				Employee emp1 = new Employee("Dov", "Navon", "aaaMail");
				System.out.println(emp1);
				// create coupon
				String title = "FOOD";
				double price = 45.36;
				Date startDate = java.sql.Date.valueOf("2019-5-2");
				Date endDate = java.sql.Date.valueOf("2020-5-2");
				Coupon cp1 = new Coupon(title, price, startDate, endDate);
				System.out.println(cp1);

				// persist the entities
				session.save(emp1);
				session.save(cp1);

				System.out.println(emp1);
				System.out.println(cp1);

				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
