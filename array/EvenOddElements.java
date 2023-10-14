package com.kn.array;

import java.util.Scanner;

public class EvenOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		EvenOddElements(arr);
	
	}

	static void EvenOddElements(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"-->Even");
			}
			else {
				System.out.println(arr[i]+"-->Odd");	
			}
		}
	}
}

