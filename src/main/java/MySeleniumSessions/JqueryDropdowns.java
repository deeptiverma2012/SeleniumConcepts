package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdowns {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{ 
   			
		 driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/selectmenu/");
		 driver.switchTo().frame(0);
		// driver.switchTo().frame("iframe.demo-frame");
		 Thread.sleep(2000);
		 
//		 driver.findElement(By.cssSelector("span#speed-button")).click();
//		 
//		 Thread.sleep(1000);
//		 
//		 List<WebElement> menuOptions =driver.findElements(By.cssSelector("ul#speed-menu div"));
//		 System.out.println(menuOptions.size());
//		 
//		 for(WebElement e: menuOptions)
//		 {
//			String text = e.getText();
//			System.out.println(text);
//			if(e.getText().equals("Slow"))
//			{
//				e.click();
//				break;
//			}
//			
//		 }
		 
		 System.out.println("***************************************************************************");
		 
		 driver.findElement(By.cssSelector("span#files-button")).click();
		 Thread.sleep(1000);
		 
		 List<WebElement> menuOptions = driver.findElements(By.cssSelector("ul#files-menu div"));
		 System.out.println(menuOptions.size());
		 
		 for(WebElement e: menuOptions)
		 {
			String text= e.getText();
			System.out.println(text);
			if(text.equals("Some unknown file"))
			{
				e.click();
			}
		 }
		 
		 

	}

}
