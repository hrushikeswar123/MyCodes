package com.kn.Strings;

public class PalindromeofStringWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		
		//method to check String is a palindrome or not
		StringPalindrome(s1);
	}

	static void StringPalindrome(String s1) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("");
		for(int i=s1.length()-1;i>=0;i--) {
			sb=sb.append(s1.charAt(i));
		}
		String s2=sb.toString();
		if(s1.equals(s2)) {
			System.out.println("Palindromme ");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
