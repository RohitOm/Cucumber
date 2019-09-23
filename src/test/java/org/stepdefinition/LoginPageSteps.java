package org.stepdefinition;

import org.junit.Assert;
import org.pojo.LoginPojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass{

	@Given("User is in home page")
	public void user_is_in_home_page() throws Exception {
		
		launchBrowser();
		loadUrl("https://www.facebook.com");
	}
	
	
	@When("User has to enter the username password and clicking login button")
	public void user_has_to_enter_the_username_password_and_clicking_login_button() {
		
		LoginPojoClass l= new LoginPojoClass();
		fill(l.getUsername(), "Hello facebook");
				
	}
	
	@Then("when user enters incorrect credentials user should not be able to login to home page")
	public void when_wrong_credentials_entered() {
		Assert.assertTrue(driver.getCurrentUrl().contentEquals("https://www.facebook.com/"));
	
	}
}
