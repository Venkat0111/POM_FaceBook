package testng;

import org.testng.annotations.Test;

import utils.DP001;
import wrappers.GenericWrappers;

public class TC001 extends GenericWrappers{
 
	@Test(dataProvider = "fetchdata", dataProviderClass = DP001.class)
 public void facebookSignup(String firstName , String lastName ,String email,String confirmemail,String password,String day,String month,String year)
	{

 invokeApp("chrome","https://www.facebook.com/" );	
	
 clickByLink("Create New Account");	
	
 waitproperty(3000);
 
 enterByName("firstname", firstName);

 enterByName("lastname", lastName);
 
 enterByName("reg_email__", email);
 
 enterByName("reg_email_confirmation__", confirmemail);
 
 enterByName("reg_passwd__", password);
 
 selectVisibileTextById("day", day);

 selectVisibileTextById("month", month);
 
 selectVisibileTextById("year", year);
 
 clickByXpath("(//input[@name='sex'])[2]");
 
 clickByName("websubmit");
 
 closeAllBrowsers();
 
}
	
}
