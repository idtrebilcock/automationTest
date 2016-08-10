package com.zagalabs.automation.devtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	protected WebDriver driver;

	protected WebDriverWait wait;

	protected WebDriverWait waitForThirty;

	private JavascriptExecutor jsExecutor;

	public BasePage(WebDriver d) {
		driver = d;
		wait = new WebDriverWait(d, 40);
		waitForThirty = new WebDriverWait(d, 30);
		jsExecutor = (JavascriptExecutor) driver;
	}

	public abstract String getPartialUrl();

	protected String getCurrentTitle() {
		return driver.getTitle();
	}

	

	protected void clickElement(By locator) {
		driver.findElement(locator).click();
	}

}
