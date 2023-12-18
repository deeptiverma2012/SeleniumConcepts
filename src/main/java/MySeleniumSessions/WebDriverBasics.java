package MySeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	static WebDriver driver ;
	public static void main(String[] args) {
		//1.Open the browser
		//2.Enter the url
		//3.Get the title
		//4.Verify the title(Actual vs Expected)
		//5.Close the browser

		// Automation steps
		//ChromeDriver driver = new ChromeDriver();// This line will launch the browser
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		// Cross browser logic // with top casting // It helps to achieve the parallel testing
		String browser = "opera";
		
		switch(browser.toLowerCase().trim())
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
			 throw new MyAppException("Run time exception occurred-- Incorrect browser name");
			//System.out.println("Please enter correct browser"+":"+ browser);
			//break;
		}
		
		
		//Upcasting
		
		driver.get("https://www.google.com");// This method is implemented by RemoteWebDriver class
	/*Without protocol(http/s://), selenium will throw invalid Argument exception
      Without http:// or https:// selenium will not launch any browser
      www is not mandatory, selenium will launch the url without www.
      */
		
		//Verification point/check point/ actual vs expected: testing
	   String actTitle=driver.getTitle();
	   System.out.println("Title is:"+actTitle);
	   
	   if(actTitle.equals("Google"))
	   {
		   System.out.println("Title is correct --Pass");
	   }
	   else
	   {
		   System.out.println("Title is incorrect --Fail");
	   }

		driver.close();
	
	}

}
