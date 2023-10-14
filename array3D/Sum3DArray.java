package com.kn.array3D;

import java.util.Scanner;

public class Sum3DArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[][][] arr=new int[2][2][5];
		int brr[][][]=new int[arr.length][arr[0].length][arr[0][0].length];
		System.out.println("Enter a First array elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				for(int k=0;k<arr[0][0].length;k++) {
				arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Enter a send array elements");
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				for(int k=0;k<brr[i][i].length;k++) {
					brr[i][j][k]=sc.nextInt();
				}
				
			}
		}
		System.out.println("Sum of elements of 2D Arrays : ");
		Sum3Darray(arr,brr);
	}

	static void Sum3Darray(int[][][] arr, int[][][] brr) {
		// TODO Auto-generated method stub
		int crr[][][]=new int[arr.length][arr[0].length][arr[0][0].length];
		for( int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][i].length;k++) {
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
				
			}
		}
	}

}

