package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
@Test
public void ActionsTest() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rc=driver.findElement(By.xpath("//span[text()='right click me']"));
Thread.sleep(5000);
Actions act=new Actions(driver);
	act.contextClick(rc);
	
}
}
