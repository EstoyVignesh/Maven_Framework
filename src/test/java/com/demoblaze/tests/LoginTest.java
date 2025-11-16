package com.demoblaze.tests;
/*
 * This class is going to contain all the test cases with regard to Login functionality in W3schools
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblaze.utils.Reports;
import com.demoblaze.utils.SBwrappers;
import com.demoblaze.utils.Sewrappers;



public class LoginTest extends Sewrappers {
	SBwrappers w3= new SBwrappers();
	Reports report = new Reports();
		
	
	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			report.setTCDesc("Validating login in sandboxtrial with valid credentials");
			launchBrowser("https://jithya.sandboxtrial.com/login?&chkie=true");
			w3.loginSB("dentalclinic@gmail.com","demo@123");
			
			
						
			//validation for checking the title
			Assert.assertTrue(driver.getTitle().equals("My learning | W3Schools"));
			System.out.println("Assertion Passed");
			Reports.reportStep("INFO","Assertion passed by title");
			
			//To Enter into Profile element in HomePge
			//w3.pageProfile("estoyVignesh1");
			
					
		}
		
		
		catch(Exception ex)
		{
			System.out.println("Problem while logging with valid credentials");
			ex.printStackTrace();
			
		}
	}

}
