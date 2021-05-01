package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver dpdriver;

@FindBy(linkText="LOGOUT")
private WebElement logoutBtn;

@FindBy(xpath="//span[text()='Users']")
private WebElement UsersTab;
	
	public DashboardPage(WebDriver driver) {
		dpdriver=driver;
		PageFactory.initElements(dpdriver, this);
	}
	/*private WebElement getLogoutButton() {
		return dpdriver.findElement(By.linkText("LOGOUT"));
	}*/
	
	public void clickLogout() {
		logoutBtn.click();
	}
	
	public UsersPage clickUsersTab()
	{
		UsersTab.click();
		return new UsersPage(dpdriver);
		
	}

}
