package com.zagalabs.automation.devtest.driver;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {
	
	public WebDriver buildDriver();
		
	public WebDriver buildDriver(boolean maximizeWindow);

}
