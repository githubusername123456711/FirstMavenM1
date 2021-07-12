package com.FirstMavenProject.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
public String username = "mngr340274"; 
public String password = "abehysA"; 
public String loginpageurl = "http://demo.guru99.com/V4/index.php"; 
public static WebDriver driver;
public static Logger logger;

@Parameters("browser")
@BeforeClass
public  void setup(String br) {
	
	if(br.equals("chrome")) {
	
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if (br.equals("firefox")) {
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver = new FirefoxDriver();
	}
	else if (br.equals("edge")) {
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
driver = new EdgeDriver();
	}
logger = Logger.getLogger("FirstMavenProjectV1");
PropertyConfigurator.configure("log4j.properties");
driver.get(loginpageurl);
logger.info("Browser is launched and navigated to Website");
}


@AfterClass
public void teardown() {
	driver.close();
	
}

}
