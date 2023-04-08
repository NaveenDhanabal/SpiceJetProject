package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoundTripPage {

	public WebDriver driver;
	public RoundTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//div[@data-testid=\"round-trip-radio-button\"]")
	WebElement roundtripbutton;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingfrom;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destinationto;
	
	@FindBy(xpath="//div[@data-testid=\"departure-date-dropdown-label-test-id\"]")
	WebElement datebutton;
	
	@FindBy(xpath="//div[@data-testid=\"undefined-calendar-day-10\"]")
	WebElement dipaturedate;
	
	@FindBy(xpath="//div[@data-testid=\"undefined-calendar-day-20\"]")
	WebElement returndate;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;
	
	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[6]")
	WebElement currency;
		
	@FindBy(xpath="//div[contains(text(),'Family & Friends')]")
	WebElement familyandfriends;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	@FindBy(xpath="//*[name()='rect' and contains(@width,'100%')]")
	WebElement termsandcondition;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement continuebutton;
	
	public void RoundTrip() {
		roundtripbutton.click();
	}
	public void onBoarding(String From) {
		boardingfrom.sendKeys(From);
	}
	public void DestinationTo(String To) {
		destinationto.sendKeys(To);
	}
	public void Dates() {
		datebutton.click();
	}
	public void DipatureDate() {
		dipaturedate.click();
	}
	public void ReturnDate() {
		returndate.click();
	}
	public void Passengers(){
		passengers.click();
		for(int i=0;i<3;i++) {
			adult.click();}
	}
	public void Currency() {
		currency.click();
	}
	public void FamilyandFriends() {
		familyandfriends.click();
	}
	public void SearchFlight() {
		searchflight.click();
	}
	public void TermsandCondition() {
		termsandcondition.click();
	}
	public void Countinue() {
		continuebutton.click();
	}


}
