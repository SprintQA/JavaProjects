package com.sprintqa.java.class27;

class Bike {                    // Parent class
	public int getMaxSpeed() {
		return 100;
	}
}


// Child class
class HondaBike extends Bike{
	public int getMaxSpeed() { // Overridden method
		return 180;
	}
}



public class MethodOverridingExample5 {
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.getMaxSpeed();   // Parent class method
		
		HondaBike hb = new HondaBike();
		hb.getMaxSpeed();  // Child class method
		
		Bike b1 = new HondaBike();
		b1.getMaxSpeed(); //  Child class method
		
		HondaBike hb1 = new Bike(); // Class caste error
		hb1.getMaxSpeed();
		
	}
}
