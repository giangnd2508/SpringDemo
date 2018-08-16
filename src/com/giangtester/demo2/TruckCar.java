package com.giangtester.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TruckCar implements Car {
	
	@Autowired
	private FortuneService fortuneService;


	@Autowired
	public void doSomeStuff() {
		System.out.println("inside the doSomeStuff method");
	}

	@Override
	public String getNumberOfTire() {
		return "Truck car: 10 - 18 tires";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
