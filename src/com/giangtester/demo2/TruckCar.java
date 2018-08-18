package com.giangtester.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TruckCar implements Car {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define my init method
	@PostConstruct
	public void doMyStuff() {
		System.out.println("After constructor bean");
	}
	
	
	// define my destroy method
	@PreDestroy
	public void doOtherStuff() {
		System.out.println("Before destroy bean");
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
