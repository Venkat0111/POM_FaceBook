package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterBookingPage extends GenericWrappers {
	
	public CharterBookingPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
		
	}
	
	public CharterBookingPage pageDown() {
		
		pagedown();
		
		return this;
	}
	
	public EnquiryFormPage clickonEnquiryForm() {
		
		clickByXpath(prop.getProperty("IrctcCharterBookingPage.EnquiryForm.Xpath"));
		
		return new EnquiryFormPage(driver,test);
	}

}
