package com.sprintqa.java.class25;

class Car {
	int maxSpeed;

	public Car() {
		System.out.println("1. From Car Class");
		maxSpeed = 100;
	}

	public void testMaxSpeed() {
		System.out.println("2. Max speed is " + maxSpeed);
	}
}

// child class(BMW) = function(parent class) + it's own

class BMW extends Car {
	public BMW(){
		System.out.println("3. From class BMW");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.testMaxSpeed();
	}

}
