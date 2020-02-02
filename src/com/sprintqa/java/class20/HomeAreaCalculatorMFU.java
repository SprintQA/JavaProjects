package com.sprintqa.java.class20;

public class HomeAreaCalculatorMFU

{
	
	
	void areacalculation (int length, int width)
	{
		System.out.println ("area= " + (length * width));
	}
	
	
	
	public static void main (String [] args)
	{
	HomeAreaCalculatorMFU myhomebedroom = new HomeAreaCalculatorMFU ();
	myhomebedroom.areacalculation(15, 10);
		
	HomeAreaCalculatorMFU myhomekitchen = new HomeAreaCalculatorMFU ();
	myhomekitchen.areacalculation(15, 10);

	HomeAreaCalculatorMFU myhomelivingroom = new HomeAreaCalculatorMFU ();
	myhomelivingroom.areacalculation(15, 10);
		
	}
	
}
