package com.test;// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)

// An Enum class 
enum Day 
{ 
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	THURSDAY, FRIDAY, SATURDAY; 
} 

// Driver class that contains an object of "day" and 
// main(). 
public class GFG
{ 
	Day day; 

	// Constructor 
	public GFG(Day day)
	{ 
		this.day = day; 
	} 

	public GFG(){

	}

	// Prints a line about Day using switch 
	public void dayIsLike() 
	{ 
		switch (day) 
		{ 
		case MONDAY: 
			System.out.println("Mondays are bad."); 
			break; 
		case FRIDAY: 
			System.out.println("Fridays are better."); 
			break; 
		case SATURDAY: 
		case SUNDAY: 
			System.out.println("Weekends are best."); 
			break; 
		default: 
			System.out.println("Midweek days are so-so."); 
			break; 
		} 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		String str = "";
		//GFG t1 = new GFG(Day.valueOf(str));
		GFG t1 = new GFG();
		t1.dayIsLike();
	} 
} 
