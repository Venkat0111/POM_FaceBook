package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers{
	
	RemoteWebDriver driver;
	
	int i=1;

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
			
			System.out.println(" The browser "+browser+" is launched with the given url"+url+"successfully ");
			
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			System.err.println(" The browser "+browser+" is not launched due to session not created error ");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			System.err.println(" The browser "+browser+" is not launched as url doesn't contain http/https ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The browser "+browser+" is not launched due to unknown error ");
		}finally {
			takeSnap();
		}
		
	}

	public void enterById(String idValue, String data) {
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println(" The elememt with id "+idValue+" is entered with data "+data);
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" The element with id "+idValue +" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+idValue +" is not visible in the application ");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+idValue +" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+idValue+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+idValue+" is not entered the data "+data+" due to unknown error ");
		}finally {
			takeSnap();
		}
		
	}

	
	public void enterByName(String nameValue, String data) {
    
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println(" The element with name "+nameValue+" is entered with the data "+data);
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" The element with name "+nameValue+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with name "+nameValue+" is not visible in the application ");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println(" The element with name "+nameValue+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with name "+nameValue+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The element with name "+nameValue+" is not entered the data "+data+" due to unknown error ");
		}finally {
			takeSnap();
		}
		
	}
	

	public void enterByXpath(String xpathValue, String data) {
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println(" The element with xpath "+xpathValue+" is entered with data "+data);
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" The element with xpath "+xpathValue+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpathValue+" is not found in the application ");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpathValue+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpathValue+" is not stable in the application ");
	    }catch (WebDriverException e) {
			// TODO: handle exception
	    	System.err.println(" The element with xpath "+xpathValue+" is is not entered the data "+data+" due to unknown error ");
		}finally {
			takeSnap();
		}
	}
	
	public void verifyTitle(String title) {
		
	try {
		
		String actualtittle	= driver.getTitle();
		if(actualtittle.equals(title)) {
			System.out.println(" The title of the page "+actualtittle+" is matched with the expected title "+title);
		}else {
			
			System.err.println(" The title of the page "+actualtittle+" is not matched with the expected title "+title);
		}
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		System.err.println(" The title of the page is not verified due to unknown error ");
	}finally {
		takeSnap();
	}
	
	}
	

	public void verifyTextById(String id, String text) {
		
		try {
			
			String actualtext = driver.findElementById(id).getText();
			if(actualtext.equals(text)) {
			System.out.println(" The element with id "+id+" is holding the text "+actualtext+" is matched with the expected text "+text);
			}else {
			System.err.println(" The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text "+text);
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" The element with id "+id+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+id+" is not visible in the application ");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+id+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+id+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The element with id "+id+" is not verified due to unknown error ");
		}finally {
			takeSnap();
		}
	}

	
	public void verifyTextByXpath(String xpath, String text) {
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.equals(text)) {
			System.out.println(" The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text);	
				
			}else {
			System.err.println(" The element with xpath "+xpath+" is holding the text "+actualtext+" is not  matched with the text "+text);
				
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    System.err.println(" The element with xpath "+xpath+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath"+xpath+" is not visible in the application");
		}catch (ElementNotInteractableException e) {
		    // TODO: handle exception
			System.err.println("The element with xpath"+xpath+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath"+xpath+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath"+xpath+" is not verified due to unknown error");
		}finally {
			takeSnap();
					}
		}
	

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.contains(text)) {
				System.out.println(" The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with the text "+text);
			}else {
				
				System.err.println(" The element with xpath "+xpath+"is holding the text"+actualtext+"is not  matched with the text"+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 System.err.println(" The element with xpath "+xpath+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpath+" is not visible in the application ");
		}catch (ElementNotInteractableException e) {
		    // TODO: handle exception
			System.err.println(" The element with xpath "+xpath+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpath+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The element with xpath "+xpath+" is not verified due to unknown error ");
		}finally {
			takeSnap();
					
		}
		
		
	}

	public void clickById(String id) {
	
		try {
			driver.findElementById(id).click();
			System.out.println(" The element with id "+id+" is clicked successfully ");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not visible in the application ");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not intercepted in the application ");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not successfuly clicked due to unknown reasons ");
		}finally {
			takeSnap();
		}
		
		
	}

	public void clickByClassName(String classVal) {
		
	try {
		driver.findElementByClassName(classVal).click();
		System.out.println(" The element with classname classVal "+classVal+" is clicked successfully ");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println(" The element with classname classVal "+classVal+" is not found in the DOM ");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		System.err.println(" The element with classname classVal "+classVal+" is not visible in the application ");
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		System.err.println(" The element with classname classVal "+classVal+" is not intercepted in the application ");		
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		System.err.println(" The element with classname classVal "+classVal+" is not interactable in the application ");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		System.err.println(" The element with classname classVal "+classVal+" is not stable in the application ");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println(" The element with classname classVal "+classVal+" is not clicked due to unknown error ");
	}finally {
		takeSnap();
	}
	
		
	}
	

	public void clickByName(String name) {
		
	try {
		driver.findElementByName(name).click();
		System.out.println("The element with  name "+name+" is clicked successfully ");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("The element with name "+name+" is not found in the DOM ");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		System.err.println("The element with name "+name+" is not visible in the application ");
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		System.err.println("The element with name "+name+" is not intercepted in the application ");		
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		System.err.println("The element with name "+name+" is not interactable in the application ");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		System.err.println("The element with name "+name+" is not stable in the application ");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("The element with name "+name+" is not successfully clicked due to unknown error ");
	}finally {
		takeSnap();
	}
	
	
			
	}

	public void clickByLink(String name) {
	     try {
			driver.findElementByLinkText(name).click();
			System.out.println(" The element with linktext "+name+" is clicked successfully ");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Thwe element with linktext "+name+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not visible in the application ");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not intercepted in the application ");		
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not successfully clicked due to unknown error ");
		}finally {
			takeSnap();
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println(" The element with linktext "+name+" is clicked successfully ");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" The element with linktext "+name+" is not found in the DOM ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println(" The element with linktext "+name+" is not visible in the application ");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println(" The element with linktext "+name+" is not intercepted in the application ");		
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println(" The element with linktext "+name+" is not interactable in the application ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println(" The element with linktext "+name+" is not stable in the application ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The element with linktext "+name+" is not successfully clicked due to unknown error ");
		}
		
		
	}

	public void clickByXpath(String xpathVal) {
		
	    try {
		    driver.findElementByXPath(xpathVal).click();
		    System.out.println("The element with name xpathVal "+xpathVal+" is clicked successfully");
	   } catch (NoSuchElementException e) {
		    // TODO Auto-generated catch block
		    System.err.println("Thwe element with name xpathVal "+xpathVal+" is not found in the DOM");
	   }catch (ElementNotVisibleException e) {
		    // TODO: handle exception
		    System.err.println("The element with name xpathVal "+xpathVal+" is not visible in the application");
	   }catch (ElementClickInterceptedException e) {
		    // TODO: handle exception
		    System.err.println("The element with name xpathVal "+xpathVal+" is not intercepted in the application");		
	   }catch (ElementNotInteractableException e) {
		    // TODO: handle exception
		    System.err.println("The element with name xpathVal "+xpathVal+" is not interactable in the application");
	   }catch (StaleElementReferenceException e) {
		    // TODO: handle exception
		    System.err.println("The element with name xpathVal "+xpathVal+" is not stable in the application");
	  }catch (WebDriverException e) {
		    // TODO: handle exception
		    System.err.println("The element with name xpathVal "+xpathVal+" is not successfully clicked due to unknown error");
	}finally {
		takeSnap();
	}
	
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with name xpathVal "+xpathVal+" is clicked successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Thwe element with name xpathVal "+xpathVal+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name xpathVal "+xpathVal+" is not visible in the application");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with name xpathVal "+xpathVal+" is not intercepted in the application");		
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name xpathVal "+xpathVal+" is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with name xpathVal "+xpathVal+" is not stable in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name xpathVal "+xpathVal+" is not successfully clicked due to unknown error");
		} 	
		
	}

	public String getTextById(String idVal) {
		 String Text = null;
		try {
			 Text = driver.findElementById(idVal).getText();
			System.out.println("The element with id "+idVal+" is holding in the text"+Text);
		   } catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 System.err.println("Thwe element with id "+idVal+" is not found in the DOM");
		   }catch (ElementNotVisibleException e) {
			    // TODO: handle exception
			    System.err.println("The element with id "+idVal+" is not visible in the application");		
		   }catch (ElementNotInteractableException e) {
			    // TODO: handle exception
			    System.err.println("The element with id "+idVal+" is not interactable in the application");
		   }catch (StaleElementReferenceException e) {
			    // TODO: handle exception
			    System.err.println("The element with id "+idVal+" is not stable in the application");
		  }catch (WebDriverException e) {
			    // TODO: handle exception
			    System.err.println("The element with id "+idVal+" is not found due to unknown error");
		}finally {
			takeSnap();
		
		}
		return Text;
	}

	public String getTextByXpath(String xpathVal) {
		
		String Text = null;
		
		try {
			Text = driver.findElementByXPath(xpathVal).getText();
			
			System.out.println("The element with xpath "+xpathVal+" is holding with the text"+Text);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Thwe element with xpath "+xpathVal+" is not found in the DOM");
		   }catch (ElementNotVisibleException e) {
			    // TODO: handle exception
			    System.err.println("The element with xpath "+xpathVal+" is not visible in the application");		
		   }catch (ElementNotInteractableException e) {
			    // TODO: handle exception
			    System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
		   }catch (StaleElementReferenceException e) {
			    // TODO: handle exception
			    System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
		  }catch (WebDriverException e) {
			    // TODO: handle exception
			    System.err.println("The element with xpat h"+xpathVal+" is not found due to unknown error");
		}finally {
			takeSnap();
		
		}
		
		return Text;
	}
	

	public void selectVisibileTextById(String id, String value) {
		
	try {
		WebElement visibletext = driver.findElementById(id);
		Select text = new Select(visibletext);
		text.selectByVisibleText(value);
		System.out.println("The element with id "+ id+" is selected with a value"+value);
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("The element with id "+id+" is not found in the DOM");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not visible in the application");		
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not intercepted in the application");		
	}catch (ElementNotSelectableException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not selectable in the application");		
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not stable in the application");		
	
	}catch (WebDriverException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not selected due to unknown error");		
	}finally {
		takeSnap();
	}

	}


	public void selectIndexById(String id, int value) {
		
	try {
		WebElement index = driver.findElementById(id);
		Select text = new Select(index);
		text.selectByIndex(value);
		System.out.println("The element with id "+id+" is selected with value"+value);
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("The element with id "+id+" is not found in the DOM");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not visible in the application");		
	}catch (ElementClickInterceptedException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not intercepted in the application");		
	}catch (ElementNotSelectableException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not selectable in the application");		
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not stable in the application");		
	
	}catch (WebDriverException e) {
		// TODO: handle exception
		 System.err.println("The element with id "+id+" is not selected due to unknown error");		
	}finally {
		takeSnap();
	}

	
	}

	public void switchToParentWindow() {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			for(String  parentwinidow : allwindows) {
			driver.switchTo().window(parentwinidow);
			break;
			}
			System.out.println("The method is switched to parent window");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no such window in the apllication");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The parent window is closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
	try {
		Set<String> allwindows = driver.getWindowHandles();
		for( String lastwindow : allwindows )	{
		driver.switchTo().window(lastwindow);	
			}
		System.out.println("The method is switched to last window");
	} catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		System.err.println("There is no such window in the apllication");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("The last window is closed due to unknown error");
	}finally {
		takeSnap();
	}
	
	}

	public void acceptAlert() {
	try {
		driver.switchTo().alert().accept();
		System.out.println("The alert is accepted in the application");
	} catch (NoAlertPresentException e) {
		// TODO Auto-generated catch block
		System.err.println("There is no such alert in the apllication");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("The alert is closed due to unknown error");
	}finally {
		takeSnap();
	}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("The alert is dismissed in the application");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no such alert in the apllication");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The alert is closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public String getAlertText() {
		
		String alerttext = null;
		
		try {
			 alerttext  = driver.switchTo().alert().getText();
			System.out.println("The alerttext is Holding in the application is matched with"+alerttext);
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no such alert in the apllication");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("There is no such alert handled in the apllication");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The alerttext is not matched due to unknown error");
		}finally {
			takeSnap();
		
		}
		
		return alerttext;
	}
	public void takeSnap() {
		// TODO Auto-generated method stub

		try {
			File temp =	driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/snap"+i+".png");
			FileUtils.copyFile(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("The snapshot is not taken due to  an issue with IO");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("This occurs when there is an issue with IO");
			}
			
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The method will close the active browser");
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser is unable to open or it is crashed");
		} catch (WebDriverException e) {
			System.err.println("The browser is closed due to unknown errors");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("The method will close all the browsers");
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser is unable to open or it is crashed");
		} catch (WebDriverException e) {
			System.err.println("The browser is closed due to unknown errors");
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
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser is closed due to unknown errors");
		}
	}

	public void selectbyvalue(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select sc = new Select(text);
			sc.selectByValue(value);
			System.out.println("The element with id "+id+" is selected with the value"+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id+" is not visible in the application");		
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id+" is not intercepted in the application");		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id+" is not selectable in the application");		
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id+" is not stable in the application");		
		
		}catch (WebDriverException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id+" is not selected due to unknown error");		
		}finally {
			takeSnap();
		}

		
	}

	public void selectvisibletextbyxpath(String xpathVal, String String) {
		// TODO Auto-generated method stub
		
		try {
			WebElement text = driver.findElementByXPath(xpathVal);
			Select sc = new Select(text);
			sc.selectByVisibleText(String);
			
			System.out.println("The element with xpath "+xpathVal+" is selected with the value "+String);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+xpathVal+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+xpathVal+" is not visible in the application");		
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+xpathVal+" is not intercepted in the application");		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+xpathVal+" is not selectable in the application");		
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+xpathVal+" is not stable in the application");		
		
		}catch (WebDriverException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+xpathVal+" is not selected due to unknown error");		
		}finally {
			takeSnap();
		}

		}

	public void selectVisibileTextByname(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement visibletext = driver.findElementByName(name);
			 Select text = new Select(visibletext);
			text.selectByVisibleText(value);
			System.out.println("The element with name "+ name+" is selected with a value"+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+name+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 System.err.println("The element with name  "+name+" is not visible in the application");		
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			 System.err.println("The element with name "+name+" is not intercepted in the application");		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			 System.err.println("The element with name "+name+" is not selectable in the application");		
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 System.err.println("The element with name "+name+" is not stable in the application");		
		
		}catch (WebDriverException e) {
			// TODO: handle exception
			 System.err.println("The element with name "+name+" is not selected due to unknown error");		
		}finally {
			takeSnap();
		}

		
	}
		
	



}
