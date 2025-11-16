package com.w3schools.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;
import com.w3schools.utils.Reports;
import com.w3schools.utils.Sewrappers;
import com.w3schools.utils.W3wrappers;

public class BrowTut_Test extends Sewrappers {
	
	W3wrappers w3 = new W3wrappers();
	Reports report = new Reports();
	
	@Test
	public void loginandbrosetut()
	{
		try
		{
			report.setTCDesc("Validating login in W3 schools with valid credentials");
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("vickyphysics1998@gmail.com","@Vigneshguvi11");
						
		
			w3.broseTutor();
			
					
		}
		
		
		catch(Exception ex)
		{
			System.out.println("Problem while logging with valid credentials");
			ex.printStackTrace();
			
		}
	
  }


}
