package com.day2.six;

import java.util.Scanner;

public class MainAddition {
	
 public static void main(String args[])
 {
	 
	 Scanner scanner=new Scanner(System.in);
	 
	 System.out.println("Enter Range of numbers:");
	 int number=scanner.nextInt();
	 
	 System.out.println("Enter numbers :");
	 
	 int i;
	 
	 int arrayNumbers[]=new int[number];
	 
	 for(i=0;i<number;i++)
	 {
       arrayNumbers[i]=scanner.nextInt();
	 }
	 
	 Addition object=new Addition();
	 object.addition(arrayNumbers,number);
 }
}
