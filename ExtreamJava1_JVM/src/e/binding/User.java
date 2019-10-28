package e.binding;

public class User {

	public int id = 1;

	public void printUserType() {
		System.out.println("User");
	}

	public void saveWebLink() {
		System.out.println("User: saveWebLink");
	}

	public Review postAReview(String reviewText) {
		System.out.println("User: postAReview");
		Review review = new Review(reviewText);
		return review;
	}

	public static void staticMethod() {

	}

	public void instanceMethod(double d) {
		System.out.println("User: instanceMethod");
	}

	public void instanceMethod(User u) {
		System.out.println("User: instanceMethod");
	}

}
