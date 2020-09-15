package com.day3.six;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word=scanner.nextLine();
		scanner.close();
		
		String reverseWord=new StringBuffer(word).reverse().toString();
		if(word.equals(reverseWord))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
