package com.sprintqa.java.class39.keywords;

class Box
{
	double width;
	double height;
	double depth;
	
	Box (double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume ()
	{
		return width * height * depth;
	}
}


public class ThisDemo
{

	public static void main (String[] args)
	{
		Box smallBox = new Box (10, 12, 9);
		System.out.println ("Width: " + smallBox.width);
		System.out.println ("Height: " + smallBox.height);
		System.out.println ("Depth: " + smallBox.depth);
	}

}
