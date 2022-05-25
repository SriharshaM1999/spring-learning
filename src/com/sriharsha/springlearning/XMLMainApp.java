package com.sriharsha.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMainApp {
	
	public static void main(String [] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CoachInterface coach = context.getBean("BaseBallCoach",CoachInterface.class);

		coach.getDailyWorkOut();

		coach.isHeGood();
	}

}
