package b;

public class TheClassObject {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> a = Class.forName("a.A");
		System.out.println(a);

		/*
		 * Every array also belongs to a class that is reflected as a Class object that
		 * is shared by all arrays with the same element type and number of dimensions.
		 */
		int[] arr1 = new int[5];
		int[] arr2 = new int[3];
		byte[] arr3 = new byte[3];
		byte[][] arr4 = new byte[3][2];
		byte[][] arr5 = new byte[7][3];

		System.out.println(arr1.getClass());
		System.out.println(arr2.getClass());
		System.out.println(arr3.getClass());
		System.out.println(arr4.getClass());
		System.out.println(arr5.getClass());

		/*
		 * The primitive Java types (boolean, byte, char, short, int, long, float, and
		 * double), and the keyword void are also represented as Class objects.
		 */
		System.out.println(int.class);
		System.out.println(boolean.class);
		System.out.println(void.class);
	}

}
