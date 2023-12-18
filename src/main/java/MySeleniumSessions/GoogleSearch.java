package MySeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
   
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
//	driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//	
//	Thread.sleep(3000);
//	
//	List<WebElement> searchText = driver.findElements(By.xpath("//div[@class ='wM6W7d']/span"));
//	System.out.println(searchText.size());
//		
//	for(WebElement e: searchText)
//	{
//		String text = e.getText();
//		
//		System.out.println(text);
//				
//		if(text.equals("selenium automation interview questions"))
//		{
//			System.out.println("Search result found--------Pass");
//			e.click();
//			break;
//		}
//	}
	
	By searchfield = By.name("q");
	By searchText = By.xpath("//div[@class ='wM6W7d']/span");
	Search(searchfield,searchText,"Selenium Automation", "selenium automation interview questions" );
	
	
	
	
	
	}
	
	
	public static void Search(By searchField, By searchText, String sendString, String comparisionString) throws InterruptedException
	{
		doSendKeys(searchField,sendString);
		Thread.sleep(3000);
		List <WebElement>list = getElements(searchText);
	
		for(WebElement e: list)
		{
			String text = e.getText();
			
			System.out.println(text);
					
			if(text.equals(comparisionString))
			{
				System.out.println("Search result found--------Pass");
				e.click();
				break;
			}
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
}
