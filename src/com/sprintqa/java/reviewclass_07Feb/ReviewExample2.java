package com.sprintqa.java.reviewclass_07Feb;

// Param
class Vehical{
	String color;
	
	Vehical(){
		System.out.println(color);
	}
	
	public Vehical(String color) {
		System.out.println(color);
	}
	
}

class Scooter extends Vehical{
	
	Scooter(){
		super();
	}
	
	Scooter(String color){
		super(color);
	}
}



public class ReviewExample2 {
	public static void main(String[] args) {
		Scooter sc = new Scooter();
	}
	
	
}
