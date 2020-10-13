package com.day2.six;

public class Addition {
	
	  void addition(int arrayNumbers[],int number)
	  {
		  
		  int sum=arrayNumbers[0],i,j;
		  
		  for(i=1;i<number;i++)
		  {
			  
			  sum=sum+arrayNumbers[i];
			  
			  System.out.print(arrayNumbers[0]);
			  
			  for(j=1;j<=i;j++)
			  {
				  System.out.print("+"+arrayNumbers[j]);
			  }
			  
			  System.out.println("="+sum);
		  }
	  }
	}