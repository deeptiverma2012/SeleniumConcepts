package MySeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
 
		// Alert: It is a Java script pop up. 
		// Alerts restricts the user from moving ahead in application without clicking ok button. 
		// Only Ok button will be displayed
		//Q: Can we inspect ok button or alert ?
		//A: We cannot inspect alerts. Alert is not a WebElement
		
		// Prompt: It is also a kind of JS pop up. Prompts are used to take some input from the user.
		// Q: Can we have 2 fields to take the input through prompt
		//A: No
		//Q: Can we have multiple alerts on the screen at a time?
		//A: Only 1 pop up will be displayed on the screen at a  time.
		
		// Confirm: It is also a kind of JS pop up.confirm alerts are used to take some confirmation from the user.
		// Confirmation pop up will be displayed with 2 buttons "Ok" and "Cancel"

		//Alert JS Pop Up / Modal dialog pop ups : Handled By Alert API
		// alert
		// prompt
		// confirm / confirmation pop up
		   driver = new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		   driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		   
//		 Alert alert =  driver.switchTo().alert();// It returns a reference of Alert interface
//		System.out.println(alert.getText());
//		 alert.dismiss();
		   
		 //Q: What is Alert?
		 //A: It is an interface in selenium with three methods without body(abstract methods) accept(), dismiss(), getText() & sendKeys().
		 // RemoteAlert is a private class that is implementing all these 4 methods
		   
//	driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']")).click();
//	Alert alert =	driver.switchTo().alert();
//	System.out.println(alert.getText());
//	//alert.dismiss();
// After dismiss the alert if I try to accept the alert, what will happen?
// It will throw No Alert Present Exception.		   
		   
//	alert.accept();
//		
		
    driver.findElement(By.xpath("//button[text() ='Click for JS Prompt']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(3000);
	alert.sendKeys("Clicking on JS Prompt");
	Thread.sleep(3000);
    alert.accept();
		
		
	}

}
