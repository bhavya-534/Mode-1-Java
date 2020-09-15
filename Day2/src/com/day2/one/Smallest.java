package com.day2.one;

import java.util.Scanner;

public class Smallest {

	static int smallestNumber(int firstNumber,int secondNumber,int thirdNumber)
	{
		if(firstNumber>thirdNumber)
		{
			if(firstNumber>secondNumber)
			{
				return firstNumber;
			}
			else
			{
				return secondNumber;
			}
		}
		else
		{
			return thirdNumber;
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Three Numbers:");
		Scanner scanner=new Scanner(System.in);
		int firstNumber=scanner.nextInt();
		int secondNumber=scanner.nextInt();
		int thirdNumber=scanner.nextInt();
		System.out.println("The Smallest Number Among the Three nnumbers is:  " +smallestNumber(firstNumber,secondNumber,thirdNumber));

	}

}
