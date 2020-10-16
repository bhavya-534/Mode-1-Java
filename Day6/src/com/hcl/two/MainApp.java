package com.hcl.two;

import java.util.Date;

public class MainApp extends Thread {

	static void displayCurrentTime()
	{
        Date date = new Date();
        Date currentTime = new java.sql.Time(date.getTime() );
        System.out.println("Display the Current Time : "+currentTime);
    }
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MainApp t1=new MainApp();
		t1.setName("MyThread");
		System.out.println("New Thread Name : "+t1);
		t1.start();
	}

}
