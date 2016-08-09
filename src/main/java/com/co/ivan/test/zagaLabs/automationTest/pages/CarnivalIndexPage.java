/**
 * 
 */
package com.co.ivan.test.zagaLabs.automationTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ivan.trebilcock
 *
 */
public class CarnivalIndexPage extends BasePage{

	


	public CarnivalIndexPage(WebDriver d) {
		super(d);		
	}

	// button search Cruises
	private By buttonSearchCruises = By.className("search-cta ng-scope");
	//button duration
	private By buttonDuration = By.className("sail-duration ng-scop");
	// options button duration
	private By buttonDurationOptionNinedays = By.xpath(".//*[@id='sailDuration']/div/ul/li[2]/button");

	@Override
	public String getPartialUrl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void clickDuration(){
		clickElement(buttonDuration);
	}
	
	public void clickSearchCruise(){
		clickElement(buttonSearchCruises);
	}

	
}
