package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.OnewayTripPage;

public class OnewayTripTest extends BaseClass {
	
		@Test
		public void Onewaytrip() throws InterruptedException {
		OnewayTripPage oneway = new OnewayTripPage(driver);
		oneway.OneWay();
		oneway.onBoarding(prop.getProperty("From"));
		Thread.sleep(3000);
		oneway.DestinationTo(prop.getProperty("To"));
		Thread.sleep(3000);
		oneway.DipatureDate();
		Thread.sleep(3000);
		oneway.Passengers();
		Thread.sleep(3000);
		oneway.Adult();
		Thread.sleep(3000);
		oneway.Currency();
		oneway.FamilyandFriends();
		Thread.sleep(3000);
		oneway.SearchFlight();
		Thread.sleep(3000);
		SwitchWindow();
		oneway.TermsandCondition();
		Thread.sleep(3000);
		oneway.Countinue();
		Thread.sleep(3000);
		
		
	}
	
}
