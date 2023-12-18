package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  { 
		//Context click = right click
		 driver = new ChromeDriver();
		 
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 Actions act = new Actions(driver);
		 
		WebElement EmailId =  driver.findElement(By.id("input-email"));
		WebElement Passwd = driver.findElement(By.id("input-password"));
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		
		act
		.sendKeys(EmailId, "Deepti@gmail.com")
			.sendKeys(Passwd, "abc@123")
				.click(LoginBtn)
					.perform();
	}	
 
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator)
	{
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public static void doActionsSendKeys(By locator, String value)
	{
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}

}
