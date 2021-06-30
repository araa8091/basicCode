package com.luv2code.springdemo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired //field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//defult constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside defult constructor");
	}
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennnisCoach : inside of doMyStartupStuff()");
	}
	//define my destroyed method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennnisCoach : inside of doMyCleanupStuff()");
	}
	
	
	/*@Autowired //method Injection
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("TennisCoach : inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}*/
	
	/*//define a setter method //  setter Injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TennisCoach : inside setFortuneService() method");
		fortuneService = theFortuneService;
	}*/
	/*@Autowired //constructor injection
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volleyBall";
	}
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
