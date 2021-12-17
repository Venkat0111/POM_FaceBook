package testng;



import org.testng.annotations.Test;

import utils.DP002;
import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers{
	
     @Test(dataProvider = "fetchdata",dataProviderClass = DP002.class)
	public void PhpTravels(String firstName,String lastName,String email,String phoneNumber,String companyName,String streetaddress1,
			String streetaddress2,String city,String state,String postcode,String country,String mobile,String password,String confirmpassword) {
		
	invokeApp("chrome", "https://www.phptravels.org/register.php");
	
	enterById("inputFirstName", firstName);
	
	enterById("inputLastName", lastName);
	
	enterById("inputEmail", email);
	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]");
	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]/span[1]");
	
	enterById("inputPhone", phoneNumber);
	
	enterById("inputCompanyName", companyName);
	
	enterById("inputAddress1", streetaddress1);
	
	enterById("inputAddress2", streetaddress2);
	
    enterById("inputCity", city);
	
	enterById("stateinput", state);
	
	enterById("inputPostcode", postcode);
	
	selectVisibileTextById("inputCountry", country);
	
	enterById("customfield2",mobile);
	
	enterById("inputNewPassword1", password);
	
	enterById("inputNewPassword2", confirmpassword);
	
	clickByXpath("//*[@id=\"containerPassword\"]/div[4]/div/button");
	
	closeAllBrowsers();
	
}
	
}
