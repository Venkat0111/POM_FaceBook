package testng;

import org.testng.annotations.Test;

import utils.DP006;
import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers {

	@Test(dataProvider="fetchdata",dataProviderClass=DP006.class)
	
	public void bookyourCoach(String userid,String password,String confirmpassword,String sequrityquestion,String answer,String year,String month,
			
		String email,String occupation,String firstname,String middlename,String lastname,String nationality,String flatno,String street,String area,String country,
		
		String mobile,String pincode,String city,String state,String postoffice,String officeflatno,String officestreet,String officearea,
		
		String officecountry,String officemobile,String officepincode,String officecity,String officestate,String officepostoffice) 
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
		
	enterById("userId", userid);
	
	enterById("password", password);
	
	enterById("cnfPassword", confirmpassword);
	
	selectbyvalue("secQstn",sequrityquestion);
	
	enterById("secAnswer", answer);
	
	clickById("dateOfBirth");
	
	selectvisibletextbyxpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]",year);
	
	selectvisibletextbyxpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]", month);
	
	clickByLink("14");
	
	clickById("gender0");
	
	clickById("maritalStatus1");
	
	enterById("email", email);
	
	selectIndexById("occupation",Integer.parseInt(occupation));
	
	enterById("fname", firstname);
	
	enterById("mname", middlename);	
	
	enterById("lname", lastname);
	
	selectbyvalue("natinality", nationality);
	
	enterById("flatNo", flatno);
		
	enterById("street", street);
	
	enterById("area", area);
	
	selectbyvalue("country", country);
	
	enterById("mobile", mobile);
	
	enterById("pincode", pincode);
	
	pagedown();
	
    selectVisibileTextById("city", city); 
    
    selectbyvalue("state", state);
    
    selectbyvalue("postOffice", postoffice);
    
	clickById("sameAddresses1");
	
	enterById("flatNoOffice", officeflatno);
	
	enterById("streetOffice",officestreet);
	
	enterById("areaOffice",officearea);
	
	selectbyvalue("countryOffice", officecountry);
	
	enterById("mobileOffice", officemobile);
	
	enterById("pincodeOffice", officepincode);
	
	pagedown();
	
	selectVisibileTextById("cityOffice", officecity);
	
	selectVisibileTextById("stateOffice", officestate);
	
	pagedown();
		
	selectVisibileTextById("postOfficeOffice", officepostoffice);
	
	closeAllBrowsers();
		
	}
}
