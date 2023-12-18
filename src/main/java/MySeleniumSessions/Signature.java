package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Signature {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	    
		driver = new ChromeDriver();   
	    driver.get("https://signature-generator.com/draw-signature/");
	   WebElement target = driver.findElement(By.id("signature-pad"));
	   
	    Actions act = new Actions(driver);
Action signature =	 act.click(target)
	    .moveToElement(target,30,40)
	    .clickAndHold(target)
	    .moveToElement(target, -200,-30)
	    .moveByOffset(40, 50)
	    .moveByOffset(10, 40)
	    .moveByOffset(-200, -100)
	    .release(target)
	    .build();
	    
	    signature.perform();
	    
	    
	    
	}

}
