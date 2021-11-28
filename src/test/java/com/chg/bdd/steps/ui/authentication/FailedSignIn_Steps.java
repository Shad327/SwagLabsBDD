package com.chg.bdd.steps.ui.authentication;

import com.chg.bdd.page.ui.c_pages.CSignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FailedSignIn_Steps {

	private CSignInPage t2;
	
	
	
	@Given("^I am on the Sauce Demo Login Page$1")
	public void i_am_on_the_Sauce_Demo_Login_Page1() {
		t2 = new CSignInPage();
		t2.goToSwayLabsPage().verifyUrl();
		System.out.println("Step 1 given");	
		
	}
	@When("I fill the account information for account LockedOutUser into the Username field and the Password field$")
	public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
		t2 = new CSignInPage();
		t2.enterLoginInfo("locked_out_user", "secret_sauce");
		System.out.println("Step 2 given");
	}
	@When("^I click the Login Button$1")
	public void i_click_the_Login_Button1(){
		t2.clicklogin();
		System.out.println("Step 3 given");
	}

	@Then("I verify the Error Message contains the text {string}")
	public void i_verify_the_error_message_contains_the_text(String string) {
		t2.verifyerrormessage();
		System.out.println("Step 4 given");
	}
	
}


 