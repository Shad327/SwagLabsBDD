package com.chg.bdd.page.ui.i_pages;

import org.openqa.selenium.By;

import com.chg.bdd.base.ui.IPageBase;
import com.chg.bdd.page.ui.c_pages.CSignInPage;

public interface ISignInPage extends IPageBase {
	By usernameBy = By.id(document.selectSingleNode("//Pages/CSignInPage/unBy").getText());
	By pwBy = By.id(document.selectSingleNode("//Pages/CSignInPage/pwBy").getText());
	By loginBy = By.id(document.selectSingleNode("//Pages/CSignInPage/liBy").getText());
	By logoBy =By.xpath(document.selectSingleNode("//Pages/CSignInPage/lgBy").getText());
	By errorboxBy =By.xpath(document.selectSingleNode("//Pages/CSignInPage/ebBy").getText());

public CSignInPage goToSwayLabsPage();
public CSignInPage verifyUrl();
public CSignInPage enterLoginInfo(String un, String pw);
public CSignInPage clicklogin();
public CSignInPage redirected();
public CSignInPage verifyerrormessage();
public boolean existsLogo() ;









}