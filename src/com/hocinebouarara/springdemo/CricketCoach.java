package com.hocinebouarara.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	// create no-arg constructor
	public CricketCoach () {
		System.out.println("CricketCoach: inside no-arg constructor ");
	}
	
	
	

	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside Setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}




	public String getTeam() {
		return team;
	}




	public void setTeam(String team) {
		System.out.println("CricketCoach: inside Setter method - setTeam");
		this.team = team;
	}




	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
