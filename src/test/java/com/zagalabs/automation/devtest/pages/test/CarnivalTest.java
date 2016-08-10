/**
 * 
 */
package com.zagalabs.automation.devtest.pages.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.zagalabs.automation.devtest.config.BaseConfig;
import com.zagalabs.automation.devtest.pages.CarnivalBookinPage;
import com.zagalabs.automation.devtest.pages.CarnivalIndexPage;
import com.zagalabs.automation.devtest.pages.CarnivalItineraryPage;

/**
 * @author ivan.trebilcock
 *
 */
public class CarnivalTest extends BaseConfig {
	
	
	private CarnivalIndexPage indexPage;
	
		
		
		
		@Test
		public void bookCruise() throws InterruptedException {
			System.out.println("Create An Account page test...");
			
			indexPage = new CarnivalIndexPage(driver);
			indexPage.clickDuration();
			indexPage.clickSearchCruise();
			indexPage.clickSortByPrice();
			indexPage.scrollPage(0, 1200);
			indexPage.clickFilters();
			indexPage.moveHandler();
			CarnivalItineraryPage itinerary = indexPage.clickAndGoLearnMore();
			itinerary.readAbout();
			CarnivalBookinPage bookingPage = itinerary.moveToBookingPage();
			assertTrue(bookingPage.popUpIsPresent());
			
		}
		
	


}
