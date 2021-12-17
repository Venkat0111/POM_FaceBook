package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC001 extends GenericWrappers {
 
   @Test
 public void facebookSignup() {
 
 invokeApp("chrome","https://www.facebook.com/" );	
	
 clickByLink("Create New Account");	
	
 waitproperty(3000);
 
 enterByName("firstname", "Venkateh");

 enterByName("lastname", "Vadduri");
 
 enterByName("reg_email__", "venkateshvadduri99@gmail.com");
 
 enterByName("reg_email_confirmation__", "venkateshvadduri99@gmail.com");
 
 enterByName("reg_passwd__", "Test12345");
 
 selectVisibileTextById("day", "14");

 selectVisibileTextById("month", "Dec");
 
 selectVisibileTextById("year", "1996");
 
 clickByXpath("(//input[@name='sex'])[2]");
 
 clickByName("websubmit");
 
 closeAllBrowsers();
 
}
	
}
