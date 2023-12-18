package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customWait   {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//Q: Without using any dynamic wait, create your own custom wait
		By forgotPwd = By.xpath("(//p[contains(@class,'oxd-text')] )[3]1");
		retryingElement(forgotPwd, 20).click();

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator, int timeout)
	{
		WebElement element = null;
		int totalAttempt = 0;
		while(totalAttempt<timeout)
		{
			try 
		
			{
		
			 element = getElement(locator);
			 System.out.println("Element is found"+ locator+ "No. of attempt/s :  "+totalAttempt);
			 break;
			}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not found"+locator+"No. of attempt/s : "+totalAttempt);
			try {
				Thread.sleep(500);//polling time
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
			totalAttempt++;
			
		}
	
			if(element == null) {
				System.out.println("element is not found.... tried for "+timeout+"with the interval.."+"500 miliseconds");
			    throw new MyAppException("No Such Element");
			}
			return element;
		}
		
	}

	
