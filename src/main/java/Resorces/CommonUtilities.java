package Resorces;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static void dropDownHandle(WebElement DropDownXpath, int DropDownIndex)
	{
		
		Select s=new Select(DropDownXpath);
		
		s.selectByIndex(DropDownIndex);
		
	}
	
	public static void dropDownHandle2(WebElement DropDownXpath1, String DropDownValue)
	{
		Select s1=new Select(DropDownXpath1);
		
		s1.selectByValue(DropDownValue);
	}
	
	public static void assertions(String actual, String expected)
	{
		SoftAssert assertion=new SoftAssert();
		
		assertion.assertEquals(actual, expected);;
		
		assertion.assertAll();
		
	}
	
	

}
