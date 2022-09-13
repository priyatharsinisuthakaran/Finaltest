package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {

		WebElement element = locateElement("username");

		clearAndType(element, data);

		reportStep("Username is entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		
		WebElement element = locateElement(Locators.XPATH, "//input[@type='password']");
		
		clearAndType(element, data);
		
		reportStep("Password is entered successfully","pass");
		
		return this;
	}
	
  public HomePage clickLogin() {
	  
	  click(locateElement(Locators.NAME, "Login"));
	  reportStep("Login button is clicked successfully", "pass");
	  
	  return new HomePage(); }
	 
	
	}
