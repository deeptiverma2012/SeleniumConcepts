package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

static WebDriver driver;
// Selenium 4.x feature

//It works for
//tab 
// window

//Types of switch
// switchTo().window
//switchTo().alert
//switchTo().frame
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    System.out.println(driver.getCurrentUrl());
  String ParentWindowHandle =  driver.getWindowHandle();
   // driver.switchTo().newWindow(WindowType.TAB);
  driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.google.com/");
    
    System.out.println(driver.getCurrentUrl());
    Thread.sleep(3000);
    driver.close();
    Thread.sleep(3000);
    driver.switchTo().window(ParentWindowHandle);
    Thread.sleep(1000);
    String text =  driver.findElement(By.xpath("(//div[@class='orangehrm-login-error']/div/p)[1]")).getText();
	System.out.println(text);
	}

}
