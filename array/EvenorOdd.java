package com.kn.array;

public class EvenorOdd {
	public static void main(String[] args) {
		int arr[]= {55,22,44,66,77,88,99};
		EvenorOdd(arr);//method for finding a Even or Odd
	}

	static void EvenorOdd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" Even");
			}else{
				System.out.println(arr[i]+" Odd");
			}
			
		}
	}
}
