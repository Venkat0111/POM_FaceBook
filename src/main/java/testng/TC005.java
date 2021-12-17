package testng;

import org.testng.annotations.Test;

import utils.DP005;
import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers
{
     @Test(dataProvider ="fetchdata",dataProviderClass=DP005.class)
	public void IrctcSignup(String username,String password,String confirmpassword,String answer,String firstname,String middlename,String lastname,
			
			String dob,String country,String email,String mobile,String nationality,String address1,String address2,String address3,String pincode,
			
			String state,String city,String postoffice,String phone,String officeaddress1,String officeaddress2,String officeaddress3,
			
			String officepincode,String officestate,String officecity,String officepostoffice,String officephone) 
     {
    	 
    invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");	 
    
    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
    
    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
    
    enterById("userName", username);
    
    enterById("usrPwd", password);
    
    enterById("cnfUsrPwd", confirmpassword);
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
    
   enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", answer);
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   enterById("firstName", firstname);
   
   enterById("middleName", middlename);
   
   enterById("lastname", lastname);
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span");
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span");
   
   enterByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input",dob);
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[7]/a");
   
   clickByXpath("//*[@id=\"unmarried\"]/label");
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select", country);
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span");
   
   enterById("email", email);
   
   enterById("mobile", mobile);
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select",nationality);
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   enterById("resAddress1", address1);
   
   enterById("resAddress2", address2);
   
   enterById("resAddress3",address3);
   
   enterByName("resPinCode", pincode);
   
   enterById("resState", state);
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select", city);
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", postoffice);
   
   enterById("resPhone", phone);
   
   clickByXpath("//*[@id=\"no\"]/div/div[2]/span");
   
   //office address
   
   enterById("offAddress1", officeaddress1);
   
   enterById("offAddress2", officeaddress2);
   
   enterById("offAddress3", officeaddress3);
   
   clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[2]/span");
   
   clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span");
   
   enterById("offPinCode", officepincode);
   
   enterById("offState",officestate);
   
   enterById("offCity",officecity);
   
   enterById("offPostOff", officepostoffice);
  
   enterById("offPhone", officephone);
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   closeBrowser();
   
   	
	}
	
	
}
