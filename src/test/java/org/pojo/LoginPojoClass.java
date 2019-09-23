package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.BaseClass;

public class LoginPojoClass extends BaseClass{

	public LoginPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
}
