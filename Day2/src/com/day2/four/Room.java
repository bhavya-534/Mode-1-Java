package com.day2.four;

public class Room {
	
	 int roomno; 
	 String roomtype; 
	 float roomarea; 
	 boolean ACmachine; 
	 
	 void setData(int roomNumber, String roomType, float roomArea, boolean acMachine) 
	 { 
	 roomno = roomNumber; 
	 roomtype = roomType; 
	 roomarea = roomArea; 
	 ACmachine = acMachine; 
	 } 
	 void displayData() 
	 { 
	 System.out.println("The Room Number : " + roomno); 
	 System.out.println ("The Room Type : " + roomtype); 
	 System.out.println ("The Room Area : " + roomarea); 
	 String checkAC = (ACmachine) ? "yes " : "no "; 
	 System.out.println ("The Air Conditioner Machine needed : " + checkAC); 
	 } 
	 
	 public static void main(String arg[]) 
	 { 
	 Room room = new Room ( ); 
	 room. setData (101, "Super Deluxe", 360.0f, true); 
	 room.displayData ( ); 
	 } 
	
}
