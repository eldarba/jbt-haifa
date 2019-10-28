package g.stack;

public class Stack {

	private Object[] stack = new Object[2];
	private int size;

	public void push(Object e) {
		verifyCapacity();
		stack[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new RuntimeException("stack is enpty");
		} else {
			Object curr = stack[--size];
			stack[size] = null;
			return curr;
		}
	}

	private void verifyCapacity() {
		if (size == stack.length) {
			Object[] arr = new Object[size * 2];
			System.arraycopy(stack, 0, arr, 0, size);
			stack = arr;
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");

		try {
			for (int i = 0; i < 10; i++) {
				Object e = stack.pop();
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		stack.push("111");
		stack.push("222");
		stack.push("333");
		stack.push("444");
		stack.push("555");

		try {
			for (int i = 0; i < 10; i++) {
				Object e = stack.pop();
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
