package aop.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class AnalyticsAspect3 {

	@Before("MyPointcuts.AllDaoPackageNoGetSet()")
	public void apiAnalytics(JoinPoint jp) {
		System.out.println("===> apiAnalytics advice: " + jp.getSignature());
	}

}
