package com.hcl.nine;

import java.lang.Math;

public class UserMainCode
{
	public static int sumOfSquaresOfEvenDigits(int digit)
	{
		int remainder,sum=0;
		while(digit!=0)
		{
			remainder=digit%10;
			if(remainder%2==0)
			{
				sum= (int) (sum+ Math.pow(remainder,2));
			}
			digit=digit/10;
		}
		
		return sum;
	}
}
