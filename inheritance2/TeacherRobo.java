package com.kn.inheritance2;

public class TeacherRobo extends Robo{
	TeacherRobo(String n,String t){
		name=n;
		type=t;
		
	}
	public void teach() {
		System.out.println("Teaching....");
	}

}
