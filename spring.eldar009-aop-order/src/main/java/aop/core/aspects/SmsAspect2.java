package aop.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class SmsAspect2 {

	@Before("MyPointcuts.AllDaoPackageNoGetSet()")
	public void smsAlert(JoinPoint jp) {
		System.out.println("===> smsAlert advice: " + jp.getSignature());
	}

}
