package com.careers.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.careers.qa.base.TestBase;

public class HomePage  extends TestBase
{
	@FindBy(xpath="//button[normalize-space()='Apply Here']")
	WebElement applyBtnHome;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public JobDetails Homefn() throws InterruptedException
	{
		Thread.sleep(3000);
		applyBtnHome.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		return new JobDetails();

	}
}
