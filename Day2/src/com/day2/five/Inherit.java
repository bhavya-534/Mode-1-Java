package com.day2.five;

class a
{
	int b=6;
}

class b extends a
{
  b()
  {
	  System.out.println("b="+b);
  }
}

public class Inherit {
	
  public static void main(String args[])
  {
	  b object=new b();
  }
  
}
