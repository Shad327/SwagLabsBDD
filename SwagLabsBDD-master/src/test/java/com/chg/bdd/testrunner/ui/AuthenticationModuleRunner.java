package com.chg.bdd.testrunner.ui;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		  },
		 monochrome = true, 
		 features = "src/test/resources/features/UI/authentication", 
		 glue = { "com.chg.bdd.steps", "com.chg.bdd.base.ui" }, 
		 tags = "@Authentication", 
		 dryRun = false
		
		
		 )

public class AuthenticationModuleRunner {

}
