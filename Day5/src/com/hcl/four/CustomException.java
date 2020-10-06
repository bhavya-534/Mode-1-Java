package com.hcl.four;

public class CustomException extends Exception
{
	public String toString()
	{
		return "InvalidAgeRange";
	}
}
