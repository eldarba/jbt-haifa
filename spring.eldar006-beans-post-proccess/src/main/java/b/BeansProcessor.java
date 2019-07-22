package b;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import a.MyProto;

@Component
public class BeansProcessor implements BeanPostProcessor {

	// before post construct methods
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("===> BeansProcessor - before init: " + beanName);
		return bean;
	}

	// after post construct methods
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("===> BeansProcessor - after init: " + beanName);
		if (bean instanceof MyProto) {
			MyProto p = (MyProto) bean;
			if (p.getX() % 2 != 0) {
				System.out.println("===> BeansProcessor - found odd x value and corrected it");
				p.setX(p.getX() + 1);
			}
		}
		return bean;
	}

}
