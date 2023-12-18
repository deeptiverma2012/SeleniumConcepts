package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  { 
		//Context click = right click
		 driver = new ChromeDriver();
		 
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		 WebElement EmailId =  driver.findElement(By.id("input-email"));
//		 String value = "deepti@gmail.com";
//		 char[] v = value.toCharArray();
//		 
//		 for(char c: v )
//		 {
//			 Actions act = new Actions(driver);
//			 act.sendKeys(EmailId, String.valueOf(c)).pause(500).perform();
//		 }
		 	By emailId = By.id("input-email");
		 	String value = "deepti@gmail.com";
		 	
		 	doActionsSendKeysWithPause(emailId, value);
			
}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeysWithPause(By locator, String val)
	{
		WebElement attribute = getElement(locator);
		 String value = val;
		 char[] v = value.toCharArray();
		 
		 for(char c: v )
		 {
			 Actions act = new Actions(driver);
			 act.sendKeys(attribute, String.valueOf(c)).pause(500).perform();
		 }
	
	}

}
