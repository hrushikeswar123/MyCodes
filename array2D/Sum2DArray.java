package com.kn.array2D;

import java.util.Scanner;

public class Sum2DArray {

	public static void main(String[] args) {
		
		// Same length array
		
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][5];
		int brr[][]=new int[arr.length][arr[0].length];
		System.out.println("Enter a First array elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a send array elements");
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[0].length;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of elements of 2D Arrays : ");
		Sum2Darray(arr,brr);
	}

	static void Sum2Darray(int[][] arr, int[][] brr) {
		// TODO Auto-generated method stub
		int crr[][]=new int[arr.length][arr[0].length];
		for( int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
		
	}

}
