package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {
	
	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver= driver;
		this.test=test;
	}
	  
    public EnquiryFormPage enterName(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.Name.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage enterOrganisationName(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.OrganisationName.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage enterAddress(String data) {
	
	     enterByXpath(prop.getProperty("IrctcEnquiryFormPage.Address.Xpath"), data);
	
	    return this;
	
   }
    
    
    public EnquiryFormPage enterMobile(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.Mobile.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.Email.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage selectRequestFor(String data) {
	
	    selectvisibletextbyxpath(prop.getProperty("IrctcEnquiryFormPage.RequestFor.Xpath"), data);
	
	    return this;
	
   }
    
    public EnquiryFormPage enterOriginStation(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.OriginStation.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage enterDestinationStation(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.DestinationStation.Xpath"), data);
		
		return this;
	}
    
      public EnquiryFormPage clickonCheckInDateCalender() {
	
	    clickByXpath(prop.getProperty("IrctcEnquiryFormPage.CheckInDateCalender.Xpath"));
		
		  return this;
	}

      public EnquiryFormPage clickonCheckInDate(String Date) {
    		
  	    clickByXpath(prop.getProperty("IrctcEnquiryFormPage.CheckInDate.Xpath"),Date);
  		
  		  return this;
  	}

    public EnquiryFormPage clickonCheckOutDateCalender(){
		
    	  clickByXpath(prop.getProperty("IrctcEnquiryFormPage.CheckOutDateCalender.Xpath"));
    	  
		  return this;
	}
    
    public EnquiryFormPage clickonCheckOutDate(String Date) {
		
  	  clickByXpath(prop.getProperty("IrctcEnquiryFormPage.CheckOutDate.Xpath"),Date);
  	  
		  return this;
	}
    
    
   public EnquiryFormPage enterDurationDays(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.DurationDays.Xpath"), data);
		
		return this;
	}
   
   public EnquiryFormPage enterCoachDetails(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.CoachDetails.Xpath"), data);
		
		return this;
	}
   

    public EnquiryFormPage enterNumberOfPassengers(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.NumberOfPassengers.Xpath"), data);
		
		return this;
	}

    public EnquiryFormPage enterPurposeOfCharter(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.PurposeOfCharter.Xpath"), data);
		
		return this;
	}
    
   public EnquiryFormPage enterAdditionalServices(String data) {
		
		enterByXpath(prop.getProperty("IrctcEnquiryFormPage.AdditionalServices.Xpath"), data);
		
		return this;
	}
   
   
   public EnquiryFormPage clickonSubmit() {
		
	  	  clickByXpath(prop.getProperty("IrctcEnquiryFormPage.Submit.Xpath"));
	  	  
			  return this;
		}
   
   
   public EnquiryFormPage verifyMobileNumberNotValidMessage(String data) {
		
	   verifyTextByXpath(prop.getProperty("IrctcEnquiryFormPage.verifyMobileNumberNotValidMessage.Xpath"),data);
	   
	   return this;
	   
		}

   
}
