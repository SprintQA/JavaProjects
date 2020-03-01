package com.sprintqa.java.class39.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlingDemo
{

	public static void main (String[] args)
	{
		createFile();
	}
	
	public static void createFile()
	{
		File file = new File ("resources/nonexistent.txt");
		try
		{
			file.createNewFile ();
		}
		catch (IOException e)
		{
			System.out.println ("Directory does not exist.");
			e.printStackTrace();
		}
	}

}

