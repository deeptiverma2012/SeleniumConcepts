package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException { 
   			//Actions: User actions
		//Mouse & keyboard user actions like - move, hover, right click, double click
		 driver = new ChromeDriver();
		 driver.get("http://mrbool.com/search/?searchtxt=how-to-create-menu-with-sub-menu-using-css-html/");
		 Actions act = new Actions(driver);
//		 Thread.sleep(2000);
//		 WebElement link= driver.findElement(By.cssSelector("a.menulink"));
//		
//		 act.moveToElement(link).build().perform();
//		 driver.findElement(By.linkText("COURSES")).click();
//		 
		 //act.a1.a2.a3.a4.build ---Invalid
		//act.a1.a2.a3.a4.build.perform(); ---Valid
		 //act.a1.perform()---valid
		 //act.a1.build ---Invalid
		 //act.a1.build.perform() ---valid
	   By parentLocator = By.cssSelector("a.menulink");
	   By childLocator = By.linkText("COURSES");
	   parentChildMenuHandling(parentLocator,childLocator);
	   
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void parentChildMenuHandling(By parentMenuLocator, By childMenuLocator) throws InterruptedException
	{
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 act.moveToElement(getElement(parentMenuLocator)).build().perform();
		 Thread.sleep(2000);
		 getElement(childMenuLocator).click();
	}
	

}
