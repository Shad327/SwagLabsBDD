package com.chg.bdd.steps.ui.authentication;

import com.chg.bdd.page.ui.c_pages.CSignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SuccessfulSignIn_Steps {
	
	
	private CSignInPage t1;
	
	@Given("^I am on the Sauce Demo Login Page$")
	public void i_am_on_the_Sauce_Demo_Login_Page() {
		t1 = new CSignInPage();
		t1.goToSwayLabsPage().verifyUrl();
		System.out.println("Step 1 given");
	}

	@When("^I fill the account information for account StandardUser into the Username field and the Password field$")
	public void i_fill_the_account_information_for_account_StandardUser_into_the_Username_field_and_the_Password_field() {
		t1.enterLoginInfo("standard_user", "secret_sauce");
		System.out.println("Step 2 given");
	}

	@When("^I click the Login Button$")
	public void i_click_the_Login_Button(){
		t1.clicklogin();
		System.out.println("Step 3 given");
	}

	@Then("^I am redirected to the Sauce Demo Main Page$")
	public void i_am_redirected_to_the_Sauce_Demo_Main_Page() {
		t1.redirected();
		System.out.println("Step 4 given");
	}

	@Then("^I verify the App Logo exists$")
	public void i_verify_the_App_Logo_exists() {
		t1.existsLogo();
		System.out.println("Step 5 given");
	}


}