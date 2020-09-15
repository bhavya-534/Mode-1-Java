package com.hcl.nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number which is the Positive Integer :");
		int digit=scanner.nextInt();
		scanner.close();
		
		UserMainCode usermaincode =new UserMainCode();
		System.out.println(UserMainCode.sumOfSquaresOfEvenDigits(digit));
	}
}
