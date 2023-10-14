package com.kn.constructors;

public class EngStudent extends Student{
	String branch;
	int sem;
	public EngStudent(String name, int age) {
		super(name, age);
		System.out.println("------Child 2-args "+name+" "+age);
	}
	public EngStudent(String name, int age,String branch) {
		super(name, age,branch);
		System.out.println("------Child 3-args  "+name+" "+age+" "+branch);
	}
	public EngStudent(String name, int age,String branch,int sem) {
		super(name, age);
		System.out.println("------Child 3-args "+name+" "+age+" "+branch+" "+sem);
	}
	
	

}
