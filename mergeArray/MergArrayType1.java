package mergeArray;

import java.util.Scanner;

public class MergArrayType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]=new int[5];
		int brr[]=new int[5];
		int crr[]=new int [5+5];
		System.out.println("Array 1 elememnts ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array 2 elememnts ");

		for(int i=0;i<brr.length;i++) {
			brr[i]=sc.nextInt();
		}
		int j=0,k=0;
		for(int i=0;i<crr.length;i++) {
			
			if(i%2==0) {
				crr[i]=arr[j];
				j++;
			}
			else {
				crr[i]=brr[k];
				k++;
			}
		}
		for(int i:crr) {
			System.out.println(i+" ");
		}
		

	}

}
