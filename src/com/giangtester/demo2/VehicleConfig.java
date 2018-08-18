package com.giangtester.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class VehicleConfig {
	
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for Minivan and inject dependency
	@Bean
	public Car minivanCar() {
		return new MinivanCar(sadFortuneService());
	}
	
}
