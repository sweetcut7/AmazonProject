package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By Email=By.cssSelector("[type='email']");
	By emailcontinue=By.cssSelector("[type='submit']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[value='Log In']");
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement getEmailcontinue()
	{
		return driver.findElement(emailcontinue);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
}

