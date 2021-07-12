/**
 * 
 */
package com.FirstMavenProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jack
 *
 */
public class HomePage {

	WebDriver ldriver;
	
	HomePage(WebDriver rdriver){
	ldriver = rdriver;	
	PageFactory.initElements(rdriver, this);
	}
}
