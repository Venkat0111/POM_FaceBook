package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers
{
     @Test
	public void PhpTravels() {
		
	invokeApp("chrome", "https://www.phptravels.org/register.php");
	
	enterById("inputFirstName", "Venkatesh");
	
	enterById("inputLastName", "Vadduri");
	
	enterById("inputEmail", "venkateshvadduri99@gmail.com");
	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]");
	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]/span[1]");
	
	enterById("inputPhone", "8008195106");
	
	enterById("inputCompanyName", "HCL Technologies");
	
	enterById("inputAddress1", "Sholinganallor");
	
	enterById("inputAddress2", "2nd lane");
	
    enterById("inputCity", "Chennai");
	
	enterById("stateinput", "Tamil Nadu");
	
	enterById("inputPostcode", "600003");
	
	selectVisibileTextById("inputCountry", "India");
	
	enterById("customfield2", "8008195106");
	
	enterById("inputNewPassword1", "Test1234");
	
	enterById("inputNewPassword2", "Test1234");
	
	clickByXpath("//*[@id=\"containerPassword\"]/div[4]/div/button");
	
	closeAllBrowsers();
	
}
	
}
