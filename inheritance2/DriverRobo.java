package com.kn.inheritance2;

public class DriverRobo extends Robo{
	DriverRobo(String n,String t){
		name=n;
		type=t;
		
	}
	public void Drive() {
		System.out.println("Driving....");
	}

}
