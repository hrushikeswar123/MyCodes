package LargestWord;

import java.util.Scanner;

public class LargestWordinStringDemo {

	public static void main(String[] args) {
		
		//Taking the Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine(); 
		
		//Object creation
		LargestWordinString obj=new LargestWordinString();
		
		//Calling a method to find the large word
		obj.findingLargeWord(s1);
		
		
	}

}
