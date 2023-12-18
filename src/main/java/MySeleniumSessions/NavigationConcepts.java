package MySeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

public class NavigationConcepts {
	
	// Q: What is the difference b/w driver.get() method & driver.navigate.to()?
	// There is no difference b/w them. internally to method is calling get method
	// both methods are synonyms of each other the only difference is to() method is overriden

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());*/
		
		//driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		driver.navigate().to(new URL("https://naveenautomationlabs.com/opencart/"));
		
		// We can use to() method by passing the string and by passing the object of URL class & then passing the url
	    driver.navigate().refresh();
	}

}
