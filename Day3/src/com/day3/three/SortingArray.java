package com.day3.three;

import java.util.Scanner;

public class SortingArray {

	private static int[] sortingIntegers(int[] Integers) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10-(i+1);j++)
			{
				if(Integers[j]>Integers[j+1])
				{
					int temp=Integers[j];
					Integers[j]=Integers[j+1];
					Integers[j+1]=temp;
				}
			}
		}
		
		return Integers;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Integers[]=new int[10];
		System.out.println("Enter the 10 Integers: ");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			Integers[i]=scanner.nextInt();
		}
		
		scanner.close();
		
		sortingIntegers(Integers);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("The Sorting Integers are: " +Integers[i]);
		}
		
	}

	

}
