package MySeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paginationConcepts {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
	
		
		
//		while(true)
//		{ //if element is available on 1st page
//			if(driver.findElements(By.xpath("//td[text()='Deepti']")).size() > 0)
//			{
//				selectCountry("Deepti");
//				break;
//			}
//			else {
//					//pagination logic
//				
//     			JavascriptExecutor js = (JavascriptExecutor) driver;
//     			js.executeScript("window.scrollTo(0,document.body.scrollHeight/2-50);");
//			
//				 By next = By.linkText("Next");
//     			 
//     			 //WebElement next1 = driver.findElement(By.linkText("Next"));
//				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//				WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));		 
//				
//				 if(next1.getAttribute("class").contains("disabled"))
//				  {
//					System.out.println("Pagination is over......Country not found");
//					break;
//				  }
//				  next1.click();
//				  Thread.sleep(1000);
//					}
		
			By country = By.xpath("//td[text()='India']");
//			selectCountryByPagination(country, "Deepti");
		
//		while(true) {
//			if(driver.findElements(country).size()>0)
//			{
//				selectMultipleCountry("India");
//			}
//			
//		Thread.sleep(2000);
//				 By next = By.linkText("Next");
////     			 
////     			 //WebElement next1 = driver.findElement(By.linkText("Next"));
//			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));	
//			if(next1.getAttribute("class").contains("disabled"))
//			{
//				System.out.println("Pagination is over......Country not found");
//				break;
//			}
//			next1.click();
//			Thread.sleep(1000);
			//multipleCountrySelection(country, "India");
			
			while(true)
			{
				if(driver.findElements(country).size()>0)
				{
					selectDifferentContry("India", "Russia");
				}
				JavascriptExecutor js = (JavascriptExecutor) driver;
     			js.executeScript("window.scrollTo(0,document.body.scrollHeight/2-60);");
				By next = By.linkText("Next");
			 
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));	
		if(next1.getAttribute("class").contains("disabled"))
		{
			System.out.println("Pagination is over......Country not found");
			break;
		}
		next1.click();
		Thread.sleep(1000);
				
			}
			
			
			}
	
			
			

	
	

	public static void selectCountry(String countryName)
	{
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static void selectCountryByPagination(By locator, String countryName) throws InterruptedException {
		while(true)
		{ //if element is available on 1st page
			if(driver.findElements(locator).size() > 0)
			{
				selectCountry(countryName);
				break;
			}
			else {
					//pagination logic
				
     			JavascriptExecutor js = (JavascriptExecutor) driver;
     			js.executeScript("window.scrollTo(0,document.body.scrollHeight/2-50);");
			
				 By next = By.linkText("Next");
     			 
     			 //WebElement next1 = driver.findElement(By.linkText("Next"));
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));		 
				
				 if(next1.getAttribute("class").contains("disabled"))
				  {
					System.out.println("Pagination is over......Country not found");
					break;
				  }
				  next1.click();
				  Thread.sleep(1000);
					}
			
			
			
		
	}
		
		
	}
		
		public static void selectMultipleCountry(String countryName)
		{
			
				
			List<WebElement> li = driver.findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
			for(WebElement e: li)	
			{
				e.click();
			}
				
				
		}
		
		public static void multipleCountrySelection(By locator, String countryName) throws InterruptedException
		{
			while(true) {
				if(driver.findElements(locator).size()>0)
				{
					selectMultipleCountry(countryName);
				}
				
			Thread.sleep(2000);
					 By next = By.linkText("Next");
//	     			 
//	     			 //WebElement next1 = driver.findElement(By.linkText("Next"));
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));	
				if(next1.getAttribute("class").contains("disabled"))
				{
					System.out.println("Pagination is over......Country not found");
					break;
				}
				next1.click();
				Thread.sleep(1000);
				}
		}
		
		public static void selectDifferentContry(String country1, String country2)
		{
			
			List <WebElement> li = driver.findElements(By.xpath("//td[text()='"+country1+"' or text()='"+country2+"']/preceding-sibling::td/input[@type='checkbox']"));
		    for(WebElement e: li)
		    {
		    	e.click();
		    }
		}
		
		public static void differentMultipleSelection(By locator, String country1, String country2) throws InterruptedException
		{
			while(true)
			{
				if(driver.findElements(locator).size()>0)
				{
					selectDifferentContry(country1, country2);
				}
				JavascriptExecutor js = (JavascriptExecutor) driver;
     			js.executeScript("window.scrollTo(0,document.body.scrollHeight/2-60);");
				By next = By.linkText("Next");
			 
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement next1 = wait.until(ExpectedConditions.visibilityOfElementLocated(next));	
		if(next1.getAttribute("class").contains("disabled"))
		{
			System.out.println("Pagination is over......Country not found");
			break;
		}
		next1.click();
		Thread.sleep(1000);
				
		}
}
}