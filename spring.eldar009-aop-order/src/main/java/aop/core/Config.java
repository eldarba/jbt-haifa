package aop.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aop.core.dao.CompanyDao;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			companyDao.addCompany(503);

		}
	}

}
