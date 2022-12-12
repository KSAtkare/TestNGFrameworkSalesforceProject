package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageObjectModel {
	
	//This driver don't have scope.
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By error=By.xpath("//div[@id='error']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	
	//We have achieved encapsulation here.
	public LoginPageObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterUsername()
	{
	   return driver.findElement(username);
	}
	
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement PrintErrormsg()
	{
		return driver.findElement(error);
	}
			
	public WebElement ClickOnTryForFree()
	{
		return driver.findElement(tryforfree);
	}
			
	

	
	
	

}
