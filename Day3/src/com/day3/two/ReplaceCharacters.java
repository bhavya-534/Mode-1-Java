package com.day3.two;

import java.util.Scanner;

public class ReplaceCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		scanner.close();
		System.out.println("The Replacement of all 'd' occurences with 'h' is: "+word.replace('d','h'));
	}

}
