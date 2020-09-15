package com.day3.four;

import java.util.Scanner;

public class SearchingArray {

		private static int searchingInteger(int numberOfIntegers,int[] Integers,int serachElement) {
			// TODO Auto-generated method stub
			int position = 0;
			for(int i=0;i<numberOfIntegers;i++)
			{
				if(serachElement==Integers[i])
				{
					position=i+1;
				}
			}
		
			return position;	
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the Number Of Integers: ");
			
			int numberOfIntegers=scanner.nextInt();
			
			int Integers[]=new int[numberOfIntegers];
			
			System.out.println("Enter the Integers: ");
			
			for(int i=0;i<numberOfIntegers;i++)
			{
				Integers[i]=scanner.nextInt();
			}
			
			System.out.println("Enter the Searching Integer: ");
			
			int searchElement=scanner.nextInt();
			
			scanner.close();
			
			System.out.println("The Position of Searching Element is: " +searchingInteger(numberOfIntegers,Integers,searchElement));
			
		
			
		}

}
