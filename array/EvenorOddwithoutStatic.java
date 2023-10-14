package com.kn.array;

import java.util.Scanner;

public class EvenorOddwithoutStatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		FindEevenOdd obj=new FindEevenOdd();
		obj.EvenOdd(arr);
		obj.EvenOddCount(arr);

	}

}
