package com.day3.nine;

public class UserMainCode {

	 static String reshape(String string,char character)
	 {
		 String reverseString =new StringBuffer(string).reverse().toString();	 
		 
		 StringBuilder stringBuilder= new StringBuilder();
		 
		 for(int i=0;i<reverseString.length();i++)
		 {
			 
			 	stringBuilder.append(reverseString.charAt(i));
			 	
		   		if(i==reverseString.length()-1)
				{
					break;
				}
		   		
				stringBuilder.append(character);
		 }
		 
		 String finalString = stringBuilder.toString();
		 
			return finalString;
			
	}
}
