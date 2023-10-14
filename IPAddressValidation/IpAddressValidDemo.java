package IPAddressValidation;

import java.util.Scanner;

public class IpAddressValidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String srr[] = sc.nextLine().split(".");
		int isvalid = 0;
		int a = 0;
		if (srr.length == 4) {
			for (int i = 0; i < srr.length; i++) {

			}

		} else {
			System.out.println("Not a valid IP Address");
		}
	}

}
