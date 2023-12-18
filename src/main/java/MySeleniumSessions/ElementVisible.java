package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementVisible {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();   
//    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//    WebElement logo = driver.findElement(By.xpath("//img[@title='naveenopencart']"));
//    System.out.println(logo.isDisplayed());
//    System.out.println(logo.isEnabled());
//    System.out.println(logo.isSelected());
		
//         driver.get("https://classic.freecrm.com/register/");
//         WebElement submit = driver.findElement(By.id("submitButton"));
//         System.out.println(submit.isDisplayed());
//         Thread.sleep(2000);
//         System.out.println(submit.isEnabled());
//         
//         WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//         System.out.println(chkbox.isSelected());
//         Thread.sleep(1000);
//         chkbox.click();
//         System.out.println(chkbox.isSelected());
         System.out.println("****************************************");
        
//         Thread.sleep(2000);
//         submit.click(); // element click intercepted exception : It means other element would receive the click
//         
         Actions act = new Actions(driver);
//         act.click(submit).perform(); // If we click on a disabled element using Actions class, it will not throw any exception or any msg
         
         //Q: What will happen if I pass some value to a disabled field?
         //A: Element not interactable exception
         driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
         
        // WebElement passwd = driver.findElement(By.xpath("//input[@name='lname' and @id ='pass']"));
       //  System.out.println(passwd.isEnabled());
       //  passwd.sendKeys("abc@123");
         //Q: What will happen if I pass some value to a disabled field through actions class?
         // No exception will be thrown 
        // act.sendKeys("abc@123");
         
         //Q: What will be the output if I send null as an input to a field?
         //A: It will give a warning at the compile time because null check & length!=0 checks are already applied to sendKeys methods
         // but still if we exceute it, it will throw illegal argument exception
         
      WebElement fName =   driver.findElement(By.name("fname"));
      fName.sendKeys(null); //java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
         
         
         
	}

}

