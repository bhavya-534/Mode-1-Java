package com.day2.two;

import java.util.Scanner;

public class MiddleCharacter {

	static String middleCharacter(String string)
    {
        int position;
        int length;
        if (string.length() % 2 == 0)
        {
            position = string.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = string.length() / 2;
            length = 1;
        }
        return string.substring(position, position + length);
    }
	
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.print("The middle character in the string: " + middleCharacter(string));
    }
	
  
}
