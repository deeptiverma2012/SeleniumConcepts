package MySeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForTitleUrl {

	static WebDriver driver;
	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("About Us")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if(wait.until(ExpectedConditions.titleContains("About")))
//		{
//			System.out.println(driver.getTitle());
//		}
//		else
//		{
//			System.out.println("Title value not found");
//		}

		String title = waitForTitleContains("About11", 5);
		System.out.println(title);
	}
	
	public static String waitForTitleContains(String titleFraction, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try{if(wait.until(ExpectedConditions.titleContains(titleFraction)))
		{
			return driver.getTitle();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println(titleFraction+"Title not present");
			e.printStackTrace();
		}
		
		return null;
	}
	public static String waitForTitleIs(String title, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try{if(wait.until(ExpectedConditions.titleIs(title)))
		{
			return driver.getTitle();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println(title+"Title not present");
			e.printStackTrace();
		}
		
		return null;
	}
	public static String waitForUrlContains(String urlFraction, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction)))
		{
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println(urlFraction+"Url not present");
			e.printStackTrace();
		}
		return null;
	}
	public static String waitForUrlIs(String url, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlToBe(url)))
		{
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println(url+"Url not present");
			e.printStackTrace();
		}
		return null;
	}

}
