package com.sprintqa.java.class28;

class Car {
	private int numberOfCC=90;
	private String make;
	private int makeYear;

	public int getNumberOfCC() {
		return numberOfCC;
	}

	public void setNumberOfCC(int numberOfCC) {
		this.numberOfCC = numberOfCC;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make1) {
		make ="Ford";
	}

	public int getMakeYear() {
		return makeYear;
	}

}

public class EncapsulationExample1 {
	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car();
		c.setNumberOfCC(1000);
		System.out.println(c.getNumberOfCC());
		
	}
}
