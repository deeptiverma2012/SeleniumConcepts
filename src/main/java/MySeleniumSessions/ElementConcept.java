package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// Webelement
		//create the webelement+ perform an action(click, sendKeys, getText, isDisplayed)
		
		//driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// DOM: Document object model:Html code
		//1st: we are sending request to server twice
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver .findElement(By.id("input-password")).sendKeys("test@123");
		
		//2nd:No need to create the webelement again & again
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver .findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");
		
		//3rd: with the By, we are not hitting server but with driver. we are hitting server
		// using By locator, we can create the repository of locators. We can hit the server for the locators we want to perform action on
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId =driver.findElement(eId);
//		WebElement passwd = driver.findElement(pwd);
//		
		//4th : By locator + Generic method : We have to write driver.findElement only once
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		 getElement(eId).sendKeys("test@gmail.com");;
//		 getElement(pwd).sendKeys("test@123");;
//		 
		 //5th: By locator+Generic method for element & action
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		 doSendKeys(eId,"test@gmail.com");
//		 doSendKeys(pwd, "test@123");
		 
	// 6th: By locator+ Generic method for element & action but in other element util class
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		ElementUtil util = new ElementUtil(driver);
//		util.doSendKeys(eId, "test@gmail.com");
//		util.doSendKeys(pwd, "test@123");
		
		//7th : BrowserUtility+ElementUtil: Most preferred way
		
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		BrowserUtility br = new BrowserUtility();			
//		WebDriver driver = br.lanchBrowser("chrome");//123
//		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	
//		ElementUtil Util = new ElementUtil(driver);
//		Util.doSendKeys(eId, "test@123.com");
//		Util.doSendKeys(pwd, "test@123");
//		br.closeBrowser();
		
		//8th: Convert By locators into the string
		String email = "input-email";
		String pwd = "input-password";
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.lanchBrowser("Chrome");
	    bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys("id", email, "test@123.com");
		eUtil.doSendKeys("id", pwd, "test@123");
		
	}
	
	public  static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}


	}


