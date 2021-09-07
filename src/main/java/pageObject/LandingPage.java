package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LandingPage {
	
	public WebDriver driver;
	By Signin =By.cssSelector("a[href*='signin']");
	By NavBar=By.id("navbar");
	By Search=By.id("twotabsearchtextbox");
	By Searchsend=By.cssSelector("*[type='submit']");
	By giftcard25=By.cssSelector("a[href*='10423897']");
	By egiftcard=By.cssSelector("a[href*='B07P68FH74']");
	By stylegiftcard=By.cssSelector("button[value='STANDARD']");
	//By styleselect=By.id("gc-mini-design-thumb-3");
	By stylevalue=By.id("gc-order-form-custom-amount");
	//By stylevalue=By.cssSelector("button[value='100']");
	By giftemailcardtype=By.id("gc-delivery-mechanism-button-Email");
	By emailvalue=By.id("gc-order-form-recipients");
	By sendervalue=By.id("gc-order-form-senderName");
	By sendermessage=By.id("gc-order-form-message");
	By addtocart=By.cssSelector("input[id='gc-buy-box-atc']");
	By cart=By.cssSelector("a[id*='nav-cart']");
	By proceedcart=By.cssSelector("input[value='Proceed to checkout']");
	By signin=By.id("signInSubmit");
		
	

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(Signin);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	
	public WebElement getSearchBar()
	{
		return driver.findElement(Search);
	}
	public WebElement getSearchsend()
	{
		return driver.findElement(Searchsend);
	}
	public WebElement get25giftcard()
	{
		return driver.findElement(giftcard25);
	}
	public WebElement getegiftcard()
	{
		return driver.findElement(egiftcard);
	}
	public WebElement getstyle()
	{
		return driver.findElement(stylegiftcard);
	}
/*	public WebElement getstyleselect()
	{
		return driver.findElement(styleselect);
	}*/
	public WebElement getvalue()
	{
		return driver.findElement(stylevalue);
	}
	public WebElement getselectemailoption()
	{
		return driver.findElement(giftemailcardtype);
	}
	public WebElement getemail()
	{
		return driver.findElement(emailvalue);
	}
	public WebElement getsendername()
	{
		return driver.findElement(sendervalue);
	}
	public WebElement getsendermessage()
	{
		return driver.findElement(sendermessage);
	}
	public WebElement getaddtocart()
	{
		return driver.findElement(addtocart);
	}
	public WebElement getcart()
	{
	driver.navigate().refresh();
	return driver.findElement(cart);
	}
	public WebElement getproceedcart()
	{
		return driver.findElement(proceedcart);
	}
	public WebElement getsignin()
	{
		return driver.findElement(signin);
	}
	
	
}
