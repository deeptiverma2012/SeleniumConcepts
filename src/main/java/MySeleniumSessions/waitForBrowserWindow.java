package MySeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForBrowserWindow {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   String ParentWindowHandle = driver.getWindowHandle();
   System.out.println(ParentWindowHandle);
    Thread.sleep(3000);
    
    By linkedIn = By.xpath("//a[contains(@href, 'linkedin')]");
    By facebook = By.xpath("//a[contains(@href, 'facebook')]");
    By twitter = By.xpath("//a[contains(@href, 'twitter')]");
    By youTube = By.xpath("//a[contains(@href, 'youtube')]");
    
    waitForVisibilityOfElement(linkedIn, 10).click();
  
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   if( wait.until(ExpectedConditions.numberOfWindowsToBe(2)))
   {
	   Set<String> handles = driver.getWindowHandles();
    Iterator<String> it =  handles.iterator();
    
    while(it.hasNext())
    {
    	String windowId = it.next();
    	if(!windowId.equals(ParentWindowHandle))
    	{
    	driver.switchTo().window(windowId);
    	System.out.println(driver.getCurrentUrl());
    	
    	driver.close();	
    	
    	}
    }
    driver.switchTo().window(ParentWindowHandle);
    System.out.println(driver.getTitle());
   }
  
	}

	
	public static boolean checkNewWindowExist(int timeout, int ExpectedNoOfWindows)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 try { 
		 if( wait.until(ExpectedConditions.numberOfWindowsToBe(2)))
		   { return true;
		   }
		 }
		 catch(TimeoutException e) {
			System.out.println("No. of windows expected are not same");
		 }
		   
		   return false;
		  }
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/*An expectation for checking an element is visible and enabled such that you can click it.
	 * @Param locator
	 * @param timeout*/
	public static void clickElementWhenReady(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try{
			 wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		catch(TimeoutException e)
		{
			System.out.println("Element is not clickable");
		}
	}

}
