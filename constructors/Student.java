package com.kn.constructors;

public class Student {
	String name;
	int age;
	public Student( String name,int age) {
	super();
	System.out.println("---parent class called with 2-args");
	this.name=name;
	this.age=age;
	
	}
	public Student( String name,int age ,String branch) {
		super();
		System.out.println("---parent class called with 3-args");
		
		}
	

}
