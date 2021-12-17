package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers
{
     @Test
	public void IrctcSignup() {
    	 
    invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");	 
    
    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
    
    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
    
    enterById("userName", "venky123");
    
    enterById("usrPwd", "Test@123");
    
    enterById("cnfUsrPwd", "Test@123");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span");
    
    clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span");
    
   enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", "Pavan Kalyan");
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   enterById("firstName", "Venkatesh");
   
   enterById("middleName", "V");
   
   enterById("lastname", "Vadduri");
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span");
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span");
   
   enterByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input", "14-12-1996");
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[7]/a");
   
   clickByXpath("//*[@id=\"unmarried\"]/label");
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select", "India");
   
   clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span");
   
   enterById("email", "venkateshvadduri99@gmail.com");
   
   enterById("mobile", "8008195106");
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select", "India");
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   enterById("resAddress1", "4-110");
   
   enterById("resAddress2", "Immadisetty Vari Palem");
   
   enterById("resAddress3", "Bapatla");
   
   enterByName("resPinCode", "522101");
   
   enterById("resState", "Andhra Pradesh");
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select", "Guntur");
   
   selectvisibletextbyxpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", "Bapatla H.O");
   
   enterById("resPhone", "8008195106");
   
   clickByXpath("//*[@id=\"no\"]/div/div[2]/span");
   
   //office address
   
   enterById("offAddress1", "23-10");
   
   enterById("offAddress2", "Sholinganallur");
   
   enterById("offAddress3", "Chennai");
   
   clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[2]/span");
   
   clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span");
   
   enterById("offPinCode", "600003");
   
   enterById("offState", "Tamil Nadu");
   
   enterById("offCity", "Chennai");
   
   enterById("offPostOff", "Ripon Buildings S.O");
  
   enterById("offPhone", "8008195112");
   
   clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
   
   closeBrowser();
   
   	
	}
	
	
}
