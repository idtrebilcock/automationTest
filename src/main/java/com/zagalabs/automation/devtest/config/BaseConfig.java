package com.zagalabs.automation.devtest.config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.zagalabs.automation.devtest.driver.WebDriverFactory;
import com.zagalabs.automation.devtest.driver.WebDriverFactoryProvider;
import com.zagalabs.automation.devtest.driver.WebDriverType;

/**
 * Hello world!
 *
 */
public class BaseConfig {
	
	protected WebDriver driver;

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		
		WebDriverType type = WebDriverType.valueOf(browserType);
		WebDriverFactory factory = WebDriverFactoryProvider.getFactory(type);
		driver = factory.buildDriver();
		driver.navigate().to(appURL);
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
