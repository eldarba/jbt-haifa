package b.courseProjectDemos;

public class Demo1 {

	public static void main(String[] args) throws CouponSystemException {
		CouponSystemException e = new CouponSystemException("test error");
		throw e;
	}

}
