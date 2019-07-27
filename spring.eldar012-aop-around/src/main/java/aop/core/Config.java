package aop.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aop.core.dao.TraficService;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

	public static void main(String[] args) {

		System.out.println("start of main app");

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {

			TraficService traficService = ctx.getBean(TraficService.class);
			String forcast = traficService.displayTraficForcast();
			System.out.println(forcast);

		}
		System.out.println("end of main app");
	}

}
