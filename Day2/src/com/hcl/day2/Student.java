package com.hcl.day2;

import java.util.*;

public class Student {

	public static void main(String[] args) 
	{
		
		Calculator calculator = new Calculator();
		calculator.studentnumber=101;
		calculator.firstname="bhavya";
		calculator.lastname="ch";
		calculator.age=22;
		calculator.gender='F';
		calculator.english=24.5f;
		calculator.telugu=25.5f;
		calculator.major="cse";
		calculator.display();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(name.equals("bhavya"))
		{
			calculator.display();
		}
		else
		{
			System.out.println("Data not found!!!");
		}
		int number=sc.nextInt();
		if(number==101)
		{
			calculator.display();
		}
		else
		{
			System.out.println("Data not found!!!");
		}
		
		sc.close();
	}

}
