package e.binding;

public class Staff extends User {

	public int id = 2;

	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);
	}

	@Override
	public void printUserType() {
		System.out.println("Staff");
	}

	@Override
	public void saveWebLink() {
		System.out.println("User: saveWebLink");
	}

	@Override
	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}

	public static void staticMethod() {

	}

	// method overload
	public void instanceMethod(int d) {
		System.out.println("Staff: instanceMethod");
	}

	public void instanceMethod(Staff s) {
		System.out.println("Staff: instanceMethod");
	}

}
