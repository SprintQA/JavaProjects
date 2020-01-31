package com.sprintqa.java.class20;

public class ComputerShop
{

	public static void main (String[] args)
	{

		Computer apple = new Computer (); // instantiating objects
		apple.brand = "Apple";
		apple.memory = 4;
		apple.storage = 500;
		apple.OS = "MacOS";
		
		// adding behaviour
		apple.bootOS ();
		apple.browse ();
		apple.openTerminal ();

	}

}
