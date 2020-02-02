package com.sprintqa.java.class22;

class CellPhone {
	String brand;
	String color;
	boolean gpsEnable;

	public void call(String number) {
		System.out.println("Calling from..." + brand + " with color- " + color+" gps "+gpsEnable);
	}

	public void sendSMS(String number, String text) {
		System.out.println("Sendinng text.... to number " + number + " with text " + text);
	}

}

public class TestingObjAndClass {
	public static void main(String args[]) {
		CellPhone iPhone4 = new CellPhone();
		CellPhone motoG5 = new CellPhone();


		motoG5.brand = "Moto";
		motoG5.color = "Black";

//		motoG5.call("");
		iPhone4.call("12345");

	}
}
