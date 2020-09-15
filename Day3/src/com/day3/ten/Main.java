package com.day3.ten;

import java.util.Scanner;

import com.hcl.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two Numbers:");
		Scanner scanner=new Scanner(System.in);
		int firstNumber=scanner.nextInt();
		int secondNumber=scanner.nextInt();
		scanner.close();
		
		Calculator calculator=new Calculator();
		System.out.println("Adding of two numbers: "+calculator.add(firstNumber,secondNumber));
	}

}
