package com.w3schools.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.pages.BrowseTutorials;
import com.w3schools.pages.HomePage;
import com.w3schools.pages.LoginPage;
import com.w3schools.pages.Profile;

/*
 * This class is going to contain all the reusable methods from W3 schools application
 */

public class W3wrappers extends Sewrappers {
	
	public void loginW3Schools(String username, String password)
	{
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		HomePage homePage= PageFactory.initElements(driver, HomePage.class);
				
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickLogin();
		
		captureScreenshot("profile");
				
		homePage.waitForLearning();
		
	}	
	
	public void pageProfile(String saveButton)
	{
		
	
		Profile profiles = PageFactory.initElements(driver, Profile.class);
	
		
		profiles.profileFrame();
	    profiles.profilelnk();
	    
	    profiles.scroll(1300);
	    profiles.edit();
	    profiles.sendKeys(saveButton);
	}	
	
	public void broseTutor()
	{
		BrowseTutorials browsetut = PageFactory.initElements(driver, BrowseTutorials.class);
		
		browsetut.browseTutorials();
		browsetut.searchBar("Learn Java");
		browsetut.titlesall();
		
	}
		

}
