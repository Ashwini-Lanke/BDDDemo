package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.RegisterNewMember;

public class NewMemberRegistrationTest {
	WebDriver driver;
	RegisterNewMember nm;
	LoginPage lp;
	@BeforeSuite
	public void setup()
	{
		driver= TestBase.initialization();
		nm= new RegisterNewMember(driver);
		lp= new LoginPage(driver);
	}

	
	@Test(priority=1)
	public void registerTest() {
		lp.clickRegisterLink();
	}
	
	@Test(priority=2)
	public void validateNewMemberRegistrationWithValidData()
	{
		nm.setName("Ashwini Lanke");
		nm.setMobile("1234567890");
        nm.setEmail("ashwini.lanke@test.com");
		nm.setPassword("123456");
		nm.clickSignInButton();
		nm.acceptAlert();
	}
	
	
}
