package com.sprintqa.java.class22;

class Phone {
	String brand;
	String color;
	static int count;

	public void call() {
		System.out.println("Calling from..." + brand + " with color- " + color);
	}

	public void sendSMS(String number, String text) {
		System.out.println("Sendinng text.... to number " + number + " with text " + text);
	}
	
	public void displayCount() {
		System.out.println(count);
	}

}

public class StaticKeywordExample {
	public static void main(String args[]) {
		Phone iPhone1 = new Phone();
		Phone.count++;
		Phone iPhone2 = new Phone();
		Phone.count++;
		Phone iPhone3 = new Phone();
		Phone.count++;
		Phone iPhone4 = new Phone();
		Phone.count++;
		Phone iPhone5 = new Phone();
		Phone.count++;
		
		iPhone5.displayCount();
		
		

	}
}
