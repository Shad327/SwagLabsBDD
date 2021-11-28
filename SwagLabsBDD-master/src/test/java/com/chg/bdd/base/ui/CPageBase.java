package com.chg.bdd.base.ui;

import org.openqa.selenium.WebDriver;

import com.chg.bdd.utilities.webactionutils.ElementActions;
import com.chg.bdd.utilities.webactionutils.WaitUtil;

public class CPageBase{
	protected static WebDriver driver;
	//-----------------------Support methods-------------------- 
	protected ElementActions weu = new ElementActions(driver);
	protected WaitUtil waits = new WaitUtil();


}
