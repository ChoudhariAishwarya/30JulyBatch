package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.LoginPagePOMClassProg;
import com.sauceDemo.UtilityPackage.UtilityClassProg;


public class BaseClassProg
{
	WebDriver driver;
	Logger log = Logger.getLogger("SauceDemo1"); 
	@Parameters("broswername")
	@BeforeMethod
	public void setupmethod(String broswername) throws IOException 
	{
		if(broswername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					 "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			log.info("browser is opened");
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver",
					 "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("browser is opened");
		}
		
		PropertyConfigurator.configure("log4j.properties");
			
		driver.manage().window().maximize();
		log.info("browser is maximized");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	    driver.get("https://www.saucedemo.com/");
	    log.info("url is opened");
	    
	    UtilityClassProg.screenshotmethod(driver, "LoginPage");
		   
	    LoginPagePOMClassProg lp = new LoginPagePOMClassProg(driver);
	    
	    lp.usernamemethod();
	    log.info("Username is entered");
	    
	    lp.passwordmethod();
	    log.info("Password is entered");
		   
	    lp.loginmethod();
	    log.info("clicked on login button");
	    
//	    went on home page
	    
	    log.info("Went on home page");
	    
	    UtilityClassProg.screenshotmethod(driver, "HomePage");
	}
	
	@AfterMethod
	public void teardownmethod()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of program");
	}
	
	
	
}
