package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("http://www.londonfreelance.org/courses/frames/index.html");
    Thread.sleep(2000);
    
   // driver.switchTo().frame("main");
   // driver.switchTo().frame(2);
    driver.switchTo().frame(driver.findElement(By.name("bot")));
    String text =  driver.findElement(By.tagName("h2")).getText();
    System.out.println(text);
    
    //Browser
    	//Page ---Elements
    		//Frame1 --- Elements
    		//Frame2 --- Elements
    // The purpose of frames is to provide an extra layer of security to the web elements available on a web page
    
    // There are two types of frames
    // 1. frame tag deprecated -- not recommended by w3c
    // 2. iframe tag -- new -- recommended by w3c
    
    

	}

}
