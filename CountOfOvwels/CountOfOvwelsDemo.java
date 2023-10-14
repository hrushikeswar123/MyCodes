package CountOfOvwels;

import java.util.Scanner;

public class CountOfOvwelsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		CountOfOvwels obj=new CountOfOvwels();
		obj.counting(s1);
	}

}
