package testng;

import org.testng.annotations.Test;

import utils.DP007;
import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers 

{
    @Test(dataProvider="fetchdata",dataProviderClass=DP007.class)
    
	public void saloonCheck(String name,String organization,String address,String mobile,String email,String requestfor,String originstation,
			
			String destinationstation,String durationperiod,String coachdetails,String numberofpassengers,String purpose,String services,String verification )
    
    {
    	
    invokeApp("chrome", " https://www.irctc.co.in/nget/train-search"); 	
    	
    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");	
	
	clickByLink("HOLIDAYS");	
		
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		
	switchToLastWindow();	
    	
	clickByXpath("//*[@id=\"sidebarCollapse\"]");	
	
	clickByLink("Charter");
	
	clickByXpath("//*[@id=\"dismiss\"]/i");
	
	clickByLink("Enquiry Form");
	
	enterByName("name", name);
	
	enterByName("organization", organization);
    	
	enterByName("address",address);
    	
    enterByName("mobile", mobile);
    
    enterByName("email", email);
    
    selectVisibileTextByname("requestFor", requestfor);
    
    enterByName("originStation", originstation);
    
    enterByName("destnStation", destinationstation);
    
    clickByName("checkInDate");
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[3]/span");
    
    clickByName("checkOutDate");
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[4]/td[6]/span");
    
    enterByName("durationPeriod", durationperiod);
    
    enterByName("coachDetails", coachdetails);
    
    enterByName("numPassenger", numberofpassengers);
    
    enterByName("charterPurpose", purpose);
    
    enterByName("services", services);
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");
    
    verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", verification);
    
    closeAllBrowsers();
    	
    	
		
	}
}
