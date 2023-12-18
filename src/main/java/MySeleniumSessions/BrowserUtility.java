package MySeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 * @author Deepti
 * Browser utility is having multiple generic methods to handle the various browser actions
 */
public class BrowserUtility {

	private WebDriver driver;
	/**
	 * This method is used to launch browser based upon the given browserName
	 * @param browserName
	 * @return this method returns the driver instance
	 */
	public WebDriver lanchBrowser(String browserName)
	{
		System.out.println("Browser name is:"+browserName);
		switch(browserName.toLowerCase().trim())
		{
		 case "chrome":
			driver = new ChromeDriver();// Child class object is referred by parent interface reference 
		  break;
		 case "firefox":
			driver = new FirefoxDriver();
			break;
		 case "edge":
			driver = new EdgeDriver();
			break;
		 case "safari":
		  driver = new SafariDriver();
		  break;
		 default:
			 throw new MyAppException("INVALID BROWSER");
			//System.out.println("Please enter correct browser"+":"+ browser);
			//break;
		}
		return driver;
	}
	
	public void launchUrl(String url)
	{
		if(url==null)
		{
			System.out.println("Url is NULL");
			throw new MyAppException("URL IS NULL");
		}
		// http://www.google.com
		if(url.indexOf("https")==0)
		{
			driver.get(url);
		}
		else
		{
			throw new MyAppException("Http is missing");
		}
	}
	public String getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Page title is:"+title);
		return title;
	}
	public String getPageUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println("Your page url is:"+url);
		return url;
	}
	
	public boolean getPageSource(String value)
	{
		String pageSource = driver.getPageSource();
		if(pageSource.contains(value)) {
		   return true;
		}
		
		 return false;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	public void quitBrowser()
	{
		driver.quit();
	}

}
