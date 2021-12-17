package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers {

	@Test
	public void bookyourCoach() 
	{
	
	invokeApp("chrome", " https://www.irctc.co.in/nget/train-search");
		
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");	
		
	clickByLink("HOLIDAYS");	
		
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		
	switchToLastWindow();
		
	clickByXpath("//*[@id=\"sidebarCollapse\"]");	
		
	clickByLink("Book Your Coach/Train");	
	
	switchToLastWindow();
	
	clickByLink("New User? Signup");
		
	enterById("userId", "venky123");
	
	enterById("password", "Test@1234");
	
	enterById("cnfPassword", "Test@1234");
	
	selectbyvalue("secQstn", "2");
	
	enterById("secAnswer", "Pavan Kalyan");
	
	clickById("dateOfBirth");
	
	selectvisibletextbyxpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]", "1996");
	
	selectvisibletextbyxpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]", "Dec");
	
	clickByLink("14");
	
	clickById("gender0");
	
	clickById("maritalStatus1");
	
	enterById("email", "venkateshvadduri99@gmail.com");
	
	selectIndexById("occupation", 1);
	
	enterById("fname", "Venkatesh");
	
	enterById("mname", "V");	
	
	enterById("lname", "Vadduri");
	
	selectbyvalue("natinality", "94");
	
	enterById("flatNo", "4-110");
		
	enterById("street", "Immadisetty Vari Palem");
	
	enterById("area", "Bapatla");
	
	selectbyvalue("country", "94");
	
	enterById("mobile", "8008195106");
	
	enterById("pincode", "522101");
	
	pagedown();
	
    selectVisibileTextById("city", "Guntur"); 
    
    selectbyvalue("state", "ANDHRA PRADESH");
    
    selectbyvalue("postOffice", "Bapatla H.O");
    
	clickById("sameAddresses1");
	
	enterById("flatNoOffice", "41-110");
	
	enterById("streetOffice", "sholinganallur");
	
	enterById("areaOffice", "Chennai");
	
	selectbyvalue("countryOffice", "94");
	
	enterById("mobileOffice", "8008195112");
	
	enterById("pincodeOffice", "600003");
	
	pagedown();
	
	selectVisibileTextById("cityOffice", "Chennai");
	
	selectVisibileTextById("stateOffice", "TAMIL NADU");
	
	pagedown();
		
	selectVisibileTextById("postOfficeOffice", "Ripon Buildings S.O");
	
	closeAllBrowsers();
		
	}
}
