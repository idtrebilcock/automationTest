package com.zagalabs.automation.devtest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarnivalItineraryPage extends BasePage {
	
	private By itineraryDays = By.className("about-cta");
	
	private By buttonReady = By.className("ready");

	public CarnivalItineraryPage(WebDriver d) {
		super(d);
	}

	@Override
	public String getPartialUrl() {
		return null;
	}
	
	public void readAbout() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(itineraryDays));
		List<WebElement> elements = driver.findElements(itineraryDays);
		for (int i = 1; i < 5; i++) {
			elements.get(i).click();
			waitNoExceptions(10000L);
		}
	}
	
	public CarnivalBookinPage moveToBookingPage(){
		waitForElement(buttonReady);
		return new CarnivalBookinPage(driver);
	}
	
	
	
	
	

}
