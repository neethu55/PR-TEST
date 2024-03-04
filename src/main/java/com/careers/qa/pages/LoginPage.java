package com.careers.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.careers.qa.base.TestBase;
import com.careers.qa.pages.HomePage;

public class LoginPage extends TestBase
{
	//Page Factory - OR:
	
	@FindBy(xpath="//button[@name='signIn']")
	WebElement applyBtn;
	
			@FindBy(name="Email")
			WebElement username;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//button[normalize-space()='Continue']")
			WebElement loginBtn;
			
	//Initializing the Page Objects using constructor:
			public LoginPage()
			{
				PageFactory.initElements(driver, this);
			}
			
			public HomePage login(String un, String pwd) throws InterruptedException
			{
				Thread.sleep(3000);
				applyBtn.click();
				username.sendKeys(un);
				password.sendKeys(pwd);
				Thread.sleep(3000);
				loginBtn.click();
				Thread.sleep(3000);
				return new HomePage();
			}
}
