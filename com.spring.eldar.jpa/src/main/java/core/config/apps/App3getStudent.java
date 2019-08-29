package core.config.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import core.config.AppConfig;
import core.config.Student;
import core.config.StudentDao;

public class App3getStudent {

	public static void main(String[] args) {

		// start Spring application context to get Spring beans
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			StudentDao studentDao = ctx.getBean(StudentDao.class);
			Student student = new Student("David Kohen", "david@mail.com");
			student.setId(1);

			studentDao.updateStudent(student);
			System.out.println(student + " updated");
		}

	}

}
