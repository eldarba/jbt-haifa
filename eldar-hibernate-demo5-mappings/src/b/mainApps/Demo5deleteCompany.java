package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;

public class Demo5deleteCompany {

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
				Company comp = session.get(Company.class, 1);
				// find address
				Address address = comp.getAddress();
				System.out.println(comp);
				System.out.println(address);
				// set company address to null
				session.delete(comp);
				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
