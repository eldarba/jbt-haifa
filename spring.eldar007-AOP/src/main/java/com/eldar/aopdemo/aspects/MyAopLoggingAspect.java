package com.eldar.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAopLoggingAspect {

	// advice:
	// @Before("execution(* add*(com.eldar.aopdemo.dao.Coupon, ..))")
	@Before("execution(* add*(..))")
	public void beforeAddCouponAdvice() {
		System.out.println("===> performing @Before advice on addCoupon()");
	}
}
