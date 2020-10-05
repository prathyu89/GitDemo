package E2EProject.Maven;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
//import junit.framework.Assert;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;



public class HomePage extends base{
	public WebDriver driver;
	 private static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	
	 public void initilization() throws IOException
	 {
		 driver=initizationDriver();
			
	 }
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException
	{
	
		driver.get(prop.getProperty("url"));
	// one is inheritance
		//create object for loginpage and invoke menthods in it
		LandingPage lp=new LandingPage(driver);
		lp.getImage().click();
		LoginPage l1=new LoginPage(driver);
		
		//LoginPage l1=new LoginPage(driver);
		l1.getusrname().sendKeys(username);
		l1.getpwd().sendKeys(password);
		l1.getLogin().click();
		//System.out.println(text);
		
		log.info(text);
		ForgotPassword fp=l1.getforgotpassword();
		fp.getemail().sendKeys("emailid");
		fp.getsubmit().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="correctdata";
		data[0][1]="1234";
		data[0][2]="restricteddata";
				
		data[1][0]="incorrectdata";
		data[1][1]="2345";
		data[1][2]="unrestricteddata";
		
		return data;
	}
	
	
}
