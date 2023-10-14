package com.kn.array2D;
import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Array declaration
		int arr[][]=new int[2][];
		//Array Creation
		arr[0]=new int[4];
		arr[1]=new int[2];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the  Elements :");
				arr[i][j]=sc.nextInt();
			}
		}
		//Array traversing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
				
			}
		}
		
	}

}
