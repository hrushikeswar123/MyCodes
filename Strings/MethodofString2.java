package com.kn.Strings;

public class MethodofString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hrushi Keswara Reddy Thumu";
		//length of String
		System.out.println(s1.length());
		
		//Replace of characters
		String b=s1.replace('a', 'b');
		System.out.println(b);
		
		//characters of String into Array
		char arr[]=s1.toCharArray();
		for(char i:arr) {
			System.out.println(i);
		}
		
		//Split at the required position
		String brr []=s1.split(" ");
		for(String i: brr) {
			System.out.println(i);
		}
		
		//Starts and end of Strings
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("xyz"));
	}

}
