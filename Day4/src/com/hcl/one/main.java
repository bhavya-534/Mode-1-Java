package com.hcl.one;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Rectangle");
		System.out.println("Enter the shape name ");
		String option=scanner.next();
		switch(option)
		{
		
		case "Circle": 
			System.out.println("Enter radius of circle");
			float radius = scanner.nextFloat();
			Circle circle = new Circle("Circle", radius);
			System.out.println("Area of " + circle.name + circle.calculateArea());
		break;
		
		case "Square":
			System.out.println("Enter side of Square");
			float side = scanner.nextFloat();
			Square square = new Square("Square", side);
			System.out.println("Area of " + square.name + square.calculateArea());
		break;
		
		case "Rectangle":	
			System.out.println("Enter length of rectangle");
			float length = scanner.nextFloat();
			System.out.println("Enter breadth of rectangle");
			float breadth = scanner.nextFloat();
			Rectangle rectangle = new Rectangle("Rectangle", length, breadth);
			System.out.println("Area of " + rectangle.name + rectangle.calculateArea());
		break;
		
		default:
			System.out.println("The option is incorrect");
			
		}
		scanner.close();
	}
	
}
