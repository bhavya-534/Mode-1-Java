package com.hcl.day2;

public class Calculator 
{
	int studentnumber;
	String firstname;
	String lastname;
	int age;
	char gender;
	float english;
	float telugu;
	String major;
	
	void display()
	{
		System.out.println(firstname+lastname);
		System.out.println(age);
		if(gender=='F')
		{
			System.out.println("female");
		}
		else
		{
			System.out.println("male");
		}
		float marks=english+telugu;
		System.out.println(marks);
		System.out.println(marks/2);
		System.out.println(major);
	}
		
			
}
