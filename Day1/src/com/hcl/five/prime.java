package com.hcl.five;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number which is greater than 1: ");
		int number=scanner.nextInt();
		scanner.close();
		
		Operation operation=new Operation();
		if(operation.checkPrime(number)==0)
		{
			System.out.println(number+" is a Prime Number");
		}
		else
		{
			System.out.println(number+" is not a Prime Number");
		}
		

	}

}
