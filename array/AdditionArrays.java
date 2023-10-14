package com.kn.array;

import java.util.Scanner;

public class AdditionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of Array1: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		int brr[] = new int[arr.length];
		System.out.println("Enter the elements of Array2: ");
		for (int i = 0; i < arr.length; i++) {
			brr[i] = sc.nextInt();
	    }
		System.out.println("Sum of array Elemnts");
		int[] crr=SumArray(arr,brr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(crr[i]);
	    }

}

	static int[] SumArray(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] drr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i]+brr[i];
		}
		return drr;
	}
}
