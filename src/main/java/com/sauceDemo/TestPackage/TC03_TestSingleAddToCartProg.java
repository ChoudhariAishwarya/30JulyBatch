package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePagePOMClassProg;

public class TC03_TestSingleAddToCartProg extends BaseClassProg
{
   @Test
   public void testSingleAddToCartProg() throws InterruptedException
   {
	   HomePagePOMClassProg hp = new HomePagePOMClassProg(driver);
	   hp.settingbtnmethod();
	   log.info("clicked on setting button");
	   
	   hp.singleaddtocartclick();
	   log.info("select bag product");
	   Thread.sleep(3000);
	   
	   log.info("Apply the validation");
	   
	   String expectedselectedprod ="1";
	   String actualselectedprod = hp.gettextfromcartbtn();
	   
	   Assert.assertEquals(actualselectedprod, expectedselectedprod);
	   
   }
}
