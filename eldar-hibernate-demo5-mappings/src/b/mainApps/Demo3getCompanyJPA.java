package b.mainApps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;
import a.entities.Coupon;
import a.entities.Manager;

public class Demo3getCompanyJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Address.class)

				.addAnnotatedClass(Company.class)

				.addAnnotatedClass(Manager.class)

				.addAnnotatedClass(Coupon.class)

				.buildSessionFactory();

		EntityManager entityManager = factory.createEntityManager();

		try {
			// session.beginTransaction();
			entityManager.getTransaction().begin();
			//////////////////
			// find company
			int compId = 2;
			// Company comp = session.get(Company.class,compId);
			Company comp = entityManager.find(Company.class, compId);
			if (comp != null) {
				System.out.println("found " + comp);
				System.out.println("at " + comp.getAddress());
			} else {
				System.out.println("company with id " + compId + " not found.");
			}
			//////////////////
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			if (factory != null) {
				factory.close();
			}
		}

	}

}
