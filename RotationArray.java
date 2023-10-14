package RotationArray;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]=new int[5];
		int brr[]=new int[5];
		
		System.out.println("Array 1 elememnts ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				brr[i]=arr[arr.length-1];
			}
			else {
				brr[i]=arr[i-1];
			}
		}
		for(int i:brr) {
			System.out.println(i+" ");
		}
		
	}

}
