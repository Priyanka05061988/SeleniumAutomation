package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class DemoNewTours {

@Test
public void homePage() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.phptravels.net/home");
	WebElement myAccount=driver.findElement(By.xpath("//*[@class='mini-menu']/ul/li[3]"));
	
	myAccount.click();
	WebElement signUp=driver.findElement(By.linkText("Sign Up"));
	signUp.click();
	driver.close();
	//WebElement fName=driver.findElement(By.xpath("//span[text()='First Name']"));
	
//	fName.click();
	//Thread.sleep(2000);
	
	//fName.sendKeys("Paras");
}
}
