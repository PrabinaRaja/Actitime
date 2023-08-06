package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class Actitimelogout extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	public Actitimelogout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logout()
	{   webdriverwaitvisibilityof(driver, logoutLink);
	    javascriptclick(driver, logoutLink);
	}
}
