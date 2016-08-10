/**
 * 
 */
package com.zagalabs.automation.devtest.pages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zagalabs.automation.devtest.config.BaseConfig;
import com.zagalabs.automation.devtest.pages.CarnivalIndexPage;

/**
 * @author ivan.trebilcock
 *
 */
public class CarnivalTest extends BaseConfig {
	
	
	private CarnivalIndexPage indexPage;
	
		
		
		
		@Test
		public void bookCruise() {
			System.out.println("Create An Account page test...");
			//
			indexPage.clickSearchCruise();
			Assert.assertTrue(2>2);
		}
		
	


}
