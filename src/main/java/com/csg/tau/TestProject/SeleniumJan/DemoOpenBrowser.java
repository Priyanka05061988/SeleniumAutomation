

package com.csg.tau.TestProject.SeleniumJan ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoOpenBrowser {
 @Test
 public void homePage() throws InterruptedException{
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://book.theautomatedtester.co.uk/");
  WebElement chap1=driver.findElement(By.linkText("Chapter1"));
  chap1.click();
  WebElement  rb=driver.findElement(By.id("radiobutton"));
  rb.click();
  WebElement cb=driver.findElement(By.name("selected(1234)"));
  cb.click();
  WebElement tb=driver.findElement(By.className("belowcenter"));
  tb.clear();
  tb.sendKeys("Automation demo");
  WebElement loadText=driver.findElement(By.id("secondajaxbutton"));
  loadText.click();
  //Select dd=new Select(driver.findElement(By.id("selecttype")));
  WebElement dropd=driver.findElement(By.id("selecttype"));
  Select dd=new Select(dropd);
  dd.selectByIndex(3);
  WebElement hp=driver.findElement(By.linkText("Home Page"));
  hp.click();
  WebElement chap2=driver.findElement(By.linkText("Chapter2"));
  chap2.click();
  
 }

}

