package com.giangtester.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortune) {
		this.fortuneService = theFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "30 min in Baseball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
