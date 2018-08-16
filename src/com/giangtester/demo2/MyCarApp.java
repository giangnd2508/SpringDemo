package com.giangtester.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCarApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Car anotherCar = context.getBean("truckCar", Car.class);

		System.out.println(anotherCar.getNumberOfTire());

		System.out.println(anotherCar.getDailyFortune());

		context.close();
	}

}
