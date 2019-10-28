package a;

public class Demo3 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "ab";

		str2 = str2 + "c";

		System.out.println("str1 :" + str1 + ", str2 :" + str2);

		System.out.println(str1 == str2);
		str2 = str2.intern();
		System.out.println(str1 == str2);

	}

}
