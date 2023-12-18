package MySeleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuLinks {

     	static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
	   
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    
	    Thread.sleep(5000);
	    By menuLinks = By.className("list-group-item");
	    	    
	    List<WebElement> li= driver.findElements(menuLinks);
		System.out.println("Count of the links ="+ li.size());
		
		List<String> linksList = new ArrayList<String>();
	    for(WebElement e: li)
	    {
	    	String text = e.getText();
	    	if(text.length()!=0)
	    	{
	    		 linksList.add(text);
	    	}
	    }
	    System.out.println(linksList);

	}

}
