package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
    driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
    driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
    driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Driving License");
    driver.findElement(By.id("RESULT_TextField-3")).sendKeys("United States");
    driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Testing  Testing Testing Testing Testing  TestingTestingvvvTestingTestingTestingTestingTestingTestingTestingTesting");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='file_upload']")).sendKeys("C:/Users/Ashish/Desktop/Test1.json");
    Thread.sleep(2000);
    Actions act = new Actions(driver);
    act.sendKeys(Keys.PAGE_DOWN).perform();
    driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Divya");
    driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Gupta");
    driver.findElement(By.id("RESULT_TextField-10")).sendKeys("1429 W Mcdermott Dr.");
    driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Allen");
    
  WebElement dropdown =   driver.findElement(By.xpath("//select[@name='RESULT_RadioButton-13']"));
  dropdown.click();
 Select select = new Select(dropdown);
 Thread.sleep(2000);
  select.selectByVisibleText("Arizona");
  
// List <WebElement> statesList =  driver.findElements(By.xpath("//select[@class='drop_down']/option"));
// System.out.println(statesList.size());
// for(WebElement e: statesList)
// {
//	String text = e.getText();
//	if(text.equals("Arizona"))
//	{
//		e.click();
//	}
// }
  
  driver.switchTo().defaultContent();
  
 String txt =  driver.findElement(By.xpath("//h3[@class='details__form-preview-title']")).getText();
 System.out.println(txt);
 
	}

}

