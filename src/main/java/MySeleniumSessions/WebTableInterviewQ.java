package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInterviewQ {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    //Q Fetch all the values from Company column
 
  
		
  //*[@id='customers']//tr[2]/td[1]
  //*[@id='customers']//tr[3]/td[1]
  //*[@id='customers']//tr[4]/td[1]
  //*[@id='customers']//tr[5]/td[1]
    
    List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id='customers']//tr"));
    System.out.println(rowCount.size());
    String initialPart ="//*[@id='customers']//tr[";
    String laterPart = "]/td[1]";
    
    for(int row=2; row<=rowCount.size();row++ )
    {
    	String actualXpath = initialPart+ row +laterPart;
    	System.out.println(actualXpath);
    	String compName = driver.findElement(By.xpath(actualXpath)).getText();
    	System.out.println(compName);
    }
    
	}

}
