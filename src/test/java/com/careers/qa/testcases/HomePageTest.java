package com.careers.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.careers.qa.base.TestBase;
import com.careers.qa.pages.HomePage;
import com.careers.qa.pages.JobDetails;
import com.careers.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
	HomePage homePage;
	LoginPage LoginPage;
	JobDetails JobDetails;
	
	public HomePageTest()
	{
		super();
	}
	

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		LoginPage = new LoginPage();	
		homePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
	}
	
	@Test
	public void HomefnTest() throws InterruptedException
	{
		JobDetails=homePage.Homefn();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
    }
	
}
