package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegestrationPage extends GenericWrappers {
	
	public RegestrationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
	
public RegestrationPage enterUserName(String data) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserName.Xpath"), data);
		
		return this;
	}
	
	
      public RegestrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Password.Xpath"), data);
		
		return this;
		
	    }
	
      public RegestrationPage enterConfirmPassword(String data) {
  		
  		enterByXpath(prop.getProperty("IrctcRegistrationPage.ConfirmPassword.Xpath"), data);
  		
  		return this;
  		
  	    }
      
      public RegestrationPage clickonPreferedLanguage() {
  		
  		clickByXpath(prop.getProperty("IrctcRegistrationPage.PreferedLanguage.Xpath"));
  		
  		return this;
  		
  	    }
      
      public RegestrationPage clickonLanguage(String Language) {
  		
  		clickByXpath(prop.getProperty("IrctcRegistrationPage.Language.Xpath"),Language);
  		
  		return this;
  		
  	    }
      
      public RegestrationPage clickonSecurityQuestion() {
    		
    		clickByXpath(prop.getProperty("IrctcRegistrationPage.SecurityQuestion.Xpath"));
    		
    		return this;
    		
    	    }
      
      public RegestrationPage clickonQuestion(String Question) {
  		
  		clickByXpath(prop.getProperty("IrctcRegistrationPage.Question.Xpath"),Question);
  		
  		return this;
  		
  	    }
      
      public RegestrationPage enterSecurityAnswer(String data) {
  		
  		enterByXpath(prop.getProperty("IrctcRegistrationPage.SecurityAnswer.Xpath"), data);
  		
  		return this;
  		
  	    }
      
      public RegestrationPage clickonContinue() {
    		
    		clickByXpath(prop.getProperty("IrctcRegistrationPage.Continue.Xpath"));
    		
    		return this;
    		
    	    }

      public RegestrationPage enterFirstName(String data) {
  		
  		enterByXpath(prop.getProperty("IrctcRegistrationPage.FirstName.Xpath"), data);
  		
  		return this;
  	}
  	
  	
      public RegestrationPage enterMiddleName(String data) {
  		
  		enterByXpath(prop.getProperty("IrctcRegistrationPage.MiddleName.Xpath"), data);
  		
  		return this;
  	}
  	
      
      public RegestrationPage enterLastName(String data) {
  		
   		enterByXpath(prop.getProperty("IrctcRegistrationPage.LastName.Xpath"), data);
   		
   		return this;
   	}
  	
      public RegestrationPage clickonOccupation() {
  		
   		clickByXpath(prop.getProperty("IrctcRegistrationPage.Occupation.Xpath"));
   		
   		return this;
   	}
  	
      public RegestrationPage clickonYourOccupation(String Occupation) {
  		
   		clickByXpath(prop.getProperty("IrctcRegistrationPage.YourOccupation.Xpath"),Occupation);
   		
   		return this;
   	}
  	

      public RegestrationPage enterDateOfBirth(String data) {
  		
   		enterByXpath(prop.getProperty("IrctcRegistrationPage.DateOfBirth.Xpath"), data);
   		
   		return this;
   	}
  	
       public RegestrationPage clickonDate() {
  		
   		clickByXpath(prop.getProperty("IrctcRegistrationPage.Date.Xpath"));
   		
   		return this;
   	}
  	
  	
       public RegestrationPage clickonMaritalStatus(String Status) {
   		
    		clickByXpath(prop.getProperty("IrctcRegistrationPage.MaritalStatus.Xpath"),Status);
    		
    		return this;
    	}
   	
       public RegestrationPage selectCountry(String data) {
   		
    	    selectvisibletextbyxpath(prop.getProperty("IrctcRegistrationPage.Country.Xpath"), data);
    	 
    		return this;
    	}
       
       public RegestrationPage clickonGender(String Gender) {
   		
       	clickByXpath(prop.getProperty("IrctcRegistrationPage.Gender.Xpath"),Gender);
    		
    		return this;
    	}
       
       public RegestrationPage enterEmail(String data) {
   		
    		enterByXpath(prop.getProperty("IrctcRegistrationPage.Email.Xpath"), data);
    		
    		return this;
    	}
       
       public RegestrationPage enterMobile(String data) {
   		
      	 enterByXpath(prop.getProperty("IrctcRegistrationPage.Mobile.Xpath"), data);
    		
    		return this;
    	}
       
       public RegestrationPage selectNationality(String data) {
   		
    		selectvisibletextbyxpath(prop.getProperty("IrctcRegistrationPage.Nationality.Xpath"), data);
    		
    		return this;
    	}
      
       public RegestrationPage clickonContinue1() {
   		
   		clickByXpath(prop.getProperty("IrctcRegistrationPage.Continue1.Xpath"));
   		
   		return this;
   		
   	    }
       public RegestrationPage enterResidentialAddress1(String data) {
	  		
	  		enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialAddress1.Xpath"), data);
	  		
	  		return this;
	  	}
	     
	     public RegestrationPage enterResidentialAddress2(String data) {
	  		
	  		enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialAddress2.Xpath"), data);
	  		
	  		return this;
	  	}
	     
	     public RegestrationPage enterResidentialAddress3(String data) {
		  		
		  		enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialAddress3.Xpath"), data);
		  		
		  		return this;
		  	}
		     
		     public RegestrationPage enterResidentialPincode(String data) {
		  		
		  		enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialPincode.Xpath"), data);
		  		
		  		return this;
		  	}
	     
	     public RegestrationPage enterResidentialState(String String) {
	   		
	    	 enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialState.Xpath"), String);
	   		
	   		return this;
	   	}
	     
	     
	     public RegestrationPage selectResidentialCity(String String) {
	    		
	       selectvisibletextbyxpath(prop.getProperty("IrctcRegistrationPage.ResidentialCity.Xpath"), String);
	    		
	    	return this;
	    	
	    }
	     
	     public RegestrationPage selectResidentialPostOffice(String String) {
	    		
		       selectvisibletextbyxpath(prop.getProperty("IrctcRegistrationPage.ResidentialPostOffice.Xpath"), String);
		    		
		    	return this;
		    	
		    }
	     
	     public RegestrationPage enterResidentialPhone(String String) {
		   		
	    	 enterByXpath(prop.getProperty("IrctcRegistrationPage.ResidentialPhone.Xpath"), String);
	   		
	   		return this;
	   	}
	     
	     
	     public RegestrationPage clickonCopyResidencetoOfficeAddress() {
	    	 
	    	 clickByXpath(prop.getProperty("IrctcRegistrationPage.CopyResidencetoOfficeAddress.Xpath"));
	    	 
	    	 return this;
	    	 
	     }
	     //
	     
	     public RegestrationPage enterOfficeAddress1(String data) {
		  		
		  	enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeAddress1.Xpath"), data);
		  		
		  	return this;
		}
		     
	    public RegestrationPage enterOfficeAddress2(String data) {
		  		
		  	enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeAddress2.Xpath"), data);
		  		
		  	return this;
		}
		     
	   public RegestrationPage enterOfficeAddress3(String data) {
			  		
			  enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeAddress3.Xpath"), data);
			  		
			  return this;
			  
		}
			    
      public RegestrationPage clickonCountry1() {
		   
		   clickByXpath(prop.getProperty("IrctcRegistrationPage.Country1.Xpath"));
		   
		   return this;
	   }
	   
	   public RegestrationPage clickonCountryOption(String Country) {
		   
        clickByXpath(prop.getProperty("IrctcRegistrationPage.CountryOption.Xpath"),Country);  
        
		   return this;
	   }
	   
	   public RegestrationPage enterOfficePincode(String data) {
			  		
			enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePincode.Xpath"), data);
			  		
			return this;
			
	  	}
	   
	   public RegestrationPage pageDown() {
		   
		   pagedown();
		   
		   return this;
	   }
		     
	   public RegestrationPage enterOfficeState(String data) {
		   		
		    enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeState.Xpath"), data);
		   		
		   	return this;
		}
		     
		     
	   public RegestrationPage enterOfficeCity(String data) {
		   
		     enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeCity.Xpath"), data);
		     
		      return this;
		    	
	    }
		     
	   public RegestrationPage enterOfficePostOffice(String data) {
		   
		 enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePostOffice.Xpath"), data);
			    		
		   	return this;
			    	
	   }
		     
	   public RegestrationPage enterOfficePhone(String data) {
			   		
		    enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePhone.Xpath"), data);
		   		
		   	return this;
	 	}
		     
		     
	  public RegestrationPage clickonCreditCardInformation() {
		    	 
		   clickByXpath(prop.getProperty("IrctcRegistrationPage.CreditCardInformation.Xpath"));
		    	 
		    return this;
		    	 
		 }
		     
	  public RegestrationPage clickonTermsandConditions() {
	    	 
		   clickByXpath(prop.getProperty("IrctcRegistrationPage.TermsandConditions.Xpath"));
		    	 
		    return this;
		    	 
		 }
	     
	  public RegestrationPage clickonRegister() {
	    	 
		   clickByXpath(prop.getProperty("IrctcRegistrationPage.Register.Xpath"));
		    	 
		    return this;
	  }
		    
	  
		  
}
