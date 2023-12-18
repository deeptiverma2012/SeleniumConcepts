package MySeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle1 {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   String ParentWindowHandle = driver.getWindowHandle();
   System.out.println(ParentWindowHandle);
    
    
    Thread.sleep(3000);
   // driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
  List<WebElement> list =   driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
  for(WebElement e: list) {
	  e.click();
	  Set<String> windowsId =  driver.getWindowHandles();
	   Iterator <String> it =  windowsId.iterator();
	   while(it.hasNext())
	   {
		 String window =  it.next();
		 if(!window.equals(ParentWindowHandle))
		 {
			 driver.switchTo().window(window);
			 System.out.println(driver.getCurrentUrl());
			 Thread.sleep(3000);
			 driver.close();
			 driver.switchTo().window(ParentWindowHandle);
			 System.out.println(driver.getCurrentUrl());
		 }
	
	   }
  }
  Thread.sleep(1000);
    String text =  driver.findElement(By.xpath("(//div[@class='orangehrm-login-error']/div/p)[1]")).getText();
	System.out.println(text);
    
  
   
    	   	
    }
   
    
}
 

