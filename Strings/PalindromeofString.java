package com.kn.Strings;

import java.util.Scanner;

public class PalindromeofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s2= sc.next();
		
		// program to check String is palindrome or not
		StringPalindrome(s2);
				
	}

	static void StringPalindrome(String s2) {
		// TODO Auto-generated method stub
		String s1 = "";
		for(int i=s2.length()-1;i>=0;i--) {
			s1= s1+(s2.charAt(i));
			// System.out.println(s1);
		}
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palidrome");
		}
	}

}
