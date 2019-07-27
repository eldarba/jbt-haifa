package com.eldar.parkinglot;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.eldar.parkinglot.beans.Car;
import com.eldar.parkinglot.beans.ParkingLot;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AppConfig {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc = new Scanner(System.in);) {

			ParkingLot parkingLot = ctx.getBean(ParkingLot.class);

			lbl: while (true) {
				// System.out.println("\ncars in lot: " + parkingLot.getCars());
				try {
					showMenu();
					String command = sc.nextLine();
					switch (command) {
					case "in":
						System.out.print("Enter car number: ");
						int carNumber = Integer.parseInt(sc.nextLine());
						System.out.print("Enter driver name: ");
						String driverName = sc.nextLine();
						Car car = ctx.getBean(Car.class);
						car.setNumber(carNumber);
						car.setDriverName(driverName);
						parkingLot.parkIn(car);
						break;
					case "out":
						System.out.print("Enter car number: ");
						carNumber = Integer.parseInt(sc.nextLine());
						car = parkingLot.parkOut(carNumber);
						// System.out.println("you parked out: " + car);
						break;
					case "show":
						System.out.println("parked cars: " + parkingLot.getCars());
						break;
					case "q":
						break lbl;
					default:
						System.out.println("Your choice is not recignized: " + command);
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

		// System.out.println("Parkin Lot app is done. Good Bye!");

	}

	private static void showMenu() {
		System.out.println("MENU ================");
		System.out.println("park in ....... in");
		System.out.println("park out ...... out");
		System.out.println("show cars ..... show");
		System.out.println("quit .......... q");
		System.out.print("\nYour choice: ");
	}

}
