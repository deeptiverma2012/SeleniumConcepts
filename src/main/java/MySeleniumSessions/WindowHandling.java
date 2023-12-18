package MySeleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
    Set<String> handles = driver.getWindowHandles();
    Iterator<String> it = handles.iterator();
   
    String ParentWindowId = it.next();
    System.out.println(ParentWindowId);
    
    String ChildWindowId = it.next();
    System.out.println(ChildWindowId);
    
    driver.switchTo().window(ChildWindowId);
    System.out.println(driver.getCurrentUrl());
    
    Thread.sleep(5000);
    driver.close();
    
    driver.switchTo().window(ParentWindowId);
    System.out.println(driver.getCurrentUrl());
    
    driver.quit();
    

	}

}
