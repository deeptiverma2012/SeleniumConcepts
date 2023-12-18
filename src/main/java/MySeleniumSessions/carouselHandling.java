package MySeleniumSessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class carouselHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(20000);
	List <WebElement> li = driver.findElements(By.xpath("//img[contains(@alt, '/yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div//div[@data-qa='product-name']"));

	System.out.println(li.size());
	
	String nextXpath = "//img[contains(@alt, '/yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-19']/following-sibling::div[@class='componentArea-20']//div[contains(@class,'swiper-button-next')]";
	//List<String> prodList = new ArrayList<String>();
	Set<String> prodSet = new HashSet<String>();
    while(!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("disabled"))
    {
	for(WebElement e: li)
     {
    	String text = e.getAttribute("title");
    	//prodList.add(text);
    	 prodSet.add(text);
    	
     }
	driver.findElement(By.xpath(nextXpath)).click();
    }
    //print the products 
    for(String p: prodSet)
    {
    	System.out.println(p);
    }
	}
}
