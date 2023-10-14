package com.kn.Strings;

public class StringComparison3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ram";
		String s2="Sita";
		String s3=s1+"Sita";  //***
		String s4="Ram"+s2;   //***
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		System.out.println("S3: "+s3);
		System.out.println("S4: "+s4);
	
		if(s3==s4) {
			System.out.println("reference are same");
		}
		else {
			System.out.println("reference are not same");
		}
		if(s3.equals(s4)) {
			System.out.println("Data are same");
		}
		else {
			System.out.println("DAta are not same");
		}
	}

}
