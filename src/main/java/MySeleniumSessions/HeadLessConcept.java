package MySeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		// headless browser testing
		// testing without active browser window
		// No active UI
		// Testing behind the scene
		// Performance wise faster than UI mode
		// but might not interact with some complex application components
		//headless mode not supported by Safari
		
		//When to use:
		// CI/CD/ Aws/Linux/Jeckins - when no UI is available
		
		
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--headless");		
//		op.addArguments("--incognito");
//		driver = new ChromeDriver(op);
		
//		FirefoxOptions fo = new FirefoxOptions();
//	    fo.addArguments("--headless");
//		
//		driver = new FirefoxDriver(fo);
		
		EdgeOptions eo = new EdgeOptions();
		//eo.addArguments("--headless");
		eo.addArguments("--InPrivate");
		driver = new EdgeDriver(eo);
		
		
		driver.get("https://classic.freecrm.com/index.html");
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
