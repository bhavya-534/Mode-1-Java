package com.day3.one;

import java.util.Scanner;

public class LowerCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		scanner.close();
		System.out.println("The LowerCase String is: "+word.toLowerCase());
	}

}
