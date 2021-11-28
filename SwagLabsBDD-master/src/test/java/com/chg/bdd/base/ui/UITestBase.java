package com.chg.bdd.base.ui;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.chg.bdd.utilities.webactionutils.DriverUtil;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class UITestBase extends CPageBase {
	

	//hook
	@Before
	public void starU(Scenario scenario) {
		System.out.println("--------------------------");
		System.out.println("Starting - " + scenario.getName());
		System.out.println("--------------------------");
		
		String browser = System.getProperty("browser");
		 driver = DriverUtil.startBrowser("Chrome");
		//driver = DriverUtil.startBrowserInPrivateMode(browser);
		//driver = DriverUtil.startDockerContainerBrowser(browser);		
	}
	
	@After(order = 0)
	public void tearDown(Scenario scenario) {
		if(driver !=null) {
			driver.quit();
			}
		System.out.println("----------------------------");
		System.out.println(scenario.getName() + " Status -  " + scenario.getStatus());
		System.out.println("----------------------------");
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
}
	
	
	
	
