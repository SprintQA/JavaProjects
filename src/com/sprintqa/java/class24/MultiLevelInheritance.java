package com.sprintqa.java.class24;


class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Barking......");
	}
}

class BabyDog extends Dog{
	public void weep() {
		System.out.println("weepping....");
	}
}



public class MultiLevelInheritance {

	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weep();
		
<<<<<<< HEAD
		//Dog d = new Dog();
		//d.weep();
=======
		Dog d = new Dog();
>>>>>>> d4083a441fec3acd3af3029e4fb48467d88a1639
		
	}

}
