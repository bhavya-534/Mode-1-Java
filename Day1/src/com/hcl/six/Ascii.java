package com.hcl.six;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Character: ");
		Scanner scanner=new Scanner(System.in);
		char character=scanner.next().charAt(0);
		scanner.close();
		
		int asciicode = character;
		System.out.println("The ASCII value of " + "character : " +asciicode);
		
		
		
	}

}
