package com.qa.rf.Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.rf.Base.TestBase;

public class RegisterPage extends TestBase {

	public RegisterPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "inputFirstName")
	WebElement firstname;

	@FindBy(id = "inputLastName")
	WebElement lastname;

	@FindBy(id = "inputEmail")
	WebElement email;

	@FindBy(xpath ="//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]")
	WebElement coutrycode;

	@FindBy(id = "inputPhone")
	WebElement phone;

	@FindBy(id = "inputAddress1")
	WebElement address;

	@FindBy(id = "inputCity")
	WebElement city;

	@FindBy(id = "stateinput")
	WebElement state;

	@FindBy(id = "inputPostcode")
	WebElement postcode;

	@FindBy(id = "inputCountry")
	WebElement country;

	@FindBy(id = "customfield2")
	WebElement whatsappNo;

	@FindBy(id = "inputNewPassword1")
	WebElement password;

	@FindBy(id = "inputNewPassword2")
	WebElement confirmpassword;

	
	public String validatetitle() {
		return driver.getTitle();
	}
	
	
	
	public void registeruser(String FN, String LN, String em,String Phone, String ad, String City,
			String stat, String zipcode, String count, String whatsapp, String pass, String confpass) throws InterruptedException {

	   firstname.sendKeys(FN);
	   lastname.sendKeys(LN);
	   email.sendKeys(em);
	   phone.sendKeys(Phone);
	   address.sendKeys(ad);
	   city.sendKeys(City);
	   state.sendKeys(stat);
	   postcode.sendKeys(zipcode);
	   Select select= new Select(country);
	   select.selectByVisibleText(count);
	   whatsappNo.sendKeys(whatsapp);
	   password.sendKeys(pass);
	   confirmpassword.sendKeys(confpass);
	   
	}
	
	public void changecountrycode() {
		coutrycode.click();
		
		List<WebElement> allLinks =  driver.findElements(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul[1]/li"));
	for (int i=0; i< allLinks.size();i++) {
		System.out.println(allLinks.get(i).getText());
		if (allLinks.get(i).getText().contains("United States")) {
			allLinks.get(i).click();
		}
		}
	}
	
	

}
