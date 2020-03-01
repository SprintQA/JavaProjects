package com.sprintqa.java.class39.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class RethrowingDemo
{

	public static void main (String[] args) throws Exception
	{
	
		calculateSalary(50);
	}
	
	public static void createFileRethrow() throws Exception
	{
		File file = new File ("resources/nonexistent.txt");
		file.createNewFile ();
	}
	
	public static void calculateSalary (double hours)
	{
		if (hours > 40)
		{
			throw new IllegalArgumentException ("We do not allow overtime.");
		}
	}

}
