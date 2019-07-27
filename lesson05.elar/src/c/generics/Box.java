package c.generics;

// in the generic class we define a type parameter
public class Box<T> { // <T> is a type parameter

	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
