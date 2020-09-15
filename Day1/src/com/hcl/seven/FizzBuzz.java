package com.hcl.seven;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range of the number: ");
		int number=scanner.nextInt();
		scanner.close();
		
		Operation operation=new Operation();
		for(int i=1;i<=number;i++)
		{
			if(i%3==0 || i%5==0)
			{
			System.out.println(i + ":  " +operation.fizzBuzz(i));
			}
		}

	}

}
