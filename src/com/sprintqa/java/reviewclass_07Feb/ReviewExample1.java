package com.sprintqa.java.reviewclass_07Feb;

class Car{
	int speed;
}

class Demo{
	int a;
	Car c;  // Declaring object of class Car
	
	public void printObj() {
		System.out.println(c.speed);
	}
	
}

public class ReviewExample1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.printObj();
	}

}
