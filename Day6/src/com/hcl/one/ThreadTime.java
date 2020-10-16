package com.hcl.one;

import java.util.Date;

public class ThreadTime extends Thread {

	static void displayCurrentTime()
	{
        Date date = new Date();
        Date currentTime = new java.sql.Time(date.getTime() );
        System.out.println("Display the Current Time : "+currentTime);
    }
	
	public void run() {
		
        try
        {
           
        	for(int i=0; i<2; i++) 
        	{
                displayCurrentTime();
                Thread.sleep(10000);
            }
        }

        catch(InterruptedException e)
        {
                System.out.println("Thread " +  Thread.currentThread() + " was  interrupted.");
        }
      }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadTime t1=new ThreadTime();
		t1.setName("MyThread");
		System.out.println("New Thread Name : "+t1);
		t1.start();
	}

}
