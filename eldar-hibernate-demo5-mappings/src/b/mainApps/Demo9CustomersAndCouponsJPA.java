package b.mainApps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;
import a.entities.Coupon;
import a.entities.Customer;
import a.entities.Manager;
import a.entities.Review;

public class Demo9CustomersAndCouponsJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = new Configuration().configure()

				.addAnnotatedClass(Company.class)

				.addAnnotatedClass(Address.class).addAnnotatedClass(Manager.class)

				.addAnnotatedClass(Coupon.class)

				.addAnnotatedClass(Customer.class)

				.addAnnotatedClass(Review.class)

				.buildSessionFactory();
		// session is an extension of EntityManager
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		try {
			/////////////////

			Coupon coupon = new Coupon("GAMES");
			entityManager.persist(coupon);

			Customer customer = new Customer("Dani", "dani@mail");
			customer.addCoupon(coupon);
			entityManager.persist(customer);

			entityManager.detach(coupon);

			/////////////////
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
