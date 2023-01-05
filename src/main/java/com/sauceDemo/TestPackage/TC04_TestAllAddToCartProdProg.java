package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePagePOMClassProg;

public class TC04_TestAllAddToCartProdProg extends BaseClassProg
{
    @Test
    public void testAllAddToCartProdProg() throws InterruptedException
    {
    	HomePagePOMClassProg hp = new HomePagePOMClassProg(driver);
 	   hp.settingbtnmethod();
 	  log.info("clicked on setting button");
 	   
 	   hp.addtocartselect();
 	  log.info("select all products");
 	   Thread.sleep(3000);
 	   
 	  log.info("Aplly the validation");
 	   
 	   String expectedprodselect ="6";
 	   String actualprodselect = hp.gettextfromcartbtn();
 	   
 	   Assert.assertEquals(actualprodselect, expectedprodselect);
 	   
    }
	
}
