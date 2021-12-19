package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookingDetailsPage extends GenericWrappers {
	
	public HotelBookingDetailsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public HotelBookingDetailsPage selectTitle(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcHotelBookingDetailsPage.Title.Xpath"), data);
		
		return this;
	}
	
	
   public HotelBookingDetailsPage enterFirstName(String data) {
	   
	   enterByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.FirstName.Xpath"), data);
		
		return this;
	}
	
   public HotelBookingDetailsPage enterLastName(String data) {
	   
	   enterByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.LastName.Xpath"), data);
		
		return this;
	}
	
   public HotelBookingDetailsPage selectCountry(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcHotelBookingDetailsPage.Country.Xpath"), data);
		
		return this;
	}
   
   public HotelBookingDetailsPage selectState(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcHotelBookingDetailsPage.State.Xpath"), data);
		
		return this;
	}
   
   public HotelBookingDetailsPage pageDown() {
	   
	   pagedown();
	   
	   return this;
   }
 
   public HotelBookingDetailsPage selectGst(String data) {
		
	   selectvisibletextbyxpath(prop.getProperty("IrctcHotelBookingDetailsPage.Gst.Xpath"), data);
		
		return this;
	}
	
  
  public HotelBookingDetailsPage enterGstNumber(String data) {
	   
	   enterByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.GstNumber.Xpath"), data);
		
		return this;
	}
  
   public HotelBookingDetailsPage verifingHotelName(String data) {
	   
	  verifyTextByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.verifingHotelName.Xpath"),data);
	  
	  return this;
   }
  
    public HotelBookingDetailsPage verifingHotelPrice(String data) {
	   
	  verifyTextByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.verifingHotelPrice.Xpath"), data);
	  
	  return this;
   }
  
  public HotelBookingPreviewPage clickonContinue() {
		
		clickByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.Continue.Xpath"));
		
		return new HotelBookingPreviewPage(driver,test);
	}
	
  public HotelBookingDetailsPage clickonContinue1() {
		
		clickByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.Continue1.Xpath"));
		
		return this;
	}
  
  
  public HotelBookingDetailsPage enterCompanyName(String data) {
	   
	   enterByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.CompanyName.Xpath"), data);
		
		return this;
	}
  
  public HotelBookingDetailsPage enterCompanyAddress(String data) {
	   
	   enterByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.CompanyAddress.Xpath"), data);
		
		return this;
	}
	
	
	
	public HotelBookingDetailsPage verifingGstText(String text) {
		
		verifyTextByXpath(prop.getProperty("IrctcHotelBookingDetailsPage.verifingGstText.Xpath"), text);
		
		return this;
	}
}
