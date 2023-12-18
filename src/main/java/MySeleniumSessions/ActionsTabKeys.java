package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  { 
		//Context click = right click
		 driver = new ChromeDriver();		 
//		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		 
//		WebElement firstName= driver.findElement(By.id("input-firstname"));
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(firstName, "deepti")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys("Verma")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.build()
//		.perform();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		
		Action action = act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Laptop")
		.sendKeys(Keys.ENTER).build();
		
		
	   action.perform();

	}

}
