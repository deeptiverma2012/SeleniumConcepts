package MySeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   String ParentWindowHandle = driver.getWindowHandle();
   System.out.println(ParentWindowHandle);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
    driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();
    driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
    driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click(); 
    
    Set<String> handles = driver.getWindowHandles();
    Iterator<String> it =  handles.iterator();
    
    while(it.hasNext())
    {
    	String windowId = it.next();
    	if(!windowId.equals(ParentWindowHandle))
    	{
    	driver.switchTo().window(windowId);
    	System.out.println(driver.getCurrentUrl());
    	Thread.sleep(2000);
    	driver.close();	
    	
    	}
    }
    driver.switchTo().window(ParentWindowHandle);
    System.out.println(driver.getTitle());
  

    
    
 
	}

}
