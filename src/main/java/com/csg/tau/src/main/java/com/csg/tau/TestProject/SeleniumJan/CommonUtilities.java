package com.csg.tau.TestProject.SeleniumJan;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilities {

	WebDriver driver;
	
	public boolean clickSafelyOn(WebElement ele){
		try{
		Thread.sleep(1000);
		ele.click();
		return true;
		}catch(NoSuchElementException ex){
			//ele.click();
			System.out.println("Not able to find the element "+ex);
			return false;
		}catch(ElementNotInteractableException ex){
			System.out.println("Not able to click on the element "+ex);
			return false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
		
		public void enterSafelyIn(WebElement ele, String text){
			try{
			Thread.sleep(1000);
			ele.clear();
			ele.sendKeys(text);
			}catch(NoSuchElementException ex){
				//ele.click();
				System.out.println("Not able to find the element "+ex);
				
			}catch(ElementNotInteractableException ex){
				System.out.println("Not able to click on the element "+ex);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
