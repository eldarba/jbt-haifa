package a;

import java.sql.Date;

public class ClassObject {
	
	public static void main(String[] args) {
		
		// lets get a reference to the class object of String
		Class<?> classObjectOfString;
		
		// option 1
		classObjectOfString = String.class;
		System.out.println(classObjectOfString);
		
		// option 2
		classObjectOfString = "aaa".getClass();
		System.out.println(classObjectOfString);
		
		// option 3
		try {
			System.out.println(classObjectOfString);
			classObjectOfString = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
