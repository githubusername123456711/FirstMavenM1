package com.FirstMavenProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using = "//*[@name='uid']")
	WebElement txtuserid;
	
	@FindBy(how=How.XPATH, using = "//*[@name='password']")
	WebElement txtpwd;
	
	@FindBy(how=How.XPATH, using = "//*[@name='btnLogin']")
	WebElement btnlogin;
	
	public void enterUsername(String uname) {
		txtuserid.sendKeys(uname);
	}
	
public void enterPassword(String pwd) {
		txtpwd.sendKeys(pwd);
	}

public void clickLogin() {
	btnlogin.click();
}
	
	
}
