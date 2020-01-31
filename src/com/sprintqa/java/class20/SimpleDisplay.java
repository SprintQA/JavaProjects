package com.sprintqa.java.class20;

public class SimpleDisplay
{
 // Write a method to display your address
	
	public void displayAddress ()
	{
		System.out.println ("XYZ Company");
		System.out.println ("Anderson Road, Hwy Park Lane");
	}
	
	public static void main (String [] args)
	{
		SimpleDisplay display = new SimpleDisplay ();
		display.displayAddress ();
	}
}
