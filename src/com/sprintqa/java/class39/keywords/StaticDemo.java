package com.sprintqa.java.class39.keywords;

class Computer
{
	private int ram;
	static int year = 1833;
	
	void setRam (int r)
	{
		ram = r;
	}
	
	int getRAM ()
	{
		return ram;
	}
	
	// static method
	static void displayInventor ()
	{
		System.out.println ("Charles Babbage.");
	}
}

public class StaticDemo
{

	public static void main (String[] args)
	{
		Computer hp = new Computer ();
		hp.setRam (8);
		System.out.println (hp.getRAM ());
		System.out.println (Computer.year);
		Computer.displayInventor ();
		//demonstrateStatic ();

	}
	
	public static void demonstrateStatic ()
	{
		System.out.println ("I'm static.");
	}

}
