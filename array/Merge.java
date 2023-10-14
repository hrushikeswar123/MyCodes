package com.kn.array;

public class Merge {
	public void merging(int[]arr,int[]brr) {
		int crr[]=new int [arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
					crr[i]=arr[i];	
		}
		for(int i=arr.length,j=0;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
		System.out.println("Merged array: ");
		for(int i:crr) {
			System.out.println(i+" ");
		}
	}
	

}
