package com.chg.bdd.page.ui.c_pages;



import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.chg.bdd.base.ui.CPageBase;
import com.chg.bdd.page.ui.i_pages.ISignInPage;
import com.chg.bdd.utilities.reportmanager.Log4jManager;





public class CSignInPage extends CPageBase implements ISignInPage {
	private static String url = "https://www.saucedemo.com/";

	
	//------------public method-------------------
	
	public CSignInPage goToSwayLabsPage() {

		
		driver.get(url);
		Log4jManager.info("Landed on Swag Labs");
		return this;
	}
	public CSignInPage verifyUrl() {
		System.out.println("Swag Labs page verifing");
		waits.pause(2);
		System.out.println("User goes to Swag Labs Page");
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		Log4jManager.info("Verifed Url");
		return this;
		
	}
	public CSignInPage enterLoginInfo(String un, String pw) {
		
		enterUserName(un);
		enterPassword(pw);
		Log4jManager.info("Entered sign in info");
		return this;
	}


	
	
	public CSignInPage clicklogin() {

		weu.highlight(loginBy);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(loginBy)).click().perform();
		System.out.println("Signin clicked");
		Log4jManager.info("Sign in button clicked");
		return this;

	}	
	public CSignInPage redirected() {
		System.out.println("redirecting to main page");
		waits.pause(2);
		
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		Log4jManager.info("Redirectd to main page");
		return this;
	}
	public boolean existsLogo() {
	    try {
	        driver.findElement(logoBy);
	    } catch (NoSuchElementException e) {
	    	Log4jManager.info("App logo not found");
	        return false;
	    }
	    
	    Log4jManager.info("App Logo exists");
	    return true;
	    
	} 
	public CSignInPage verifyerrormessage() {
		String exp = "Sorry, this user has been banned.";
	
		String act = driver.findElement(errorboxBy).getText();
	     Log4jManager.info("Expected messagage is " + exp);
	     Log4jManager.info("Actual messagage is " + act);
	     //verify error message with Assertion
	     Assert.assertEquals(exp, act);

	     return this;
		
	}
	
	//-----------private methods/helper methods------------
	private void enterPassword(String pwvalue) {
		weu.highlight(pwBy);
	    driver.findElement(pwBy).clear();
	    driver.findElement(pwBy).sendKeys(pwvalue);
		Log4jManager.debug("User entered Password");

	}

	private void enterUserName(String usernameevalue) {
		weu.highlight(usernameBy);
		weu.typeIn(usernameBy, usernameevalue);
		Log4jManager.debug("User entered UserName");

	}
	
}
