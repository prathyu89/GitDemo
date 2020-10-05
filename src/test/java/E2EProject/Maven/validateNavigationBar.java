package E2EProject.Maven;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import junit.framework.Assert;
import pageObject.LandingPage;
//import pageObject.LoginPage;
import resources.base;

public class validateNavigationBar extends base{
	public WebDriver driver;
	 private static Logger log=LogManager.getLogger(base.class.getName());

 @BeforeTest
 
 public void initilization() throws IOException
 {
	 driver=initizationDriver();
		driver.get(prop.getProperty("url"));
 }
	@Test()
	public void ValidateNavgation() throws IOException
	{
		//public WebDriver driver;
		
	// one is inheritance
		//create object for loginpage and invoke menthods in it
		LandingPage lp=new LandingPage(driver);
		
		Assert.assertTrue(lp.getNavbar().isDisplayed());
		log.info("Navigated bar is displayed");
			
			
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
