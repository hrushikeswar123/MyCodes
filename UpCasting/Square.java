package com.kn.UpCasting;

public class Square extends Shape {
	public void Draw() {
		System.out.println("Drawing Square...");
	}
	public double calArea() {
		double s=6.5;
		return s*s;
	}
}
