package com.sprintqa.java.class19;

public class ProceduralWay
{

	public static void main (String[] args)
	{
		rotate ("Square", 0, 0);
		playSound ("Square");

	}
	
	public static void rotate (String shape, int xPt, int yPt)
	{
		System.out.println ("rotate");
		if (shape.equalsIgnoreCase ("Amoeba"))
		{
				System.out.println ("rotate by " + xPt + "and " + yPt);
		}
			
	}
	
	public static void playSound (String shape)
	{
		System.out.println ("play .mp3 file");
	}

}
