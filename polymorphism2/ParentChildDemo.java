package com.kn.polymorphism2;

public class ParentChildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent.dis();
		Child.dis();
		  
		
		Parent  p1= new Parent();
		p1.dis(); // output Parent Method..
		
		Child c1=new Child();
		c1.dis();
		
		// Parent p1 =new Child();
		
	}

}
