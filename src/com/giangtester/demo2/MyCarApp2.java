package com.giangtester.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCarApp2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);

		Car anotherCar = context.getBean("truckCar", Car.class);

		System.out.println(anotherCar.getNumberOfTire());

		System.out.println(anotherCar.getDailyFortune());

		context.close();
	}

}
