package com.zagalabs.automation.devtest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverFactory implements WebDriverFactory {

	@Override
	public WebDriver buildDriver() {
		return new ChromeDriver();
	}

	@Override
	public WebDriver buildDriver(boolean maximizeWindow) {
		ChromeDriver driver = new ChromeDriver();
		if (maximizeWindow) {
			driver.manage().window().maximize();
		}
		return driver;
	}

}
