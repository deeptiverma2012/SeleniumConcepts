package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException { 
		//Context click = right click
		 driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 WebElement button = driver.findElement(By.xpath("//span[text() ='right click me']"));
		 
		 Actions act = new Actions(driver);
		 act.contextClick(button).perform();
		 
		//WebElement copyOption =  driver.findElement(By.xpath("//span[text() ='Copy']"));
		//act.moveToElement(copyOption).click().perform();
		 
		List<WebElement> eleList = driver.findElements(By.xpath("//ul[@class ='context-menu-list context-menu-root']//span"));
		System.out.println(eleList.size());
		for(WebElement e: eleList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy"))
			{
				act.moveToElement(e).click().perform();
				System.out.println("Clicked on copy");
				break;
			}
		}
		
		
		
	

	}

}
