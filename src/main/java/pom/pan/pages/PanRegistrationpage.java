package pom.pan.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanRegistrationpage extends GenericWrappers {
	
public PanRegistrationpage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver= driver;
		this.test=test;
		
	}
    
	public PanRegistrationpage selectTitle(String String) {
		
		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.Title.xpath"), String);
		
		return this;
		
	}
	
	
	public PanRegistrationpage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("PanRegistrationpage.FirstName.xpath"), data);
		
		return this;
	}
	
	
    public PanRegistrationpage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("PanRegistrationpage.MiddleName.xpath"), data);
		
		return this;
	}
	
    
    public PanRegistrationpage enterLastName(String data) {
		
 		enterByXpath(prop.getProperty("PanRegistrationpage.LastName.xpath"), data);
 		
 		return this;
 	}
	
    public PanRegistrationpage enterFatherFirstName(String data) {
		
		enterByXpath(prop.getProperty("PanRegistrationpage.FatherFirstName.xpath"), data);
		
		return this;
	}
	
	
    public PanRegistrationpage enterFatherMiddleName(String data) {
		
		enterByXpath(prop.getProperty("PanRegistrationpage.FatherMiddleName.xpath"), data);
		
		return this;
	}
	
    
    public PanRegistrationpage enterFatherLastName(String data) {
		
 		enterByXpath(prop.getProperty("PanRegistrationpage.FatherLastName.xpath"), data);
 		
 		return this;
 	}
    
	
    public PanRegistrationpage enterMobileNumber(String data) {
    	
    	enterByXpath(prop.getProperty("PanRegistrationpage.MobileNumber.xpath"), data);
    	
    	return this;
    }
	
	
    public PanRegistrationpage enterEmail(String data) {
    	
    	enterByXpath(prop.getProperty("PanRegistrationpage.Email.xpath"), data);
    	
    	return this;
    }
	
     public PanRegistrationpage selectIncome(String String) {
	   
	   selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.Income.xpath"), String);
	   
	   return this;
   }
   
	public PanRegistrationpage clickonAddressOfCommunication(String Office) {
		
		clickByXpath(prop.getProperty("PanRegistrationpage.AddressOfCommunication.xpath"), Office);
		
		return this;
	}
	
     public PanRegistrationpage enterDateOfBirth(String data) {
		
        enterByXpath(prop.getProperty("PanRegistrationpage.DateOfBirth.xpath"), data);
        
        pagedown();
		
		return this;
	
     }
     
	//Residential Address
   
 	
     public PanRegistrationpage enterResidentialAddress1(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.ResidentialAddress1.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage enterResidentialAddress2(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.ResidentialAddress2.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage enterResidentialAddressCity(String data) {
    		
    		enterByXpath(prop.getProperty("PanRegistrationpage.ResidentialAddressCity.xpath"), data);
    		
    		return this;
    	}
     
     public PanRegistrationpage selectResidentialAddressState(String String) {
   		
   		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.ResidentialAddressState.xpath"), String);
   		
   		return this;
   	}
     
     public PanRegistrationpage enterResidentialAddressPincode(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.ResidentialAddressPincode.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage selectResidentialAddressCountry(String String) {
    		
    		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.ResidentialAddressCountry.xpath"), String);
    		
    		return this;
    	}
      
  //Office Address
     
     public PanRegistrationpage enterOfficeName(String data) {
 		
 		enterByXpath(prop.getProperty("PanRegistrationpage.OfficeName.xpath"), data);
 		
 		return this;
 	}
     
     public PanRegistrationpage enterOfficeAddress1(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.OfficeAddress1.xpath"), data);
  		
  		return this;
  	}
  	
 	
     public PanRegistrationpage enterOfficeAddress2(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.OfficeAddress2.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage enterOfficeAddressCity(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.OfficeAddressCity.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage selectOfficeAddressState(String String) {
   		
   		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.OfficeAddressState.xpath"), String);
   		
   		return this;
   	}
     
     public PanRegistrationpage enterOfficeAddressPincode(String data) {
  		
  		enterByXpath(prop.getProperty("PanRegistrationpage.OfficeAddressPincode.xpath"), data);
  		
  		return this;
  	}
     
     public PanRegistrationpage selectOfficeAddressCountry(String String) {
    	 
    		
    		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.OfficeAddressCountry.xpath"), String);
    		
    		return this;
    	}
 	
     public PanRegistrationpage selectIdentityProof(String String) {
 		
 		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.IdentityProof.xpath"), String);
 		
 		return this;
 	}
     public PanRegistrationpage selectAddressProof(String String) {
 		
 		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.AddressProof.xpath"), String);
 		
 		return this;
 	}
     public PanRegistrationpage selectDOBProof(String String) {
 		
 		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.DOBProof.xpath"), String);
 		
 		return this;
 	}
     public PanRegistrationpage selectAadhaarProof(String String) {
 		
 		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.AadhaarProof.xpath"), String);
 		
 		return this;
 	}
     public PanRegistrationpage selectOfficeAddressProof(String String) {
 		
 		selectvisibletextbyxpath(prop.getProperty("PanRegistrationpage.OfficeAddressProof.xpath"), String);
 		
 		return this;
 	}
     
     public PanRegistrationpage pageDown(){
    	 
    	 pagedown();
    	 
    	 return this;
    	 
     }
     
    public PanRegistrationpage clickonCheckbox() {
    	
    	clickByXpath(prop.getProperty("PanRegistrationpage.Checkbox.xpath"));
    	
    	return this;
    }
	
}
