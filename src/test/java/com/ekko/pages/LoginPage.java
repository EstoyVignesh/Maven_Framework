package com.ekko.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.ekko.utils.Sewrappers;

public class LoginPage extends Sewrappers {

	@FindBy(xpath="//a[text()='Login']")
	public WebElement clogin;
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(xpath="(//button[text()='Continue'])[2]")
	public WebElement click1;
	
	@FindBy(id="password")
	public WebElement password;
		
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement click2;
	
	@FindBy(xpath="//span[text()='Patients']")
	public WebElement click3;
	
	// Patient cards list
    @FindBy(xpath = "//div[@class='space-y-3']//h3")
    private List<WebElement> patientNames;

    @FindBy(xpath="//button[text()=' New Patient']")
	public WebElement create;
    
 // Patient cards list
    @FindBy(xpath = "(//div[@class='space-y-3']//h3)[1]")
    public WebElement selPatient;
    
	
	
	public void clickLogin()
	{
		waitForElement(clogin,20);
		clickElement(clogin);
	}
	
	
	public void setUserName(String user)
	{
		waitForElement(username,20);
		clickElement(username);
		typeText(username,user);
	}
	
	public void clickContinue()
	{
		waitForElement(click1,20);
		clickElement(click1);
	}
	
	
	public void setPassword(String pwd)
	{
		waitForElement(password,20);
		clickElement(password);
		typeText(password,pwd);
	}
	
	public void clickContinue1()
	{
		waitForElement(click2,20);
		clickElement(click2);
	}
	
	public void clickPatient()
	{
		waitForElement(click3,20);
		clickElement(click3);
	}

	
	 // Return TRUE if list is loaded
    public boolean isPatientsListLoaded() {
        return patientNames.size() > 0;
    }

    // Return all patient names in a List<String>
    public List<String> getAllPatientNames() {
        return patientNames.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    // Return patient count
    public int getPatientCount() {
        return patientNames.size();
    }

//    public boolean doAllCardsHaveNameAndInitials() {
//        for (int i = 0; i < patientNames.size(); i++) {
//            if (patientNames.get(i).getText().trim().isEmpty()) return false;
//            if (patientInitials.get(i).getText().trim().isEmpty()) return false;
//        }
//        return true;
//    }
    
    public void selectPatient() throws InterruptedException
	{
		waitForElement(selPatient,20);
		clickElement(selPatient);
		Thread.sleep(5000);
	}

    public void createPatient()
	{
		waitForElement(create,20);
		clickElement(create);
	}
	
}
