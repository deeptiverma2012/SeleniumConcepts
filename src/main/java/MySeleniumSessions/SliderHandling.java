package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	    
		driver = new ChromeDriver();   
	    driver.get("https://jqueryui.com/resources/demos/slider/default.html");
	    WebElement slider =  driver.findElement(By.id("slider"));
	//   int h = slider.getSize().height;
	 //   int height = slider.getSize().getHeight();// for vertical slider 
	    int width = slider.getSize().getWidth(); // for horizontal slider
	    System.out.println(width);
	    
	    
	    Actions act = new Actions(driver);
	    act.clickAndHold(slider).moveByOffset((width/2)-50, 0).build().perform();
	    
	    
		

	}

}
