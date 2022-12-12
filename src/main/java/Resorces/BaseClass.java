package Resorces;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver BrowserLaunch() throws IOException
	{
		//To read data.properties file
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resorces\\data.properties");
		
		//To get access of data.properties file
		
		prop=new Properties();
		
		prop.load(fis);
		
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")) 
		{
		   WebDriverManager.chromedriver().setup(); ////This will run with latest chrome driver version in your system.
		   
		   driver=new ChromeDriver();
		    
		    driver.get(prop.getProperty("url"));
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("edge"))
		{
			//Microsoft Edge code
		}
		
		else
		{
			System.out.println("Please Select valid Browser");
		}
		return driver;
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException
	{
		BrowserLaunch();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
