package c.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("c.demo.Employee");
			System.out.println(clazz);
			System.out.println(clazz.getName());
			if (clazz.isInterface()) {
				System.out.println("this is an interface");
			} else {
				System.out.println("this is NOT an interface");
			}
			System.out.println("=== " + clazz.getName() + " implements the following interfaces:");
			Class<?>[] interfaces = clazz.getInterfaces();
			for (Class<?> curr : interfaces) {
				System.out.println(curr);
			}
			System.out.println("========================================");
			System.out.println(clazz.getName() + " == extends == " + clazz.getSuperclass().getName());

			// ================================================================================================
			Object obj = clazz.newInstance(); // MUST HAVE DEFAULT CONSTRUCTOR
			System.out.println(obj.getClass().getSimpleName());
			System.out.println(obj);

			// ================================================================================================
			System.out.println("=== declared methods of " + clazz);
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				System.out.print(method.getName());
				if (method.getReturnType() == void.class) {
					System.out.println(" ===================== found to return void");
				} else {
					System.out.println(" ========= returns: " + method.getReturnType().getName());
				}
			}
			// ================================================================================================
			System.out.println("=== declared ctors of " + clazz);
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> ctor : constructors) {
				System.out.println(ctor.getName() + " takes " + ctor.getParameterCount());
			}
			// ================================================================================================
			// Fetch constructor & invoke it
			Class<Employee> empClass = Employee.class;
			Constructor<Employee> ctor = empClass.getDeclaredConstructor(int.class, String.class);
			Employee emp = ctor.newInstance(101, "David");
			System.out.println(emp);
			// ================================================================================================
			// Fetch method & invoke it
			Method method = clazz.getDeclaredMethod("performTask", String.class, int.class);
			Object result = method.invoke(emp, "Plan a vacation", 3);
			System.out.println("result: " + result);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
