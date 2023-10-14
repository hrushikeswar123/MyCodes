package RomanNumberConvert;

import java.util.Scanner;

public class RomanNumberConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer("");
		String srr[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int arr[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0;i<srr.length;i++) {
			while(num>=arr[i]) {
				{
					num=num-arr[i];
					sb=sb.append(srr[i]);
				}
			}
		}
		System.out.println(sb);

	}

}
