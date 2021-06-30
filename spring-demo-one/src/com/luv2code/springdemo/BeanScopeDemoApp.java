package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring configuraton file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemory location for theCoach :"+theCoach);
		
		System.out.println("\nmemory location for the alphaCoach "+alphaCoach+ "\n");
		
		context.close();
	}

}
