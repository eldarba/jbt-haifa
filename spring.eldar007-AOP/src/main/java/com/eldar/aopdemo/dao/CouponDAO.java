package com.eldar.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CouponDAO {

	public void addCoupon(Coupon coupon) {
		System.out.println(getClass().getSimpleName() + ": Adding a coupon to the database");
	}

	public void addCoupon(Coupon coupon, boolean discount) {
		System.out.println(getClass().getSimpleName() + ": Adding a coupon to the database");
	}

}
