package com.kn.array;

import java.util.Scanner;

public class BackwardTraversingUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter size");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements for Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int crr[] =reverse(arr);
		System.out.println("Reverse Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(crr[i]);
		}
	}

	static int[] reverse(int[] arr) {
		int brr[]=new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--) {
			brr[j]=arr[i];
			j++;
		}
		return brr;

	}

}
