package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.SignupPage;

public class SignupTest extends BaseClass {
	
	@Test
	public void Singup() throws InterruptedException {
		SignupPage signuppage = new SignupPage(driver);
		signuppage.SignupButton();
		SwitchWindow();
		Thread.sleep(4000);
		signuppage.Title();
		Thread.sleep(2000);
		signuppage.Firstname(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		signuppage.Lastname(prop.getProperty("LastName"));
		Thread.sleep(2000);
		signuppage.Country(prop.getProperty("Country"));
		Thread.sleep(2000);
		signuppage.DOB(prop.getProperty("DOB"));
		Thread.sleep(2000);
		signuppage.MobileNumber(prop.getProperty("MobileNumber"));
		Thread.sleep(3000);
		signuppage.EmailId(prop.getProperty("Email"));
		Thread.sleep(5000);
		signuppage.Password(prop.getProperty("Password"));
		Thread.sleep(2000);
		signuppage.ConfirmPassword(prop.getProperty("ConfirmPassword"));
		Thread.sleep(2000);
		signuppage.DefaultClick();
		Thread.sleep(2000);
		signuppage.SubmitButton();
		Thread.sleep(10000);
		
	}
	


}
