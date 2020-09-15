package com.hcl.five;

public class Operation
{
	int checkPrime(int number)
	{
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count=1;
				break;
			}
		}
		return count;
	}
}
