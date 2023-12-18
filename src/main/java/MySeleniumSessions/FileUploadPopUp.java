package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
    //1.  <type =file>tag should be there
    //2. If this tag is not available, ask developer to add <type =file> tag
    //3. 3rd party libs: AutoIT(windows   - windows batch),Robot(windows),Sikuli(Image based)
    driver.findElement(By.name("upfile")).sendKeys("C:/Users/Ashish/Desktop/Test1.json");
	

	}

}
