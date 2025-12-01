package com.ekko.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ekko.pages.LoginPage;



/*
 * This class is going to contain all the reusable methods from W3 schools application
 */

public class SBwrappers extends Sewrappers {
	
	public LoginPage loginSB(String username, String password) throws InterruptedException
	{
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		
		loginPage.setUserName(username);
		loginPage.clickContinue();		
		loginPage.setPassword(password);
		loginPage.clickContinue1();
		loginPage.clickPatient();
		loginPage.selectPatient();
		captureScreenshot("PatientDetails");
		loginPage.createPatient();
		captureScreenshot("PatientForm");


		return loginPage;
		
		//captureScreenshot("profile");
				
	
		
	}

//	public boolean isPatientsListLoaded() {
//		// TODO Auto-generated method stub
//		return false;
//	}	
//	
	
	
		
	}
		


