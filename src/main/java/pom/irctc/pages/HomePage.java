package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
	
	public RegestrationPage clickonRegister() {
		
		clickByXpath(prop.getProperty("IrctcHomePage.Register.Xpath"));
		
		return new RegestrationPage(driver,test);
	}

	public HomePage mouseHoveronHolidays() {
		
		mouseOverByXpath(prop.getProperty("IrctcHomePage.Holidays.Xpath"));
		
		return this;
	}
	
     public HomePage mouseHoveronStays() {
		
		mouseOverByXpath(prop.getProperty("IrctcHomePage.Stays.Xpath"));
		
		return this;
	}
	
     public AccomodationPage clickonLounge() {
 		
 		clickByXpath(prop.getProperty("IrctcHomePage.Lounge.Xpath"));
 		
 		return new AccomodationPage(driver,test);
 	}
     
    
	
	
}
