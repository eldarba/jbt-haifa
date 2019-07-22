package a;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyProto {

	// private Logger logger = Logger.getLogger(MainApp1Singleton.class.getName());

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
	}

	// life cycle method 2
	@PreDestroy
	public void destory() {
		System.out.println("===> from MyProto destory");
	}

}
