package com.qa.rf.TestPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.rf.Base.TestBase;
import com.qa.rf.Pages.HomePage;
import com.qa.rf.Pages.RegisterPage;

public class RegisterPageTest extends TestBase {

	HomePage homepage;
	RegisterPage registerpage;

	public RegisterPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		homepage = new HomePage();
		registerpage = new RegisterPage();
		homepage.clickonregister();

	}

	@Test
	public void validatetitle() {
		String title = registerpage.validatetitle();
		System.out.println("Title of the Page  ===>>  " + title);
		Assert.assertEquals(title, "Register - PHPTRAVELS");
	}
	
	@Test
	public void Enterinfo() throws InterruptedException {
		registerpage.registeruser("Ali", "Hassan", "alihassan@icloud.com", "3012011011",
				"123 Test Driver", "Hanover", "Maryland", "21076", "United States", "3012011011", "Helloworld", "Helloworld");
		
	}

	@Test
	public void changecc() {
		registerpage.changecountrycode();
	}
}
