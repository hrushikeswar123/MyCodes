package com.kn.LowCasting;

public class Square1 extends Shape {
	public void Draw() {
		System.out.println("Drawing Square...");
	}
	public double calArea() {
		double s=6.5;
		return s*s;
	}
	public Double calPerameter() {
		double s=5.6;
		return 4*s;
		
	}
}
