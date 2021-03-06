package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlerts {

	@Test
	public void homePage() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
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
		driver.close();
		
}
}