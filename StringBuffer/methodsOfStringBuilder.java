package com.kn.StringBuffer;

import java.util.Scanner;

public class methodsOfStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("HrushikesawarReddy");
		sb.append("Thumu");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(s1);
	}

}
