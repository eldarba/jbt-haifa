package com.eldar.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eldar.aopdemo.dao.CompanyDAO;
import com.eldar.aopdemo.dao.Coupon;
import com.eldar.aopdemo.dao.CouponDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
			CouponDAO couponDAO = ctx.getBean(CouponDAO.class);
			CompanyDAO companyDAO = ctx.getBean(CompanyDAO.class);
			// call the business method
			Coupon coupon = new Coupon();
			boolean isDiscount = true;
			couponDAO.addCoupon(coupon, isDiscount);
			companyDAO.addCompany();
		}
	}

}
