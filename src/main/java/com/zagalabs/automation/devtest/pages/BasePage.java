package com.zagalabs.automation.devtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	protected void waitForElement(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	protected void scrollPage(int x, int y){
		StringBuilder sb = new StringBuilder();
		sb.append("scroll(");
		sb.append(x);
		sb.append(",");
		sb.append(y);
		sb.append(");");
		jsExecutor.executeScript(sb.toString(), "");
	}
	
	protected void executeJS(String command, Object... args){
		jsExecutor.executeScript(command, args);
	}
	
	protected void waitNoExceptions(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
