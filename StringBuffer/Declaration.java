package com.kn.StringBuffer;

public class Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("HrushikesawarReddy");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Thumu");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
