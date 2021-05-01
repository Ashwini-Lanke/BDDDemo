package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.AddUser;

public class AddUserTest {
	
	WebDriver driver;
	AddUser au;

	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
		au= new AddUser(driver);
		
	}
	@Test(priority=1)
	public void addUser() {
		
		au.setUserName("Ashwini");
		au.setMobile("1234567890");
		au.setEmail("ashwini.lanke@test.com");
		au.setCourse("Selenium");
		au.setGender("Female");
		au.setState("Maharashtra");
		au.setPassword("1234567890");
		au.submitAddUser();
		
	}
	

}
