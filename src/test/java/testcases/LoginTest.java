package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.LoginPage;

//this is the file where we will write testcase ->Execute test one by one = Testsuite -> Maven
public class LoginTest extends BaseClass{
	
	@Test
	public void LoginwithValidCredentials() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login();
		loginpage.EmailButton();
		loginpage.EmailId(prop.getProperty("Email"));
		loginpage.Password(prop.getProperty("Password"));
		Thread.sleep(2000);
		loginpage.LoginButton();
	}
	
	@Test
	public void LoginwithInValidCredentials() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login();
		loginpage.EmailButton();
		loginpage.EmailId(prop.getProperty("Email"));
		loginpage.InvalidPassword(prop.getProperty("InvalidPass"));
		Thread.sleep(2000);
		loginpage.LoginButton();
	}


}
