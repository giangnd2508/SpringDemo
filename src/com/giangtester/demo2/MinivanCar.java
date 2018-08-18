package com.giangtester.demo2;

import org.springframework.beans.factory.annotation.Value;

public class MinivanCar implements Car {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public MinivanCar(FortuneService sadFortuneService) {
		this.fortuneService = sadFortuneService;
	}

	@Override
	public String getNumberOfTire() {
		return "This is a minivan: 4 tires";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
