package Amazon;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger Log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
	
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException 

	{
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getEmailcontinue().click();
		lp.getpassword().sendKeys(Password);
		
		
		lp.getlogin().click();
				
			
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
			}
	
	@DataProvider
	public Object getData()
	{

		String Username = "amazontestjava@gmail.com";
		String Password="Amazon@123";
		return getData();
		
		
	//	data[1][0]="User@bestbuy.com";
	//	data[1][1]="bestbuy@123";
	//	data[1][2]="Unrestricted user";
	//	return data;
	}
	}
