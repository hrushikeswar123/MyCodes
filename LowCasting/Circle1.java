package com.kn.LowCasting;

public class Circle1 extends Shape {
	public void Draw() {
		System.out.println("Drawing Circle...");
	}
	public double calArea() {
		double r=6.5;
		return Math.PI* r*r;
	}
	public Double calPerameter() {
		double r=5.6;
		return Math.PI*2*r;
		
	}

}
