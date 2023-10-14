package com.kn.UpCasting;

public class Rectangle extends Shape {
	public void Draw() {
		System.out.println("Drawing Rectangle...");
	}
	public double calArea() {
		double l=5.5,b=10.5;
		return l*b;
	}
}
