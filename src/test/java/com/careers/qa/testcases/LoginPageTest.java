package com.careers.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.careers.qa.base.TestBase;
import com.careers.qa.pages.HomePage;
import com.careers.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage LoginPage;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		LoginPage = new LoginPage();	
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		homePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
    }
}
