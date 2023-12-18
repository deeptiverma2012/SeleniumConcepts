package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling2 {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://classic.freecrm.com/index.html");
    driver.findElement(By.name("username")).sendKeys("apiautomation");
    driver.findElement(By.name("password")).sendKeys("selenium@12345");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.switchTo().frame("mainpanel");
   Thread.sleep(3000);  

    driver.findElement(By.linkText("CONTACTS")).click();
    
    Thread.sleep(5000);
   // driver.findElement(By.xpath("//a[contains(text(),'Andrew Charles')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	
  //1.Click on a checkbox for a specific user( Click on the check box from the name (move in backward direction to write the xPath))
    selectUserCheckbox("Ali khan");
   //Q3: Get company name for a specific user
   String companyName = getCompanyName("Andrew Charles");
   System.out.println(companyName);
    
	
	//Q4. Get Phone no. for a specific user
	
   String PhoneNo = getPhoneNo("Anusha N");	
	System.out.println(PhoneNo);
	
	//Q5: Get Mobile No.specific user
	String mobNumber= getMobileNo("David Warner");
	System.out.println(mobNumber);
	
	//Q6: Get Email address for a specific user
	String email = getEmailId("Joe Root");
	System.out.println(email);
	
	}
	public static void selectUserCheckbox(String userName) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		  System.out.println("Check box clicked");       
	}
	
	public static String getCompanyName(String userName) {
		String companyName= driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/following-sibling::td/a[@context='company']")).getText();
		return companyName;
	}
	public static String getPhoneNo(String userName) {
		String PhoneNo = driver.findElement(By.xpath("(//a[contains(text(), '"+userName+"')]/parent::td/following-sibling::td/span[@context ='phone'])[position()=1]")).getText();
		return PhoneNo;
	}
	
	public static String getMobileNo(String userName) {
		String mobileNo = driver.findElement(By.xpath("(//a[contains(text(), '"+userName+"')]/parent::td/following-sibling::td/span[@context ='phone'])[position()=last()]")).getText();
		return mobileNo;
	}
	public static String getEmailId(String userName) {
		String email= driver.findElement(By.xpath("(//a[contains(text(), '"+userName+"')]/parent::td/following-sibling::td/a)[position()=last()-5]")).getText();
	    return email;
	}
	
	

}

