package testng;

import org.testng.annotations.Test;

import utils.DP003;
import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers{
	
    @Test(dataProvider = "fetchdata",dataProviderClass = DP003.class)
	public void panIndia(String title,String firstName ,String middleName ,String lastName,String firstname,String middlename,String lastname,
			String mobilenumber ,String email,String sourceofincome,String dob,String firstline,String secondline,String city,
			String state,String pincode,String country,String officename,String officefirstline,String officesecondline,String officecity,
			String officestate,String officepincode,String officecountry,String identityproof,String addressproof,String DOBproof,
			String Aadhaarproof,String officeaddressproof){
    	
    invokeApp("chrome", "https://panind.com/india/new_pan/");
    
    selectVisibileTextById("pan_title", title);
    
    enterById("pan_firstname", firstName);
    
    enterById("pan_middlename", middleName);
    
    enterById("pan_lastname", lastName);
    
    enterById("pan_fatherfirstname",firstname );
    
    enterById("pan_fathermiddlename", middlename);
    
    enterById("pan_fatherlastname",lastname);
    
    enterByName("pan_mobilenumber",mobilenumber);
    
    enterByName("pan_email", email);
    
    selectVisibileTextById("pan_sourceofincome", sourceofincome);
    
    clickById("office");
    
    waitproperty(5000);
    
    enterById("pan_dob", dob);
    
    pagedown();
    
    //Residential address
    
     enterByName("pan_addressline1",firstline );
    
    enterByName("pan_addressline2", secondline);
    
    enterByName("pan_cityname", city);
    
    selectVisibileTextById("pan_state",state);
    
    enterByName("pan_pincode", pincode);
    
    waitproperty(5000);
    
    selectVisibileTextById("pan_country",country);
    
    //office address
    waitproperty(5000);
    
    enterByName("pan_officename",officename );
    
    pagedown();
   
    enterByName("pan_officeaddressline1",officefirstline );
    
    enterByName("pan_officeaddressline2", officesecondline);
    
    enterByName("pan_officecityname",officecity);
    
    selectVisibileTextById("pan_officestate",officestate);
    
    enterByName("pan_officepincode", officepincode);
    
    waitproperty(5000);
   
    selectVisibileTextById("pan_officecountry",officecountry);

    selectVisibileTextById("pan_identityproof",identityproof);
    
    pagedown();
    
    selectVisibileTextById("pan_addressproof",addressproof);
    
    selectVisibileTextById("pan_DOBproof",DOBproof);
    
    selectVisibileTextById("pan_aadhaarproof",Aadhaarproof);
    
    selectVisibileTextById("pan_officeaddressproof",officeaddressproof);
    
    pagedown();
    
    clickById("pan_source");
    
    closeBrowser();
		
	}
}
