package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.utils.Sewrappers;

public class LoginPage extends Sewrappers {

	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="signinbutton")
	public WebElement loginButton;
	
	
	public void setUserName(String user)
	{
		waitForElement(username,20);
		clickElement(username);
		typeText(username,user);
	}
	
	public void setPassword(String pwd)
	{
		waitForElement(password,20);
		typeText(password,pwd);
	}
	
	public void clickLogin()
	{
		waitForElement(loginButton,20);
		clickElement(loginButton);
	}
	
}
