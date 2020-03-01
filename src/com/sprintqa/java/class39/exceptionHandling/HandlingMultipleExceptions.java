package com.sprintqa.java.class39.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingMultipleExceptions
{

	public static void main (String[] args)
	{
		numberExceptionHandling ();

	}
	
	public static void numberExceptionHandling ()
	{
		File file = new File ("resources/numbers.txt");
		Scanner fileReader = null;
		try
		{
			fileReader = new Scanner(file);
			while (fileReader.hasNext ())
			{
				double num = fileReader.nextDouble();
				System.out.println (num);
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fileReader.close();
		}
		
		
	}

}
