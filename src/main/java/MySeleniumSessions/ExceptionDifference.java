package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionDifference {

static WebDriver driver;
	
	public static void main(String[] args)  {
   
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	//Q: What will be the output of driver.findElement(By.xpath("//input[@class = 'naveen']"));
	// A: Syntax wise it is correct so, it will throw no such element exception
	
	//Q: What will be the output of driver.findElement(By.xpath("//input[@@@@@class = 'naveen']"));
	// A: Syntax wise it is incorrect so, it will throw invalid selector exception
	
	//Q: What will be the output of 
	//List<WebElement> list = driver.findElements(By.xpath("//input[@class = 'naveen']"));
	//System.out.println(list);	//  []
	//System.out.println(list.size());// 0
	
	//A:It will give an empty list --->[]	
	
	By logo = By.cssSelector(".img-responsive");
	//Boolean locatorSize = checkElementPresent(logo);
	//System.out.println(locatorSize );
	
	if(checkElementPresent(logo))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}

	}
	
	public static boolean checkElementPresent(By locator)
	{
		return driver.findElements(locator).size() ==1 ? true : false;
	}
	
	//? ---> Ternary operator

}
