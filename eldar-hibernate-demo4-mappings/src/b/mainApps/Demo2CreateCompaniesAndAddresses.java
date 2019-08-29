package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;

public class Demo2CreateCompaniesAndAddresses {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Address.class)

				.addAnnotatedClass(Company.class)

				.buildSessionFactory()) {

			Session session = factory.getCurrentSession();
			try {
				session.beginTransaction();
				//////////////////
				// create companies
				Company c1 = new Company("Samsung", "sam@email");
				Company c2 = new Company("Tadiran", "tad@email");
				// set companies address
				c1.setAddress(new Address("Tel Aviv", "Israel"));
				c2.setAddress(new Address("Haifa", "Israel"));
				// save (persist)
				session.save(c1);
				session.save(c2);
				//////////////////
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}

		}
	}

}
