package com.FirstMavenProject.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.FirstMavenProject.pageobjects.LoginPage;

public class TC2_HomePage extends BaseClass{
	@Test
	public void testLogin() throws Exception {
		driver.get(loginpageurl);
		logger.info("Browser is launched and navigated to Website");
		
		LoginPage lp = new LoginPage(driver);
		logger.info("Entering User Name");
		lp.enterUsername(username);
		logger.info("User Name entered");
		logger.info("Entering Password");
		lp.enterPassword(password);
		logger.info("Password entered");
		lp.clickLogin();
		Thread.sleep(5000);
		logger.info("login button clicked");
		if (driver.getTitle().contentEquals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Passed");
		}else {
			Assert.assertTrue(false);
			logger.info("Failed");
		}
		
	}
	
}


