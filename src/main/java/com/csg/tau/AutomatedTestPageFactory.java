package com.csg.tau;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomatedTestPageFactory extends CommonUtilities{
 WebDriver driver;
 
 public AutomatedTestPageFactory(WebDriver cdriver){
  super();
  this.driver=cdriver;
  PageFactory.initElements(driver, this);
 }


 @FindBy(linkText="Chapter1") 
 public WebElement chap1;
 
 @FindBy(id="radiobutton")
 public WebElement rb;
 
 @FindBy(name="selected(1234)")
 public WebElement cb;
 
 @FindBy(className="belowcenter")
 public WebElement tb;
 
 @FindBy(id="secondajaxbutton")
 public WebElement loadText;
 
// @FindBy(id="selecttype")
// public WebElement dropd;
 
 @FindBy(linkText="Home Page")
 public WebElement hp;
 
 @FindBy(linkText="Chapter2")
 public WebElement chap2;

 public boolean clickOnChap1(){
  boolean result=clickSafelyOn(chap1);
return result;
 }
 
 public void clickOnRB(){
  clickSafelyOn(rb);
 }
 
 public void clickOnCB(){
  clickSafelyOn(cb);
 }
 
 public void sendText(){
  enterSafelyIn(tb,"Paras Sharma");
 }
 
 public void clickOnLT(){
  clickSafelyOn(loadText);
 }
 
// public void selectFromDD(){
//  Select dd=new Select(dropd);
//  dd.selectByIndex(3);
// }
 
 public void clickOnHP(){
  clickSafelyOn(hp);
 }
 
 public void clickOnChap2(){
  clickSafelyOn(chap2);
 }
}
