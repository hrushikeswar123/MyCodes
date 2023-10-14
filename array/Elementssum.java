package com.kn.array;
import java.util.Scanner;
public class Elementssum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int arr[]=new int[sc.nextInt()];
		//Taking Elements form the User
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Method for For Sum of the Elements in Array
		Elementssum(arr);
	}

	static void Elementssum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
