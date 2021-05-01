package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.AddUser;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UsersPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage lp=null;
	DashboardPage dp=null;
	UsersPage up=null;
	AddUser au=null;
	
	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
		lp= new LoginPage(driver);
		//dp= new DashboardPage(driver);
	}
	
	@AfterSuite
	public void Close()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void loginTestCase() {
	   dp= lp.validLogin();
	//	dp.clickLogout();
		up=dp.clickUsersTab();
	   au=up.clickAddUser();
	   au.addUser();
	}
	
	@Test(priority=2)
	public void registerTest() {
		lp.clickRegisterLink();
	}

}
