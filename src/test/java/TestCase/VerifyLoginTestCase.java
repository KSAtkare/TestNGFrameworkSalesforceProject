package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjectModel;
import Resorces.BaseClass;
import Resorces.CommonUtilities;
import Resorces.TestCaseData;

@Test
public class VerifyLoginTestCase extends BaseClass{
	
	public void Login() throws IOException
	{
		String expected=TestCaseData.expectdTitleLogin;
		
		String actual=driver.getTitle();
		
	    CommonUtilities.assertions(actual, expected);
		
		LoginPageObjectModel Lpo=new LoginPageObjectModel(driver);
		
		Lpo.EnterUsername().sendKeys(TestCaseData.username);
		
		Lpo.EnterPassword().sendKeys(TestCaseData.password);
		
		Lpo.ClickOnLogin().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(Lpo.PrintErrormsg().getText());
		
	
		
		
		
		
		
	}

	

}
