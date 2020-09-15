package com.day3.eight;

import java.util.Scanner;

public class UserMainCode {

	static String getString(String string) {
		// TODO Auto-generated method stub
	
			if(string.charAt(0)=='k' && string.charAt(1)=='b')
			{
				return string;
			}
			else if(string.charAt(0)=='k')
			{
				return string.charAt(0) + string.substring(2,string.length());
			}
			else if(string.charAt(1)=='b')
			{
				return string.charAt(1) + string.substring(2,string.length());
			}
			
			return string.substring(2,string.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		scanner.close();
		System.out.println(getString(string));
	}

	 
}
