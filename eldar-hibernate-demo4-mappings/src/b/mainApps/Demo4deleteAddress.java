package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;

public class Demo4deleteAddress {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Address.class)

				.addAnnotatedClass(Company.class)

				.buildSessionFactory()) {

			Session session = factory.getCurrentSession();
			try {
				session.beginTransaction();
				//////////////////
				// find company
				Company comp = session.get(Company.class, 2);
				// find address
				Address address = comp.getAddress();
				System.out.println(comp);
				System.out.println(address);
				// set company address to null
				comp.setAddress(null);
				session.delete(address);
				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
