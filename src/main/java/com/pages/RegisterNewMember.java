package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewMember {
	WebDriver driver;

	@FindBy(xpath="//input[@id='name']")
	private WebElement uname; 
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile; 
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email; 
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password; 
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement signInBtn; 
	
	public RegisterNewMember(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*public WebElement getName() {
		return driver.findElement(By.xpath("//input[@id='name']"));
	}*/
	/*public WebElement getMobile() {
	return driver.findElement(By.xpath("//input[@id='mobile']"));
}*/
	/*public WebElement getEmail() {
	return driver.findElement(By.xpath("//input[@id='email']"));
}*/
	/*public WebElement getPassword() {
	return driver.findElement(By.xpath("//input[@id='password']"));
}*/
	/*	public WebElement getSignInButton()
	{
		return driver.findElement(By.xpath("//button[text()='Sign In']"));
	}*/
	public void setName(String name) {
		uname.sendKeys(name);
	}
	
	public void setMobile(String mobileNo) {
	
		mobile.sendKeys(mobileNo);
	}
	
	public void setEmail(String emailID) {
		email.sendKeys(emailID);
	}
	
	public void setPassword(String passwordTxt) {
	password.sendKeys(passwordTxt);
	}
	
	public void clickSignInButton() {
		signInBtn.click();;
	}
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	

}
