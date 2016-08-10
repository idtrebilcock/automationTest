package com.zagalabs.automation.devtest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriverFactory implements WebDriverFactory {

	@Override
	public WebDriver buildDriver() {
		return new FirefoxDriver();
	}

	@Override
	public WebDriver buildDriver(boolean maximizeWindow) {
		FirefoxDriver driver = new FirefoxDriver();
		if (maximizeWindow) {
			driver.manage().window().maximize();
		}
		return driver;
	}

}
