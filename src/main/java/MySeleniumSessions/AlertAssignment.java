package MySeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.findElement(By.xpath("//input[@name='proceed']")).click();
    Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
    
    driver.findElement(By.id("login1")).sendKeys("deepti@123");
    driver.findElement(By.xpath("//input[@name='proceed']")).click();
    Thread.sleep(3000);
    System.out.println(alert.getText());
    alert.accept();
    driver.findElement(By.id("password")).sendKeys("deepti@123");
    driver.findElement(By.id("login1")).clear();
    driver.findElement(By.xpath("//input[@name='proceed']")).click();
    Thread.sleep(3000);
    System.out.println(alert.getText());
    alert.dismiss();
    
    
	}

}
