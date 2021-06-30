package com.luv2code.mobile;

public class Airtel implements Sim{
	
	@Override
	public void call() {
		System.out.println("Airtel for calling");
		
	}

	@Override
	public void sms() {
		System.out.println("Airtel for sms");
		
	}

	@Override
	public void brows() {
		System.out.println("Airtel for browsing");
		
	}

}
