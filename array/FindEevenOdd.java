package com.kn.array;
public class FindEevenOdd {
	public void EvenOdd(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"-->Even");
			}
			else {
				System.out.println(arr[i]+"-->Odd");	
			}
		}
	}
	public void EvenOddCount(int[]arr) {
		int evenCount=0,oddCount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;	
			}
		}
		System.out.println(evenCount+" is Event Count");
		System.out.println(oddCount+" is odd Count");
	}

}
