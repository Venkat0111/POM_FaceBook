package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
	public RegistrationPage enterUserId(String data) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.UserId.XPath"), data);
		
		return this;
	}

    public RegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.Password.XPath"), data);
		
		return this;
	}

    public RegistrationPage enterConfirmPassword(String data) {
	
	     enterByXpath(prop.getProperty("FormCRegistrationPage.ConfirmPassword.XPath"), data);
	
	    return this;
	
   }
    
   public RegistrationPage selectSequrityQuestion(String data) {
    	
    	selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.SequrityQuestion.XPath"), data);
    	
    	return this;
    	
       }
    
 /*public RegistrationPage selectSequrityQuestion1(String data) {
    	
    	selectValuebyxpath("//select[@id='u_secques']", data);
    	
    	return this;
    	
       }*/
    
    public RegistrationPage enterSequrityAnswer(String data) {
    	
    	enterByXpath(prop.getProperty("FormCRegistrationPage.SequrityAnswer.XPath"), data);
    	
    	return this;
    	
       }
    
    public RegistrationPage enterName(String data) {
    	
    	enterByXpath(prop.getProperty("FormCRegistrationPage.Name.XPath"), data);
    	
    	return this;
    	
       }
    
    public RegistrationPage selectGender(String data) {
    	
    	selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.Gender.XPath"), data);
    	
    	return this;
    	
       }
    
    public RegistrationPage enterDateOfBirth(String data) {
    	
    	enterByXpath(prop.getProperty("FormCRegistrationPage.DateOfBirth.XPath"), data);
    	
    	return this;
    	
       }
    
    public RegistrationPage enterDesignation(String data) {
    	
    	enterByXpath(prop.getProperty("FormCRegistrationPage.Designation.XPath"), data);
    	
    	return this;
    	
       }
    
   public RegistrationPage enterEmail(String data) {
    	
    	enterByXpath(prop.getProperty("FormCRegistrationPage.Email.XPath"), data);
    	
    	return this;
    	
       }
   
   public RegistrationPage enterMobile(String data) {
   	
   	enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.XPath"), data);
   	
   	return this;
   	
      }
 
   
   public RegistrationPage enterPhoneNumber(String data) {
	   	
	   	enterByXpath(prop.getProperty("FormCRegistrationPage.PhoneNumber.XPath"), data);
	   	
	   	return this;
	   	
	      }
   
   public RegistrationPage selectCountry(String data) {
	   	
	   selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.Country.XPath"), data);
	   	
	   	return this;
	   	
	      }
	
	
   public RegistrationPage enterHotelName(String data) {
	   	
	   	enterByXpath(prop.getProperty("FormCRegistrationPage.HotelName.XPath"), data);
	   	
	   	return this;
	   	
	      }
   
   public RegistrationPage enterCapacity(String data) {
	   	
	   	enterByXpath(prop.getProperty("FormCRegistrationPage.Capacity.XPath"), data);
	   	
	   	return this;
	   	
	      }
   
   public RegistrationPage enterAddress(String data) {
	   	
	   	enterByXpath(prop.getProperty("FormCRegistrationPage.Address.XPath"), data);
	   	
	   	return this;
	   	
	      }
   
   public RegistrationPage selectState(String data) {
	   	
	  selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.State.XPath"), data);
	   	
	   	return this;
	   	
	      }
   
    public RegistrationPage selectCity(String data) {
	   	
		 selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.City.XPath"), data);
		   	
		 return this;
		   	
   }
   
    public RegistrationPage selectFrro(String data) {
	   	
		 selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.Frro.XPath"), data);
		   	
		 return this;
		   	
  }
    
    public RegistrationPage selectHotelAccomodationType(String data) {
	   	
		 selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.HotelAccomodationType.XPath"), data);
		   	
		 return this;
		   	
  }
    
    public RegistrationPage selectHotelAccomodationGrade(String data) {
	   	
		 selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.HotelAccomodationGrade.XPath"), data);
		   	
		 return this;
		   	
  }
	
	public RegistrationPage enterHotelEmailid(String data) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelEmailid.XPath"), data);
		
		return this;
	}
	
    public RegistrationPage enterHotelMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelMobileNumber.XPath"), data);
		
		return this;
	}

    public RegistrationPage enterHotelPhoneNumber(String data) {
	
	enterByXpath(prop.getProperty("FormCRegistrationPage.HotelPhoneNumber.XPath"), data);
	
	return this;
   
    }
	
	public RegistrationPage enterOwnerName1(String String) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName1.XPath"), String);
		
		return this;
	}
	
    public RegistrationPage enterOwnerAddress1(String data) {
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress1.XPath"), data);
		
		return this;
	}

    public RegistrationPage selectOwnerState1(String data) {
	
	selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.OwnerState1.XPath"), data);
	
	return this;
    
    }

     public RegistrationPage selectOwnerCity1(String data) {
	
    	 selectValuebyxpath(prop.getProperty("FormCRegistrationPage.OwnerCity1.XPath"), data);
    	 
	    return this;
      
     }

      public RegistrationPage enterOwnerEmailid1(String data) {
	
	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmailid1.XPath"), data);
	
	    return this;
	
   }
	
      public RegistrationPage enterOwnerPhoneNumber1(String data) {
    		
  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhoneNumber1.XPath"), data);
  	
  	    return this;
  	
     }
  	
      public RegistrationPage enterOwnerMobileNumber1(String data) {
    		
  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobileNumber1.XPath"), data);
  	
  	    return this;
  	
     }
  	
	 public RegistrationPage clickonAdd() {
		 
		 clickByXpath(prop.getProperty("FormCRegistrationPage.Add.XPath"));
		 
		 return this;
	 }
	
	 public RegistrationPage enterOwnerName2(String data) {
			
			enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName2.XPath"), data);
			
			return this;
		}
		
	    public RegistrationPage enterOwnerAddress2(String data) {
			
			enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress2.XPath"), data);
			
			return this;
		}

	    public RegistrationPage selectOwnerState2(String data) {
		
		selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.OwnerState2.XPath"), data);
		
		return this;
	}

	     public RegistrationPage selectOwnerCity2(String data) {
		
	    	selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.OwnerCity2.XPath"), data); 
		
		    return this;
	}

	      public RegistrationPage enterOwnerEmailid2(String data) {
		
		    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmailid2.XPath"), data);
		
		    return this;
		
	   }
		
	      public RegistrationPage enterOwnerPhoneNumber2(String data) {
	    		
	  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhoneNumber2.XPath"), data);
	  	
	  	    return this;
	  	
	     }
	  	
	      public RegistrationPage enterOwnerMobileNumber2(String data) {
	    		
	  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobileNumber2.XPath"), data);
	  	
	  	    return this;
	  	
	     }
	  	
		 public RegistrationPage clickonAdd2() {
			 
			 clickByXpath(prop.getProperty("FormCRegistrationPage.Add2.XPath"));
			 
			 return this;
		 }
		
		 public RegistrationPage enterOwnerName3(String data) {
				
				enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName3.XPath"), data);
				
				return this;
			}
			
		    public RegistrationPage enterOwnerAddress3(String data) {
				
				enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress3.XPath"), data);
				
				return this;
			}

		    public RegistrationPage selectOwnerState3(String data) {
			
			selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.OwnerState3.XPath"), data);
			
			return this;
		}

		     public RegistrationPage selectOwnerCity3(String data) {
			
		    	selectvisibletextbyxpath(prop.getProperty("FormCRegistrationPage.OwnerCity3.XPath"), data); 
			
			    return this;
		}

		      public RegistrationPage enterOwnerEmailid3(String data) {
			
			    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmailid3.XPath"), data);
			
			    return this;
			
		   }
			
		      public RegistrationPage enterOwnerPhoneNumber3(String data) {
		    		
		  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhoneNumber3.XPath"), data);
		  	
		  	    return this;
		  	
		     }
		  	
		      public RegistrationPage enterOwnerMobileNumber3(String data) {
		    		
		  	    enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobileNumber3.XPath"), data);
		  	
		  	    return this;
		  	
		     }
		  	
			 public RegistrationPage clickonAdd3() {
				 
				 clickByXpath(prop.getProperty("FormCRegistrationPage.Add3.XPath"));
				 
				 return this;
			 }
			
			 
	 
	 public RegistrationPage clickonSubmit() {
		 
		 clickByXpath(prop.getProperty("FormCRegistrationPage.Submit.XPath"));
		 
		 return this;
	 }
	
	
}
