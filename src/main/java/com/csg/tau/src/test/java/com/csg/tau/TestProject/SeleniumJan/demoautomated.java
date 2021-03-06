package com.csg.tau.TestProject.SeleniumJan;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demoautomated {
	@Test
	public void homePage() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		AutomatedTester at=new AutomatedTester(driver);
		driver.get("http://book.theautomatedtester.co.uk/");
       Assert.assertTrue(at.clickOnChap1(), "Clicking on chapter 1 link");
       

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       //		WebElement  rb=driver.findElement(By.id("radiobutton"));
//		rb.click();
//		WebElement cb=driver.findElement(By.name("selected(1234)"));
//		cb.click();
//		WebElement tb=driver.findElement(By.className("belowcenter"));
//		tb.clear();
//		tb.sendKeys("Automation demo");
//		WebElement loadText=driver.findElement(By.id("secondajaxbutton"));
//		loadText.click();
//		
//		//Select dd=new Select(driver.findElement(By.id("selecttype")));
//		WebElement dropd=driver.findElement(By.id("selecttype"));
//		Select dd=new Select(dropd);
//		dd.selectByIndex(3);
//		WebElement hp=driver.findElement(By.linkText("Home Page"));
//		hp.click();
//		WebElement chap2=driver.findElement(By.linkText("Chapter2"));
//		chap2.click();
//		driver.close();
		
	}

}
