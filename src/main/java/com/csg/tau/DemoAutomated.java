package com.csg.tau;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAutomated {
		 @Test
		 public void homePage() throws InterruptedException{
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  AutomatedTestPageFactory at=new AutomatedTestPageFactory(driver);
		  driver.get("http://book.theautomatedtester.co.uk/");
		       Assert.assertTrue(at.clickOnChap1(), "Clicking on chapter 1 link");
		       



}
