package com.giangtester.demo2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Happy fortune";
	}
	
}
