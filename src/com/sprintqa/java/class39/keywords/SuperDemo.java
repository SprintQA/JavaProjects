package com.sprintqa.java.class39.keywords;

class BoxWeight extends Box
{
	double weight;
	
	BoxWeight (double w, double h, double d, double m)
	{
		super (w, h, d);
		weight = m;
	}
	
	double volume ()
	{
		return super.volume ();
	}
}


public class SuperDemo
{

	public static void main (String[] args)
	{
		BoxWeight bigBox = new BoxWeight (10, 12, 14, 30);
		System.out.println ("Volume of the box: " + bigBox.volume ());

	}

}
