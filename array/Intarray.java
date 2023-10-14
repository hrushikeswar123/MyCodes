package com.kn.array;
import java.util.Scanner;
public class Intarray {

	public static void main(String[] args) {
		int arr[];   //Array declaration
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the arrauy size: ");
		arr=new int[sc.nextInt()];    //Array creation 
		for(int i=0;i<arr.length;i++) {     //Array initialization
			System.out.println("Enter the "+i+1+"element: ");
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++) {  //Array traversing
			System.out.println("Enter the "+i+1+"element is  "+arr[i]);
		}
		/*  for(int i=0;i<arr.length;i++) {     //Array initialization
			System.out.println("Enter the "+i+1+"element: ");
			arr[i]=sc.nextInt();
			}
		for(int i=arr.length-1;i>=0;i--) {  //Array traversing
			System.out.println("Enter the "+i+1+"element is  "+arr[i]);
		}  */
	}

}
