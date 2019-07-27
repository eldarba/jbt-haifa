package aop.core.dao;

import org.springframework.stereotype.Component;

@Component
public class CouponDao {

	public void addCoupon(int id) {
		System.out.println("coupon added to db");
	}

	public void deleteCoupon() {
		System.out.println("coupon deleted from db");
	}

}
