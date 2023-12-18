package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException { 
   			//Actions: User actions
		//Mouse & keyboard user actions like - move, hover, right click, double click
		 driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		 
		 Thread.sleep(2000);
		 
	     WebElement srcEle = driver.findElement(By.id("draggable"));
	     WebElement targetEle = driver.findElement(By.id("droppable"));
	     
	     Thread.sleep(2000);
	     Actions act = new Actions(driver);
	     
	     act
	     .clickAndHold(srcEle)
	     	.moveToElement(targetEle)
	     		.release()
	     			.perform();
	}

}
