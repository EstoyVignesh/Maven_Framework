package com.w3schools.tests;
/*
 * This class is going to contain all the test cases with regard to Login functionality in W3schools
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.utils.Sewrappers;
import com.w3schools.utils.W3wrappers;

public class LoginTest extends Sewrappers {
	W3wrappers w3= new W3wrappers();
	
	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("vickyphysics1998@gmail.com","@Vigneshguvi11");
			
			//validation for checking the title
			Assert.assertTrue(driver.getTitle().equals("My learning | W3Schools"));
			System.out.println("Assertion Passed");
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while logging with valid credentials");
			ex.printStackTrace();
			
		}
	}

}
