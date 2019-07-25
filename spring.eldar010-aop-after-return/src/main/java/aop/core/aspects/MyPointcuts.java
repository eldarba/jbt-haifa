package aop.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyPointcuts {

	@Pointcut("execution(* aop.core.dao.*.*(..))")
	public void forEntirePackage() {
	}

	@Pointcut("execution(* set*(..))")
	public void forSetters() {
	}

	@Pointcut("execution(* get*(..))")
	public void forGetters() {
	}

	@Pointcut("forEntirePackage() && !(forGetters() || forSetters())")
	public void AllDaoPackageNoGetSet() {
	}

}
