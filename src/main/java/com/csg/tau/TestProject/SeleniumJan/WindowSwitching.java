package com.csg.tau.TestProject.SeleniumJan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowSwitching {
	@Test
	public void homepage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(10000);
		WebElement login=driver.findElement(By.xpath("//*[text()='Login']"));
		String parent=driver.getWindowHandle();
		login.click();
		Set<String> windows=driver.getWindowHandles();
		for(String child: windows){
			if(!child.equals(parent)){
				driver.switchTo().window(child);
				WebElement email=driver.findElement(By.name("username"));
				email.sendKeys("paras.sharma@gmail.com");
				
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}



}
