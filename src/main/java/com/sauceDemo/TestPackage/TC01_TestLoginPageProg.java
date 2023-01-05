package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC01_TestLoginPageProg extends BaseClassProg
{
   @Test
   public void testLoginPageProg() 
   {
//	    apply validation
	   log.info("Apply the validation");
	    
	    String giventitle = "Swag Labs";
	    String actualtitle = driver.getTitle();
	    
	    Assert.assertEquals(actualtitle, giventitle);
 
   }
	
}
