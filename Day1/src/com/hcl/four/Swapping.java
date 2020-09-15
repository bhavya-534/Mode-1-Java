package com.hcl.four;

import java.util.Scanner;

import com.hcl.two.Operation;

public class Swapping {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input First number:  ");
		int firstNumber=scanner.nextInt();
		System.out.print("Input Second number:  ");
		int secondNumber=scanner.nextInt();
		scanner.close();
		
		int temp;
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		System.out.println("Swapping of two Numbers:" +firstNumber+" "+secondNumber);
		

	}

}
