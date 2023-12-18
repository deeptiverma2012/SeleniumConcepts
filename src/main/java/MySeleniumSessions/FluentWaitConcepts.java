package MySeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcepts  {
	static WebDriver driver;
	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By passwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
		//Upcasting: Fluent class object is referred by parent interface Wait
		
//		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
//				 				.withTimeout(Duration.ofSeconds(10))
//				 				.pollingEvery(Duration.ofSeconds(2))
//				 				.withMessage("Timeout occurred... Element not found")
//				 				.ignoring(NoSuchElementException.class);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("abc@123.com");
//		
		waitForElementWithFluentWait(email, 10, 2).sendKeys("abc@123.com");
		
		//Wait(Interface)----> Implemented by Fluent Wait class---> WebDriverWait class extends Fluent Wait class
		// WebDriverWait is a child class of FluentWait class therefore, we can access all the methods
		//of fluentWait class through the object of WebDriverWait class
		
		// WebDriver Wait with Fluent Wait Features
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.withMessage("Time out.....Element not found")
		.ignoring(NoSuchElementException.class)
		.ignoring(TimeoutException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("abc@123.com");
		
		
		
		
		
	}
	
	public static WebElement waitForElementWithFluentWait(By locator, int timeout, int interval) {
	
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
 				.withTimeout(Duration.ofSeconds(timeout))
 				.pollingEvery(Duration.ofSeconds(interval))
 				.withMessage("Timeout occurred... Element not found")
 				.ignoring(NoSuchElementException.class);

			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	public static void waitForFrameWithFluentWait(String frameIdOrName, int timeout, int interval) {
		
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
 				.withTimeout(Duration.ofSeconds(timeout))
 				.pollingEvery(Duration.ofSeconds(interval))
 				.withMessage("Timeout occurred... Frame is not found")
 				.ignoring(NoSuchFrameException.class);

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}	
			public static Alert waitForAlertWithFluentWait(int timeout, int interval) {
				
				Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
		 				.withTimeout(Duration.ofSeconds(timeout))
		 				.pollingEvery(Duration.ofSeconds(interval))
		 				.withMessage("Timeout occurred... Alert is not found")
		 				.ignoring(NoAlertPresentException.class);

				return	wait.until(ExpectedConditions.alertIsPresent());
	}
}

