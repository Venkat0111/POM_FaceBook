package testcases;



import org.junit.Test;

import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers 

{
    @Test
	public void saloonCheck() {
    	
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
	
	enterByName("name", "Venkatesh");
	
	enterByName("organization", "HCL Technologies");
    	
	enterByName("address", "4-110,Immadisetty vari palem,Bapatla");
    	
    enterByName("mobile", "80081951");
    
    enterByName("email", "venkateshvadduri99@gmail.com");
    
    selectVisibileTextByname("requestFor", "Saloon Charter");
    
    enterByName("originStation", "Bapatla");
    
    enterByName("destnStation", "Hyderabad");
    
    clickByName("checkInDate");
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[5]/td[6]/span");
    
    clickByName("checkOutDate");
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[6]/td[1]/span");
    
    enterByName("durationPeriod", "3");
    
    enterByName("coachDetails", "4");
    
    enterByName("numPassenger", "4");
    
    enterByName("charterPurpose", "Travelling");
    
    enterByName("services", "water bottles and blankets");
    
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");
    
    verifyTextByXpath("//*[@id=\\\"enquiry\\\"]/div/form/div/div[4]/span", "Mobile no. not valid");
    
    closeAllBrowsers();
    	
    	
		
	}
}
