package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePagePOMClassProg;

public class TC02_TestLogOutFunProg extends BaseClassProg
{
   @Test
   public void testLogOutFunProg() 
   {
	   HomePagePOMClassProg hp = new HomePagePOMClassProg(driver);
	   hp.settingbtnmethod();
	   log.info("clicked on setting button");
	   
	   hp.logoutmethod();
	   log.info("clicked on logout button");
	   
	   log.info("went on login page");
	   
//	   Apply validation
	   log.info("Apply the validation");
	   
	   String giventitle = "Swag Labs";
	   String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle, actualtitle);
   }
	
}
