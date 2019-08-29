package b.mainApps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import a.entities.Address;
import a.entities.Company;
import a.entities.Coupon;
import a.entities.Customer;
import a.entities.Manager;
import a.entities.Review;

public class Demo8CustomersAndCoupons {

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
			/////////////////
			String hql = "from Customer";
			Query<Customer> query = session.createQuery(hql, Customer.class);
			List<Customer> customers = query.getResultList();
			System.out.println("customers:");
			System.out.println(customers);

			String hql2 = "from Coupon";
			Query<Coupon> query2 = session.createQuery(hql2, Coupon.class);
			List<Coupon> coupons = query2.getResultList();
			System.out.println("coupons:");
			System.out.println(coupons);

			Coupon coupon = new Coupon("GAMES");
			session.save(coupon);

			Customer customer = new Customer("Dani", "dani@mail");
			customer.addCoupon(coupon);
			session.save(customer);

			session.evict(coupon);

			/////////////////
			session.getTransaction().commit();
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
