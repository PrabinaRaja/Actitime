package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.ActitimeLoginPage;
import com.actitime.pages.Actitimelogout;
//@Listeners(generic.ScreenShot.class)
public class TC_01_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException, java.io.IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "login")
	public void titlevalidation()
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.validateTitle();
	}
	@Test(dependsOnMethods = "titlevalidation")
	public void logout()
	{
		Actitimelogout logout=new Actitimelogout(driver);
		logout.logout();
	}
	public void quit() 
	{
		BaseTest quit=new BaseTest();
		quit.teardown();
	}
}