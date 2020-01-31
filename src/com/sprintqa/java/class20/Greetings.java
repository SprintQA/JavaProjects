package com.sprintqa.java.class20;

import java.util.Scanner;

public class Greetings
{
	
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter your name.");
		String userName = scanner.next ();
		// Call method
		greetUser (userName);
	}
	
	
  // Write a method that asks a user their name and greet them.
	public static void greetUser (String userName) // Method Header
	{
		System.out.println ("Hello, " + userName + "!"); // Implementation
	}
	
	
}
