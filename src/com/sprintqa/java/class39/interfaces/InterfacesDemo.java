package com.sprintqa.java.class39.interfaces;

interface Product
{
	double getPrice ();
	void setPrice (double price);
	String getName();
	void setName(String name);
	
	default String getBarcode()
	{
		return "some barcode";
	}
}

class Book implements Product
{
	private double price;
	private String name;

	@Override
	public double getPrice ()
	{
		return price;
	}

	@Override
	public void setPrice (double price)
	{
		this.price = price;
		
	}

	@Override
	public String getName ()
	{
		return name;
	}

	@Override
	public void setName (String name)
	{
		this.name = name;
	}
	
}

public class InterfacesDemo
{

	public static void main (String[] args)
	{
		Product book = new Book ();
		book.setName ("Alchemist");
		book.setPrice (9.99);
		System.out.println (book.getName ());
		System.out.println (book.getPrice ());

	}

}
