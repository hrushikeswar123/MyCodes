package com.kn.array;

import java.util.Scanner;

public class SumofArrayElementsUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=SumArray(arr);
		System.out.println("Sum of Elements: "+sum);
	}

	static int SumArray(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
