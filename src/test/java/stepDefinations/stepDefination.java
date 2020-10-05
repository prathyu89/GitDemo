package stepDefinations;
//package my.package.name

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefination extends base{
	
	@Given("^initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver=initizationDriver();
			
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^click on login link in home page to load on secure sign in page$")
	public void click_on_login_link_in_home_page_to_load_on_secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp=new LandingPage(driver);
		lp.getImage().click();
	}

	//@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and log in$")
//	public void user_enters_and_and_log_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 @When("^User enters (.+) and (.+) and log in$")
		    public void user_enters_and_and_log_in(String username, String password) throws Throwable {
		        
		    
		LoginPage l1=new LoginPage(driver);
		
		//LoginPage l1=new LoginPage(driver);
		l1.getusrname().sendKeys(username);
		l1.getpwd().sendKeys(password);
		l1.getLogin().click();
		//System.out.println(text);
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	 @And("^close all the browsers$")
	    public void close_all_the_browsers() throws Throwable {
	       driver.quit();
	    }


}
