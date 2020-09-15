package com.hcl.three;

import java.util.Scanner;

public class Average {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter FirstNumber: ");
		float firstNumber=scanner.nextInt();
		System.out.println("Enter SecondNumber: ");
		float secondNumber=scanner.nextInt();
		System.out.println("Enter ThirdNumber: ");
		float thirdNumber=scanner.nextInt();
		scanner.close();

		Operation operation=new Operation();
		System.out.println(operation.average(firstNumber, secondNumber,thirdNumber));
	}

}
