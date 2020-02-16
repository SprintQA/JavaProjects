package com.sprintqa.java.class31;

abstract class Page {
	abstract void openPage();
	abstract void waitForPageToLoad();
	
	public void verifyHeaderSection() {
		
	}
	
}

// IS - A 
class LoginPage extends Page {

	@Override
	void openPage() {
		System.out.println("click on login link");
	}

	@Override
	void waitForPageToLoad() {

	}
	
	public void doLogin(String usernmae, String password) {
		
	}

}

class HomePage extends Page {

	@Override
	void waitForPageToLoad() {

	}

	@Override
	void openPage() {
		System.out.println("click on login link");
		System.out.println("Do login");
	}

}

class ProfilePage extends Page {

	@Override
	void waitForPageToLoad() {

	}

	@Override
	void openPage() {
		System.out.println("click on login link");
		System.out.println("Do login");
		System.out.println("Click on profile tab");
	}

}

public class AbstractClassExample4 {

}
