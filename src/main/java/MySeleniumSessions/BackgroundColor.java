package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor {
	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();	
		driver.get("https://classic.freecrm.com/index.html");
		
			WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
	    String bgColor = element.getCssValue("backgroundColor");
	    
	    System.out.println(bgColor);
	    
	    Rectangle rect = element.getRect();
	    int height = rect.getHeight();
	    System.out.println(height);
	    
	    int width = rect.getWidth();
	    System.out.println(width);
	    
	   System.out.println( rect.getX());
	   System.out.println(rect.getY());
	   
	  int x =  element.getLocation().getX();
	  int y = element.getLocation().y;
	  System.out.println(x);
	  System.out.println(y);
	}
	

}
