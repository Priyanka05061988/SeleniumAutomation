package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OpenBrowser {
	@Test
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://book.theautomatedtester.co.uk");
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Chapter1")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Chapter1")));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Chapter1")));


		WebElement ele=driver.findElement(By.linkText("Chapter1"));
		ele.click();
		//Thread.sleep(10000);
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		WebElement textBox=driver.findElement(By.className("belowcenter"));
		textBox.clear();
		textBox.sendKeys("Learning Selenium");
		WebElement textBox1=driver.findElement(By.className("belowcenter"));
	
		
		driver.close();
	}

}
