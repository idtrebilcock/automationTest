package com.zagalabs.automation.devtest.driver;

public class WebDriverFactoryProvider {
	
	
	/**
	 * Returns FirefoxWebDriverFactory by default
	 * @return
	 */
	public static WebDriverFactory getFactory(){
		return new FirefoxWebDriverFactory();
	}
	
	public static WebDriverFactory getFactory(WebDriverType type){
		switch (type) {
		case CHROME:
			return new ChromeWebDriverFactory();
		case FIREFOX:
			return new FirefoxWebDriverFactory();
		default:
			return new FirefoxWebDriverFactory();
		}
	}

}
