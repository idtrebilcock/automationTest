package com.zagalabs.automation.devtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarnivalBookinPage extends BasePage {
	
	private By popUpStateRooms = By.className("booking-engine-app");

	public CarnivalBookinPage(WebDriver d) {
		super(d);
	}

	@Override
	public String getPartialUrl() {
		return null;
	}
	
	public boolean popUpIsPresent(){
		return driver.findElement(popUpStateRooms).isDisplayed();
	}

}
