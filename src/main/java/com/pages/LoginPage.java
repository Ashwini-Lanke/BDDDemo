package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver lpdriver;

@FindBy(id="email")
private WebElement uname;

@FindBy(id="password")
private WebElement pass;

@FindBy(xpath="//button")
private WebElement loginbutton;

@FindBy(partialLinkText="Register")
private WebElement registerLink;



	public LoginPage(WebDriver driver) {
		lpdriver=driver;
		PageFactory.initElements(lpdriver, this);
		
	}
	
	/*private WebElement getUserName() {
		return lpdriver.findElement(By.id("email"));
	}
	private WebElement getpassword() {
		return lpdriver.findElement(By.id("password"));
	}
	private WebElement getLoginButton() {
		return lpdriver.findElement(By.xpath("//button"));
		
	}
	private WebElement getregisterLink() {
		return lpdriver.findElement(By.partialLinkText("Register"));		
	}*/
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	
	
	public void enterUsername(String text) {
		uname.sendKeys(text);
	}
	
	public void enterPassword(String text) {
		pass.sendKeys(text);
	}
	public void clickLoginButton() {
		loginbutton.click();
	}
	
	public DashboardPage validLogin()
	{
		enterUsername("kiran@gmail.com");
		enterPassword("123456");
		clickLoginButton();
		return new DashboardPage(lpdriver);
	}

}
