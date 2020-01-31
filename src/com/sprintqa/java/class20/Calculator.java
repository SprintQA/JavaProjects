package com.sprintqa.java.class20;

public class Calculator
{
	// Write a calculator class and using this create your own calculator object which can add, substract, multiply, 
	// and divide two numnbers.
	
	void sum (int a, int b)
	{
		System.out.println ("sum= " + (a + b));
	}
	
	void sub (int a, int b)
	{
		System.out.println ("sub= " + (a - b));
	}
	
	void mult (int a, int b)
	{
		System.out.println ("product= " + (a * b));
	}
	
	void div (double a, double b)
	{
		System.out.println ("division= " + (a / b));
	}
	
	
	public static void main (String [] args)
	{
		Calculator casio = new Calculator ();
		casio.sum (10, 12);
		casio.sub (12, 6);
		
		// Razor
		Calculator razor = new Calculator ();
		razor.sub (5, 5);
		razor.sum (5, 5);
		razor.mult (5, 5);

		
	}
	
}
