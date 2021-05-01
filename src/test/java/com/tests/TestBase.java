package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Ashwini/Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		return driver;
		
	}

}
