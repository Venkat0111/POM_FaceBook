package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegistrationpage extends GenericWrappers {
	
	public FtrRegistrationpage(RemoteWebDriver driver,ExtentTest test) {
		
	this.driver=driver;
	this.test=test;
		
	}
	
public FtrRegistrationpage enterUserid(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Userid.Xpath"), data);
		
		return this;
	}

    public FtrRegistrationpage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Password.Xpath"), data);
		
		return this;
	}

    public FtrRegistrationpage enterConfirmPassword(String data) {
	
	     enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.ConfirmPassword.Xpath"), data);
	
	    return this;
	
   }
    
    public FtrRegistrationpage selectSequrityQuestion(String data) {
    	
    	selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.SequrityQuestion.Xpath"), data);
    	
    	return this;
    	
       }
    
    public FtrRegistrationpage enterSequrityAnswer(String data) {
    	
    	enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.SequrityAnswer.Xpath"), data);
    	
    	return this;
    	
       }
    
      public FtrRegistrationpage clickonDateOfBirth() {
    	
    	clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.DateOfBirth.Xpath"));
    	
    	return this;
    	
       }
      
      public FtrRegistrationpage selectYear(String value){
    	  
  		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.Year.Xpath"), value);
  		
  		return this;		
  	}
      
  	public FtrRegistrationpage selectMonth(String value){
  		
  		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.Month.Xpath"), value);
  		
  		return this;
  	}
 
  		public FtrRegistrationpage clickonDay(String Day){
  		
  			clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.Day.Xpath"),Day);
  		
  		return this;		
  	}
  	
      
      public FtrRegistrationpage clickonGender(String Gender) {
    	  
    	  clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.Gender.Xpath"),Gender);
      	
      //	clickByXpath("//input[@id='"+data+"']");
      	
      	return this;
      	
         }
      
      
    public FtrRegistrationpage clickonMaritalStatus(String Status) {
    	
    	clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.MaritalStatus.Xpath"),Status);
    	
    	return this;
    	
       }
    
    
   public FtrRegistrationpage enterEmail(String data) {
    	
    	enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Email.Xpath"), data);
    	
    	return this;
    	
       }
   
   public FtrRegistrationpage selectOccupation(String data) {
   	
   	selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.Occupation.Xpath"), data);
   	
   	return this;
   	
      }
 
   public FtrRegistrationpage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.FirstName.Xpath"), data);
		
		return this;
	}
	
	
   public FtrRegistrationpage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.MiddleName.Xpath"), data);
		
		return this;
	}
	
   
   public FtrRegistrationpage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.LastName.Xpath"), data);
		
		return this;
	}
   
   public FtrRegistrationpage selectNationality(String data) {
	   	
	   selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.Nationality.Xpath"), data);
	   	
	   	return this;
	   	
	      }
	
   public FtrRegistrationpage enterFlatNo(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.FlatNo.Xpath"), data);
		
		return this;
	}
    
    public FtrRegistrationpage enterStreet(String data) {
 		
 		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Street.Xpath"), data);
 		
 		return this;
 	}
 	
	
    public FtrRegistrationpage enterArea(String data) {
 		
 		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Area.Xpath"), data);
 		
 		return this;
 	}
    
    public FtrRegistrationpage selectCountry(String data) {
 		
 		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.Country.Xpath"), data);
 		
 		return this;
 	}
    
    public FtrRegistrationpage pageDown() {
    	
    	pagedown();
    	
    	return this;
    }
    
    public FtrRegistrationpage enterMobile(String data) {
 		
 		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Mobile.Xpath"), data);
 		
 		return this;
 	}
    
    public FtrRegistrationpage enterPincode(String data) {
 		
 		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.Pincode.Xpath"), data);
 		
 		return this;
 	}

    public FtrRegistrationpage selectCity(String data) {
 		
 		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.City.Xpath"), data);
 		
 		return this;
 	}
    
  
    public FtrRegistrationpage selectState(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.State.Xpath"), data);
		
		return this;
	}
  
  
    public FtrRegistrationpage selectPostOffice(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.PostOffice.Xpath"), data);
		
		return this;
	}
  
    public FtrRegistrationpage clickonResidentialAddressasNo() {
	  
	  clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.ResidentialAddressasNo.Xpath"));
	  
	  return this;
  }
    
  
     public FtrRegistrationpage enterOfficeFlatNo(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeFlatNo.Xpath"), data);
		
		return this;
	}
  
     public FtrRegistrationpage enterOfficeStreet(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeStreet.Xpath"), data);
		
		return this;
	}
	
	
    public FtrRegistrationpage enterOfficeArea(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeArea.Xpath"), data);
		
		return this;
	}
  
    public FtrRegistrationpage selectOfficeCountry(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeCountry.Xpath"), data);
		
		return this;
	}
  
  
     public FtrRegistrationpage enterOfficeMobile(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeMobile.Xpath"), data);
		
		return this;
	}
  
    public FtrRegistrationpage enterOfficePincode(String data) {
		
		enterByXpath(prop.getProperty("IrctcFtrRegistrationPage.OfficePincode.Xpath"), data);
		
		return this;
	}

      public FtrRegistrationpage selectOfficeCity(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeCity.Xpath"), data);
		
		return this;
	}
  

       public FtrRegistrationpage selectOfficeState(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.OfficeState.Xpath"), data);
		
		return this;
	}


      public FtrRegistrationpage selectOfficePostOffice(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("IrctcFtrRegistrationPage.OfficePostOffice.Xpath"), data);
		
		return this;
	}


       public FtrRegistrationpage clickonCreateProfile() {
	
	    clickByXpath(prop.getProperty("IrctcFtrRegistrationPage.CreateProfile.Xpath"));
	
	     return this;
   }
       
     
}
