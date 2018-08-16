package com.giangtester.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach theCoach = context.getBean("myCriketCoach", CricketCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
