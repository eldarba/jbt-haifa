package core.config.apps;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.config.AppConfig;
import core.config.dao.StudentDao;
import core.config.entities.Student;

public class App4getAllStudents {

	public static void main(String[] args) {

		// start Spring application context to get Spring beans
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			StudentDao studentDao = ctx.getBean(StudentDao.class);
			List<Student> students = studentDao.getAllStudents();
			System.out.println("=== students ===");
			for (Student student : students) {
				System.out.println(student);
			}
		}

	}

}
