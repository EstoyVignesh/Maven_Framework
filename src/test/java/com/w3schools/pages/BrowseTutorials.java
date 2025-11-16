package com.w3schools.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.Sewrappers;

public class BrowseTutorials extends Sewrappers{
	
	@FindBy(xpath="//button[text()='Browse tutorials']")
	public WebElement browseTut;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement search;
	
	@FindBy(xpath="//span[text()='TUTORIAL']")
	public WebElement titles;
	
	public void browseTutorials()
	{
		waitForElement(browseTut,20);
		clickElement(browseTut);
		
	}
	
	public void searchBar(String sear)
	{
		waitForElement(search,20);
		keysEnter(search,sear);
	}
	
	public void titlesall()

	{
		waitForElement(titles,20);
		List<WebElement> allTitles = driver.findElements(By.xpath("//div[contains(@class,'TutorialCard_cardTitle')]"));
		for(int i = 0; i<allTitles.size();i++)
		{
			
			//Thread.sleep(1000);
			System.out.println(allTitles.get(i).getText());
			
			
		}
		
		for(int i = 0; i<allTitles.size();i++)
		{
		
		if(allTitles.get(i).getText().equals("Learn JavaScript"))  //Learn Java
		{
			
			allTitles.get(i).click();
			break;
		}
		
		else {
			System.out.println("Search Failed");   // It will be displayed because it will compare all the Titles with Learn Java, 
			                                      //  The 1st Title itself not matched so it Prints Search Failed...
		}
		
		}	
		
		waitForElement(titles,20);
		clickElement(titles);
		
	}
}
