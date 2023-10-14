package InvertedStringLine;

import java.util.Scanner;

public class InvertedStringLineDemo {

	public static void main(String[] args) {
		//Taking the INput
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine(); 
		InvertedStringLine obj=new InvertedStringLine();
		obj.invertingString(s1);
		
	}

}
