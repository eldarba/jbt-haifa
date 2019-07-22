package a;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
// @Lazy
public class MySingleton {

	private int x = (int) (Math.random() * 101);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	// CTOR
	public MySingleton() {
		System.out.println("===> from MySingleton CTOR");
	}

	// business method
	public void speak() {
		System.out.println("Hello, I am " + this + " and I speak!");
	}

	// life cycle method 1
	@PostConstruct
	public void init() {
		System.out.println("===> from MySingleton init");
	}

	// life cycle method 2
	@PreDestroy
	public void destory() {
		System.out.println("===> from MySingleton destory");
	}

}
