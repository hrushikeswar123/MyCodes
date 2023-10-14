package com.kn.Strings;

import java.util.Scanner;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1=sc.nextLine();
		
		//method to create the Reverse String
		ReverseString(s1);
	}

	static void ReverseString(String s1) {
		// TODO Auto-generated method stub
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
