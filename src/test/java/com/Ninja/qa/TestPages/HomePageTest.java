package com.Ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ninja.qa.Base.TestBase;
import com.Ninja.qa.Pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		hp.gettitle();
	}
	

	@Test(priority='2')
	public void testRegisterLink()
	{
		hp.clickonMyAccount();  
		hp.clickonRegister();  
		hp.gettitle(); 
	}

	@Test(priority='3')
	public void testLoginLink()
	{
		hp.clickonMyAccount();  
		hp.clickonLogin();
		hp.gettitle();  
	}
	
	
	@Test(priority='4')
	public void testMacLink() throws InterruptedException
	{
		hp.clickOnMac();
		hp.gettitle(); 
	}
}
