package Amazon;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class Addingamazongiftcardtocart extends base {
	public WebDriver driver;
	public static Logger Log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("Amount"));
		driver.manage().window().maximize();
	}
	@Test(dataProvider="getData")
	public void giftcardtocart(String Search) throws IOException 

	{
		
		LandingPage lp= new LandingPage(driver);
	
		lp.getNavigationBar().click();
				System.out.println(driver.getTitle());
		lp.getSearchBar().click();
		lp.getSearchBar().sendKeys(Search);
		lp.getSearchsend().click();
		lp.getegiftcard().click();
		lp.getstyle().click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//	lp.getstyleselect().click();
		lp.getvalue().click();
		lp.getvalue().sendKeys(prop.getProperty("Amount"));
		lp.getselectemailoption().click();
		lp.getemail().click();
		lp.getemail().sendKeys(prop.getProperty("email"));
		lp.getsendername().click();
		lp.getsendername().sendKeys(prop.getProperty("sendername"));
		lp.getsendermessage().clear();
		lp.getsendermessage().sendKeys(prop.getProperty("sendermessage"));
		lp.getaddtocart().click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.getcart().click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.getproceedcart().click();
		
		
		LoginPage l=new LoginPage(driver);
		l.getEmail().sendKeys(prop.getProperty("amazonaccountemail"));
		l.getEmailcontinue().click();
		l.getpassword().sendKeys(prop.getProperty("amazonaccountpassword"));
		lp.getsignin().click();
		
			
	}
	

	@DataProvider
	public Object[] getData()
	{
		Object[] data=new Object[1];
		data[0]="amazon egift card";

		
		
		return data;
	}
	
	@AfterTest
	public void teardown() 
	{
			driver.close();
			}
}