package com.kn.UpCasting;

public class Circle extends Shape{
	public void Draw() {
		System.out.println("Drawing Circle...");
	}
	public double calArea() {
		double r=6.5;
		return Math.PI* r*r;
	}

}
