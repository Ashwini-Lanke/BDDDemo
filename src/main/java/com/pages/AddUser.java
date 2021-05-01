package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUser {
	WebDriver audriver;
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(id="Male")
	private WebElement genderMale;
	
	@FindBy(id="Female")
	private WebElement genderFemale;
	
	@FindBy(xpath="//select")
	private WebElement state;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	
	public AddUser(WebDriver driver)
	{
		audriver=driver;
		PageFactory.initElements(audriver, this);
	}
	
	public void setUserName(String userName)
	{
		uname.sendKeys(userName);
	}
	
	public void setEmail(String userEmail)
	{
		email.sendKeys(userEmail);
	}

	
	public void setMobile(String userMobile)
	{
		mobile.sendKeys(userMobile);
	}

	
	public void setCourse(String userCourse)
	{
		course.sendKeys(userCourse);
	}
	
	public void setGender(String userGender)
	{
		if(userGender=="Male")
		{
			genderMale.click();
		}
		else
		{
			genderFemale.click();
			
		}
		
	}
	
	public void setState(String userState)
	{
		Select st=new Select(state);
		st.selectByVisibleText(userState);
	}
	
	public void setPassword(String userPassword)
	{
		password.sendKeys(userPassword);
	}
	
    public void submitAddUser()
	{
		submit.click();
	}
    
       public void addUser() {
		
	    setUserName("Ashwini");
		setMobile("1234567890");
		setEmail("ashwini.lanke@test.com");
		setCourse("Selenium");
		setGender("Female");
		setState("Maharashtra");
		setPassword("1234567890");
		submitAddUser();
		
	}
	

}
