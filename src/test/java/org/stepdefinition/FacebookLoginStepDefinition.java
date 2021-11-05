package org.stepdefinition;

import org.Utility.BaseClass;
import org.Utility.FbPojoClass;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginStepDefinition extends BaseClass {
	

	@Given("The user should launch the chrome browser")
 	public void the_user_should_launch_the_chrome_browser() {
		launchChrome();
  
	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
		launchurl("https://www.facebook.com/");
	}

	@When("The user should maxmize the window")
	public void the_user_should_maxmize_the_window() {
		winmax();
	}

	@When("The user should type the invalid username and invalid password")
	public void the_user_should_type_the_invalid_username_and_invalid_password() {
         FbPojoClass f = new FbPojoClass();
         
         fill(f.getUserTxt(), "email");
         fill(f.getUserPass(), "pass");
        
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
		FbPojoClass f = new FbPojoClass();
		btnclick(f.getLoginBtn());
		Thread.sleep(2000);
				
	}

	@Then("The user should navigate to incorrect credential page")
	public void the_user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the page", currentUrl.contains("privacy"));
		System.out.println("the test case is passed");

	}



}
