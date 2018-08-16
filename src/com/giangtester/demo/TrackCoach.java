package com.giangtester.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "10 min in Track";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach " + fortuneService.getFortune();
	}

}
