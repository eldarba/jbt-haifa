package e.binding;

public class Review {

	private String txt;
	private boolean approved;

	public Review(String txt) {
		super();
		this.txt = txt;
	}

	@Override
	public String toString() {
		return "Review [txt=" + txt + "]";
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}
