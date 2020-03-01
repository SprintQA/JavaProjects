package com.sprintqa.java.class39.encapsulation;

class Person
{
	private String name;
	
	// Setter - allow you to update the value of name
	public void setName (String strName)
	{
		name = strName;
	}
	
	// Getter - will allow you to access the value of the name
	public String getName ()
	{
		return name;
	}
}


public class EncapsulationDemo
{

	public static void main (String[] args)
	{
		Person person = new Person ();
		person.setName ("Kamil");
		System.out.println (person.getName ());
		
	}

}
