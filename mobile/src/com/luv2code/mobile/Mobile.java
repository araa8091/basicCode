package com.luv2code.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans loaded");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.call();
		sim.sms();
		sim.brows();
	}

}
