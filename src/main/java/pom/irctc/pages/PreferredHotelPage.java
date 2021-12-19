package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PreferredHotelPage extends GenericWrappers {
	
	public PreferredHotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	  public PreferredHotelPage switchtoNextwindow() {
	    	 
	    	 switchToLastWindow();
	    	 
	    	 return this;
	     }

	public PreferredHotelPage getHotelNameText() {
		
	 getTextByXpath(prop.getProperty("IrctcPreferredHotelPage.HotelNameText.Xpath"));
		
		//System.out.println("HotelName is "+data);
		
		return this;
	}
	
     public PreferredHotelPage  getHotelPriceText() {
    	 
		
     getTextByXpath(prop.getProperty("IrctcPreferredHotelPage.HotelPriceText.Xpath"));
     
     //label[text()='Amount Payable ']//following::strong
		
		//System.out.println("HotelPrice is "+ data);
		
		return this;
	}
     
	public HotelBookingDetailsPage clickonBooking() {
		
		clickByXpath(prop.getProperty("IrctcPreferredHotelPage.Booking.Xpath"));
		
		return new HotelBookingDetailsPage(driver,test);
	}
	
}
