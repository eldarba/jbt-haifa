package aop.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class LoggingAspect1 {

	@Before("MyPointcuts.AllDaoPackageNoGetSet()")
	public void logging(JoinPoint jp) {
		System.out.println("===> logging advice: " + jp.getSignature());
	}

}
