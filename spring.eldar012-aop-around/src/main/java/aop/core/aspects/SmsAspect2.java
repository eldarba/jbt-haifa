package aop.core.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import aop.core.dao.Company;

@Aspect
@Order(2)
@Component
public class SmsAspect2 {

	@Around("execution(* displayTraficForcast(..))")
	public Object aroundForcastService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// this code runs before
		System.out.println("===>perform @Around on method: " + proceedingJoinPoint.getSignature());
		long ts1 = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		// this code runs after
		long ts2 = System.currentTimeMillis();
		System.out.println("===>perform @Around: total time: " + (ts2 - ts1) / 1000 + " seconds");
		return result;
	}

	@Before("MyPointcuts.AllDaoPackageNoGetSet()")
	public void smsAlert(JoinPoint jp) {
		System.out.println("===> smsAlert advice: " + jp.getSignature());
	}

	@AfterReturning(pointcut = "execution(* readAllCompanies())", returning = "result")
	public void afterReturningReadAllCompanies(JoinPoint jp, List<Company> result) {
		System.out.println("===>perform @AfterReturning on method: " + jp.getSignature());
		System.out.println("===>result : " + result);
		// change the returned data
		for (Company company : result) {
			company.setName(company.getName().toLowerCase());
		}
	}

	@AfterThrowing(pointcut = "execution(* readAllCompanies())", throwing = "error")
	public void afterThrowingReadAllCompanies(JoinPoint jp, Throwable error) {
		System.out.println("===>perform @AfterThrowing on method: " + jp.getSignature());
		System.out.println("===>error : " + error);
	}

	@After("execution(* readAllCompanies())")
	public void afterFinallyReadAllCompanies(JoinPoint jp) {
		System.out.println("===>perform @After finnaly on method: " + jp.getSignature());
	}

}
