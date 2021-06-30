package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it"+ fortuneService.getFortune();
	}
	//add init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}
	
	//add destroyed method
	public void doMyCleanuoStuff()
	{
		System.out.println("TrackCoach : inside method doMyCleanuoStuff");
	}

}
