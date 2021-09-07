package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

import Amazon.Addingamazongiftcardtocart;

@RunWith(Cucumber.class)
public class stepDefinations extends base {
	
	
	@Given("^Intitaliaze the browser and  Navigate to Amazon website  site$")
	public void intitaliaze_the_browser_and_Navigate_to_Amazon_website_site() throws Throwable {
		 
		 Addingamazongiftcardtocart a=new Addingamazongiftcardtocart();
		 
		
				driver =initializeDriver();
				driver.get(prop.getProperty("url"));
				//driver.get(prop.getProperty("Amount"));
				driver.manage().window().maximize();
			
	    }

	 @Given("^Click on the Search option and search for (.+)$")
	    public void click_on_the_search_option_and_search_for(String amazonegiftcard) throws Throwable {
		 LandingPage lp= new LandingPage(driver);
			
			lp.getNavigationBar().click();
					System.out.println(driver.getTitle());
			lp.getSearchBar().click();
			lp.getSearchBar().sendKeys(amazonegiftcard);
			lp.getSearchsend().click();
			lp.getegiftcard().click();
	    }

	    @When("^User enters Standard egift card type and select the amount of gift card (.+)$")
	    public void user_enters_standard_egift_card_type_and_select_the_amount_of_gift_card(String value) throws Throwable {
	    	 LandingPage lp= new LandingPage(driver);
			   	 lp.getstyle().click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//	lp.getstyleselect().click();
			lp.getvalue().click();
			lp.getvalue().sendKeys(value);
	    }
	    @And("^User enter desired reciepient email (.+) where the gift card needs to be sent$")
	    public void user_enter_desired_reciepient_email_where_the_gift_card_needs_to_be_sent(String reciepientemail) throws Throwable {
	    	 LandingPage lp= new LandingPage(driver);
	    	lp.getselectemailoption().click();
			lp.getemail().click();
			lp.getemail().sendKeys(reciepientemail);	
	    }	
	    @When("^User enter desired sender name (.+) for the gift card$")
	    public void user_enter_desired_sender_name_for_the_gift_card(String sendername) throws Throwable { 	 //LandingPage lp= new LandingPage(driver);
	    	 LandingPage lp= new LandingPage(driver);
	    		lp.getsendername().click();
	    		lp.getsendername().sendKeys(sendername);
    }	    
	

	    @When("^User enter message (.+) for the gift card$")
	    public void user_enter_message_for_the_gift_card(String message) throws Throwable {
	       
	    	 LandingPage lp= new LandingPage(driver);
	    	 lp.getsendermessage().clear();
			lp.getsendermessage().sendKeys(message);
	    }
	    
	    @Then("^User add egift card to cart and checkout$")
	    public void user_add_egift_card_to_cart_and_checkout() throws Throwable {
	    	LandingPage lp= new LandingPage(driver); 
	    	lp.getaddtocart().click();
			
			lp.getcart().click();
		
			lp.getproceedcart().click();
	    }
	    @Then("^User enter credentials email (.+) and password (.+) for the amazon account$")
	    public void user_enter_credentials_email_and_password_for_the_amazon_account(String email, String password) throws Throwable {	LoginPage l=new LoginPage(driver);
	    	LandingPage lp= new LandingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	l.getEmail().sendKeys(email);
			l.getEmailcontinue().click();
			l.getpassword().sendKeys(password);
			lp.getsignin().click();
	    }

	  
	    

	    @Then("^Close browser$")
	    public void close_browser() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	//(3, TimeUnit.SECONDS);
	    			driver.close();
	    
	    }

	
}