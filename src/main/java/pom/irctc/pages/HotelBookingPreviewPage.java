package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookingPreviewPage extends GenericWrappers {
	
	public HotelBookingPreviewPage (RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	

	  public HotelBookingPreviewPage clickonIAgree() {
		  
		  clickByXpath(prop.getProperty("IrctcHotelBookingPreviewPage.IAgree.Xpath"));
		  
		  return this;
	  }
	  
       public OtpPage clickonMakePayment() {
		  
		  clickByXpath(prop.getProperty("IrctcHotelBookingPreviewPage.MakePayment.Xpath"));
		  
		  return new OtpPage(driver,test);
	  }
}
