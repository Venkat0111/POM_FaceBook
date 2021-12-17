package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers
{
    @Test
	public void panIndia(){
    	
    invokeApp("chrome", "https://panind.com/india/new_pan/");
    
    selectVisibileTextById("pan_title", "MR.");
    
    enterById("pan_firstname", "Venkatesh");
    
    enterById("pan_middlename", "V");
    
    enterById("pan_lastname", "Vadduri");
    
    enterById("pan_fatherfirstname", "Vadduri");
    
    enterById("pan_fathermiddlename", "Yedukondalu");
    
    enterById("pan_fatherlastname", "Rao");
    
    enterByName("pan_mobilenumber", "8008195106");
    
    enterByName("pan_email", "venkateshvadduri99@gmail.com");
    
    selectVisibileTextById("pan_sourceofincome", "Salary");
    
    clickById("office");
    
    enterByName("pan_dob", "14121996");
    
    pagedown();
    
    //Residential address
    
     enterByName("pan_addressline1", "4-110");
    
    enterByName("pan_addressline2", "Immadisetty Vari Palem");
    
    enterByName("pan_cityname", "Bapatla");
    
    selectVisibileTextById("pan_state", "Andhra Pradesh");
    
    enterByName("pan_pincode", "522101");
    
    selectVisibileTextById("pan_country", "INDIA");
    
    //office address
    
    enterByName("pan_officename", "HCL Technologies");
   
    enterByName("pan_officeaddressline1", "5-110");
    
    enterByName("pan_officeaddressline2", "HighTech City");
    
    enterByName("pan_officecityname", "Hyderabad");
    
    selectVisibileTextById("pan_officestate", "Telangana");
    
    enterByName("pan_officepincode", "522108");
    
    selectVisibileTextById("pan_officecountry", "INDIA");

    selectVisibileTextById("pan_identityproof", "Aadhar Card issued by UIDAI(In Copy)");
    
    selectVisibileTextById("pan_addressproof", "PASSPORT (In Copy)");
    
    selectVisibileTextById("pan_DOBproof", "Matriculation certificate or mark sheet of recognised board (In Copy)");
    
    selectVisibileTextById("pan_aadhaarproof", "Copy of Aadhaar Card / Letter");
    
    selectVisibileTextById("pan_officeaddressproof", "Employer Certificate carrying Office Address");
    
    pagedown();
    
    clickById("pan_source");
    
    closeBrowser();
		
	}
}
