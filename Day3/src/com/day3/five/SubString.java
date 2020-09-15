package com.day3.five;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		System.out.println("Enter the two Index Positions: ");
		int firstIndex=scanner.nextInt();
		int secondIndex=scanner.nextInt();
		scanner.close();
		System.out.println("The Sub String is: "+word.substring(firstIndex,secondIndex));
	}

}
