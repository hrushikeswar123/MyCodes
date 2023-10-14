package com.kn.array2D;

import java.util.Scanner;

public class Friendsbatches {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String arr[][]=new String[4][];
		System.out.println("Enter no of friends A1 batch");
		arr[0]=new String[sc.nextInt()];
		System.out.println("Enter no of friends A2 batch");
		arr[1]=new String[sc.nextInt()];
		System.out.println("Enter no of friends A3 batch");
		arr[2]=new String[sc.nextInt()];
		System.out.println("Enter no of friends A4 batch");
		arr[3]=new String[sc.nextInt()];
		
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Friends NAMES in A"+(i+1)+" batch");
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.next();
		}
	}
	System.out.println("----------------------------------------");
	for(int i=0;i<arr.length;i++) {
		System.out.println("-->Friends in A"+(i+1)+" batch");
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("friend-"+(j+1)+"  "+arr[i][j]);
		}
	}
	}

}
