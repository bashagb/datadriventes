package com.automation.testcases;

import java.io.IOException;


import org.automation.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.base.DriverInstance;
import com.automation.dataGenerator.DataGenerator;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {
	
	@Test(dataProvider="Excel",dataProviderClass=DataGenerator.class)
	public void tc_001_login_functionality(String uname,String pass) throws IOException
	{
		LoginPage login= new LoginPage(driver);
		login.enterUserName(uname);
		login.enterPassword(pass);
		login.clickSignin();
		//System.out.println(text);
	}

	
	@DataProvider(name="static")
	public Object[][] testDataGenerator1() 
	{
		Object[][] data= {{"unam1","pass1","Entered first user"},{"uname2","pass2","Entered second user"}};
		return data;
	}
	
	
}
