package MySeleniumSessions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
	//1. ChromeDriver driver = new ChromeDriver();// individual driver object creation
		
    //2. WebDriver driver = new ChromeDriver();// Valid+recommended
		
	//3. SearchContext driver = new ChromeDriver();// Valid + not recommended because we can access only 2 methods find Element & find elements
	
	//4. RemoteWebDriver driver = new ChromeDriver();// Valid+Recommended because remotewebdriver is the class implementing the methods of Searchcontext & Webdriver interfaces
		// Therefore we can use all the implemented & individual methods 
	 
	//5. WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);// Valid +recommended but only to execute on grid/remote/cloud
	
	//6. 	ChromiumDriver driver = new ChromeDriver();// valid+not recommended because only applicable for chrome & edge
		
	
	}

}
