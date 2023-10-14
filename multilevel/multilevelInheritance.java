package com.kn.multilevel;

public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v1 =new Vehical();
		v1.regno=1111;
		System.out.println("regdno: "+v1.regno);
		v1.move();
		
		
		Car c1 =new Car();
		c1.regno=1222;
		System.out.println("regdno: "+c1.regno);
		c1.move();
		
		
		Sedan s1 =new Sedan();
		s1.regno=1333;
		System.out.println("regdno: "+s1.regno);
		s1.move();
	}

}
