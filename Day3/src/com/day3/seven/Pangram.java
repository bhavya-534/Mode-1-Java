package com.day3.seven;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence:");
		Scanner scanner=new Scanner(System.in);
		String sentence=scanner.nextLine();
		if(Pangram(sentence)==true)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
		
	}
	
	private static boolean Pangram(String sentence)
	{
		// TODO Auto-generated method stub
		boolean  checkPangram[]=new boolean[26];
		int index=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z')
			{
				index=sentence.charAt(i)-'a';
			}
			else if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
			{
				index=sentence.charAt(i)-'A';
			}
			else
			{
				continue;
			}
			checkPangram[index]=true;
		}
		
		for(int i=0;i<=25;i++)
		{
			if(checkPangram[i]==false)
			{
				return false;
			}
		}
		
		return true;
	}

}	


