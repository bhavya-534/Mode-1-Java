package com.day2.three;

import java.util.Scanner;


public class VowelsCount {

	 static int checkVowels(String sentence)
	 {
		 int vowelsCount=0;
		 
			for(int i=0;i<sentence.length();i++)
			{
				if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o'
					|| sentence.charAt(i)=='u' || sentence.charAt(i)=='A' || sentence.charAt(i)=='E' || sentence.charAt(i)=='I'
					|| sentence.charAt(i)=='O' || sentence.charAt(i)=='U')
				{
					vowelsCount++;
				}
			}
			
			return vowelsCount;
	 }
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		System.out.println("Number of Vowels in the String: "+ checkVowels(sentence));
		
	}

	

}
