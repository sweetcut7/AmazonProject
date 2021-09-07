package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\prash\\eclipse-workspace-I\\AmazonE2EProject\\src\\main\\java\\resources\\data.property");
		
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		String amount= prop.getProperty("Amount");
		String email= prop.getProperty("email");
		String sendername= prop.getProperty("sendername");
		String sendermessage= prop.getProperty("sendermessage");
		String amazonaccountemail= prop.getProperty("amazonaccountemail");
		String amazonaccountpassword= prop.getProperty("amazonaccountpassword");
		System.out.println(browserName);
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\prash\\Desktop\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
