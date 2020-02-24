package com.sprintqa.java.class32;

interface Flower{
	public abstract void month(); 
	public abstract void quality();
}
abstract class Piony{
	public abstract void bloom();
}

class Rose extends Piony implements Flower{

	public void month() {
		System.out.println("Roses bloom in ");
		
	}

	public void quality() {
		System.out.println("Roses smell fantastic");
		
		
	}
	@Override
	public void bloom() {
		
		
	}
public class InterfaceMyExample{
	public static void main(String [] args) {
		
	}
	
}

}