package a.exceptions;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String num = "25A";
		int x = Integer.parseInt(num);
		System.out.println(++x);
		
		
		int[] arr = {2,4,6};
		System.out.println(arr[3]);
		
		String s = "aaa";
		s = null;
		System.out.println(s.length());
	}

}
