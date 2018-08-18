package com.giangtester.demo2;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is the sad day";
	}

}
