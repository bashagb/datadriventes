package com.automation.testcases;

import java.io.IOException;

import org.automation.pages.LoginPage;
import org.testng.annotations.Test;

import com.automation.base.DriverInstance;
import com.automation.dataGenerator.DataGenerator;

public class TC_002_ValidateCreateAccount extends DriverInstance {
	
	@Test(dataProvider="Excel",dataProviderClass=DataGenerator.class)
	public void tc_002_create_account(String fname,String lname, String mbmail) throws IOException
	{
		LoginPage login= new LoginPage(driver);
		login.clickCreateAccount();
		login.firstName(fname);
		login.lastName(lname);
		login.mobileEmail(mbmail);
	
	}
	
}
