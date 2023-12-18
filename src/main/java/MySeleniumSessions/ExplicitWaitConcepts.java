package MySeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		//Explicit wait: concept of dynamic wait for specific element / non web element
		//on the basis of some expected conditions			
		// Explicit wait can be applied to non web elements(alerts, title, url)
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// WebDriverWait is a child class of FluentWait class. Fluent Wait class implements Wait interface. 
		//Wait interface contains only 1 method without body -- Until method which is overridden & implemented by FluentWait class		
   // WebDriver wait contains only 1 overridden method "timeoutexception" which is protected, that's why we cannot use it publicly  
		
		By email = By.id("input-email");
		By passwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele1 = wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//An expectation for checking that an element is present on the DOM of a page. 
		//This does not necessarily mean that the element is visible.
		//Expected Conditions is a class
		
		//The return type of until method is WebElement. It accepts By locator as a parameter & returns WebElement 
//		ele1.sendKeys("abc@123.com");
		//10 sec -- ele1 2 sec--8 sec wait will be ignored
		
		 waitForPresenceOfElement(email, 5).sendKeys("abc@123.com");

        driver.findElement(passwd).sendKeys("Abc@123");
		driver.findElement(loginBtn).click();
		
				
	}
	/*An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.	 *
	 * @param locator
	 * @param timeout
	 * @return
	 * */
	public static WebElement waitForPresenceOfElement(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/*An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but 
	 * also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return*/
	public static WebElement waitForVisibilityOfElement(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static void doClickWithWait(By locator, int timeout)
	{
		 waitForVisibilityOfElement(locator, timeout).click();
	}
	public static void doSendKeys(By locator, int timeout, String value)
	{
		waitForVisibilityOfElement(locator,timeout).sendKeys(value);
	}

	/*An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
     * @param locator
	 * @param timeout
	 * @return*/
 	public List <WebElement> waitForVisibilityOfElements(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
 	
 	/*An expectation for checking that there is at least one element present on a web page.
 	 * @param locator
	 * @param timeout
	 * @return*/
 	public List <WebElement> waitForPresenceOfAllElement(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}
	

}
