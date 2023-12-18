package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Amazon_Assignment {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
     List<WebElement> imgLinks  =  driver.findElements(By.tagName("img"));
      System.out.println("The Total no. of images"+ imgLinks.size());
      
      for(int i=0; i<imgLinks.size(); i++)
      {
    	String source =  imgLinks.get(i).getAttribute("src");
    	String alt = imgLinks.get(i).getAttribute("alt");
    	Thread.sleep(5000);
    	if(alt.length()!=0) {
    	System.out.println(i +"source value ="+ source+"  "+"alt value ="+alt);
      }
      }
     
	}

}
