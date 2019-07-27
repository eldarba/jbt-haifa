package a;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyProto {

	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// CTOR
	public MyProto() {
		System.out.println("===> from MyProto CTOR");
	}

	// business method
	public void speak() {
		System.out.println("Hello, I am " + this + " and I speak!");
	}

	// life cycle method 1
	@PostConstruct
	public void init() {
		System.out.println("===> from MyProto init");
		x = (int) (Math.random() * 101);
	}

	// life cycle method 2
	@PreDestroy
	public void destory() {
		System.out.println("===> from MyProto destory");
	}

}
