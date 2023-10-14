package ReverseStringLine;

import java.util.Scanner;

public class ReverseStringLineDemo {

	public static void main(String[] args) {
	
		//Taking the nNput
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine(); 
		ReverseStringLine obj =new ReverseStringLine();
		obj.reversingString(s1);
		
	}

}
