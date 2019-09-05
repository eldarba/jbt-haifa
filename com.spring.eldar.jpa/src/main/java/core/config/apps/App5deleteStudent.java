package core.config.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.config.AppConfig;
import core.config.dao.StudentDao;

public class App5deleteStudent {

	public static void main(String[] args) {

		// start Spring application context to get Spring beans
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			StudentDao studentDao = ctx.getBean(StudentDao.class);
			studentDao.deleteStudent(100);
			System.out.println("deleted");
		}

	}

}
