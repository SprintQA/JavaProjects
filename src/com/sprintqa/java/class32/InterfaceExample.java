package com.sprintqa.java.class32;

<<<<<<< HEAD
interface Vehical {
	public void changeGear(int gearNumber);

	public void speedUp(int speedCount);

	public void applyBreak(int breakCount);

	public void displayStatus();

	public void servicing();
}

class Bike implements Vehical {
	int speed, gear;

	Bike() {
		speed = 0;
		gear = 0;
	}

	@Override
=======
abstract class Vehical {
	int gear, speed;

>>>>>>> 4486fe0713843b7c667978969c0c61c436ef8292
	public void changeGear(int gearNumber) {
		gear = gearNumber;
	}

	public void speedUp(int speedCount) {
		speed = speed + speedCount;
	}

	public void applyBreak(int breakCount) {
		if (breakCount > speed) {
			speed = 0;
		} else {
			speed = speed - breakCount;
		}
	}

	public void displayStatus() {
		System.out.println("Running at speed " + speed + " with gear number " + gear);
	}

	public void servicing() {
		speed = 0;
		gear = 0;
		System.out.println("Servicing........");
	}
}

class Bike extends Vehical {

}

class Car extends Vehical {

}

class Repair {
	public void doService(Vehical v) {
		v.servicing();
	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Car AudiA4 = new Car();
		Bike suzukiBike = new Bike();
		Repair r = new Repair();

		AudiA4.displayStatus();
		AudiA4.changeGear(3);
		AudiA4.speedUp(50);
		AudiA4.displayStatus();
		r.doService(AudiA4);

		suzukiBike.displayStatus();
		suzukiBike.changeGear(2);
		suzukiBike.speedUp(20);
		suzukiBike.displayStatus();
		r.doService(suzukiBike);
	}
}
