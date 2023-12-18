package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  { 
		//Context click = right click
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.bigbasket.com/");
		 
	     By parentLocator = By.xpath("(//span[text() = 'Shop by' ])[2]");
	     By firstChildLocator = By.linkText("Foodgrains, Oil & Masala");
		 By SeconChildLocator = By.linkText("Dry Fruits");
		 By thirdChildLocator = By.linkText("Other Dry Fruits");
		 
		 
//		 getElement(parentLocator).click();
//		 Thread.sleep(2000);		
//		 Actions act = new Actions(driver);
//		 
//		 act.moveToElement(getElement(firstChildLocator)).perform();
//		 Thread.sleep(1000);
//		 act.moveToElement(getElement(SeconChildLocator)).perform();
//		 Thread.sleep(1000);
//		 act.moveToElement(getElement(thirdChildLocator)).click().perform();
//		
		 multiMenuHandle( parentLocator, firstChildLocator, SeconChildLocator, thirdChildLocator);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void multiMenuHandle(By parentLocator,By firstChildLocator, By SeconChildLocator, By thirdChildLocator) throws InterruptedException
	{
		 Actions act = new Actions(driver);
		 getElement(parentLocator).click();
		 Thread.sleep(2000);				
		 
		 act.moveToElement(getElement(firstChildLocator)).perform();
		 Thread.sleep(2000);
		 act.moveToElement(getElement(SeconChildLocator)).perform();
		 Thread.sleep(2000);
		 act.moveToElement(getElement(thirdChildLocator)).click().perform();

}
}
