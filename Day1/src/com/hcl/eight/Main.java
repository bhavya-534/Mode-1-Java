package com.hcl.eight;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number which is the Positive Integer :");
		int digit=scanner.nextInt();
		scanner.close();
		
		OddDigit odddigit=new OddDigit();
		if(odddigit.checkSum(digit) == 1)
		{
			System.out.println("sum of odd digits is odd.");
		}
		else
		{
			System.out.println("sum of odd digits is even.");
		}
	}
}
