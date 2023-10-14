package com.kn.array2D;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		// Same length array
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][5];
		// Array initialization
		System.out.println("Enter Elements of array");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		CopyArray(arr);
	}

	static void CopyArray(int[][] arr) {
		int crr[][]=new int[arr.length ][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				crr[i][j]=arr[i][j];
			}
		}
		System.out.println("coppied array crr : ");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(crr[i][j]);
			}
	}

}
}
