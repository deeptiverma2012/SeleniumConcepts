package MySeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForFrame {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        By image = By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']");
        By frame = By.id("frame-one748593425");
        By textField = By.id("RESULT_TextField-1");  
                
        By header =  By.xpath("//h3[@class='details__form-preview-title']");
        
        waitForVisibilityOfElement(image,10).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        waitForVisibilityOfElement(textField,10).sendKeys("Automation");
        driver.switchTo().defaultContent();
        String text = waitForVisibilityOfElement(header, 10).getText();
        System.out.println(text);
  
	}
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForFrameByLocator(By framelocator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	public void waitForFrameByIndex(int frameIndex, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	public void waitForFrameByIdOrName(String idOrName, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	public void waitForFrameByWebElement(WebElement frameElement, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	
	
}