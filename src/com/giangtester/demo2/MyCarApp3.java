package com.giangtester.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCarApp3 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);

		MinivanCar anotherCar = context.getBean("minivanCar", MinivanCar.class);

		System.out.println(anotherCar.getNumberOfTire());

		System.out.println(anotherCar.getDailyFortune());
		
		System.out.println(anotherCar.getEmail());
		
		System.out.println(anotherCar.getTeam());

		context.close();
	}

}
