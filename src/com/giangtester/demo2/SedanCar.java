package com.giangtester.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car {

	private FortuneService fortuneService;
	
	@Autowired
	public SedanCar(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getNumberOfTire() {
		return "BMW Car: 4 tires";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
