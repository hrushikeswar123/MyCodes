package com.kn.array;

import java.util.Scanner;

public class PositionofEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] arr=new int[sc.nextInt()];
		System.out.println("Enter Elements* of Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to fing position");
		int a=sc.nextInt();
		boolean isfound=false;
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("position is : "+(i+1));
				isfound=true;
				
			}
			
		}
		if(isfound == false) {
			System.out.println("Number not Found");
			
		}
	}

}
