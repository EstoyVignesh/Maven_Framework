package com.ekko.tests;
/*
 * This class is going to contain all the test cases with regard to Login functionality in W3schools
 */

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ekko.pages.LoginPage;
import com.ekko.utils.Reports;
import com.ekko.utils.SBwrappers;
import com.ekko.utils.Sewrappers;



public class LoginTest extends Sewrappers {
	SBwrappers w3= new SBwrappers();
	Reports report = new Reports();
		
	
	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			report.setTCDesc("Validating login in sandboxtrial with valid credentials");
			launchBrowser("https://ekkomd.com/");
			LoginPage page = w3.loginSB("vignesh000vky@gmail.com","@K0nnect");
			
			
			//validation for checking the title
//			Assert.assertTrue(driver.getTitle().equals("patients"));
//			System.out.println("Assertion Passed");
//			Reports.reportStep("INFO","Assertion passed by title");
			
			

			// 1. Get patient names
	        List<String> names = page.getAllPatientNames();

	        // 2. Assert patient count is > 0
	        Assert.assertTrue(names.size() > 0, "❌ Patient list is empty!");

	        int count = page.getPatientCount();
	        Assert.assertTrue(
	            count >= 1,
	            "❌ Expected at least 1 patient, but found: " + count
	        );

	        System.out.println("Patient Count = " + count);
	        System.out.println("Patients:");
	        names.forEach(System.out::println);
			Reports.reportStep("INFO","Assertion passed by Count");
			System.out.println("Assertion Passed");

//            // 3. Validate initials + name on each card
//            Assert.assertTrue(
//                page.doAllCardsHaveNameAndInitials(),
//                "❌ Some patient cards are missing name or initials!"
//            );
//
//            System.out.println("✅ All patient validations passed successfully");

			
//			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			
			//validation for checking the title
			Assert.assertTrue(driver.getTitle().equals("patients"));
			System.out.println("Assertion Passed");
			Reports.reportStep("INFO","Assertion passed by title");
			
			//To Enter into Profile element in HomePge
			//w3.pageProfile("estoyVignesh1");
			 * 
			 * 
			 * 
			 */
			
					
		}
		

		
		
		catch(Exception ex)
		{
			System.out.println("Problem while logging with valid credentials");
			ex.printStackTrace();
			
		}
	}

}
