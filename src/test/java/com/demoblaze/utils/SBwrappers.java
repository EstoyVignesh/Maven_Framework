package com.demoblaze.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.pages.LoginPage;



/*
 * This class is going to contain all the reusable methods from W3 schools application
 */

public class SBwrappers extends Sewrappers {
	
	public void loginSB(String username, String password)
	{
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
				
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
		
		captureScreenshot("profile");
				
	
		
	}	
	
	
		
	}
		


