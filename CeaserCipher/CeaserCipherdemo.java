package CeaserCipher;

import java.util.Scanner;

public class CeaserCipherdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1="XYZ";
		int key=2;
		CeaserCipher obj=new CeaserCipher();
		obj.cipherkey(s1,key);
	}

}
