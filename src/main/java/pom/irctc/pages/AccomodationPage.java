package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	public AccomodationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver= driver;
		this.test=test;
	}
	
 public AccomodationPage switchtoNextwindow() {
    	 
    	 switchToLastWindow();
    	 
    	 return this;
     }
 
	public AccomodationPage clickonMenu() {
		
		clickByXpath(prop.getProperty("IrctcAccomodationPage.Menu.Xpath"));
		
		return this;
	}
	
   public FtrLoginPage clickonBookYourCoach() {
		
		clickByXpath(prop.getProperty("IrctcAccomodationPage.BookYourCoach.Xpath"));
		
		return new FtrLoginPage(driver,test);
	}
	
	public CharterBookingPage clickonCharter() {
		
		clickByXpath(prop.getProperty("IrctcAccomodationPage.Charter.Xpath"));
		
		return new CharterBookingPage(driver,test);
	}
	
	public HotelsPage clickonHotels() {
		
		clickByXpath(prop.getProperty("IrctcAccomodationPage.Hotels.Xpath"));
		
		return new HotelsPage(driver,test);
	}

}
