package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElements {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		Thread.sleep(2000);
		List <WebElement> statesList = driver.findElements(By.xpath("//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @id ='regions']//*[name()='g' and @class='region' ]"));;
		
		System.out.println(statesList.size());
		Actions act = new Actions(driver);
		for(WebElement e: statesList) {
			
		act.moveToElement(e).build().perform();
		Thread.sleep(2000);
		String stateName = e.getAttribute("id");
		System.out.println(stateName);
		
		if(stateName.equals("texas"))
		{
			e.click();
			break;
		}
		}
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		List<WebElement> countyList =	driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='texas']//*[name()='g' and @class='subregion']//*[name()='path' and @class='child']"));
		System.out.println(countyList .size());
		
		for(WebElement e1: countyList)
		{
		 String countyName =  e1.getAttribute("name");
		 System.out.println(countyName);
		 if(countyName.equals("Collin County"))
		 {
			 e1.click();
			 break;
		 }
		
		}
		

	}

}
