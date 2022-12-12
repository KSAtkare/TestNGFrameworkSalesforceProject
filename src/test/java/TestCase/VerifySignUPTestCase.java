package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjectModel;
import PageObjectModel.SignUpPageObjectModel;
import Resorces.BaseClass;
import Resorces.CommonUtilities;
import Resorces.TestCaseData;

@Test
public class VerifySignUPTestCase extends BaseClass {
	
	public void SignUp() throws IOException, InterruptedException
	{
		LoginPageObjectModel Lpo=new LoginPageObjectModel(driver);
		
		Lpo.ClickOnTryForFree().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);
		
		String expected=TestCaseData.expectedTitleSignUp;
		
		String actual=driver.getTitle();
		
		CommonUtilities.assertions(actual, expected);
		
		SignUpPageObjectModel Spo=new SignUpPageObjectModel(driver);
		
		Spo.EnterFirstName().sendKeys(TestCaseData.firstName);
		
		Spo.EnterLastName().sendKeys(TestCaseData.lastName);
		
		Spo.EnterEmail().sendKeys(TestCaseData.email);
		
		CommonUtilities.dropDownHandle(Spo.EnterJobTitle(), 7);
		
		Spo.EnterCompany().sendKeys(TestCaseData.company);
		
		CommonUtilities.dropDownHandle(Spo.EnterEmployees(), 5);
		
		Spo.EnterPhone().sendKeys(TestCaseData.phone);
		
		CommonUtilities.dropDownHandle2(Spo.EnterCountry(), "IN");
		
		Spo.TickCheckbox().click();
		
		Spo.ClickStartMyFreeTrial().click();
		
		
	}

	
}
