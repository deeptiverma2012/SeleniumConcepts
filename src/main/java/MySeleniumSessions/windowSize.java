package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class windowSize {

	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
	//	Dimension dim = new Dimension(700, 500);
		//responsive testing
	//	driver.manage().window().setSize(dim);
		
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().fullscreen();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
	    String bgColor = element.getCssValue("backgroundColor");
	    
	    System.out.println(bgColor);
		
		
		
		
	}

}
