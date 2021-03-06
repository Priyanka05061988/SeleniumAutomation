package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameSwitching {
@Test	
	public void homepage() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	  Thread.sleep(15000);
	  driver.switchTo().frame("globalSqa");
	  WebElement allDD=driver.findElement(By.id("current_filter"));
	  allDD.click();
	  driver.switchTo().defaultContent();
	  WebElement anotherTab=driver.findElement(By.id("menu-item-1561"));
	  anotherTab.click();
	}

}
