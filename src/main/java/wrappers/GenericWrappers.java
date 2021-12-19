package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
		    prop = new Properties();
			
			prop.load(new FileInputStream("./src/test/java/object.properties"));
			
			//System.out.println(prop.getProperty("IrctcHomePage.Stays.XPath"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObjects() {
		
		prop = null;
	}

	public void invokeApp(String browser, String url) {
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 
			} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
			 
			} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");	
			 driver = new InternetExplorerDriver();
				
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");
			
			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully", "Pass");
			
		} catch (SessionNotCreatedException e) {
			
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "Fail");
			
		}catch (InvalidArgumentException e) {
			
			//System.err.println("The browser "+browser+" is not launched as url doesn't contain http/https");
			reportStep("The browser "+browser+" is not launched as url doesn't contain http/https", "Fail");
			
		}catch (WebDriverException e) {
			
	        //System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "Fail");
			
		}
	}

	public void enterById(String idValue, String data) {
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The elememt with id "+idValue+" is entered with data"+data);
			reportStep("The elememt with id "+idValue+" is entered with data"+data, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with id "+idValue +" is not found in the DOM");
			reportStep("The element with id "+idValue +" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with id "+idValue +" is not visible in the application");
			reportStep("The element with id "+idValue +" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with id "+idValue +" is not interactable in the application");
			reportStep("The element with id "+idValue +" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue +" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
		
			//System.err.println("The element with id "+idValue+" is not entered the data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered the data "+data+" due to unknown error", "Fail");
		}
		
	}

	
	public void enterByName(String nameValue, String data) {
    
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with name "+nameValue+" is entered with the data "+data);
		      reportStep("The element with name "+nameValue+" is entered with the data "+data, "Pass");
		      
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
		
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with name "+nameValue+" is not entered the data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered the data "+data+" due to unknown error", "Fail");
		}
	}
	

	public void enterByXpath(String xpathValue, String data) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "Pass");
		
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not found in the application");
			reportStep("The element with xpath "+xpathValue+" is not found in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "Fail");
			
	    }catch (WebDriverException e) {
			
	    	//System.err.println("The element with xpath "+xpathValue+" is is not entered the data "+data+" due to unknown error");
	    	reportStep("The element with xpath "+xpathValue+" is is not entered the data "+data+" due to unknown error", "Fail");
		}
	}
	
	
	public void verifyTitle(String title) {
		
	try {
		
		String actualtittle	= driver.getTitle();
		if(actualtittle.equals(title)) {
			
			//System.out.println("The title of the page "+actualtittle+" is matched with the expected title "+title);
			reportStep("The title of the page "+actualtittle+" is matched with the expected title "+title, "Pass");
			
		}else {
			
			//System.err.println("The title of the page "+actualtittle+" is not matched with the expected title "+title);
			reportStep("The title of the page "+actualtittle+" is not matched with the expected title "+title, "Fail");
		}
	} catch (WebDriverException e) {
		
		//System.err.println("The title of the page is not verified due to unknown error");
		reportStep("The title of the page is not verified due to unknown error", "Fail");
		
	}
	
	}
	

	public void verifyTextById(String id, String text) {
		
		try {
			
			String actualtext = driver.findElementById(id).getText();
			if(actualtext.equals(text)) {
			//System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with the expected text "+text);
			reportStep("The element with id "+id+" is holding the text "+actualtext+" is matched with the expected text "+text, "Pass");
			
			}else {
			//System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text "+text);
			reportStep("The element with id "+id+" is holding the text "+actualtext+" is not matched with the expected text "+text, "Fail");
			
			}
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with id "+id+" is not verified due to unknown error");
			reportStep("The element with id "+id+" is not verified due to unknown error", "Fail");
			
		}
	}

	
	public void verifyTextByXpath(String xpath, String text) {
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.equals(text)) {
			
			//System.out.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text, "Pass");
				
			}else {
			//System.err.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is not  matched with the text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with the text "+text, "Fail");
				
			}
		} catch (NoSuchElementException e) {
		
		    //System.err.println("The element with xpath "+xpath+" is not found in the DOM");
		    reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		    
		}catch (ElementNotVisibleException e) {
			
		    //System.err.println("The element with xpath"+xpath+" is not visible in the application");
			reportStep("The element with xpath"+xpath+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {

			//System.err.println("The element with xpath"+xpath+" is not interactable in the application");
			reportStep("The element with xpath"+xpath+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with xpath"+xpath+" is not stable in the application");
			reportStep("The element with xpath"+xpath+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with xpath"+xpath+" is not verified due to unknown error");
			reportStep("The element with xpath"+xpath+" is not verified due to unknown error", "Fail");
		}
		
		}
	

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.contains(text)) {
				
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text, "Pass");
				
			}else {
				
				//System.err.println("The element with xpath "+xpath+"is holding the text"+actualtext+"is not  matched with the text"+text);
				reportStep("The element with xpath "+xpath+"is holding the text"+actualtext+"is not  matched with the text"+text, "Fail");
				
			}
		} catch (NoSuchElementException e) {
			
			// System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			 reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
			 
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
		   
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {

			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+" is not verified due to unknown error", "Fail");
			
		}
		
	}

	
	public void clickById(String id) {
	
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
		
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
	
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
			
		}catch (ElementClickInterceptedException e) {
			
			//System.err.println("The element with id "+id+" is not intercepted in the application");
			reportStep("The element with id "+id+" is not intercepted in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with id "+id+" is not clicked due to unknown reasons");
			reportStep("The element with id "+id+" is not clicked due to unknown reasons", "Fail");
		}
		
		
	}

	public void clickByClassName(String classVal) {
		
	try {
		driver.findElementByClassName(classVal).click();
		
		//System.out.println("The element with classname classVal "+classVal+" is clicked successfully");
		reportStep("The element with classname classVal "+classVal+" is clicked successfully", "Pass");
		
	} catch (NoSuchElementException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not found in the DOM");
		reportStep("The element with classname classVal "+classVal+" is not found in the DOM", "Fail");
		
	}catch (ElementNotVisibleException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not visible in the application");
		reportStep("The element with classname classVal "+classVal+" is not visible in the application", "Fail");
		
	}catch (ElementClickInterceptedException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not intercepted in the application");	
		reportStep("The element with classname classVal "+classVal+" is not intercepted in the application", "Fail");
		
	}catch (ElementNotInteractableException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not interactable in the application");
		reportStep("The element with classname classVal "+classVal+" is not interactable in the application", "Fail");
		
	}catch (StaleElementReferenceException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not stable in the application");
		reportStep("The element with classname classVal "+classVal+" is not stable in the application", "Fail");
		
	}catch (WebDriverException e) {
		
		//System.err.println("The element with classname classVal "+classVal+" is not clicked due to unknown error");
		reportStep("The element with classname classVal "+classVal+" is not clicked due to unknown error", "Fail");
			
	}
	
	}
	

	public void clickByName(String name) {
		
	try {
		driver.findElementByName(name).click();
		//System.out.println("The element with  name "+name+" is clicked successfully");
		reportStep("The element with  name "+name+" is clicked successfully", "Pass");
		
	} catch (NoSuchElementException e) {
		
		//System.err.println("The element with name "+name+" is not found in the DOM");
		reportStep("The element with name "+name+" is not found in the DOM", "Fail");
		
	}catch (ElementNotVisibleException e) {
		
		//System.err.println("The element with name "+name+" is not visible in the application");
		reportStep("The element with name "+name+" is not visible in the application", "Fail");
		
	}catch (ElementClickInterceptedException e) {
		
		//System.err.println("The element with name "+name+" is not intercepted in the application");
		reportStep("The element with name "+name+" is not intercepted in the application", "Fail");
		
	}catch (ElementNotInteractableException e) {

		//System.err.println("The element with name "+name+" is not interactable in the application");
		reportStep("The element with name "+name+" is not interactable in the application", "Fail");
		
	}catch (StaleElementReferenceException e) {
		
		//System.err.println("The element with name "+name+" is not stable in the application");
		reportStep("The element with name "+name+" is not stable in the application", "Fail");
		
	}catch (WebDriverException e) {
		
		//System.err.println("The element with name "+name+" is not successfully clicked due to unknown error");
		reportStep("The element with name "+name+" is not successfully clicked due to unknown error", "Fail");
		
	}
	
	}

	public void clickByLink(String name) {
	     try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
			
		}catch (ElementClickInterceptedException e) {
			
			//System.err.println("The element with linktext "+name+" is not intercepted in the application");
			reportStep("The element with linktext "+name+" is not intercepted in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with linktext "+name+" is not successfully clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not successfully clicked due to unknown error", "Fail");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "Pass");
					
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
			
		}catch (ElementClickInterceptedException e) {
			
			//System.err.println("The element with linktext "+name+" is not intercepted in the application");
			reportStep("The element with linktext "+name+" is not intercepted in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with linktext "+name+" is not successfully clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not successfully clicked due to unknown error", "Fail");
		}
		
		
	}

	public void clickByXpath(String...xpathVal) {
		
		String xpath=null;
		
	    try {
	    	
	    	if(xpathVal[0].contains("$option$")) {
	    		
	    		xpath =xpathVal[0].replace("$option$", xpathVal[1]);
	    				
	    		}else {
	    			xpath=xpathVal[0];
	    		}
		    driver.findElementByXPath(xpath).click();
		    
		   // System.out.println("The element with name xpathVal "+xpathVal+" is clicked successfully");
		    reportStep("The element with xpathVal "+xpathVal+" is clicked successfully", "Pass");
		    
	   } catch (NoSuchElementException e) {
	
		   // System.err.println("The element with name xpathVal "+xpathVal+" is not found in the DOM");
		    reportStep("The element with xpathVal "+xpathVal+" is clicked successfully", "Fail");
		    
	   }catch (ElementNotVisibleException e) {
		    
		    //System.err.println("The element with name xpathVal "+xpathVal+" is not visible in the application");
		    reportStep("The element with xpathVal "+xpathVal+" is not visible in the application", "Fail");
		    
	   }catch (ElementClickInterceptedException e) {
		   
		    //System.err.println("The element with name xpathVal "+xpathVal+" is not intercepted in the application");	
		    reportStep("The element with xpathVal "+xpathVal+" is not intercepted in the application", "Fail");
		    
	   }catch (ElementNotInteractableException e) {
		  
		    //System.err.println("The element with name xpathVal "+xpathVal+" is not interactable in the application");
		    reportStep("The element with xpathVal "+xpathVal+" is not interactable in the application", "Fail");
		    
	   }catch (StaleElementReferenceException e) {
		   
		   // System.err.println("The element with name xpathVal "+xpathVal+" is not stable in the application");
		    reportStep("The element with xpathVal "+xpathVal+" is not stable in the application", "Fail");
		    
	  }catch (WebDriverException e) {
		
		    //System.err.println("The element with name xpathVal "+xpathVal+" is not successfully clicked due to unknown error");
		    reportStep("The element with xpathVal "+xpathVal+" is not successfully clicked due to unknown error", "Fail");
	}
	
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with name xpathVal "+xpathVal+" is clicked successfully");
			reportStep("The element with name xpathVal "+xpathVal+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not found in the DOM");
			reportStep("The element with name xpathVal "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not visible in the application");
			reportStep("The element with name xpathVal "+xpathVal+" is not visible in the application", "Fail");
			
		}catch (ElementClickInterceptedException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not intercepted in the application");
			reportStep("The element with name xpathVal "+xpathVal+" is not intercepted in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not interactable in the application");
			reportStep("The element with name xpathVal "+xpathVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not stable in the application");
			reportStep("The element with name xpathVal "+xpathVal+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The element with name xpathVal "+xpathVal+" is not successfully clicked due to unknown error");
			reportStep("The element with name xpathVal "+xpathVal+" is not successfully clicked due to unknown error", "Fail");
			
		} 	
		
	}

	public String getTextById(String idVal) {
		
		 String Text = null;
		try {
			
			 Text = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holding in the text"+Text);
			reportStep("The element with id "+idVal+" is holding in the text"+Text, "Pass");
			
		   } catch (NoSuchElementException e) {
		
			// System.err.println("The element with id "+idVal+" is not found in the DOM");
			 reportStep("The element with id "+idVal+" is not found in the DOM", "Fail");
			 
		   }catch (ElementNotVisibleException e) {
			    
			   // System.err.println("The element with id "+idVal+" is not visible in the application");	
			    reportStep("The element with id "+idVal+" is not visible in the application", "Fail");
			    
		   }catch (ElementNotInteractableException e) {
			   
			    //System.err.println("The element with id "+idVal+" is not interactable in the application");
			    reportStep("The element with id "+idVal+" is not interactable in the application", "Fail");
			    
		   }catch (StaleElementReferenceException e) {
			   
			   // System.err.println("The element with id "+idVal+" is not stable in the application");
			    reportStep("The element with id "+idVal+" is not stable in the application", "Fail");
			    
		  }catch (WebDriverException e) {
			    
			   // System.err.println("The element with id "+idVal+" is not found due to unknown error");
			    reportStep("The element with id "+idVal+" is not found due to unknown error", "Fail");
		}
		return Text;
	}

	public String getTextByXpath(String xpathVal) {
		
		String Text = null;
		
		try {
			Text = driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The element with xpath "+xpathVal+" is holding with the text"+Text);
			reportStep("The element with xpath "+xpathVal+" is holding with the text"+Text, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		   }catch (ElementNotVisibleException e) {
			  
			   // System.err.println("The element with xpath "+xpathVal+" is not visible in the application");	
			    reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
			    
		   }catch (ElementNotInteractableException e) {
			   
			   // System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			    reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			    
		   }catch (StaleElementReferenceException e) {
			   
			    //System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			    reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
			    
		  }catch (WebDriverException e) {
			   
			    //System.err.println("The element with xpat h"+xpathVal+" is not found due to unknown error");
			    reportStep("The element with xpat h"+xpathVal+" is not found due to unknown error", "Fail");
		}
		return Text;
	}
	

	public void selectVisibileTextById(String id, String value) {
		
	try {
		WebElement visibletext = driver.findElementById(id);
		Select text = new Select(visibletext);
		text.selectByVisibleText(value);
		
		//System.out.println("The element with id "+ id+" is selected with a value"+value);
		reportStep("The element with id "+ id+" is selected with a value"+value, "Pass");
		
	} catch (NoSuchElementException e) {
		
		//System.err.println("The element with id "+id+" is not found in the DOM");
		reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		
	}catch (ElementNotVisibleException e) {
	
		 //System.err.println("The element with id "+id+" is not visible in the application");
		 reportStep("The element with id "+id+" is not visible in the application", "Fail");
		 
	}catch (ElementClickInterceptedException e) {
		
		// System.err.println("The element with id "+id+" is not intercepted in the application");
		 reportStep("The element with id "+id+" is not intercepted in the application", "Fail");
		 
	}catch (ElementNotSelectableException e) {
		
		 //System.err.println("The element with id "+id+" is not selectable in the application");	
		 reportStep("The element with id "+id+" is not selectable in the application", "Fail");
		 
	}catch (StaleElementReferenceException e) {
		
		// System.err.println("The element with id "+id+" is not stable in the application");		
		 reportStep("The element with id "+id+" is not stable in the application", "Fail");
	
	}catch (WebDriverException e) {
		
		 //System.err.println("The element with id "+id+" is not selected due to unknown error");	
		 reportStep("The element with id "+id+" is not selected due to unknown error", "Fail");
	}
	}


	public void selectIndexById(String id, int value) {
		
	try {
		WebElement index = driver.findElementById(id);
		Select text = new Select(index);
		text.selectByIndex(value);
		
		//System.out.println("The element with id "+id+" is selected with value"+value);
		reportStep("The element with id "+id+" is selected with value"+value, "Pass");
		
	} catch (NoSuchElementException e) {
		
		//System.err.println("The element with id "+id+" is not found in the DOM");
		reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		
	}catch (ElementNotVisibleException e) {
	
		 //System.err.println("The element with id "+id+" is not visible in the application");	
		 reportStep("The element with id "+id+" is not visible in the application", "Fail");
		 
	}catch (ElementClickInterceptedException e) {
		
		 //System.err.println("The element with id "+id+" is not intercepted in the application");	
		 reportStep("The element with id "+id+" is not intercepted in the application", "Fail");
		 
	}catch (ElementNotSelectableException e) {
		
		 //System.err.println("The element with id "+id+" is not selectable in the application");		
		 reportStep("The element with id "+id+" is not selectable in the application", "Fail");
		 
	}catch (StaleElementReferenceException e) {
	
		//System.err.println("The element with id "+id+" is not stable in the application");		
		 reportStep("The element with id "+id+" is not stable in the application", "Fail");
	
	}catch (WebDriverException e) {
		
		 //System.err.println("The element with id "+id+" is not selected due to unknown error");		
		 reportStep("The element with id "+id+" is not selected due to unknown error", "Fail");
	}
	
	}

	public void switchToParentWindow() {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			for(String  parentwinidow : allwindows) {
			driver.switchTo().window(parentwinidow);
			break;
			}
			
			//System.out.println("The method is switched to parent window");
			reportStep("The method is switched to parent window", "Pass");
			
		} catch (NoSuchWindowException e) {
			
			//System.err.println("There is no such window in the apllication");
			reportStep("There is no such window in the apllication", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The parent window is closed due to unknown error");
			reportStep("The parent window is closed due to unknown error", "Fail");
		}
	}

	public void switchToLastWindow() {
	try {
		Set<String> allwindows = driver.getWindowHandles();
		for( String lastwindow : allwindows )	{
		driver.switchTo().window(lastwindow);	
			}
		//System.out.println("The method is switched to last window");
		reportStep("The method is switched to last window", "Pass");
		
	} catch (NoSuchWindowException e) {
	
		//System.err.println("There is no such window in the apllication");
		reportStep("There is no such window in the apllication", "Fail");
		
	}catch (WebDriverException e) {
		
		//System.err.println("The last window is closed due to unknown error");
		reportStep("The last window is closed due to unknown error", "Fail");
	}
	
	}

	public void acceptAlert() {
	try {
		driver.switchTo().alert().accept();
		
		//System.out.println("The alert is accepted in the application");
		reportStep("The alert is accepted in the application", "Pass");
		
	} catch (NoAlertPresentException e) {
		
		//System.err.println("There is no such alert in the apllication");
		reportStep("There is no such alert in the apllication", "Fail");
		
	}catch (WebDriverException e) {
		
		//System.err.println("The alert is closed due to unknown error");
		reportStep("The alert is closed due to unknown error", "Fail");
	}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("The alert is dismissed in the application");
			reportStep("The alert is dismissed in the application", "Pass");
			
		} catch (NoAlertPresentException e) {
	
			//System.err.println("There is no such alert in the apllication");
			reportStep("There is no such alert in the apllication", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The alert is closed due to unknown error");
			reportStep("The alert is closed due to unknown error", "Fail");
		}
	}

	public String getAlertText() {
		
		String alerttext = null;
		
		try {
			 alerttext  = driver.switchTo().alert().getText();
			 
			//System.out.println("The alerttext is Holding in the application is matched with"+alerttext);
			reportStep("The alerttext is Holding in the application is matched with"+alerttext, "Pass");
			
		} catch (NoAlertPresentException e) {
			
			//System.err.println("There is no such alert in the apllication");
			reportStep("There is no such alert in the apllication", "Fail");
			
		}catch (UnhandledAlertException e) {
			
			//System.err.println("There is no such alert handled in the apllication");
			reportStep("There is no such alert handled in the apllication", "Fail");
			
		}catch (WebDriverException e) {
			
			//System.err.println("The alerttext is not matched due to unknown error");
			reportStep("The alerttext is not matched due to unknown error", "Fail");
		}
		
		return alerttext;
	}
	
	public  long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);	
			
			
			File temp = driver.getScreenshotAs(OutputType.FILE);		
			File dest = new File("./reports/screenshots/ "+number+".jpg");
			FileUtils.copyFile(temp, dest);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("I/O exception occurs due to unknown error");
			reportStep("I/O exception occurs due to unknown error", "fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The snap not taking due to unknown error");	
			reportStep("The snap not taking due to unknown error", "fail", false);
		}
		return number;
	}

	public void closeBrowser() {
	
		try {
			driver.close();
			
			//System.out.println("The method will close the active browser");
			reportStep("The method will close the active browser", "Pass",false);
			
		} catch (UnreachableBrowserException e) {
			
			//System.err.println("The browser is unable to open or it is crashed");
			reportStep("The browser is unable to open or it is crashed", "Fail");
			
		} catch (WebDriverException e) {
			
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("The browser is closed due to unknown errors", "Fail");
		}
	}

	public void closeAllBrowsers() {
		
		try {
			driver.quit();
		
			//System.out.println("The method will close all the browsers");
			reportStep("The method will close all the browsers", "Pass",false);
			
		} catch (UnreachableBrowserException e) {
			
			//System.err.println("The browser is unable to open or it is crashed");
			reportStep("The browser is unable to open or it is crashed", "Fail");
			
		} catch (WebDriverException e) {
			
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("The browser is closed due to unknown errors", "Fail");
		}
	}

	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	public void pagedown() {
		
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
			
		} catch (WebDriverException e) {
			
			//System.err.println("The browser is closed due to unknown errors");
			reportStep("The browser is closed due to unknown errors", "Fail");
		}
	}

	public void selectbyvalue(String id, String value) {
		
		try {
			
			WebElement text = driver.findElementById(id);
			Select sc = new Select(text);
			sc.selectByValue(value);
			
			//System.out.println("The element with id "+id+" is selected with the value"+value);
			reportStep("The element with id "+id+" is selected with the value"+value, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			// System.err.println("The element with id "+id+" is not visible in the application");
			 reportStep("The element with id "+id+" is not visible in the application", "Fail");
			 
		}catch (ElementClickInterceptedException e) {
			
			 //System.err.println("The element with id "+id+" is not intercepted in the application");
			 reportStep("The element with id "+id+" is not intercepted in the application", "Fail");
			 
		}catch (ElementNotSelectableException e) {
			
			//System.err.println("The element with id "+id+" is not selectable in the application");		
			 reportStep("The element with id "+id+" is not selectable in the application", "Fail");
			 
		}catch (StaleElementReferenceException e) {
			
			// System.err.println("The element with id "+id+" is not stable in the application");		
			 reportStep("The element with id "+id+" is not stable in the application", "Fail");
		
		}catch (WebDriverException e) {
			
			 //System.err.println("The element with id "+id+" is not selected due to unknown error");		
			 reportStep("The element with id "+id+" is not selected due to unknown error", "Fail");
		}

		
	}

	public void selectvisibletextbyxpath(String xpathVal, String String) {
		
		
		try {
			WebElement text = driver.findElementByXPath(xpathVal);
			Select sc = new Select(text);
			sc.selectByVisibleText(String);
			
			//System.out.println("The element with xpath "+xpathVal+" is selected with the value "+String);
			reportStep("The element with xpath "+xpathVal+" is selected with the value "+String, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with id "+xpathVal+" is not found in the DOM");
			reportStep("The element with id "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not visible in the application");	
			 reportStep("The element with id "+xpathVal+" is not visible in the application", "Fail");
			 
		}catch (ElementClickInterceptedException e) {
		
			 //System.err.println("The element with id "+xpathVal+" is not intercepted in the application");
			 reportStep("The element with id "+xpathVal+" is not intercepted in the application", "Fail");
			 
		}catch (ElementNotSelectableException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not selectable in the application");	
			 reportStep("The element with id "+xpathVal+" is not selectable in the application", "Fail");
			 
		}catch (StaleElementReferenceException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not stable in the application");	
			 reportStep("The element with id "+xpathVal+" is not stable in the application", "Fail");
		
		}catch (WebDriverException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not selected due to unknown error");	
			 reportStep("The element with id "+xpathVal+" is not selected due to unknown error", "Fail");
		}

		}

	public void selectVisibileTextByname(String name, String value) {
		
		try {
			WebElement visibletext = driver.findElementByName(name);
			 Select text = new Select(visibletext);
			text.selectByVisibleText(value);
			
			//System.out.println("The element with name "+ name+" is selected with a value"+value);
			reportStep("The element with name "+ name+" is selected with a value"+value, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			 //System.err.println("The element with name  "+name+" is not visible in the application");	
			 reportStep("The element with name  "+name+" is not visible in the application", "Fail");
			 
		}catch (ElementClickInterceptedException e) {
		
			 //System.err.println("The element with name "+name+" is not intercepted in the application");	
			 reportStep("The element with name "+name+" is not intercepted in the application", "Fail");
			 
		}catch (ElementNotSelectableException e) {
			
			 //System.err.println("The element with name "+name+" is not selectable in the application");		
			 reportStep("The element with name "+name+" is not selectable in the application", "Fail");

		}catch (StaleElementReferenceException e) {
			
			 //System.err.println("The element with name "+name+" is not stable in the application");		
			 reportStep("The element with name "+name+" is not stable in the application", "Fail");
			 
		
		}catch (WebDriverException e) {
			
			// System.err.println("The element with name "+name+" is not selected due to unknown error");	
			 reportStep("The element with name "+name+" is not selected due to unknown error", "Fail");
		}

		
	}

	public void scrooldown(String xpathVal, String data) {
		
		try {
			driver.findElementByXPath(xpathVal).sendKeys(data);
			
			//System.out.println("The element with name xpathVal "+xpathVal+" is enter wth data"+data);
			reportStep("The element with name xpathVal "+xpathVal+" is enter wth data"+data, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
		
			//System.err.println("The element with xpath "+xpathVal+" is not found in the application");
			reportStep("The element with xpath "+xpathVal+" is not found in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
		
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
			
	    }catch (WebDriverException e) {
			
	    	//System.err.println("The element with xpath "+xpathVal+" is is not entered the data "+data+" due to unknown error");
	    	reportStep("The element with xpath "+xpathVal+" is is not entered the data "+data+" due to unknown error", "Fail");
		}
	
	}

	

	public void mouseOverByXpath(String xpath) {
		
		
		try {
			Actions builder = new Actions(driver);
			
			WebElement element = driver.findElementByXPath(xpath);
			
			builder.moveToElement(element).perform();
			
			//System.out.println("The element with xpath "+xpath+" is mousehovered successfully");
			reportStep("The element with xpath "+xpath+" is mousehovered successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with name "+xpath+" is not found in the DOM");
			reportStep("The element with name "+xpath+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			 //System.err.println("The element with name  "+xpath+" is not visible in the application");
			 reportStep("The element with name  "+xpath+" is not visible in the application", "Fail");
			 
		}catch (ElementClickInterceptedException e) {
			
			 //System.err.println("The element with name "+xpath+" is not intercepted in the application");	
			 reportStep("The element with name "+xpath+" is not intercepted in the application", "Fail");
			 
		}catch (ElementNotSelectableException e) {
			
			 //System.err.println("The element with name "+xpath+" is not selectable in the application");
			 reportStep("The element with name "+xpath+" is not selectable in the application", "Fail");
			 
		}catch (StaleElementReferenceException e) {
			
			// System.err.println("The element with name "+xpath+" is not stable in the application");	
			 reportStep("The element with name "+xpath+" is not stable in the application", "Fail");
		
		}catch (WebDriverException e) {
			
			 //System.err.println("The element with name "+xpath+" is not selected due to unknown error");	
			 reportStep("The element with name "+xpath+" is not selected due to unknown error", "Fail");
		}
	
	}

	public void selectValuebyxpath(String xpathVal, String String) {
		
		try {
			WebElement text = driver.findElementByXPath(xpathVal);
			Select sc = new Select(text);
			sc.selectByValue(String);
			
			//System.out.println("The element with id "+xpathVal+" is selected with the value"+String);
			reportStep("The element with id "+xpathVal+" is selected with the value"+String, "Pass");
			
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with id "+xpathVal+" is not found in the DOM");
			reportStep("The element with id "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not visible in the application");	
			 reportStep("The element with id "+xpathVal+" is not visible in the application", "Fail");
			 
		}catch (ElementClickInterceptedException e) {
		
			 //System.err.println("The element with id "+xpathVal+" is not intercepted in the application");	
			 reportStep("The element with id "+xpathVal+" is not intercepted in the application", "Fail");
			 
		}catch (ElementNotSelectableException e) {
			
			 //System.err.println("The element with id "+xpathVal+" is not selectable in the application");	
			 reportStep("The element with id "+xpathVal+" is not selectable in the application", "Fail");
			 
		}catch (StaleElementReferenceException e) {
			
			 //System.err.println("The element with id "+xpathVal+" is not stable in the application");	
			 reportStep("The element with id "+xpathVal+" is not stable in the application", "Fail");
		
		}catch (WebDriverException e) {
			
			// System.err.println("The element with id "+xpathVal+" is not selected due to unknown error");	
			 reportStep("The element with id "+xpathVal+" is not selected due to unknown error", "Fail");
		}

		
	}
	
	}



