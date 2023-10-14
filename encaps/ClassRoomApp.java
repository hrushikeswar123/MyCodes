package com.kn.encaps;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ClassRoom c1=new ClassRoom();
		System.out.println("Current Temperature:"+c1.getTemperature());
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the temperatur to set: ");
		c1.setTemperature(sc.nextInt());
		System.out.println("modified temperature: "+c1.getTemperature());
	}

}
