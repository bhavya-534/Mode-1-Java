package com.hcl.two;

import java.util.Scanner;

public class Airthmetic {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input First number:  ");
		int firstNumber=scanner.nextInt();
		System.out.print("Input Second number:  ");
		int secondNumber=scanner.nextInt();
		scanner.close();
		
		Operation operation =new Operation();
		System.out.println("Addition: "+operation.addition(firstNumber,secondNumber));
		System.out.println("Subraction: "+operation.subraction(firstNumber,secondNumber));
		System.out.println("Multiplication: "+operation.multiplication(firstNumber,secondNumber));
		System.out.println("Division: "+operation.division(firstNumber,secondNumber));
		System.out.println("Remainder: "+operation.remainder(firstNumber,secondNumber));
	}

}
