package b.mainApps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Address;
import a.entities.Company;
import a.entities.Coupon;
import a.entities.Customer;
import a.entities.Manager;
import a.entities.Review;

public class Demo7CreateReviewByCustomer {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()

				.addAnnotatedClass(Company.class)

				.addAnnotatedClass(Address.class).addAnnotatedClass(Manager.class)

				.addAnnotatedClass(Coupon.class)

				.addAnnotatedClass(Customer.class)

				.addAnnotatedClass(Review.class)

				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		try {
			System.out.println("table created");
//			Coupon coupon = new Coupon("FOOD");
//			Review review = new Review("This is a great coupon");
//			coupon.addReview(review);
//			session.save(coupon);
//			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (factory != null) {
				factory.close();
			}
		}
	}

}
