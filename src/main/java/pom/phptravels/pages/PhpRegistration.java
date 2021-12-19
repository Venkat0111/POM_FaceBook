package pom.phptravels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpRegistration extends GenericWrappers {
	
	public PhpRegistration(RemoteWebDriver driver, ExtentTest test ) {
		
		this.driver= driver;
		this.test=test;
		
	}

	public PhpRegistration enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.FirstName.Xpath"), data);
		
		return this;
	}
	
	public PhpRegistration enterLastName(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.LastName.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterEmail(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.Email.Xpath"), data);
		
		return this;
	}
	
	public PhpRegistration clickonDailCode( ) {
		
		clickByXpath(prop.getProperty("PhpRegistrationPage.DailCode.Xpath"));
		
		return this;
		
	}
	
    public PhpRegistration clickonCountryCode(String dailCode) {
		
		clickByXpath(prop.getProperty("PhpRegistrationPage.CountryCode.Xpath"),dailCode);
		
		return this;
		
	}
	
	
	public PhpRegistration enterPhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.PhoneNumber.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterCompanyName(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.CompanyName.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterStreet1(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.Street1.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterStreet2(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.Street2.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterCity(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.City.Xpath"), data);
		
		return this;
	}
	public PhpRegistration enterState(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.State.Xpath"), data);
		
		return this;
	}
	
     public PhpRegistration enterPostCode(String data) {
		
		enterByXpath(prop.getProperty("PhpRegistrationPage.PostCode.Xpath"), data);
		
		return this;
	}
     
     public PhpRegistration selectCountry(String data) {
    		
	     selectvisibletextbyxpath(prop.getProperty("PhpRegistrationPage.Country.Xpath"), data);
	
	     return this;
   }
     
     
      public PhpRegistration enterMobile(String data) {
	
	     enterByXpath(prop.getProperty("PhpRegistrationPage.Mobile.Xpath"), data);
	
	     return this;
   }
	
      public PhpRegistration enterPassword(String data) {
    	
    	enterByXpath(prop.getProperty("PhpRegistrationPage.Password.Xpath"), data);
    	
    	return this;
       }
    
      public PhpRegistration enterConfirmPassword(String data) {
    	
    	 enterByXpath(prop.getProperty("PhpRegistrationPage.ConfirmPassword.Xpath"), data);
    	
    	 return this;
       }
    
       public PhpRegistration clickonGeneratepassword() {
    	
    	  clickByXpath(prop.getProperty("PhpRegistrationPage.GeneratePassword.Xpath"));
    	
    	  return this;
       }
		
	
}
