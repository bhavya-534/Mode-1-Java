package com.hcl.eight;

public class OddDigit
{
	public static int checkSum(int digit)
	{
		int remainder,sum=0;
		while(digit!=0)
		{
			remainder=digit%10;
			if(remainder%2!=0)
			{
				sum=sum+remainder;
			}
			digit=digit/10;
		}
		
		if(sum%2!=0)
		{
			return 1;
		}
		else
		{
			return  -1;
		}
		
	}
}
