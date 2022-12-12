package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjectModel {
	
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By startmyfreetrial=By.xpath("//button[@name='start my free trial']");
	
	public SignUpPageObjectModel(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement EnterFirstName()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement EnterLastName()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement EnterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement EnterJobTitle()
	{
		return driver.findElement(jobtitle);
	}
	
	public WebElement EnterCompany()
	{
		return driver.findElement(company);
	}
	
	public WebElement EnterEmployees()
	{
		return driver.findElement(employees);
	}
	
	public WebElement EnterPhone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement EnterCountry()
	{
		return driver.findElement(Country);
	}
	
	public WebElement TickCheckbox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement ClickStartMyFreeTrial()
	{
		return driver.findElement(startmyfreetrial);
	}
	
	

}
