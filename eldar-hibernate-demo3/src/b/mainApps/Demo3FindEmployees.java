package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Coupon;
import a.entities.Employee;

public class Demo3FindEmployees {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Coupon.class).buildSessionFactory()) {

			Session session = factory.getCurrentSession();
			try {
				session.beginTransaction();
				//////////////////
				int empId = 2;
				Employee emp = session.get(Employee.class, empId);
				if (emp != null) {
					System.out.println("found " + emp);
					emp.setFirstName("Zehava");
				} else {
					System.out.println("employee with id " + empId + " not found");
				}
				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
