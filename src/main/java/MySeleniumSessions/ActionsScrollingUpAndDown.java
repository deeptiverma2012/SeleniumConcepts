package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingUpAndDown {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    Actions act = new Actions(driver);
   Thread.sleep(3000);
//    act.sendKeys(Keys.PAGE_DOWN).perform();
//    Thread.sleep(3000);
//    act.sendKeys(Keys.PAGE_DOWN).perform();
//    Thread.sleep(3000);
//    act.sendKeys(Keys.PAGE_UP).perform();
   
    // To go to the bottom of the page : Ctrl/command(in mac)+Arrow down
//    Thread.sleep(1000);
//    act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//    Thread.sleep(1000);
//    act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
    
    //Scroll to element
    
   Actions action = act.scrollToElement(driver.findElement(By.linkText("Your Account")))
    .click(driver.findElement(By.linkText("Your Account")));
   		
   action.perform();
   //Thread.sleep(1000);
     
   //driver.navigate().refresh();
   Thread.sleep(2000);
   act.sendKeys(Keys.CONTROL).sendKeys(Keys.F5).perform();
    
    
    
    
		

	}

}
