package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClassProg 
{
//	 webdriver declared
   WebDriver driver;
  
//   webelements find & elements action performed
  
  @FindBy(xpath="//button[text()='Add to cart']")
  private List<WebElement> addtocart;
  
  public void addtocartselect()
  {
	  for(WebElement item : addtocart)
	  {
		  item.click();
	  }
  }
  
  @FindBy(xpath="//button[text()='Add to cart']")
  private WebElement singleaddtocartbtn;
  
  public void singleaddtocartclick()
  {
	  singleaddtocartbtn.click();
  }
  
  @FindBy(xpath="//a[@class='shopping_cart_link']")
  private WebElement cartbtn;
  
  public void addtocartclick()
  {
	  cartbtn.click();
  }
  
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement settingbtn;
  
  public void settingbtnmethod()
  {
	  settingbtn.click();
  }
  
  @FindBy(xpath="//select[@class='product_sort_container']")
  private WebElement sorting;
  
  public void sortingmethod()
  {
	  sorting.click();
  }
   
  @FindBy(xpath="//a[text()='Twitter']")
  private WebElement twitterbtn;
  
  public void twittermethod()
  {
	  twitterbtn.click();
  }
  
  @FindBy(xpath="//a[text()='Facebook']")
  private WebElement facebookbtn;
  
  public void facebookmethod()
  {
	  facebookbtn.click();
  }
  
  @FindBy(xpath="//a[text()='LinkedIn']")
  private WebElement linkedinbtn;
  
  public void linkedinmethod()
  {
	  linkedinbtn.click();
  }
  
  @FindBy(xpath="//a[@id='inventory_sidebar_link']")
  private WebElement allitem;
  
  public void allitemmethod()
  {
	  allitem.click();
  }
  
  @FindBy(xpath="//a[@id='about_sidebar_link']")
  private WebElement about;
  
  public void aboutmethod()
  {
	  about.click();
  }
  
  
  @FindBy(xpath="//a[@id='logout_sidebar_link']")
  private WebElement logoutbtn;
  
  public void logoutmethod()
  {
	  logoutbtn.click();
  }
  
  @FindBy(xpath="//a[@id='reset_sidebar_link']")
  private WebElement resetappstate;
  
  public void resetappstatemethod()
  {
	  resetappstate.click();
  }
  
  public String gettextfromcartbtn() 
  {
	  String totalproductselect =  cartbtn.getText();
	  return totalproductselect;
  }
  
  public String gettextfromsettingbtn()
  {
	  String clicksetingbtn = settingbtn.getText();
	  return clicksetingbtn;
  }
  
//   constructor create
  public  HomePagePOMClassProg(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
}


