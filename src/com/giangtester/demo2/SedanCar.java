package com.giangtester.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getNumberOfTire() {
		return "BMW Car: 4 tires";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
