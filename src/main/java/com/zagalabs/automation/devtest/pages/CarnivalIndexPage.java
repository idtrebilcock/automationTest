/**
 * 
 */
package com.zagalabs.automation.devtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author ivan.trebilcock
 *
 */
public class CarnivalIndexPage extends BasePage {

	


	public CarnivalIndexPage(WebDriver d) {
		super(d);		
	}

	// button search Cruises
	private By buttonSearchCruises = By.className("search-cta");
	//button duration
	private By buttonDuration = By.className("sail-duration");
	// options button duration
	private By buttonDurationOptionNineDays = By.xpath(".//*[@id='sailDuration']/div/ul/li[2]/button");
	
	private By sortByPriceOption = By.className("search-form-sort-price");
	
	private By learnMore = By.xpath(".//*[@id='ccl-refresh-homepage']/div[1]/div[1]/div/div/div[3]/div[2]/div/div/section/view-results/div/article[1]/div/div/div/div/a/span");
	
	private By filter = By.className("filters");
	
	private By handler = By.className("ui-slider-handle");

	@Override
	public String getPartialUrl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void clickDuration(){
		clickElement(buttonDuration);
		waitForElement(buttonDurationOptionNineDays);
	}
	
	public void clickSearchCruise(){
		waitForElement(buttonSearchCruises);
	}
	
	public void clickSortByPrice(){
		waitForElement(sortByPriceOption);
	}
	
	public void clickFilters(){
		waitForElement(filter);
	}

	public CarnivalItineraryPage clickAndGoLearnMore(){
		waitForElement(learnMore);
		return new CarnivalItineraryPage(driver);
	}
	
	public void moveHandler(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(handler));
		for (int i = 0; i < 5; i++) {
			driver.findElement(handler).sendKeys(Keys.ARROW_RIGHT);
		}
	}
	
	public void scrollPage(int x, int y) {
		super.scrollPage(x, y);
	}
	
}
