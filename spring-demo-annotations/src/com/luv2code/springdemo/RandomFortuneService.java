package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of string
	private String[] data = {"Beware","Good","Bad","Hello"};
	
	//create a random generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
