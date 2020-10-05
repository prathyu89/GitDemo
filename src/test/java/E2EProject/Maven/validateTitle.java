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

public class validateTitle extends base{
	public WebDriver driver;
	 private static Logger log=LogManager.getLogger(base.class.getName());

 @BeforeTest
 
 public void initilization() throws IOException
 {
	 driver=initizationDriver();
	 log.info("Driver is initilization");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
 }
	@Test()
	public void validateAppTitle() throws IOException
	{
		
	// one is inheritance
		//create object for loginpage and invoke menthods in it
		LandingPage lp=new LandingPage(driver);
		
		
		Assert.assertEquals(lp.getTitle().getText(), "Small Business12");
		log.info("Successful passed Text message");
		//System.out.println(lp.getTitle().getText());
		
		
			
		
	}
 @AfterTest
	public void teardown()
	{
		driver.close();
	}
}
