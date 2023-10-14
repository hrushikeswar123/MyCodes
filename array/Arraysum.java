package com.kn.array;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of arrays: ");
		int arr[]= new int [sc.nextInt()];
		int brr[]= new int [arr.length];
		Getdata(arr,brr);
		Arraysum(arr,brr);
		ProductArray(arr,brr);
	}

	static void Getdata(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first array Elemants");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enetr the Second array Elements");
		for(int i=0;i<arr.length;i++) {
			brr[i]=sc.nextInt();
		}
	}

	static void ProductArray(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int crr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]*brr[i];
		}
		System.out.println("Product of Array ELments");
		
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
			
		}
	}

	static void Arraysum(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int crr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
		}
		System.out.println("Sum of Array ELments");
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
			
		}
	}

	



}
