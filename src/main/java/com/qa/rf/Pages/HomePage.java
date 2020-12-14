package com.qa.rf.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.rf.Base.TestBase;

public class HomePage extends TestBase {
	
	RegisterPage registerpage = new RegisterPage();

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(linkText = "login")
	WebElement login;

	
	
	
	
	public String validatetitle() {
		return driver.getTitle();
	}
	
	
	public RegisterPage clickonregister() throws IOException {
	       register.click();
	       return new RegisterPage();
	       
	}
	
	
	
	
}
