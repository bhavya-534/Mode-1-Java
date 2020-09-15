package com.day3.nine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println("Enter the Delimitor");
		char character=scanner.next().charAt(0);
		scanner.close();
		
		UserMainCode usermaincode =new UserMainCode();
		System.out.print(usermaincode.reshape(string,character));
		
	}
}
