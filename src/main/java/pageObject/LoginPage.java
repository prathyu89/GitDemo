package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By username=By.id("username");
	By passwd= By.cssSelector("input[id='password']");
	By Login=By.id("Login");
	By forgotpassword=By.cssSelector("[class='fl small']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public ForgotPassword getforgotpassword()
	{
		driver.findElement(forgotpassword).click();
		return new ForgotPassword(driver);
	}
	public WebElement getusrname()
	{
		return driver.findElement(username);
	}
	public WebElement getpwd()
	{
		return driver.findElement(passwd);
	}
	public WebElement getLogin()
	{
		return driver.findElement(Login);

	}
}
