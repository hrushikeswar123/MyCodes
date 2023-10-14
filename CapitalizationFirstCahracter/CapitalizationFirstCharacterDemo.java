package CapitalizationFirstCahracter;

import java.util.Scanner;

public class CapitalizationFirstCharacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input taking from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1=sc.nextLine();
		CapitalizationFirstCharacter obj=new CapitalizationFirstCharacter();
				obj.Capitalizing(s1);
		
	}

}
