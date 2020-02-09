package com.sprintqa.java.class27;

// Write a program to create Page as a base class and Login and HomePage as a child class
// In page class create one method that will override by child in respective child class
// Also create one method specific to each class
// Create object in main method with different combination

class Page {
	public void openPage() {
		System.out.println("Opening Page");
	}

	public void displayHeaderAndFooter() {

	}
}

class LoginPage extends Page {

	public void openPage() {
		System.out.println("Opening Login Page");
	}

	public void doLogin() {

	}
}

class HomePage extends Page {
	public void openPage() {
		System.out.println("Opening Home Page");
	}
	
	public void searchProduct() {
		System.out.println("Searching for product");
	}
}

class ProfilePage extends Page {
	public void openPage() {
		System.out.println("Opening Profile Page");
	}
	public void changePassword() {
		
	}
}

class PageOperation{
	public void openPage(Page page) {
		page.openPage();
	}
}

public class BasicWebApplication {
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		PageOperation po = new PageOperation();
		
		po.openPage(lp);
		lp.doLogin();
		po.openPage(hp);
		hp.searchProduct();
		
		
	}
}
