package MatrixAddition;

import java.util.Scanner;

public class MatrixAdditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Taking inputs from the user
		System.out.println("enter the sizes of rows and columns:");
		int rows=sc.nextInt();
		int column=sc.nextInt();
		int arr[][]=new int [rows][column];
		int brr[][]=new int [rows][column];
		arr=method(arr);
		brr=method(brr);
		int crr[][]=new int [rows][column];
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				
				crr[i][j]=arr[i][j]+brr[i][j];
				
			}
			
		}
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				
				
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int[][] method(int[][] arr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		return arr;
	}
	

}
