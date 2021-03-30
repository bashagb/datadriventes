package org.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automaton.utility.Utility;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserName(String uname) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	public void enterPassword(String pass) throws IOException
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	public void clickSignin() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_sigin_xpath"))).click();
	}
	public void clickCreateAccount() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("Create_Account_xpath"))).click();
	}
	public void firstName(String fname) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("first_name_xpath"))).sendKeys(fname);
	}
	public void lastName(String lname) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("last_name_xpath"))).sendKeys(lname);
	}
	public void mobileEmail(String mbmail) throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("mobile_email_xpath"))).sendKeys(mbmail);
	}
}
