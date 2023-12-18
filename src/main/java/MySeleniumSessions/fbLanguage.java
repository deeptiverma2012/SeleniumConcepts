package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLanguage {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
   
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	


JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,3000)"); //Vertical Scroll</p>

Thread.sleep(5000);



	List<WebElement> langlinks = driver.findElements(By.xpath("(//ul[contains(@class, 'uiList ')])[1]/li"));
	
	System.out.println(langlinks.size());
	for(WebElement e: langlinks )
	{
	  String text =	e.getText();
	  System.out.println(text);
	  
	  if(text.equals("한국어"))
	  {
	     e.click();
	     break;
	  }
	}  System.out.println("Link found");
	  
	  System.out.println("*****************************************************************************************");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,3000)"); //Vertical Scroll</p>
	  
     List<WebElement> langlinks1 = driver.findElements(By.xpath("(//ul[contains(@class, 'uiList ')])[1]/li"));
     System.out.println(langlinks1.size());
		for(WebElement e1: langlinks1 )
		{
		  String text1 =	e1.getText();
		  System.out.println(text1);
		  
		  if(text1.equals("English (US)"))
		  {
		     e1.click();
		     break;
		  }
	  	}
		System.out.println("Link clicked");
	
		//driver.close();
		

	}

}

