package org.stepdefinition;

import org.Utility.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class ForgotpasswordStepDefinition extends BaseClass{
	
		
		@Given("The user should the launch the browser")
		public void theUserShouldTheLaunchTheBrowser() {
		   launchChrome();
		}
		
		@When("The user should load the url")
		public void theUserShouldLoadTheUrl() {
		 launchurl("https://www.facebook.com/");
		}
		
		@When("The user should maxmize the browser")
		public void theUserShouldMaxmizeTheBrowser() {
		  winmax();
		}
		
		@When("The user should click the forgot password link")
		public void theUserShouldClickTheForgotPasswordLink() {
		  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		}
		
		@When("The user should navigate to find your account page")
		public void theUserShouldNavigateToFindYourAccountPage() {
		  String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the fb account page", currentUrl.endsWith("screen=0"));
		}
		
		
		@When("The user should type the registered mobile number or email id")
		public void theUserShouldTypeTheRegisteredMobileNumberOrEmailId() {
		  driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234567890");
		}
		
		@When("The user should click the search the button")
		public void theUserShouldClickTheSearchTheButton() {
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		}
		
		@Then("The user should navigate to reset your password page")
		public void theUserShouldNavigateToResetYourPasswordPage() {
		  String currentUrl = driver.getCurrentUrl();
		  Assert.assertTrue("verify the reset page", currentUrl.contains("recover"));
		  System.out.println("verifyed and scenario got passed");
		}
		
		
			}
