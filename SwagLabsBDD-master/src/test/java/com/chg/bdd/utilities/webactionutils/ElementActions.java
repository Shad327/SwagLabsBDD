package com.chg.bdd.utilities.webactionutils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.chg.bdd.utilities.reportmanager.Log4jManager;

public class ElementActions{
	private WebDriver driver;
	//how to initialize webdriver object
	public ElementActions( WebDriver incomingDriver) {
		this.driver = incomingDriver;
	}
	
	 public void highlight(WebElement element) {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		   try {
			   Thread.sleep(1000);
		   }catch(InterruptedException e) {
			   Log4jManager.error("Exception at highlight element:" + element);
			   
		   }
	 } 
	 public void highlight(By bylocator) {
		 WebElement element = driver.findElement(bylocator);
		  try { JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 } catch(Exception e) {
			 //System.out.println("there is error here");
			 Log4jManager.error("Exception at highlight element using bylocator:" + bylocator);
		 }
	 }
	 public void typeIn(By bylocator, String text ) {
		  WebDriverWait wait = new WebDriverWait(driver, 5);
		  try {
		   //WebElement ele = driver.findElement( bylocator);
		   WebElement ele = wait.until(  ExpectedConditions.visibilityOfElementLocated(bylocator)   );
		   ele.clear();// you decide if you want to keep clear();
		   ele.sendKeys(text);
		  }catch(Exception e) {
		   Log4jManager.error("failed to type text to " + bylocator.toString());
		  }
		 }
	 public void typeIn(WebElement ele ,String text) {
		  try {
		   ele.clear();
		   ele.sendKeys(text);
		  }catch(Exception e) {
		   Log4jManager.error("failed to type text to " + ele.toString());
		  }
	 }
	 public WebElement findBy(By bylocator) {
		  WebDriverWait wait = new WebDriverWait(driver, 5);
		  WebElement ele = null;
		  try {
		   //WebElement ele = driver.findElement( bylocator);
		   ele = wait.until(  ExpectedConditions.visibilityOfElementLocated(bylocator)   );
		 
		  } catch(Exception e) {
		    Log4jManager.error("failed to locate element using " + bylocator.toString());
		   }
		  return ele;
		 }
	 public void click(By bylocator) {
		  WebDriverWait wait = new WebDriverWait(driver, 5);
		  try {
		   //WebElement ele = driver.findElement( bylocator);
		    wait.until(  ExpectedConditions.visibilityOfElementLocated(bylocator) ) 
		    .click();
		  } catch(Exception e) {
		    Log4jManager.error("failed to click element using " + bylocator.toString());
		   }
		 }
	 }

