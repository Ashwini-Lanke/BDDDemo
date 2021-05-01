package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	WebDriver driver;
	@FindBy(xpath="//button[text()='Add User']")
	private WebElement addUserBtn;
	
	public UsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public AddUser clickAddUser()
	{
		addUserBtn.click();
		return new AddUser(driver);
	}

}
