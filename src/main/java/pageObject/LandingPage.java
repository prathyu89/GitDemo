package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signin=By.className("img-responsive");
	//By Login=By.id("login");
	
	By Title=By.id("small-business");
	By Navbar=By.xpath("//ul[@class='wwww-main-nav searchEnabled']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getImage()
	{
		return driver.findElement(signin);
	
	}
	
	public WebElement getNavbar()
	{
		return driver.findElement(Navbar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(Title);

	}
	
	
}
