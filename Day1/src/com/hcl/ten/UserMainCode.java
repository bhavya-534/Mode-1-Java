package com.hcl.ten;

public class UserMainCode
{
	public static String getLargestWord(String sentence)
	{
		int wordLength,maximumWordLength=0;
		
		String words[]=sentence.split(" ");
		
		String maximumWord=null;
		
		for(int i=0;i<words.length;i++)
		{
			
			wordLength=words[i].length();
			
			if(wordLength>maximumWordLength)
			{
				maximumWordLength=wordLength;
				maximumWord=words[i];	
			}
			
		}
		
		return maximumWord;
	}
}
