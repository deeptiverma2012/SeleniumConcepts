package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email");
//		//WebElement emailId = driver.findElement(email);//		
//		emailId.sendKeys("abc@123.com");
//		String text = emailId.getAttribute("value");
//		System.out.println(text);
//		doSendKeys(email, "test@123.com");
//		String emailValue = getAttribute(email, "value");
//		System.out.println(emailValue);		
//		String placeHolder =getAttribute(email, "placeholder");
//		System.out.println(placeHolder);
		
		WebElement register = driver.findElement(By.linkText("Register"));
		String link= register.getAttribute("href");
		System.out.println(link);
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static String getText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public static String getAttribute(By locator, String attributeName)
	{
		return getElement(locator).getAttribute(attributeName);
	}

}
