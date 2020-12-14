package com.qa.rf.TestPages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.rf.Base.TestBase;
import com.qa.rf.Pages.HomePage;
import com.qa.rf.Pages.RegisterPage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	RegisterPage registerpage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		homepage = new HomePage();
		registerpage = new RegisterPage();

	}

	@Test (priority=1)
	public void validatetitle() {

		String title = homepage.validatetitle();
		System.out.println("Title of the Page  ===>>>  " + title);
	}

	@Test(priority=2)
	public void clickonregisterpage() throws IOException {
		registerpage = homepage.clickonregister();
	}

	@AfterMethod
	public void Teardown() {
//		driver.quit();
	}

}
