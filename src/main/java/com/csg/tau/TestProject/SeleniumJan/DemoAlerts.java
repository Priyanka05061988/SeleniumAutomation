package com.csg.tau.TestProject.SeleniumJan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlerts {
	@Test
	public void homepage() throws InterruptedException{
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
	 // Code for Alert box
//	  WebElement pop1=driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']/following-sibling::button"));
//	  pop1.click();
//	  Alert alr=driver.switchTo().alert();
//	  alr.accept();
//	  Thread.sleep(5000);
//	  
//	  //Code for Alert box to accept & dismiss
//	  WebElement pop2=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
//	  pop2.click();
//	  Alert alr1=driver.switchTo().alert();
//	  alr1.accept();
//	  
//	  WebElement pop3=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
//	  pop3.click();
//	  Alert alr2=driver.switchTo().alert();
//	  alr2.dismiss();
	  
	 //Code for Alert box to accept & dismiss with input text
	  WebElement pop4=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
	 // WebElement pop4=driver.findElement(By.xpath("//p[text()='Click below button for prompt box.']/"));
	  pop4.click();
	  Alert alr3=driver.switchTo().alert();
	  alr3.sendKeys("Priyanka");
	  alr3.accept();
	  
//	  WebElement pop5=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
//	  pop5.click();
//	  Alert alr4=driver.switchTo().alert();
//	  alr4.dismiss();
	  //driver.close();

}
}