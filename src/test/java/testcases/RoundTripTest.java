package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass {
	
	@Test
	public void RoundTrip() throws InterruptedException {
		RoundTripPage roundtrip = new RoundTripPage(driver);
		roundtrip.RoundTrip();
		Thread.sleep(3000);
		roundtrip.onBoarding(prop.getProperty("From"));
		Thread.sleep(3000);
		roundtrip.DestinationTo(prop.getProperty("To"));
		Thread.sleep(3000);
		roundtrip.Dates();
		Thread.sleep(3000);
		roundtrip.DipatureDate();
		Thread.sleep(3000);
		roundtrip.ReturnDate();
		Thread.sleep(3000);
		roundtrip.Passengers();
		Thread.sleep(3000);
		roundtrip.Currency();
		roundtrip.FamilyandFriends();
		Thread.sleep(3000);
		roundtrip.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		roundtrip.TermsandCondition();
		Thread.sleep(3000);
		roundtrip.Countinue();
		Thread.sleep(3000);
		
		
	}

}
