package com.eldar.parkinglot.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.eldar.parkinglot.beans.Car;
import com.eldar.parkinglot.beans.ParkingLot;

@Aspect
@Component
public class LoggingAspect {

	// advices
	@Before("execution(* parkOut(..))")
	public void beforeOutAdvcie(JoinPoint jp) {
		int carNumber = (Integer) jp.getArgs()[0];
		System.out.println("===>You are about to take car number " + carNumber + " out");
	}

	@After("execution(* parkIn(..)) || execution(* parkOut(..))")
	public void afterCarInOrOut(JoinPoint jp) {
		List<Car> cars = ((ParkingLot) jp.getTarget()).getCars();
		System.out.println("===>currently in parking lot: " + cars);
	}

}
