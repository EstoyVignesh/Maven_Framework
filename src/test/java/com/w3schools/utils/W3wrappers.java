package com.w3schools.utils;

import org.openqa.selenium.support.PageFactory;

import com.w3schools.pages.HomePage;
import com.w3schools.pages.LoginPage;

/*
 * This class is going to contain all the reusable methods from W3 schools application
 */

public class W3wrappers extends Sewrappers {
	
	public void loginW3Schools()
	{
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.setUserName("vigneshpalanisamy1969@gmail.com");
		loginPage.setPassword("@Arvind1998");
		loginPage.clickLogin();
		
	}

}
