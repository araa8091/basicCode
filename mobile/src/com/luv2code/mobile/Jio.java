package com.luv2code.mobile;

public class Jio implements Sim{

	@Override
	public void call() {
		System.out.println("Jio for calling");
		
	}

	@Override
	public void sms() {
		System.out.println("Jio for sms");
		
	}

	@Override
	public void brows() {
		System.out.println("Jio for browsing");
		
	}

}
