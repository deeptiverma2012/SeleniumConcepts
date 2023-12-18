package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorsConcept {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
//		                       e4(above)
//		                          ^
//		                          | 
//		         e1(left)  <-----ele ---->e1(right)
//	                              |
//	                              e3(down)
//	              e5(near)   
		
		driver = new ChromeDriver();   
	    driver.get("https://www.aqi.in/us/dashboard/canada");
	  WebElement ele =  driver.findElement(By.linkText("Bluewater, Canada"));
	  
	//  right of ele
	String text =  driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(text);
	
	// left of ele
	String rank =driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(rank);
	
	// above of ele
	String aboveEle =driver.findElement(RelativeLocator.with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveEle);
	
	//below of ele
	String belowEle =driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowEle);
	
	//near to ele
	String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(nearEle);

	//get all the cities below ele
	driver.manage().window().maximize();
	List<WebElement> cityList = driver.findElements(with(By.xpath("//div[@id ='most_pollutedCitiesRank']/p")).below(ele));
	
	Thread.sleep(3000);
	System.out.println(cityList.size());
	for(WebElement e: cityList)
	{
		 String cityName = e.getText();
		 System.out.println(cityName);
	}
	
	
	}

}
