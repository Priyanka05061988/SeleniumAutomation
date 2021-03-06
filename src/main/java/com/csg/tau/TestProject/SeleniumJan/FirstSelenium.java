package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSelenium {
	@Test
	public void startBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		Thread.sleep(10000);
		WebElement x=driver.findElement(By.linkText("Software Testing"));
		x.click();
		Thread.sleep(5000);
		driver.close();
	}

}
