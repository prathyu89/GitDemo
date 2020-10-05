package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	public WebDriver driver;
	
	By emailId=By.cssSelector("[type='submit']");
	//By passwd= By.cssSelector("input[id='password']");
	By submit=By.id("continue");
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(emailId);
	}
	public WebElement  getsubmit()
	{
		return driver.findElement(submit);
		
	}
	
}
