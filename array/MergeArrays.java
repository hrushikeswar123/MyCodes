package com.kn.array;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st Array");
		int [] arr=new int[sc.nextInt()];
		System.out.println("Enter Elements* of 1st Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd Array");
		int [] brr=new int[sc.nextInt()];
		System.out.println("Enter Elements* of 2nd Array");
		for(int i=0;i<brr.length;i++) {
			brr[i]=sc.nextInt();
		}
		Merge obj=new Merge();
		obj.merging(arr,brr);
	}

}
