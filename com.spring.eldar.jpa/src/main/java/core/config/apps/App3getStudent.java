package core.config.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.config.AppConfig;
import core.config.dao.StudentDao;
import core.config.entities.Student;

public class App3getStudent {

	public static void main(String[] args) {

		// start Spring application context to get Spring beans
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			StudentDao studentDao = ctx.getBean(StudentDao.class);
			Student student = studentDao.getStudent(3);

			System.out.println(student);
		}

	}

}
