/**
 * 
 */
package com.co.ivan.test.zagaLabs.automationTest.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.co.ivan.test.zagaLabs.automationTest.App;
import com.co.ivan.test.zagaLabs.automationTest.pages.CarnivalIndexPage;

/**
 * @author ivan.trebilcock
 *
 */
public class CarnivalTest extends App{
	
	
	private WebDriver driver;
	private CarnivalIndexPage indexPage;
	
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
		
		@Test
		public void bookCruise() {
			System.out.println("Create An Account page test...");
			//
			indexPage.clickSearchCruise();
			Assert.assertTrue(2>2);
		}
		
	


}
