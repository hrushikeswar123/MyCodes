package com.kn.LowCasting;

public class Rectangle1 extends Shape {
	public void Draw() {
		System.out.println("Drawing Rectangle...");
	}
	public double calArea() {
		double l=5.5,b=10.5;
		return l*b;
	}
	public Double calPerameter() {
		double l=5.6,b=5.5;
		return 2*(l+b);
		
	}
}
