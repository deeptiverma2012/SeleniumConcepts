package MySeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoadTimeOut {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		//Below line of code doesn't corresponding to ElementUtil. It is declared at global level after initializing the driver
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//Sets the amount of time to wait for a page load to complete before throwing an error. 
		//If thetimeout is negative, not null, or greater than 2e16 - 1, an error code with 
		//invalid argumentwill be returned.
		
		driver.get("https://classic.freecrm.com/index.html");
		

	}

}
