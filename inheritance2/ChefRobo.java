package com.kn.inheritance2;

public class ChefRobo extends Robo {
	ChefRobo(String n,String t){
		name=n;
		type=t;
		
	}
	public void cook() {
		System.out.println("Cooking....");
	}

}
