package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	public WebDriver driver;
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[2]")
	WebElement signupbutton;
	
	@FindBy(xpath="(//option[@value='MR'])[1]")
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	
	@FindBy(xpath="(//input[@id='email_id'])[1]")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement defaultcheck;
	
	@FindBy(css = "button[type='button']")
	WebElement submitbutton;
	
	public void SignupButton () {
	signupbutton.click();
	}
	public void Title() {
		title.click();
	}
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	public void Lastname (String LastName) {
		lastname.sendKeys(LastName);
	}
	public void Country(String Country) {
		country.sendKeys(Country);
	}
	public void DOB (String DOB) {
		dateofbirth.sendKeys(DOB);
	}
	public void MobileNumber(String MobileNumber) {
		mobilenumber.sendKeys(MobileNumber);
	}
	public void EmailId (String Email) {
		emailid.sendKeys(Email);
	}
	public void Password(String Password) {
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String ConfirmPassword) {
		confirmpassword.sendKeys(ConfirmPassword);
	}
	public void DefaultClick () {
		defaultcheck.click();
	}
	public void SubmitButton() {
		submitbutton.click();
	}
		
	
	
}
