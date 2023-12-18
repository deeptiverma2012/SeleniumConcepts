package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLocators {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//    By email = By.id("input-email");
//   
//    driver.findElement(email).sendKeys("abc@123.com");
//    By pwd = By.id("input-password");
//    
//    driver.findElement(pwd).sendKeys("abc@123");
//    By loginBtn = By.xpath("//input[@value ='Login']");
//    driver.findElement(loginBtn).click();
//    
    String emailId = "input-email";
    String passwd = "input-password";
    String loginBn = "//input[@value ='Login']";
    
    doSendKeys("id", emailId, "abc@123.com");
    doSendKeys("id", passwd, "abc@123");
    doClick("xpath", loginBn);
    
    System.out.println("Execution done");
    
     
    
	}
	
	public static By getBy(String locatorType, String locatorValue)
	{
		By by = null;
		switch(locatorType.toLowerCase().trim())
		{
		case "id":
			by = By.id(locatorValue);
			break;
		case "name":
			by = By.name(locatorValue);
			break;
		case "classname":
			by= By.className(locatorValue);
			break;
		case "xpath":
			by = By.xpath(locatorValue);
			break;
		case "cssselector":
			by = By.cssSelector(locatorValue);
			break;
		case "linktext":
			by= By.linkText(locatorValue);
			break;
		case "partiallinktext":
			by= By.partialLinkText(locatorValue);
			break;
		case "tagname":
			by = By.tagName(locatorValue);
			break;
			
			default: 
				System.out.println("Wrong input");
				throw new MyAppException("INVALID BY TYPE");
		}
		return by;
		
		
	}
	
	public static WebElement getElement(String locatorType, String locatorValue)
	{
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public static void doSendKeys(String locatorType, String locatorValue, String inputKeys)
	{
		getElement(locatorType, locatorValue).sendKeys(inputKeys);
	}
	
	public static void doClick(String locatorType, String locatorValue)
	{
		getElement(locatorType, locatorValue).click();
	}

}
